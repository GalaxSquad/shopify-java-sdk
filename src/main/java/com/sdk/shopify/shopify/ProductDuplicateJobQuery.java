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
* Represents a product duplication job.
*/
public class ProductDuplicateJobQuery extends Query<ProductDuplicateJobQuery> {
    ProductDuplicateJobQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * This indicates if the job is still queued or has been run.
    */
    public ProductDuplicateJobQuery done() {
        startField("done");

        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */
    public ProductDuplicateJobQuery id() {
        startField("id");

        return this;
    }
}
