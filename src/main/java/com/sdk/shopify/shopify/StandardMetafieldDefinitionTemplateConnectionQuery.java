// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type for paginating through multiple StandardMetafieldDefinitionTemplates.
*/
public class StandardMetafieldDefinitionTemplateConnectionQuery extends Query<StandardMetafieldDefinitionTemplateConnectionQuery> {
    StandardMetafieldDefinitionTemplateConnectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */
    public StandardMetafieldDefinitionTemplateConnectionQuery edges(StandardMetafieldDefinitionTemplateEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new StandardMetafieldDefinitionTemplateEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of nodes that are contained in StandardMetafieldDefinitionTemplateEdge. You can fetch data
    * about an individual node, or you can follow the edges to fetch data about a collection of related
    * nodes. At each node, you specify the fields that you want to retrieve.
    */
    public StandardMetafieldDefinitionTemplateConnectionQuery nodes(StandardMetafieldDefinitionTemplateQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new StandardMetafieldDefinitionTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */
    public StandardMetafieldDefinitionTemplateConnectionQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
