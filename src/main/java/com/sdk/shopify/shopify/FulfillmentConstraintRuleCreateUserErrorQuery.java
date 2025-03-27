// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentConstraintRuleCreate`.
*/
public class FulfillmentConstraintRuleCreateUserErrorQuery extends Query<FulfillmentConstraintRuleCreateUserErrorQuery> {
    FulfillmentConstraintRuleCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentConstraintRuleCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentConstraintRuleCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentConstraintRuleCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
