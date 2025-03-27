// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens while revoking a granted scope.
*/
public class AppRevokeAccessScopesAppRevokeScopeErrorQuery extends Query<AppRevokeAccessScopesAppRevokeScopeErrorQuery> {
    AppRevokeAccessScopesAppRevokeScopeErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public AppRevokeAccessScopesAppRevokeScopeErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public AppRevokeAccessScopesAppRevokeScopeErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public AppRevokeAccessScopesAppRevokeScopeErrorQuery message() {
        startField("message");

        return this;
    }
}
