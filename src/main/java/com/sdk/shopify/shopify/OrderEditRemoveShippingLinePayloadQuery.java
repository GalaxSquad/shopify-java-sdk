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
* Return type for `orderEditRemoveShippingLine` mutation.
*/
public class OrderEditRemoveShippingLinePayloadQuery extends Query<OrderEditRemoveShippingLinePayloadQuery> {
    OrderEditRemoveShippingLinePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
    * with the edits applied but not saved.
    */
    public OrderEditRemoveShippingLinePayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditRemoveShippingLinePayloadQuery userErrors(OrderEditRemoveShippingLineUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderEditRemoveShippingLineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
