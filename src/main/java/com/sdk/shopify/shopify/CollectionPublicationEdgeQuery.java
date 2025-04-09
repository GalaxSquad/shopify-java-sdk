// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CollectionPublication and a cursor during pagination.
*/
public class CollectionPublicationEdgeQuery extends Query<CollectionPublicationEdgeQuery> {
    CollectionPublicationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CollectionPublicationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CollectionPublicationEdge.
    */
    public CollectionPublicationEdgeQuery node(CollectionPublicationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CollectionPublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
