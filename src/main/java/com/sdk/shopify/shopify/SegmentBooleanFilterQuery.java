// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter with a Boolean value that's been added to a segment query.
*/
public class SegmentBooleanFilterQuery extends Query<SegmentBooleanFilterQuery> {
    SegmentBooleanFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentBooleanFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentBooleanFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentBooleanFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
