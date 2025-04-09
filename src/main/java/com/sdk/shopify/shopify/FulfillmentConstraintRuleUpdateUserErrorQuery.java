// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentConstraintRuleUpdate`.
*/
public class FulfillmentConstraintRuleUpdateUserErrorQuery extends Query<FulfillmentConstraintRuleUpdateUserErrorQuery> {
    FulfillmentConstraintRuleUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentConstraintRuleUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentConstraintRuleUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentConstraintRuleUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
