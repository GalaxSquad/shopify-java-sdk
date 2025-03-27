// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CustomerAccountPage and a cursor during pagination.
*/
public class CustomerAccountPageEdgeQuery extends Query<CustomerAccountPageEdgeQuery> {
    CustomerAccountPageEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CustomerAccountPageEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CustomerAccountPageEdge.
    */
    public CustomerAccountPageEdgeQuery node(CustomerAccountPageQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAccountPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
