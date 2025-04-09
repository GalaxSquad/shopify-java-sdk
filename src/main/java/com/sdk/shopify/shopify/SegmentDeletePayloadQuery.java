// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `segmentDelete` mutation.
*/
public class SegmentDeletePayloadQuery extends Query<SegmentDeletePayloadQuery> {
    SegmentDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * ID of the deleted segment.
    */
    public SegmentDeletePayloadQuery deletedSegmentId() {
        startField("deletedSegmentId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SegmentDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
