// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a discount mutation.
*/
public class DiscountUserErrorQuery extends Query<DiscountUserErrorQuery> {
    DiscountUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DiscountUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * Extra information about this error.
    */
    public DiscountUserErrorQuery extraInfo() {
        startField("extraInfo");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DiscountUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DiscountUserErrorQuery message() {
        startField("message");

        return this;
    }
}
