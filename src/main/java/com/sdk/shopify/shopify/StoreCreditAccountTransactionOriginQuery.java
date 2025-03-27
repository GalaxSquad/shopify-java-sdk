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
* The origin of a store credit account transaction.
*/
public class StoreCreditAccountTransactionOriginQuery extends Query<StoreCreditAccountTransactionOriginQuery> {
    StoreCreditAccountTransactionOriginQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public StoreCreditAccountTransactionOriginQuery onOrderTransaction(OrderTransactionQueryDefinition queryDef) {
        startInlineFragment("OrderTransaction");
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
