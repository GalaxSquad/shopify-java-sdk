// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `MetafieldDefinitionDelete`.
*/
public class MetafieldDefinitionDeleteUserErrorQuery extends Query<MetafieldDefinitionDeleteUserErrorQuery> {
    MetafieldDefinitionDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetafieldDefinitionDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetafieldDefinitionDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetafieldDefinitionDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
