// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The order associated to the balance transaction.
*/
public class ShopifyPaymentsAssociatedOrderQuery extends Query<ShopifyPaymentsAssociatedOrderQuery> {
    ShopifyPaymentsAssociatedOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the associated order.
    */
    public ShopifyPaymentsAssociatedOrderQuery id() {
        startField("id");

        return this;
    }

    /**
    * The name of the associated order.
    */
    public ShopifyPaymentsAssociatedOrderQuery name() {
        startField("name");

        return this;
    }
}
