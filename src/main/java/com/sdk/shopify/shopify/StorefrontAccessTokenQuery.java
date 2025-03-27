// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A token that's used to delegate unauthenticated access scopes to clients that need to access
* the unauthenticated [Storefront API](https://shopify.dev/docs/api/storefront).
* An app can have a maximum of 100 active storefront access
* tokens for each shop.
* [Get started with the Storefront
* API](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/getting-started)
* .
*/
public class StorefrontAccessTokenQuery extends Query<StorefrontAccessTokenQuery> {
    StorefrontAccessTokenQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * List of permissions associated with the token.
    */
    public StorefrontAccessTokenQuery accessScopes(AccessScopeQueryDefinition queryDef) {
        startField("accessScopes");

        _queryBuilder.append('{');
        queryDef.define(new AccessScopeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The issued public access token.
    */
    public StorefrontAccessTokenQuery accessToken() {
        startField("accessToken");

        return this;
    }

    /**
    * The date and time when the public access token was created.
    */
    public StorefrontAccessTokenQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * An arbitrary title for each token determined by the developer, used for reference         purposes.
    */
    public StorefrontAccessTokenQuery title() {
        startField("title");

        return this;
    }

    /**
    * The date and time when the storefront access token was updated.
    */
    public StorefrontAccessTokenQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
