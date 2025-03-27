// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentOrderReschedule`.
*/
public class FulfillmentOrderRescheduleUserErrorQuery extends Query<FulfillmentOrderRescheduleUserErrorQuery> {
    FulfillmentOrderRescheduleUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentOrderRescheduleUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentOrderRescheduleUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentOrderRescheduleUserErrorQuery message() {
        startField("message");

        return this;
    }
}
