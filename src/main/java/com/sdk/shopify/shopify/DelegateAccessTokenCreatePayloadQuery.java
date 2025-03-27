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
