// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderReleaseHold` mutation.
*/
public class FulfillmentOrderReleaseHoldPayloadQuery extends Query<FulfillmentOrderReleaseHoldPayloadQuery> {
    FulfillmentOrderReleaseHoldPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment order on which the hold was released.
    */
    public FulfillmentOrderReleaseHoldPayloadQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderReleaseHoldPayloadQuery userErrors(FulfillmentOrderReleaseHoldUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderReleaseHoldUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
