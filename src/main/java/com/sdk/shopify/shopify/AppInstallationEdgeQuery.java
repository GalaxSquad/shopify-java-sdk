// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one AppInstallation and a cursor during pagination.
*/
public class AppInstallationEdgeQuery extends Query<AppInstallationEdgeQuery> {
    AppInstallationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public AppInstallationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of AppInstallationEdge.
    */
    public AppInstallationEdgeQuery node(AppInstallationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new AppInstallationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
