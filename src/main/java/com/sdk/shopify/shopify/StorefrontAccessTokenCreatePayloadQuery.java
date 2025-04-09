// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `storefrontAccessTokenCreate` mutation.
*/
public class StorefrontAccessTokenCreatePayloadQuery extends Query<StorefrontAccessTokenCreatePayloadQuery> {
    StorefrontAccessTokenCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The user's shop.
    */
    public StorefrontAccessTokenCreatePayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The storefront access token.
    */
    public StorefrontAccessTokenCreatePayloadQuery storefrontAccessToken(StorefrontAccessTokenQueryDefinition queryDef) {
        startField("storefrontAccessToken");

        _queryBuilder.append('{');
        queryDef.define(new StorefrontAccessTokenQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StorefrontAccessTokenCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
