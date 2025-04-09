// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a delivery customization mutation.
*/
public class DeliveryCustomizationErrorQuery extends Query<DeliveryCustomizationErrorQuery> {
    DeliveryCustomizationErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DeliveryCustomizationErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DeliveryCustomizationErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DeliveryCustomizationErrorQuery message() {
        startField("message");

        return this;
    }
}
