package com.sdk.shopify.converter;

import com.sdk.shopify.shopify.LineItemConnection;
import com.sdk.shopify.shopify.LineItemQuery;
import com.sdk.shopify.shopify.MoneyBagQuery;
import com.sdk.shopify.shopify.MoneyV2Query;
import com.sdk.shopify.shopify.TaxLineQuery;
import graphql.language.Argument;
import graphql.language.AstPrinter;
import graphql.language.Definition;
import graphql.language.Document;
import graphql.language.Field;
import graphql.language.FragmentDefinition;
import graphql.language.IntValue;
import graphql.language.OperationDefinition;
import graphql.language.Selection;
import graphql.language.SelectionSet;
import graphql.language.StringValue;
import graphql.language.Value;
import graphql.parser.Parser;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Converts GraphQL query strings to Shopify LineItemQuery objects using reflection.
 */
public class QueryToObjectConverter {

  /**
   * Converts a GraphQL query string to a LineItemQuery object
   *
   * @param graphqlQuery The GraphQL query string to convert
   * @return A LineItemQuery object representing the query
   */
  public LineItemQuery convert(String graphqlQuery) {
    Parser parser = new Parser();
    Document document = parser.parseDocument(graphqlQuery);
    // Create a new LineItemQuery
    StringBuilder queryBuilder = new StringBuilder();
    LineItemQuery lineItemQuery = new LineItemQuery(queryBuilder);

    Field field = (Field)(((OperationDefinition)document.getDefinitions().get(0)).getSelectionSet().getSelections().get(0));
    Argument argument = new Argument("first", new IntValue(BigInteger.valueOf(50)));
    Argument argument2 = new Argument("after", new StringValue("test"));
    String s = AstPrinter.printAst(new Field("lineItem", Arrays.asList(argument2, argument), field.getSelectionSet()));

    // Extract the selections from the parsed document
    List<Selection> selections = extractSelections(document);

    // Process each field in the query
    for (Selection selection : selections) {
      if (selection instanceof Field) {
        Field field1 = (Field) selection;
        processField(lineItemQuery, field1);
      }
    }

    return lineItemQuery;
  }

  /**
   * Extracts selections from the GraphQL document
   */
  private List<Selection> extractSelections(Document document) {
    for (Definition definition : document.getDefinitions()) {
      if (definition instanceof OperationDefinition) {
        OperationDefinition operation = (OperationDefinition) definition;
        return operation.getSelectionSet().getSelections();
      } else if (definition instanceof FragmentDefinition) {
        FragmentDefinition fragment = (FragmentDefinition) definition;
        return fragment.getSelectionSet().getSelections();
      }
    }

    // If the document structure is simpler (just a selection set)
    if (document.getDefinitions().size() == 1) {
      Definition definition = document.getDefinitions().get(0);
      if (definition instanceof SelectionSet) {
        return ((SelectionSet) definition).getSelections();
      }
    }

    return Collections.emptyList();
  }

  /**
   * Processes a field in the GraphQL query and applies it to the LineItemQuery
   */
  private void processField(LineItemQuery query, Field field) {
    String fieldName = field.getName();

    try {
      // Look for simple fields first (no arguments, no child selections)
      if (field.getSelectionSet() == null || field.getSelectionSet().getSelections().isEmpty()) {
        Method method = findMethodByName(LineItemQuery.class, fieldName);
        if (method != null) {
          method.invoke(query);
          return;
        }
      }

//      // Handle special cases with nested objects
//      switch (fieldName) {
//        case "discountedUnitPriceSet":
//          handleMoneyBagField(query, field, LineItemQuery::discountedUnitPriceSet);
//          break;
//        case "originalUnitPriceSet":
//          handleMoneyBagField(query, field, LineItemQuery::originalUnitPriceSet);
//          break;
//        case "discountedTotalSet":
//          handleMoneyBagField(query, field, LineItemQuery::discountedTotalSet);
//          break;
//        case "taxLines":
//          handleTaxLinesField(query, field);
//          break;
//        // Add other complex field handlers as needed
//      }
    } catch (Exception e) {
      System.err.println("Error processing field '" + fieldName + "': " + e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Handles MoneyBag fields like discountedUnitPriceSet, originalUnitPriceSet, etc.
   */
  private void handleMoneyBagField(
      LineItemQuery query,
      Field field,
      Function<Consumer<MoneyBagQuery>, LineItemQuery> moneyBagFunction) {

    Consumer<MoneyBagQuery> moneyBagConsumer = moneyBag -> {
      if (field.getSelectionSet() != null) {
        for (Selection selection : field.getSelectionSet().getSelections()) {
          if (selection instanceof Field) {
            Field subField = (Field) selection;
            String subFieldName = subField.getName();

            if ("shopMoney".equals(subFieldName)) {
              moneyBag.shopMoney(money -> processMoneyField(money, subField));
            } else if ("presentmentMoney".equals(subFieldName)) {
              moneyBag.presentmentMoney(money -> processMoneyField(money, subField));
            }
          }
        }
      }
    };

    moneyBagFunction.apply(moneyBagConsumer);
  }

  /**
   * Processes MoneyV2 fields (amount, currencyCode)
   */
  private MoneyV2Query processMoneyField(MoneyV2Query money, Field field) {
    if (field.getSelectionSet() != null) {
      for (Selection selection : field.getSelectionSet().getSelections()) {
        if (selection instanceof Field) {
          Field subField = (Field) selection;
          String subFieldName = subField.getName();

          if ("amount".equals(subFieldName)) {
            money.amount();
          } else if ("currencyCode".equals(subFieldName)) {
            money.currencyCode();
          }
        }
      }
    }
    return money;
  }

  /**
   * Handles the taxLines field which has arguments and nested fields
   */
  private void handleTaxLinesField(LineItemQuery query, Field field) {
    // Extract first argument if present
    Integer first = null;
    for (Argument arg : field.getArguments()) {
      if ("first".equals(arg.getName())) {
        Value value = arg.getValue();
        if (value instanceof IntValue) {
          first = ((IntValue) value).getValue().intValue();
        }
      }
    }

    // Create the tax lines consumer
    Consumer<TaxLineQuery> taxLineConsumer = taxLine -> {
      if (field.getSelectionSet() != null) {
        for (Selection selection : field.getSelectionSet().getSelections()) {
          if (selection instanceof Field) {
            Field subField = (Field) selection;
            String subFieldName = subField.getName();

            switch (subFieldName) {
              case "title":
                taxLine.title();
                break;
              case "rate":
                taxLine.rate();
                break;
              case "ratePercentage":
                taxLine.ratePercentage();
                break;
              case "priceSet":
                taxLine.priceSet(moneyBag -> {
                  for (Selection priceSetSelection : subField.getSelectionSet().getSelections()) {
                    if (priceSetSelection instanceof Field) {
                      Field priceSetField = (Field) priceSetSelection;
                      String priceSetFieldName = priceSetField.getName();

                      if ("shopMoney".equals(priceSetFieldName)) {
                        moneyBag.shopMoney(money -> processMoneyField(money, priceSetField));
                      } else if ("presentmentMoney".equals(priceSetFieldName)) {
                        moneyBag.presentmentMoney(money -> processMoneyField(money, priceSetField));
                      }
                    }
                  }
                });
                break;
              case "source":
                taxLine.source();
                break;
              case "channelLiable":
                taxLine.channelLiable();
                break;
            }
          }
        }
      }
    };

    // Apply the tax lines with the appropriate arguments
//    if (first != null) {
//      query.taxLines(args -> args.first(first), taxLineConsumer);
//    } else {
//      query.taxLines(taxLineConsumer);
//    }
  }

  /**
   * Find a method by name in the given class
   */
  private Method findMethodByName(Class<?> clazz, String methodName) {
    for (Method method : clazz.getMethods()) {
      if (method.getName().equals(methodName) && method.getParameterCount() == 0) {
        return method;
      }
    }
    return null;
  }
  
}