// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderRiskAssessmentCreate`.
*/
public class OrderRiskAssessmentCreateUserErrorQuery extends Query<OrderRiskAssessmentCreateUserErrorQuery> {
    OrderRiskAssessmentCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderRiskAssessmentCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderRiskAssessmentCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderRiskAssessmentCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
