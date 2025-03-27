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
* A job corresponds to some long running task that the client should poll for status.
*/
public class JobResultQuery extends Query<JobResultQuery> {
    JobResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * This indicates if the job is still queued or has been run.
    */
    public JobResultQuery done() {
        startField("done");

        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */
    public JobResultQuery id() {
        startField("id");

        return this;
    }

    public JobResultQuery onCustomerSegmentMembersQuery(CustomerSegmentMembersQueryQueryDefinition queryDef) {
        startInlineFragment("CustomerSegmentMembersQuery");
        queryDef.define(new CustomerSegmentMembersQueryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
