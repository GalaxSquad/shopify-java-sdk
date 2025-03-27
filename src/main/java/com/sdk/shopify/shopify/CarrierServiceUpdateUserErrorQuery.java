// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CarrierServiceUpdate`.
*/
public class CarrierServiceUpdateUserErrorQuery extends Query<CarrierServiceUpdateUserErrorQuery> {
    CarrierServiceUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CarrierServiceUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CarrierServiceUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CarrierServiceUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
