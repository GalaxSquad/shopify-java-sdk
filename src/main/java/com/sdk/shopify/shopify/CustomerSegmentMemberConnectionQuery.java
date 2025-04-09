// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The connection type for the `CustomerSegmentMembers` object.
*/
public class CustomerSegmentMemberConnectionQuery extends Query<CustomerSegmentMemberConnectionQuery> {
    CustomerSegmentMemberConnectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of edges.
    */
    public CustomerSegmentMemberConnectionQuery edges(CustomerSegmentMemberEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new CustomerSegmentMemberEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */
    public CustomerSegmentMemberConnectionQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The statistics for a given segment.
    */
    public CustomerSegmentMemberConnectionQuery statistics(SegmentStatisticsQueryDefinition queryDef) {
        startField("statistics");

        _queryBuilder.append('{');
        queryDef.define(new SegmentStatisticsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of members in a given segment.
    */
    public CustomerSegmentMemberConnectionQuery totalCount() {
        startField("totalCount");

        return this;
    }
}
