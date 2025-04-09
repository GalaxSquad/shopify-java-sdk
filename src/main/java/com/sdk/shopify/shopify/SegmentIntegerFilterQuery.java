// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter with an integer that's been added to a segment query.
*/
public class SegmentIntegerFilterQuery extends Query<SegmentIntegerFilterQuery> {
    SegmentIntegerFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentIntegerFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentIntegerFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentIntegerFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
