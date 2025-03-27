// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CarrierServiceDelete`.
*/
public class CarrierServiceDeleteUserErrorQuery extends Query<CarrierServiceDeleteUserErrorQuery> {
    CarrierServiceDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CarrierServiceDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CarrierServiceDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CarrierServiceDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
