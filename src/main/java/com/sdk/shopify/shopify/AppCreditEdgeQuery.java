// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one AppCredit and a cursor during pagination.
*/
public class AppCreditEdgeQuery extends Query<AppCreditEdgeQuery> {
    AppCreditEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public AppCreditEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of AppCreditEdge.
    */
    public AppCreditEdgeQuery node(AppCreditQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new AppCreditQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
