// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fulfillmentOrderLineItemsPreparedForPickup` mutation.
*/
public class FulfillmentOrderLineItemsPreparedForPickupPayloadQuery extends Query<FulfillmentOrderLineItemsPreparedForPickupPayloadQuery> {
    FulfillmentOrderLineItemsPreparedForPickupPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderLineItemsPreparedForPickupPayloadQuery userErrors(FulfillmentOrderLineItemsPreparedForPickupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
