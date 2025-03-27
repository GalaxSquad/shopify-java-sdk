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
* The result of splitting a fulfillment order.
*/
public class FulfillmentOrderSplitResultQuery extends Query<FulfillmentOrderSplitResultQuery> {
    FulfillmentOrderSplitResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The original fulfillment order as a result of the split.
    */
    public FulfillmentOrderSplitResultQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The remaining fulfillment order as a result of the split.
    */
    public FulfillmentOrderSplitResultQuery remainingFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("remainingFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The replacement fulfillment order if the original fulfillment order wasn't in a state to be split.
    */
    public FulfillmentOrderSplitResultQuery replacementFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("replacementFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
