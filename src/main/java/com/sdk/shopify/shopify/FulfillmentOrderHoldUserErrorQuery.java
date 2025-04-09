// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentOrderHold`.
*/
public class FulfillmentOrderHoldUserErrorQuery extends Query<FulfillmentOrderHoldUserErrorQuery> {
    FulfillmentOrderHoldUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentOrderHoldUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentOrderHoldUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentOrderHoldUserErrorQuery message() {
        startField("message");

        return this;
    }
}
