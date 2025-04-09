// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter with a set of possible values that's been added to a segment query.
*/
public class SegmentEnumFilterQuery extends Query<SegmentEnumFilterQuery> {
    SegmentEnumFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentEnumFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentEnumFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentEnumFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
