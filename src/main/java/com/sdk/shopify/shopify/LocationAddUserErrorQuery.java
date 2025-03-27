// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs while adding a location.
*/
public class LocationAddUserErrorQuery extends Query<LocationAddUserErrorQuery> {
    LocationAddUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public LocationAddUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public LocationAddUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public LocationAddUserErrorQuery message() {
        startField("message");

        return this;
    }
}
