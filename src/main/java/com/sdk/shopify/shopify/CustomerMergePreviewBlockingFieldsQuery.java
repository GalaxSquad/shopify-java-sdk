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
* The blocking fields of a customer merge preview. These fields will block customer merge unless
* edited.
*/
public class CustomerMergePreviewBlockingFieldsQuery extends Query<CustomerMergePreviewBlockingFieldsQuery> {
    CustomerMergePreviewBlockingFieldsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The merged note resulting from a customer merge. The merged note is over the 5000 character limit
    * and will block customer merge.
    */
    public CustomerMergePreviewBlockingFieldsQuery note() {
        startField("note");

        return this;
    }

    /**
    * The merged tags resulting from a customer merge. The merged tags are over the 250 limit and will
    * block customer merge.
    */
    public CustomerMergePreviewBlockingFieldsQuery tags() {
        startField("tags");

        return this;
    }
}
