// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one LocalizationExtension and a cursor during pagination.
*/
public class LocalizationExtensionEdgeQuery extends Query<LocalizationExtensionEdgeQuery> {
    LocalizationExtensionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public LocalizationExtensionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of LocalizationExtensionEdge.
    */
    public LocalizationExtensionEdgeQuery node(LocalizationExtensionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new LocalizationExtensionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
