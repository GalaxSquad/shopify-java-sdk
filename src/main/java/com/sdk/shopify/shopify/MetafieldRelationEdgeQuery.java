// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MetafieldRelation and a cursor during pagination.
*/
public class MetafieldRelationEdgeQuery extends Query<MetafieldRelationEdgeQuery> {
    MetafieldRelationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MetafieldRelationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MetafieldRelationEdge.
    */
    public MetafieldRelationEdgeQuery node(MetafieldRelationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldRelationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
