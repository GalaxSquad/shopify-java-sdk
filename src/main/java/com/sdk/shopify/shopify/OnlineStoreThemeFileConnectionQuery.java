// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type for paginating through multiple OnlineStoreThemeFiles.
*/
public class OnlineStoreThemeFileConnectionQuery extends Query<OnlineStoreThemeFileConnectionQuery> {
    OnlineStoreThemeFileConnectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */
    public OnlineStoreThemeFileConnectionQuery edges(OnlineStoreThemeFileEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of nodes that are contained in OnlineStoreThemeFileEdge. You can fetch data about an
    * individual node, or you can follow the edges to fetch data about a collection of related nodes. At
    * each node, you specify the fields that you want to retrieve.
    */
    public OnlineStoreThemeFileConnectionQuery nodes(OnlineStoreThemeFileQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */
    public OnlineStoreThemeFileConnectionQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * List of errors that occurred during the request.
    */
    public OnlineStoreThemeFileConnectionQuery userErrors(OnlineStoreThemeFileReadResultQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileReadResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
