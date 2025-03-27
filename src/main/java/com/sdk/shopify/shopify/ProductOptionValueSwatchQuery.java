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
* A swatch associated with a product option value.
*/
public class ProductOptionValueSwatchQuery extends Query<ProductOptionValueSwatchQuery> {
    ProductOptionValueSwatchQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The color representation of the swatch.
    */
    public ProductOptionValueSwatchQuery color() {
        startField("color");

        return this;
    }

    /**
    * An image representation of the swatch.
    */
    public ProductOptionValueSwatchQuery image(MediaImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new MediaImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
