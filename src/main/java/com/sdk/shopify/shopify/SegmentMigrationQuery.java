// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A segment and its corresponding saved search. 
* For example, you can use `SegmentMigration` to retrieve the segment ID that corresponds to a saved
* search ID.
*/
public class SegmentMigrationQuery extends Query<SegmentMigrationQuery> {
    SegmentMigrationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A globally-unique ID.
    */
    public SegmentMigrationQuery id() {
        startField("id");

        return this;
    }

    /**
    * The ID of the saved search.
    */
    public SegmentMigrationQuery savedSearchId() {
        startField("savedSearchId");

        return this;
    }

    /**
    * The ID of the segment.
    */
    public SegmentMigrationQuery segmentId() {
        startField("segmentId");

        return this;
    }
}
