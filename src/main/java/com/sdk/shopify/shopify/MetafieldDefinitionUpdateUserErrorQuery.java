// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `MetafieldDefinitionUpdate`.
*/
public class MetafieldDefinitionUpdateUserErrorQuery extends Query<MetafieldDefinitionUpdateUserErrorQuery> {
    MetafieldDefinitionUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetafieldDefinitionUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The index of the array element that's causing the error.
    */
    public MetafieldDefinitionUpdateUserErrorQuery elementIndex() {
        startField("elementIndex");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetafieldDefinitionUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetafieldDefinitionUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
