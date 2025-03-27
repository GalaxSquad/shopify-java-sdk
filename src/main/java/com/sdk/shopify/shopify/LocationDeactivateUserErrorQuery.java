// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The possible errors that can be returned when executing the `locationDeactivate` mutation.
*/
public class LocationDeactivateUserErrorQuery extends Query<LocationDeactivateUserErrorQuery> {
    LocationDeactivateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public LocationDeactivateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public LocationDeactivateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public LocationDeactivateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
