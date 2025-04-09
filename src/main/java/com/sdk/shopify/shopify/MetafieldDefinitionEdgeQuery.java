// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MetafieldDefinition and a cursor during pagination.
*/
public class MetafieldDefinitionEdgeQuery extends Query<MetafieldDefinitionEdgeQuery> {
    MetafieldDefinitionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MetafieldDefinitionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MetafieldDefinitionEdge.
    */
    public MetafieldDefinitionEdgeQuery node(MetafieldDefinitionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
