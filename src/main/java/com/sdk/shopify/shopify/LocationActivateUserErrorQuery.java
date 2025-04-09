// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs while activating a location.
*/
public class LocationActivateUserErrorQuery extends Query<LocationActivateUserErrorQuery> {
    LocationActivateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public LocationActivateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public LocationActivateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public LocationActivateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
