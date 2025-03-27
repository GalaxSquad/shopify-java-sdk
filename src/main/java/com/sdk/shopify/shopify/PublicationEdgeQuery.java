// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Publication and a cursor during pagination.
*/
public class PublicationEdgeQuery extends Query<PublicationEdgeQuery> {
    PublicationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public PublicationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of PublicationEdge.
    */
    public PublicationEdgeQuery node(PublicationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
