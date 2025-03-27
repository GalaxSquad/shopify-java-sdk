// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CompanyContactRole and a cursor during pagination.
*/
public class CompanyContactRoleEdgeQuery extends Query<CompanyContactRoleEdgeQuery> {
    CompanyContactRoleEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CompanyContactRoleEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CompanyContactRoleEdge.
    */
    public CompanyContactRoleEdgeQuery node(CompanyContactRoleQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
