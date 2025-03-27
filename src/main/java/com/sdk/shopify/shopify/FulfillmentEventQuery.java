// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The fulfillment event that describes the fulfilllment status at a particular time.
*/
public class FulfillmentEventQuery extends Query<FulfillmentEventQuery> {
    FulfillmentEventQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The street address where this fulfillment event occurred.
    */
    public FulfillmentEventQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The city where this fulfillment event occurred.
    */
    public FulfillmentEventQuery city() {
        startField("city");

        return this;
    }

    /**
    * The country where this fulfillment event occurred.
    */
    public FulfillmentEventQuery country() {
        startField("country");

        return this;
    }

    /**
    * The date and time when the fulfillment event was created.
    */
    public FulfillmentEventQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The estimated delivery date and time of the fulfillment.
    */
    public FulfillmentEventQuery estimatedDeliveryAt() {
        startField("estimatedDeliveryAt");

        return this;
    }

    /**
    * The time at which this fulfillment event happened.
    */
    public FulfillmentEventQuery happenedAt() {
        startField("happenedAt");

        return this;
    }

    /**
    * The latitude where this fulfillment event occurred.
    */
    public FulfillmentEventQuery latitude() {
        startField("latitude");

        return this;
    }

    /**
    * The longitude where this fulfillment event occurred.
    */
    public FulfillmentEventQuery longitude() {
        startField("longitude");

        return this;
    }

    /**
    * A message associated with this fulfillment event.
    */
    public FulfillmentEventQuery message() {
        startField("message");

        return this;
    }

    /**
    * The province where this fulfillment event occurred.
    */
    public FulfillmentEventQuery province() {
        startField("province");

        return this;
    }

    /**
    * The status of this fulfillment event.
    */
    public FulfillmentEventQuery status() {
        startField("status");

        return this;
    }

    /**
    * The zip code of the location where this fulfillment event occurred.
    */
    public FulfillmentEventQuery zip() {
        startField("zip");

        return this;
    }
}
