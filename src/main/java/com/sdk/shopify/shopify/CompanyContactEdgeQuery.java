// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CompanyContact and a cursor during pagination.
*/
public class CompanyContactEdgeQuery extends Query<CompanyContactEdgeQuery> {
    CompanyContactEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CompanyContactEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CompanyContactEdge.
    */
    public CompanyContactEdgeQuery node(CompanyContactQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
