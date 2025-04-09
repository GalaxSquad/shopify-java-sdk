// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter option is one possible value in a search filter.
*/
public class FilterOptionQuery extends Query<FilterOptionQuery> {
    FilterOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The filter option's label for display purposes.
    */
    public FilterOptionQuery label() {
        startField("label");

        return this;
    }

    /**
    * The filter option's value.
    */
    public FilterOptionQuery value() {
        startField("value");

        return this;
    }
}
