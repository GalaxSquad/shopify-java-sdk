// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CustomerVisitProductInfo and a cursor during pagination.
*/
public class CustomerVisitProductInfoEdgeQuery extends Query<CustomerVisitProductInfoEdgeQuery> {
    CustomerVisitProductInfoEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CustomerVisitProductInfoEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CustomerVisitProductInfoEdge.
    */
    public CustomerVisitProductInfoEdgeQuery node(CustomerVisitProductInfoQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CustomerVisitProductInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
