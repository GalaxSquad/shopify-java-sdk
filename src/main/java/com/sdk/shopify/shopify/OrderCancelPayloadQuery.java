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
* Return type for `orderCancel` mutation.
*/
public class OrderCancelPayloadQuery extends Query<OrderCancelPayloadQuery> {
    OrderCancelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The job that asynchronously cancels the order.
    */
    public OrderCancelPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderCancelPayloadQuery orderCancelUserErrors(OrderCancelUserErrorQueryDefinition queryDef) {
        startField("orderCancelUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderCancelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
