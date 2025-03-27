// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the destination where the items should be sent upon fulfillment.
*/
public class FulfillmentOrderDestinationQuery extends Query<FulfillmentOrderDestinationQuery> {
    FulfillmentOrderDestinationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The first line of the address of the destination.
    */
    public FulfillmentOrderDestinationQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address of the destination.
    */
    public FulfillmentOrderDestinationQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The city of the destination.
    */
    public FulfillmentOrderDestinationQuery city() {
        startField("city");

        return this;
    }

    /**
    * The company of the destination.
    */
    public FulfillmentOrderDestinationQuery company() {
        startField("company");

        return this;
    }

    /**
    * The two-letter country code of the destination.
    */
    public FulfillmentOrderDestinationQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The email of the customer at the destination.
    */
    public FulfillmentOrderDestinationQuery email() {
        startField("email");

        return this;
    }

    /**
    * The first name of the customer at the destination.
    */
    public FulfillmentOrderDestinationQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The last name of the customer at the destination.
    */
    public FulfillmentOrderDestinationQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The location designated for the pick-up of the fulfillment order.
    */
    public FulfillmentOrderDestinationQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The phone number of the customer at the destination.
    */
    public FulfillmentOrderDestinationQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The province of the destination.
    */
    public FulfillmentOrderDestinationQuery province() {
        startField("province");

        return this;
    }

    /**
    * The ZIP code of the destination.
    */
    public FulfillmentOrderDestinationQuery zip() {
        startField("zip");

        return this;
    }
}
