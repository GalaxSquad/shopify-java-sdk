// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one LocalizedField and a cursor during pagination.
*/
public class LocalizedFieldEdgeQuery extends Query<LocalizedFieldEdgeQuery> {
    LocalizedFieldEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public LocalizedFieldEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of LocalizedFieldEdge.
    */
    public LocalizedFieldEdgeQuery node(LocalizedFieldQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new LocalizedFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
