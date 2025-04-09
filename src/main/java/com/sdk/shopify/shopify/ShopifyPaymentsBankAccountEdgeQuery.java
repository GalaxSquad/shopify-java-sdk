// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ShopifyPaymentsBankAccount and a cursor during pagination.
*/
public class ShopifyPaymentsBankAccountEdgeQuery extends Query<ShopifyPaymentsBankAccountEdgeQuery> {
    ShopifyPaymentsBankAccountEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ShopifyPaymentsBankAccountEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ShopifyPaymentsBankAccountEdge.
    */
    public ShopifyPaymentsBankAccountEdgeQuery node(ShopifyPaymentsBankAccountQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsBankAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
