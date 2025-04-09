// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `delegateAccessTokenCreate` mutation.
*/
public class DelegateAccessTokenCreatePayloadQuery extends Query<DelegateAccessTokenCreatePayloadQuery> {
    DelegateAccessTokenCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The delegate access token.
    */
    public DelegateAccessTokenCreatePayloadQuery delegateAccessToken(DelegateAccessTokenQueryDefinition queryDef) {
        startField("delegateAccessToken");

        _queryBuilder.append('{');
        queryDef.define(new DelegateAccessTokenQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user's shop.
    */
    public DelegateAccessTokenCreatePayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DelegateAccessTokenCreatePayloadQuery userErrors(DelegateAccessTokenCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DelegateAccessTokenCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
