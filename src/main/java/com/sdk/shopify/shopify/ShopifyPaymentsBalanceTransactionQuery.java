// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A transaction that contributes to a Shopify Payments account balance.
*/
public class ShopifyPaymentsBalanceTransactionQuery extends Query<ShopifyPaymentsBalanceTransactionQuery> {
    ShopifyPaymentsBalanceTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The reason for the adjustment that's associated with the transaction.
    * If the source_type isn't an adjustment, the value will be null.
    */
    public ShopifyPaymentsBalanceTransactionQuery adjustmentReason() {
        startField("adjustmentReason");

        return this;
    }

    /**
    * The adjustment orders associated to the transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery adjustmentsOrders(ShopifyPaymentsAdjustmentOrderQueryDefinition queryDef) {
        startField("adjustmentsOrders");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsAdjustmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount contributing to the balance transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The associated order for the balance transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery associatedOrder(ShopifyPaymentsAssociatedOrderQueryDefinition queryDef) {
        startField("associatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsAssociatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Payout assoicated with the transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery associatedPayout(ShopifyPaymentsBalanceTransactionAssociatedPayoutQueryDefinition queryDef) {
        startField("associatedPayout");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsBalanceTransactionAssociatedPayoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fee amount contributing to the balance transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery fee(MoneyV2QueryDefinition queryDef) {
        startField("fee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The net amount contributing to the merchant's balance.
    */
    public ShopifyPaymentsBalanceTransactionQuery net(MoneyV2QueryDefinition queryDef) {
        startField("net");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the resource leading to the transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery sourceId() {
        startField("sourceId");

        return this;
    }

    /**
    * The id of the
    * [Order Transaction](https://shopify.dev/docs/admin-api/rest/reference/orders/transaction)
    * that resulted in this balance transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery sourceOrderTransactionId() {
        startField("sourceOrderTransactionId");

        return this;
    }

    /**
    * The source type of the balance transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery sourceType() {
        startField("sourceType");

        return this;
    }

    /**
    * Wether the tranaction was created in test mode.
    */
    public ShopifyPaymentsBalanceTransactionQuery test() {
        startField("test");

        return this;
    }

    /**
    * The date and time when the balance transaction was processed.
    */
    public ShopifyPaymentsBalanceTransactionQuery transactionDate() {
        startField("transactionDate");

        return this;
    }

    /**
    * The type of transaction.
    */
    public ShopifyPaymentsBalanceTransactionQuery type() {
        startField("type");

        return this;
    }
}
