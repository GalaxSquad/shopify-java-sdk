// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happened when changing local pickup settings for a location.
*/
public class DeliveryLocationLocalPickupSettingsErrorQuery extends Query<DeliveryLocationLocalPickupSettingsErrorQuery> {
    DeliveryLocationLocalPickupSettingsErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DeliveryLocationLocalPickupSettingsErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DeliveryLocationLocalPickupSettingsErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DeliveryLocationLocalPickupSettingsErrorQuery message() {
        startField("message");

        return this;
    }
}
