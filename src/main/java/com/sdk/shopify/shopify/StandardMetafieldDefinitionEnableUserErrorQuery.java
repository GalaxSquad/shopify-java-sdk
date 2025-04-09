// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `StandardMetafieldDefinitionEnable`.
*/
public class StandardMetafieldDefinitionEnableUserErrorQuery extends Query<StandardMetafieldDefinitionEnableUserErrorQuery> {
    StandardMetafieldDefinitionEnableUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public StandardMetafieldDefinitionEnableUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public StandardMetafieldDefinitionEnableUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public StandardMetafieldDefinitionEnableUserErrorQuery message() {
        startField("message");

        return this;
    }
}
