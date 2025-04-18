// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CarrierServiceCreate`.
*/
public class CarrierServiceCreateUserErrorQuery extends Query<CarrierServiceCreateUserErrorQuery> {
    CarrierServiceCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CarrierServiceCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CarrierServiceCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CarrierServiceCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
