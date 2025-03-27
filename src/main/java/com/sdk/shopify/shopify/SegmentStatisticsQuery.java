// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The statistics of a given segment.
*/
public class SegmentStatisticsQuery extends Query<SegmentStatisticsQuery> {
    SegmentStatisticsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The statistics of a given attribute.
    */
    public SegmentStatisticsQuery attributeStatistics(String attributeName, SegmentAttributeStatisticsQueryDefinition queryDef) {
        startField("attributeStatistics");

        _queryBuilder.append("(attributeName:");
        Query.appendQuotedString(_queryBuilder, attributeName.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentAttributeStatisticsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
