// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A row count represents rows on background operation.
*/
public class RowCountQuery extends Query<RowCountQuery> {
    RowCountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Estimated number of rows contained within this background operation.
    */
    public RowCountQuery count() {
        startField("count");

        return this;
    }

    /**
    * Whether the operation exceeds max number of reportable rows.
    */
    public RowCountQuery exceedsMax() {
        startField("exceedsMax");

        return this;
    }
}
