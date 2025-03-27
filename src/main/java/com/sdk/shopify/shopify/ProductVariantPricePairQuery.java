// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* The compare-at price and price of a variant sharing a currency.
*/
public class ProductVariantPricePairQuery extends Query<ProductVariantPricePairQuery> {
    ProductVariantPricePairQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The compare-at price of the variant with associated currency.
    */
    public ProductVariantPricePairQuery compareAtPrice(MoneyV2QueryDefinition queryDef) {
        startField("compareAtPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price of the variant with associated currency.
    */
    public ProductVariantPricePairQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
