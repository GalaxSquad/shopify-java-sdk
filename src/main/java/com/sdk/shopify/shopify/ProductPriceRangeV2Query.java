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
* The price range of the product.
*/
public class ProductPriceRangeV2Query extends Query<ProductPriceRangeV2Query> {
    ProductPriceRangeV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The highest variant's price.
    */
    public ProductPriceRangeV2Query maxVariantPrice(MoneyV2QueryDefinition queryDef) {
        startField("maxVariantPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The lowest variant's price.
    */
    public ProductPriceRangeV2Query minVariantPrice(MoneyV2QueryDefinition queryDef) {
        startField("minVariantPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
