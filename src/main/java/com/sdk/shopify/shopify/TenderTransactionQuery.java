// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A TenderTransaction represents a transaction with financial impact on a shop's balance sheet. A
* tender transaction always
* represents actual money movement between a buyer and a shop. TenderTransactions can be used instead
* of OrderTransactions
* for reconciling a shop's cash flow. A TenderTransaction is immutable once created.
*/
public class TenderTransactionQuery extends Query<TenderTransactionQuery> {
    TenderTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The amount and currency of the tender transaction.
    */
    public TenderTransactionQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The order that's related to the tender transaction. This value is null if the order has been
    * deleted.
    */
    public TenderTransactionQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Information about the payment method used for the transaction.
    */
    public TenderTransactionQuery paymentMethod() {
        startField("paymentMethod");

        return this;
    }

    /**
    * Date and time when the transaction was processed.
    */
    public TenderTransactionQuery processedAt() {
        startField("processedAt");

        return this;
    }

    /**
    * The remote gateway reference associated with the tender transaction.
    */
    public TenderTransactionQuery remoteReference() {
        startField("remoteReference");

        return this;
    }

    /**
    * Whether the transaction is a test transaction.
    */
    public TenderTransactionQuery test() {
        startField("test");

        return this;
    }

    /**
    * Information about the payment instrument used for the transaction.
    */
    public TenderTransactionQuery transactionDetails(TenderTransactionDetailsQueryDefinition queryDef) {
        startField("transactionDetails");

        _queryBuilder.append('{');
        queryDef.define(new TenderTransactionDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member who performed the transaction.
    */
    public TenderTransactionQuery user(StaffMemberQueryDefinition queryDef) {
        startField("user");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
