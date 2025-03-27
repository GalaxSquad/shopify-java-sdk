// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The statistics of a given attribute.
*/
public class SegmentAttributeStatisticsQuery extends Query<SegmentAttributeStatisticsQuery> {
    SegmentAttributeStatisticsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The average of a given attribute.
    */
    public SegmentAttributeStatisticsQuery average() {
        startField("average");

        return this;
    }

    /**
    * The sum of a given attribute.
    */
    public SegmentAttributeStatisticsQuery sum() {
        startField("sum");

        return this;
    }
}
