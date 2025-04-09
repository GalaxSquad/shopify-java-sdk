// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
