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
* A product variant component associated with a product variant.
*/
public class ProductVariantComponentQuery extends Query<ProductVariantComponentQuery> {
    ProductVariantComponentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The product variant associated with the component.
    */
    public ProductVariantComponentQuery productVariant(ProductVariantQueryDefinition queryDef) {
        startField("productVariant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The required quantity of the component.
    */
    public ProductVariantComponentQuery quantity() {
        startField("quantity");

        return this;
    }
}
