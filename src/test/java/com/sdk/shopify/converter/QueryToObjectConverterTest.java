package com.sdk.shopify.converter;

import com.sdk.shopify.shopify.LineItemQuery;
import org.junit.jupiter.api.Test;

public class QueryToObjectConverterTest {

  String graphqlQuery =
      "{lineItems(first: 250) {\n" +
          "    nodes {\n" +
          "        id\n" +
          "        name\n" +
          "        discountedUnitPriceSet {\n" +
          "            shopMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "            presentmentMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "        }\n" +
          "        quantity\n" +
          "        originalUnitPriceSet {\n" +
          "            shopMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "            presentmentMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "        }\n" +
          "        sku\n" +
          "        requiresShipping\n" +
          "        taxable\n" +
          "        vendor\n" +
          "        discountedTotalSet {\n" +
          "            shopMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "            presentmentMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "        }\n" +
          "        taxLines(first: 5) {\n" +
          "            title\n" +
          "            rate\n" +
          "            ratePercentage\n" +
          "            priceSet {\n" +
          "                shopMoney {\n" +
          "                    amount\n" +
          "                    currencyCode\n" +
          "                }\n" +
          "                presentmentMoney {\n" +
          "                    amount\n" +
          "                    currencyCode\n" +
          "                }\n" +
          "            }\n" +
          "            source\n" +
          "            channelLiable\n" +
          "        }\n" +
          "    }\n" +
          "}}";

  // For testing, use the inner query (nodes {...}) directly
  String nodeQuery =
      "{\n" +
          "    id\n" +
          "    name\n" +
          "    discountedUnitPriceSet {\n" +
          "        shopMoney {\n" +
          "            amount\n" +
          "            currencyCode\n" +
          "        }\n" +
          "        presentmentMoney {\n" +
          "            amount\n" +
          "            currencyCode\n" +
          "        }\n" +
          "    }\n" +
          "    quantity\n" +
          "    originalUnitPriceSet {\n" +
          "        shopMoney {\n" +
          "            amount\n" +
          "            currencyCode\n" +
          "        }\n" +
          "        presentmentMoney {\n" +
          "            amount\n" +
          "            currencyCode\n" +
          "        }\n" +
          "    }\n" +
          "    sku\n" +
          "    requiresShipping\n" +
          "    taxable\n" +
          "    vendor\n" +
          "    discountedTotalSet {\n" +
          "        shopMoney {\n" +
          "            amount\n" +
          "            currencyCode\n" +
          "        }\n" +
          "        presentmentMoney {\n" +
          "            amount\n" +
          "            currencyCode\n" +
          "        }\n" +
          "    }\n" +
          "    taxLines(first: 5) {\n" +
          "        title\n" +
          "        rate\n" +
          "        ratePercentage\n" +
          "        priceSet {\n" +
          "            shopMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "            presentmentMoney {\n" +
          "                amount\n" +
          "                currencyCode\n" +
          "            }\n" +
          "        }\n" +
          "        source\n" +
          "        channelLiable\n" +
          "    }\n" +
          "}";

  @Test
  public void queryToObjectConverterTest() {
    QueryToObjectConverter convert = new QueryToObjectConverter();

    LineItemQuery convert1 = convert.convert(graphqlQuery);

    System.out.printf("Test");
  }

}
