// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a generic custom attribute, such as whether an order is a customer's first.
*/
public class AttributeQuery extends Query<AttributeQuery> {
    AttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The key or name of the attribute. For example, `"customersFirstOrder"`.
    */
    public AttributeQuery key() {
        startField("key");

        return this;
    }

    /**
    * The value of the attribute. For example, `"true"`.
    */
    public AttributeQuery value() {
        startField("value");

        return this;
    }
}
