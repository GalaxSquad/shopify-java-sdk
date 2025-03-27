// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentOrderLineItemsPreparedForPickup`.
*/
public class FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery extends Query<FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery> {
    FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery message() {
        startField("message");

        return this;
    }
}
