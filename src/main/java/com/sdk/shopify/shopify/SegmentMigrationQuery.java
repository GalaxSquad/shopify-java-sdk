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
