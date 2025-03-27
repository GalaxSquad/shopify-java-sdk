// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The response type for the `segmentMembership` object.
*/
public class SegmentMembershipQuery extends Query<SegmentMembershipQuery> {
    SegmentMembershipQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A Boolean that indicates whether or not the customer in the query is a member of the segment, which
    * is identified using the `segmentId`.
    */
    public SegmentMembershipQuery isMember() {
        startField("isMember");

        return this;
    }

    /**
    * A `segmentId` that's used for testing membership.
    */
    public SegmentMembershipQuery segmentId() {
        startField("segmentId");

        return this;
    }
}
