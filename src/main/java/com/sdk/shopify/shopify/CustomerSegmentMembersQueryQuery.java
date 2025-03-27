// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A job to determine a list of members, such as customers, that are associated with an individual
* segment.
*/
public class CustomerSegmentMembersQueryQuery extends Query<CustomerSegmentMembersQueryQuery> {
    CustomerSegmentMembersQueryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The current total number of members in a given segment.
    */
    public CustomerSegmentMembersQueryQuery currentCount() {
        startField("currentCount");

        return this;
    }

    /**
    * This indicates if the job is still queued or has been run.
    */
    public CustomerSegmentMembersQueryQuery done() {
        startField("done");

        return this;
    }
}
