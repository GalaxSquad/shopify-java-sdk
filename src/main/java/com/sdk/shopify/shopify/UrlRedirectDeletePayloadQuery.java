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
* Return type for `urlRedirectDelete` mutation.
*/
public class UrlRedirectDeletePayloadQuery extends Query<UrlRedirectDeletePayloadQuery> {
    UrlRedirectDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted redirect.
    */
    public UrlRedirectDeletePayloadQuery deletedUrlRedirectId() {
        startField("deletedUrlRedirectId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectDeletePayloadQuery userErrors(UrlRedirectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
