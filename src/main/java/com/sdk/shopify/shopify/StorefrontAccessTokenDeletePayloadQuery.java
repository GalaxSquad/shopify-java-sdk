// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `storefrontAccessTokenDelete` mutation.
*/
public class StorefrontAccessTokenDeletePayloadQuery extends Query<StorefrontAccessTokenDeletePayloadQuery> {
    StorefrontAccessTokenDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted storefront access token.
    */
    public StorefrontAccessTokenDeletePayloadQuery deletedStorefrontAccessTokenId() {
        startField("deletedStorefrontAccessTokenId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StorefrontAccessTokenDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
