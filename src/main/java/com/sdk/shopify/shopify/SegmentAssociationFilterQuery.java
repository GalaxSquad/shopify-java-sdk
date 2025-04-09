// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter that takes a value that's associated with an object. For example, the `tags` field is
* associated with the [`Customer`](/api/admin-graphql/latest/objects/Customer) object.
*/
public class SegmentAssociationFilterQuery extends Query<SegmentAssociationFilterQuery> {
    SegmentAssociationFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentAssociationFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentAssociationFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentAssociationFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
