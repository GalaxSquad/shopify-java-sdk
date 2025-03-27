// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Image and a cursor during pagination.
*/
public class ImageEdgeQuery extends Query<ImageEdgeQuery> {
    ImageEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ImageEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ImageEdge.
    */
    public ImageEdgeQuery node(ImageQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
