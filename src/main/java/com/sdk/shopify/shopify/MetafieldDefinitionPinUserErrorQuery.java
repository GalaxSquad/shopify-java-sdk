// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `MetafieldDefinitionPin`.
*/
public class MetafieldDefinitionPinUserErrorQuery extends Query<MetafieldDefinitionPinUserErrorQuery> {
    MetafieldDefinitionPinUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetafieldDefinitionPinUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetafieldDefinitionPinUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetafieldDefinitionPinUserErrorQuery message() {
        startField("message");

        return this;
    }
}
