// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentOrdersSetFulfillmentDeadline`.
*/
public class FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery extends Query<FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery> {
    FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery message() {
        startField("message");

        return this;
    }
}
