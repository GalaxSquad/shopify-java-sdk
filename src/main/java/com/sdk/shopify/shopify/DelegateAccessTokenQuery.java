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
* A token that delegates a set of scopes from the original permission.
* To learn more about creating delegate access tokens, refer to
* [Delegate OAuth access tokens to
* subsystems](https://shopify.dev/docs/apps/build/authentication-authorization/access-tokens/use-deleg
* ate-tokens).
*/
public class DelegateAccessTokenQuery extends Query<DelegateAccessTokenQuery> {
    DelegateAccessTokenQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of permissions associated with the token.
    */
    public DelegateAccessTokenQuery accessScopes() {
        startField("accessScopes");

        return this;
    }

    /**
    * The issued delegate access token.
    */
    public DelegateAccessTokenQuery accessToken() {
        startField("accessToken");

        return this;
    }

    /**
    * The date and time when the delegate access token was created.
    */
    public DelegateAccessTokenQuery createdAt() {
        startField("createdAt");

        return this;
    }
}
