// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A dynamic collection of customers based on specific criteria.
*/
public class SegmentQuery extends Query<SegmentQuery> {
    SegmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the segment was added to the store.
    */
    public SegmentQuery creationDate() {
        startField("creationDate");

        return this;
    }

    /**
    * The date and time when the segment was last updated.
    */
    public SegmentQuery lastEditDate() {
        startField("lastEditDate");

        return this;
    }

    /**
    * The name of the segment.
    */
    public SegmentQuery name() {
        startField("name");

        return this;
    }

    /**
    * A precise definition of the segment. The definition is composed of a combination of conditions on
    * facts about customers.
    */
    public SegmentQuery query() {
        startField("query");

        return this;
    }
}
