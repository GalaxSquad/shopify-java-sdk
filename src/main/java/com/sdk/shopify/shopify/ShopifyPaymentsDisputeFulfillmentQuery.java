// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The fulfillment associated with dispute evidence.
*/
public class ShopifyPaymentsDisputeFulfillmentQuery extends Query<ShopifyPaymentsDisputeFulfillmentQuery> {
    ShopifyPaymentsDisputeFulfillmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The shipping carrier for this fulfillment.
    */
    public ShopifyPaymentsDisputeFulfillmentQuery shippingCarrier() {
        startField("shippingCarrier");

        return this;
    }

    /**
    * The shipping date for this fulfillment.
    */
    public ShopifyPaymentsDisputeFulfillmentQuery shippingDate() {
        startField("shippingDate");

        return this;
    }

    /**
    * The shipping tracking number for this fulfillment.
    */
    public ShopifyPaymentsDisputeFulfillmentQuery shippingTrackingNumber() {
        startField("shippingTrackingNumber");

        return this;
    }
}
