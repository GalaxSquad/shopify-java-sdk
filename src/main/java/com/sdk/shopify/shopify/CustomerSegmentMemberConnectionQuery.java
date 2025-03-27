// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
