// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `segmentCreate` mutation.
*/
public class SegmentCreatePayloadQuery extends Query<SegmentCreatePayloadQuery> {
    SegmentCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created segment.
    */
    public SegmentCreatePayloadQuery segment(SegmentQueryDefinition queryDef) {
        startField("segment");

        _queryBuilder.append('{');
        queryDef.define(new SegmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SegmentCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
