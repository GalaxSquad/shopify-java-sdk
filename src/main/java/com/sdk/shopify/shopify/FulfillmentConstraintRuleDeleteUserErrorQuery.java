// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `FulfillmentConstraintRuleDelete`.
*/
public class FulfillmentConstraintRuleDeleteUserErrorQuery extends Query<FulfillmentConstraintRuleDeleteUserErrorQuery> {
    FulfillmentConstraintRuleDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public FulfillmentConstraintRuleDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public FulfillmentConstraintRuleDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public FulfillmentConstraintRuleDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
