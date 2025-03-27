// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter with a date value that's been added to a segment query.
*/
public class SegmentDateFilterQuery extends Query<SegmentDateFilterQuery> {
    SegmentDateFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentDateFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentDateFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentDateFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
