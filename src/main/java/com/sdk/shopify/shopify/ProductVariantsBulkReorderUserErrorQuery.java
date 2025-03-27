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
* Error codes for failed bulk product variants reorder operation.
*/
public class ProductVariantsBulkReorderUserErrorQuery extends Query<ProductVariantsBulkReorderUserErrorQuery> {
    ProductVariantsBulkReorderUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductVariantsBulkReorderUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductVariantsBulkReorderUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductVariantsBulkReorderUserErrorQuery message() {
        startField("message");

        return this;
    }
}
