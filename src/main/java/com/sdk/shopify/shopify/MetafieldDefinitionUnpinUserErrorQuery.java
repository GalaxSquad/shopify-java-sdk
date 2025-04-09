// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `MetafieldDefinitionUnpin`.
*/
public class MetafieldDefinitionUnpinUserErrorQuery extends Query<MetafieldDefinitionUnpinUserErrorQuery> {
    MetafieldDefinitionUnpinUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetafieldDefinitionUnpinUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetafieldDefinitionUnpinUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetafieldDefinitionUnpinUserErrorQuery message() {
        startField("message");

        return this;
    }
}
