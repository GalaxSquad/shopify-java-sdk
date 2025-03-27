// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Metaobject and a cursor during pagination.
*/
public class MetaobjectEdgeQuery extends Query<MetaobjectEdgeQuery> {
    MetaobjectEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MetaobjectEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MetaobjectEdge.
    */
    public MetaobjectEdgeQuery node(MetaobjectQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
