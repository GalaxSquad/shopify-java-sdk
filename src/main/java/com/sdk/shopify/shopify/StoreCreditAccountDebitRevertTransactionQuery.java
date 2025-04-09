// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A debit revert transaction which increases the store credit account balance.
* Debit revert transactions are created automatically when a [store credit account debit
* transaction](https://shopify.dev/api/admin-graphql/latest/objects/StoreCreditAccountDebitTransaction
* ) is reverted.
* Store credit account debit transactions are reverted when an order is cancelled, refunded or in the
* event of a payment failure at checkout.
* The amount added to the balance is equal to the amount reverted on the original credit.
*/
public class StoreCreditAccountDebitRevertTransactionQuery extends Query<StoreCreditAccountDebitRevertTransactionQuery> {
    StoreCreditAccountDebitRevertTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The store credit account that the transaction belongs to.
    */
    public StoreCreditAccountDebitRevertTransactionQuery account(StoreCreditAccountQueryDefinition queryDef) {
        startField("account");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of the transaction.
    */
    public StoreCreditAccountDebitRevertTransactionQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The balance of the account after the transaction.
    */
    public StoreCreditAccountDebitRevertTransactionQuery balanceAfterTransaction(MoneyV2QueryDefinition queryDef) {
        startField("balanceAfterTransaction");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the transaction was created.
    */
    public StoreCreditAccountDebitRevertTransactionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The reverted debit transaction.
    */
    public StoreCreditAccountDebitRevertTransactionQuery debitTransaction(StoreCreditAccountDebitTransactionQueryDefinition queryDef) {
        startField("debitTransaction");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountDebitTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */
    public StoreCreditAccountDebitRevertTransactionQuery event() {
        startField("event");

        return this;
    }

    /**
    * The origin of the store credit account transaction.
    */
    public StoreCreditAccountDebitRevertTransactionQuery origin(StoreCreditAccountTransactionOriginQueryDefinition queryDef) {
        startField("origin");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountTransactionOriginQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
