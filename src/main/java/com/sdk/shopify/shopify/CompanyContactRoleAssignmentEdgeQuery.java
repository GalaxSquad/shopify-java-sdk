// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CompanyContactRoleAssignment and a cursor during pagination.
*/
public class CompanyContactRoleAssignmentEdgeQuery extends Query<CompanyContactRoleAssignmentEdgeQuery> {
    CompanyContactRoleAssignmentEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CompanyContactRoleAssignmentEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CompanyContactRoleAssignmentEdge.
    */
    public CompanyContactRoleAssignmentEdgeQuery node(CompanyContactRoleAssignmentQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRoleAssignmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
