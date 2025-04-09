// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A list of maps that contain `segmentId` IDs and `isMember` Booleans. The maps represent segment
* memberships.
*/
public class SegmentMembershipResponseQuery extends Query<SegmentMembershipResponseQuery> {
    SegmentMembershipResponseQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The membership status for the given list of segments.
    */
    public SegmentMembershipResponseQuery memberships(SegmentMembershipQueryDefinition queryDef) {
        startField("memberships");

        _queryBuilder.append('{');
        queryDef.define(new SegmentMembershipQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
