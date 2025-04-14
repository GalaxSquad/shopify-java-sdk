package com.sdk.shopify.util;

import graphql.language.Document;
import graphql.language.Field;
import graphql.language.OperationDefinition;
import graphql.parser.Parser;

public class GraphQLUtils {

  private GraphQLUtils () {
  }

  public static Field getGraphQLFieldFromQuery(String query){
    Parser parser = new Parser();
    Document document = parser.parseDocument(query);

    return  (Field)(((OperationDefinition)document.getDefinitions().get(0)).getSelectionSet().getSelections().get(0));
  }

}
