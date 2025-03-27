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
* Return type for `appRevokeAccessScopes` mutation.
*/
public class AppRevokeAccessScopesPayloadQuery extends Query<AppRevokeAccessScopesPayloadQuery> {
    AppRevokeAccessScopesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of scope handles that have been revoked.
    */
    public AppRevokeAccessScopesPayloadQuery revoked(AccessScopeQueryDefinition queryDef) {
        startField("revoked");

        _queryBuilder.append('{');
        queryDef.define(new AccessScopeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppRevokeAccessScopesPayloadQuery userErrors(AppRevokeAccessScopesAppRevokeScopeErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new AppRevokeAccessScopesAppRevokeScopeErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
