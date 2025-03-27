// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MetafieldDefinitionConstraintValue and a cursor during
* pagination.
*/
public class MetafieldDefinitionConstraintValueEdgeQuery extends Query<MetafieldDefinitionConstraintValueEdgeQuery> {
    MetafieldDefinitionConstraintValueEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MetafieldDefinitionConstraintValueEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MetafieldDefinitionConstraintValueEdge.
    */
    public MetafieldDefinitionConstraintValueEdgeQuery node(MetafieldDefinitionConstraintValueQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionConstraintValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
