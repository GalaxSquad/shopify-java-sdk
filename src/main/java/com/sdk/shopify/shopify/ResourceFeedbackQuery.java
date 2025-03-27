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
* Represents feedback from apps about a resource, and the steps required to set up the apps on the
* shop.
*/
public class ResourceFeedbackQuery extends Query<ResourceFeedbackQuery> {
    ResourceFeedbackQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of AppFeedback detailing issues regarding a resource.
    */
    public ResourceFeedbackQuery details(AppFeedbackQueryDefinition queryDef) {
        startField("details");

        _queryBuilder.append('{');
        queryDef.define(new AppFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Summary of resource feedback pertaining to the resource.
    */
    public ResourceFeedbackQuery summary() {
        startField("summary");

        return this;
    }
}
