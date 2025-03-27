// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A suggested transaction. Suggested transaction are usually used in the context of refunds
* and exchanges.
*/
public class SuggestedOrderTransactionQuery extends Query<SuggestedOrderTransactionQuery> {
    SuggestedOrderTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The masked account number associated with the payment method.
    */
    public SuggestedOrderTransactionQuery accountNumber() {
        startField("accountNumber");

        return this;
    }

    /**
    * The amount and currency of the suggested order transaction in shop and presentment currencies.
    */
    public SuggestedOrderTransactionQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The human-readable payment gateway name suggested to process the transaction.
    */
    public SuggestedOrderTransactionQuery formattedGateway() {
        startField("formattedGateway");

        return this;
    }

    /**
    * The suggested payment gateway used to process the transaction.
    */
    public SuggestedOrderTransactionQuery gateway() {
        startField("gateway");

        return this;
    }

    /**
    * Specifies the kind of the suggested order transaction.
    */
    public SuggestedOrderTransactionQuery kind() {
        startField("kind");

        return this;
    }

    /**
    * Specifies the available amount to refund on the gateway in shop and presentment currencies. Only
    * available within SuggestedRefund.
    */
    public SuggestedOrderTransactionQuery maximumRefundableSet(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundableSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The associated parent transaction, for example the authorization of a capture.
    */
    public SuggestedOrderTransactionQuery parentTransaction(OrderTransactionQueryDefinition queryDef) {
        startField("parentTransaction");

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The associated payment details related to the transaction.
    */
    public SuggestedOrderTransactionQuery paymentDetails(PaymentDetailsQueryDefinition queryDef) {
        startField("paymentDetails");

        _queryBuilder.append('{');
        queryDef.define(new PaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
