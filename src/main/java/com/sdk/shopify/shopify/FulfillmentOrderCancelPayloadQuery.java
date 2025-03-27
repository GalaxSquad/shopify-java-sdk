// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderCancel` mutation.
*/
public class FulfillmentOrderCancelPayloadQuery extends Query<FulfillmentOrderCancelPayloadQuery> {
    FulfillmentOrderCancelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment order that was marked as canceled.
    */
    public FulfillmentOrderCancelPayloadQuery fulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fulfillment order that was created to replace the canceled fulfillment order.
    */
    public FulfillmentOrderCancelPayloadQuery replacementFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("replacementFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderCancelPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
