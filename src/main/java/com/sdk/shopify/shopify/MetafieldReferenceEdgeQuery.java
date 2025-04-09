// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MetafieldReference and a cursor during pagination.
*/
public class MetafieldReferenceEdgeQuery extends Query<MetafieldReferenceEdgeQuery> {
    MetafieldReferenceEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MetafieldReferenceEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MetafieldReferenceEdge.
    */
    public MetafieldReferenceEdgeQuery node(MetafieldReferenceQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldReferenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
