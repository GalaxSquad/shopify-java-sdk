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
