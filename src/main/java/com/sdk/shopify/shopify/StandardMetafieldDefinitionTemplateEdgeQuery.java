// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one StandardMetafieldDefinitionTemplate and a cursor during
* pagination.
*/
public class StandardMetafieldDefinitionTemplateEdgeQuery extends Query<StandardMetafieldDefinitionTemplateEdgeQuery> {
    StandardMetafieldDefinitionTemplateEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public StandardMetafieldDefinitionTemplateEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of StandardMetafieldDefinitionTemplateEdge.
    */
    public StandardMetafieldDefinitionTemplateEdgeQuery node(StandardMetafieldDefinitionTemplateQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new StandardMetafieldDefinitionTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
