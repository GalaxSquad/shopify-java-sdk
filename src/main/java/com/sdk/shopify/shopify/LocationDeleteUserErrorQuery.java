// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs while deleting a location.
*/
public class LocationDeleteUserErrorQuery extends Query<LocationDeleteUserErrorQuery> {
    LocationDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public LocationDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public LocationDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public LocationDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
