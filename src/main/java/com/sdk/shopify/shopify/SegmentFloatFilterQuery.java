// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter with a double-precision, floating-point value that's been added to a segment query.
*/
public class SegmentFloatFilterQuery extends Query<SegmentFloatFilterQuery> {
    SegmentFloatFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentFloatFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentFloatFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentFloatFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
