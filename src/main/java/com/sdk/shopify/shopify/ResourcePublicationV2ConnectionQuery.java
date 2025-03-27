// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type for paginating through multiple ResourcePublicationV2s.
*/
public class ResourcePublicationV2ConnectionQuery extends Query<ResourcePublicationV2ConnectionQuery> {
    ResourcePublicationV2ConnectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */
    public ResourcePublicationV2ConnectionQuery edges(ResourcePublicationV2EdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationV2EdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of nodes that are contained in ResourcePublicationV2Edge. You can fetch data about an
    * individual node, or you can follow the edges to fetch data about a collection of related nodes. At
    * each node, you specify the fields that you want to retrieve.
    */
    public ResourcePublicationV2ConnectionQuery nodes(ResourcePublicationV2QueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */
    public ResourcePublicationV2ConnectionQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
