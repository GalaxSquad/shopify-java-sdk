// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
