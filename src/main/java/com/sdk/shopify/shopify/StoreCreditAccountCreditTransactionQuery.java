// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A credit transaction which increases the store credit account balance.
*/
public class StoreCreditAccountCreditTransactionQuery extends Query<StoreCreditAccountCreditTransactionQuery> {
    StoreCreditAccountCreditTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The store credit account that the transaction belongs to.
    */
    public StoreCreditAccountCreditTransactionQuery account(StoreCreditAccountQueryDefinition queryDef) {
        startField("account");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of the transaction.
    */
    public StoreCreditAccountCreditTransactionQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The balance of the account after the transaction.
    */
    public StoreCreditAccountCreditTransactionQuery balanceAfterTransaction(MoneyV2QueryDefinition queryDef) {
        startField("balanceAfterTransaction");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the transaction was created.
    */
    public StoreCreditAccountCreditTransactionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */
    public StoreCreditAccountCreditTransactionQuery event() {
        startField("event");

        return this;
    }

    /**
    * The time at which the transaction expires.
    * Debit transactions will always spend the soonest expiring credit first.
    */
    public StoreCreditAccountCreditTransactionQuery expiresAt() {
        startField("expiresAt");

        return this;
    }

    /**
    * The origin of the store credit account transaction.
    */
    public StoreCreditAccountCreditTransactionQuery origin(StoreCreditAccountTransactionOriginQueryDefinition queryDef) {
        startField("origin");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountTransactionOriginQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The remaining amount of the credit.
    * The remaining amount will decrease when a debit spends this credit. It may also increase if that
    * debit is subsequently reverted.
    * In the event that the credit expires, the remaining amount will represent the amount that remained
    * as the expiry ocurred.
    */
    public StoreCreditAccountCreditTransactionQuery remainingAmount(MoneyV2QueryDefinition queryDef) {
        startField("remainingAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
