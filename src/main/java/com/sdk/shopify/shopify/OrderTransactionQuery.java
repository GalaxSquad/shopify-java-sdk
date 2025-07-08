// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The `OrderTransaction` object represents a payment transaction that's associated with an order. An
* order
* transaction is a specific action or event that happens within the context of an order, such as a
* customer paying
* for a purchase or receiving a refund, or other payment-related activity.
* Use the `OrderTransaction` object to capture the complete lifecycle of a payment, from initial
* authorization to final settlement, including refunds and currency exchanges. Common use cases for
* using the
* `OrderTransaction` object include:
* - Processing new payments for orders
* - Managing payment authorizations and captures
* - Processing refunds for returned items
* - Tracking payment status and errors
* - Managing multi-currency transactions
* - Handling payment gateway integrations
* Each `OrderTransaction` object has a
* [`kind`](https://shopify.dev/docs/api/admin-graphql/latest/enums/OrderTransactionKind)
* that defines the type of transaction and a
* [`status`](https://shopify.dev/docs/api/admin-graphql/latest/enums/OrderTransactionStatus)
* that indicates the current state of the transaction. The object stores detailed information about
* payment
* methods, gateway processing, and settlement details.
* Learn more about [payment processing](https://help.shopify.com/manual/payments)
* and [payment gateway integrations](https://www.shopify.com/ca/payment-gateways).
*/
public class OrderTransactionQuery extends Query<OrderTransactionQuery> {
    OrderTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The masked account number associated with the payment method.
    */
    public OrderTransactionQuery accountNumber() {
        startField("accountNumber");

        return this;
    }

    /**
    * The rounding adjustment applied on the cash amount in shop and presentment currencies.
    */
    public OrderTransactionQuery amountRoundingSet(MoneyBagQueryDefinition queryDef) {
        startField("amountRoundingSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount and currency of the transaction in shop and presentment currencies.
    */
    public OrderTransactionQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Authorization code associated with the transaction.
    */
    public OrderTransactionQuery authorizationCode() {
        startField("authorizationCode");

        return this;
    }

    /**
    * The time when the authorization expires. This field is available only to stores on a Shopify Plus
    * plan.
    */
    public OrderTransactionQuery authorizationExpiresAt() {
        startField("authorizationExpiresAt");

        return this;
    }

    /**
    * Date and time when the transaction was created.
    */
    public OrderTransactionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * An adjustment on the transaction showing the amount lost or gained  due to fluctuations in the
    * currency exchange rate.
    */
    public OrderTransactionQuery currencyExchangeAdjustment(CurrencyExchangeAdjustmentQueryDefinition queryDef) {
        startField("currencyExchangeAdjustment");

        _queryBuilder.append('{');
        queryDef.define(new CurrencyExchangeAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Shopify Point of Sale device used to process the transaction.
    */
    public OrderTransactionQuery device(PointOfSaleDeviceQueryDefinition queryDef) {
        startField("device");

        _queryBuilder.append('{');
        queryDef.define(new PointOfSaleDeviceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A standardized error code, independent of the payment provider.
    */
    public OrderTransactionQuery errorCode() {
        startField("errorCode");

        return this;
    }

    /**
    * The transaction fees charged on the order transaction. Only present for Shopify Payments
    * transactions.
    */
    public OrderTransactionQuery fees(TransactionFeeQueryDefinition queryDef) {
        startField("fees");

        _queryBuilder.append('{');
        queryDef.define(new TransactionFeeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The human-readable payment gateway name used to process the transaction.
    */
    public OrderTransactionQuery formattedGateway() {
        startField("formattedGateway");

        return this;
    }

    /**
    * The payment gateway used to process the transaction.
    */
    public OrderTransactionQuery gateway() {
        startField("gateway");

        return this;
    }

    /**
    * The kind of transaction.
    */
    public OrderTransactionQuery kind() {
        startField("kind");

        return this;
    }

    /**
    * The physical location where the transaction was processed.
    */
    public OrderTransactionQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the transaction is processed by manual payment gateway.
    */
    public OrderTransactionQuery manualPaymentGateway() {
        startField("manualPaymentGateway");

        return this;
    }

    /**
    * Whether the transaction can be manually captured.
    */
    public OrderTransactionQuery manuallyCapturable() {
        startField("manuallyCapturable");

        return this;
    }

    /**
    * Specifies the available amount with currency to refund on the gateway.
    * This value is only available for transactions of type `SuggestedRefund`.
    */
    public OrderTransactionQuery maximumRefundableV2(MoneyV2QueryDefinition queryDef) {
        startField("maximumRefundableV2");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the transaction can be captured multiple times.
    */
    public OrderTransactionQuery multiCapturable() {
        startField("multiCapturable");

        return this;
    }

    /**
    * The associated order.
    */
    public OrderTransactionQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The associated parent transaction, for example the authorization of a capture.
    */
    public OrderTransactionQuery parentTransaction(OrderTransactionQueryDefinition queryDef) {
        startField("parentTransaction");

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The payment details for the transaction.
    */
    public OrderTransactionQuery paymentDetails(PaymentDetailsQueryDefinition queryDef) {
        startField("paymentDetails");

        _queryBuilder.append('{');
        queryDef.define(new PaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The payment icon to display for the transaction.
    */
    public OrderTransactionQuery paymentIcon(ImageQueryDefinition queryDef) {
        startField("paymentIcon");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The payment ID associated with the transaction.
    */
    public OrderTransactionQuery paymentId() {
        startField("paymentId");

        return this;
    }

    /**
    * Date and time when the transaction was processed.
    */
    public OrderTransactionQuery processedAt() {
        startField("processedAt");

        return this;
    }

    /**
    * The transaction receipt that the payment gateway attaches to the transaction.
    * The value of this field depends on which payment gateway processed the transaction.
    */
    public OrderTransactionQuery receiptJson() {
        startField("receiptJson");

        return this;
    }

    /**
    * The settlement currency.
    */
    public OrderTransactionQuery settlementCurrency() {
        startField("settlementCurrency");

        return this;
    }

    /**
    * The rate used when converting the transaction amount to settlement currency.
    */
    public OrderTransactionQuery settlementCurrencyRate() {
        startField("settlementCurrencyRate");

        return this;
    }

    /**
    * Contains all Shopify Payments information related to an order transaction. This field is available
    * only to stores on a Shopify Plus plan.
    */
    public OrderTransactionQuery shopifyPaymentsSet(ShopifyPaymentsTransactionSetQueryDefinition queryDef) {
        startField("shopifyPaymentsSet");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsTransactionSetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this transaction.
    */
    public OrderTransactionQuery status() {
        startField("status");

        return this;
    }

    /**
    * Whether the transaction is a test transaction.
    */
    public OrderTransactionQuery test() {
        startField("test");

        return this;
    }

    /**
    * Specifies the available amount with currency to capture on the gateway in shop and presentment
    * currencies.
    * Only available when an amount is capturable or manually mark as paid.
    */
    public OrderTransactionQuery totalUnsettledSet(MoneyBagQueryDefinition queryDef) {
        startField("totalUnsettledSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Staff member who was logged into the Shopify POS device when the transaction was processed.
    */
    public OrderTransactionQuery user(StaffMemberQueryDefinition queryDef) {
        startField("user");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
