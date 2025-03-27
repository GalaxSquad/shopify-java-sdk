// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ShopifyPaymentsBalanceTransaction and a cursor during
* pagination.
*/
public class ShopifyPaymentsBalanceTransactionEdgeQuery extends Query<ShopifyPaymentsBalanceTransactionEdgeQuery> {
    ShopifyPaymentsBalanceTransactionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ShopifyPaymentsBalanceTransactionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ShopifyPaymentsBalanceTransactionEdge.
    */
    public ShopifyPaymentsBalanceTransactionEdgeQuery node(ShopifyPaymentsBalanceTransactionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsBalanceTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
