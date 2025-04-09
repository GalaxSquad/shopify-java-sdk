// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A debit transaction which decreases the store credit account balance.
*/
public class StoreCreditAccountDebitTransactionQuery extends Query<StoreCreditAccountDebitTransactionQuery> {
    StoreCreditAccountDebitTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The store credit account that the transaction belongs to.
    */
    public StoreCreditAccountDebitTransactionQuery account(StoreCreditAccountQueryDefinition queryDef) {
        startField("account");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of the transaction.
    */
    public StoreCreditAccountDebitTransactionQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The balance of the account after the transaction.
    */
    public StoreCreditAccountDebitTransactionQuery balanceAfterTransaction(MoneyV2QueryDefinition queryDef) {
        startField("balanceAfterTransaction");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the transaction was created.
    */
    public StoreCreditAccountDebitTransactionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */
    public StoreCreditAccountDebitTransactionQuery event() {
        startField("event");

        return this;
    }

    /**
    * The origin of the store credit account transaction.
    */
    public StoreCreditAccountDebitTransactionQuery origin(StoreCreditAccountTransactionOriginQueryDefinition queryDef) {
        startField("origin");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountTransactionOriginQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
