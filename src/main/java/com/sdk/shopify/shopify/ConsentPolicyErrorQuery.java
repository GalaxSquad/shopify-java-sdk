// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The errors encountered while performing mutations on consent policies.
*/
public class ConsentPolicyErrorQuery extends Query<ConsentPolicyErrorQuery> {
    ConsentPolicyErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ConsentPolicyErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ConsentPolicyErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ConsentPolicyErrorQuery message() {
        startField("message");

        return this;
    }
}
