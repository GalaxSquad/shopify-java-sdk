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
* Return type for `fulfillmentOrderReschedule` mutation.
*/
public class FulfillmentOrderReschedulePayloadQuery extends Query<FulfillmentOrderReschedulePayloadQuery> {
    FulfillmentOrderReschedulePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A fulfillment order with the rescheduled line items.
    * Fulfillment orders may be merged if they have the same `fulfillAt` datetime.
    * If the fulfillment order is merged then the resulting fulfillment order will be returned.
    * Otherwise the original fulfillment order will be returned with an updated `fulfillAt` datetime.
    */
    public FulfillmentOrderReschedulePayloadQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderReschedulePayloadQuery userErrors(FulfillmentOrderRescheduleUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderRescheduleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
