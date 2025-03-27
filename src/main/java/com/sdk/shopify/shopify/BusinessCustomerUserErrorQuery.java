// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that happens during the execution of a business customer mutation.
*/
public class BusinessCustomerUserErrorQuery extends Query<BusinessCustomerUserErrorQuery> {
    BusinessCustomerUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public BusinessCustomerUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public BusinessCustomerUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public BusinessCustomerUserErrorQuery message() {
        startField("message");

        return this;
    }
}
