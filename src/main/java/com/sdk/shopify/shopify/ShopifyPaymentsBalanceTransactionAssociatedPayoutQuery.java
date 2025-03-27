// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The payout associated with a balance transaction.
*/
public class ShopifyPaymentsBalanceTransactionAssociatedPayoutQuery extends Query<ShopifyPaymentsBalanceTransactionAssociatedPayoutQuery> {
    ShopifyPaymentsBalanceTransactionAssociatedPayoutQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the payout associated with the balance transaction.
    */
    public ShopifyPaymentsBalanceTransactionAssociatedPayoutQuery id() {
        startField("id");

        return this;
    }

    /**
    * The status of the payout associated with the balance transaction.
    */
    public ShopifyPaymentsBalanceTransactionAssociatedPayoutQuery status() {
        startField("status");

        return this;
    }
}
