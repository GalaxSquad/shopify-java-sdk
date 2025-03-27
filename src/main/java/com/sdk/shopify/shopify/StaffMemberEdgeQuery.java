// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one StaffMember and a cursor during pagination.
*/
public class StaffMemberEdgeQuery extends Query<StaffMemberEdgeQuery> {
    StaffMemberEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public StaffMemberEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of StaffMemberEdge.
    */
    public StaffMemberEdgeQuery node(StaffMemberQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
