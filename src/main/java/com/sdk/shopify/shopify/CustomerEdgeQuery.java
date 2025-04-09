// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Customer and a cursor during pagination.
*/
public class CustomerEdgeQuery extends Query<CustomerEdgeQuery> {
    CustomerEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CustomerEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CustomerEdge.
    */
    public CustomerEdgeQuery node(CustomerQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
