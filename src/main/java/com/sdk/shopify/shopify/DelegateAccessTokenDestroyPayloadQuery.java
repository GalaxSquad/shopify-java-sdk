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
* Return type for `delegateAccessTokenDestroy` mutation.
*/
public class DelegateAccessTokenDestroyPayloadQuery extends Query<DelegateAccessTokenDestroyPayloadQuery> {
    DelegateAccessTokenDestroyPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The user's shop.
    */
    public DelegateAccessTokenDestroyPayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the delegate access token destroy operation. Returns true if successful.
    */
    public DelegateAccessTokenDestroyPayloadQuery status() {
        startField("status");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DelegateAccessTokenDestroyPayloadQuery userErrors(DelegateAccessTokenDestroyUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DelegateAccessTokenDestroyUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
