// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `MetafieldsSet`.
*/
public class MetafieldsSetUserErrorQuery extends Query<MetafieldsSetUserErrorQuery> {
    MetafieldsSetUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetafieldsSetUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The index of the array element that's causing the error.
    */
    public MetafieldsSetUserErrorQuery elementIndex() {
        startField("elementIndex");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetafieldsSetUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetafieldsSetUserErrorQuery message() {
        startField("message");

        return this;
    }
}
