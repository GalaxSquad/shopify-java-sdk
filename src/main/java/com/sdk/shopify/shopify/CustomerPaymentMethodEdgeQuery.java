// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CustomerPaymentMethod and a cursor during pagination.
*/
public class CustomerPaymentMethodEdgeQuery extends Query<CustomerPaymentMethodEdgeQuery> {
    CustomerPaymentMethodEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CustomerPaymentMethodEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CustomerPaymentMethodEdge.
    */
    public CustomerPaymentMethodEdgeQuery node(CustomerPaymentMethodQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
