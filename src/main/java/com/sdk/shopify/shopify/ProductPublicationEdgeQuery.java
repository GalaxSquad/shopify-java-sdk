// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ProductPublication and a cursor during pagination.
*/
public class ProductPublicationEdgeQuery extends Query<ProductPublicationEdgeQuery> {
    ProductPublicationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ProductPublicationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ProductPublicationEdge.
    */
    public ProductPublicationEdgeQuery node(ProductPublicationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ProductPublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
