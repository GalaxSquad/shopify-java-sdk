// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors encountered while managing metaobject resources.
*/
public class MetaobjectUserErrorQuery extends Query<MetaobjectUserErrorQuery> {
    MetaobjectUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MetaobjectUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The index of the failing list element in an array.
    */
    public MetaobjectUserErrorQuery elementIndex() {
        startField("elementIndex");

        return this;
    }

    /**
    * The key of the failing object element.
    */
    public MetaobjectUserErrorQuery elementKey() {
        startField("elementKey");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MetaobjectUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MetaobjectUserErrorQuery message() {
        startField("message");

        return this;
    }
}
