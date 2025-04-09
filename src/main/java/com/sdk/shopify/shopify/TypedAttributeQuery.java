// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a typed custom attribute.
*/
public class TypedAttributeQuery extends Query<TypedAttributeQuery> {
    TypedAttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Key or name of the attribute.
    */
    public TypedAttributeQuery key() {
        startField("key");

        return this;
    }

    /**
    * Value of the attribute.
    */
    public TypedAttributeQuery value() {
        startField("value");

        return this;
    }
}
