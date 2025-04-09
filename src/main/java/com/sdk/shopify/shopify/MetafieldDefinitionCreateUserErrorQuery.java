// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `MetafieldDefinitionCreate`.
*/
public class MetafieldDefinitionCreateUserErrorQuery extends Query<MetafieldDefinitionCreateUserErrorQuery> {
    MetafieldDefinitionCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetafieldDefinitionCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The index of the array element that's causing the error.
    */
    public MetafieldDefinitionCreateUserErrorQuery elementIndex() {
        startField("elementIndex");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetafieldDefinitionCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetafieldDefinitionCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
