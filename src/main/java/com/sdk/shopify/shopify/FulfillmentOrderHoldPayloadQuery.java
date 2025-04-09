// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderHold` mutation.
*/
public class FulfillmentOrderHoldPayloadQuery extends Query<FulfillmentOrderHoldPayloadQuery> {
    FulfillmentOrderHoldPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment hold created for the fulfillment order. Null if no hold was created.
    */
    public FulfillmentOrderHoldPayloadQuery fulfillmentHold(FulfillmentHoldQueryDefinition queryDef) {
        startField("fulfillmentHold");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentHoldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fulfillment order on which a fulfillment hold was applied.
    */
    public FulfillmentOrderHoldPayloadQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The remaining fulfillment order containing the line items to which the hold wasn't applied,
    * if specific line items were specified to be placed on hold.
    */
    public FulfillmentOrderHoldPayloadQuery remainingFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("remainingFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderHoldPayloadQuery userErrors(FulfillmentOrderHoldUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderHoldUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
