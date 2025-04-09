// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error for a failed quantity rule operation.
*/
public class QuantityRuleUserErrorQuery extends Query<QuantityRuleUserErrorQuery> {
    QuantityRuleUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public QuantityRuleUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public QuantityRuleUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public QuantityRuleUserErrorQuery message() {
        startField("message");

        return this;
    }
}
