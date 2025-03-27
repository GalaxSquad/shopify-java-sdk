// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Interface for a store credit account transaction.
*/
public class StoreCreditAccountTransactionQuery extends Query<StoreCreditAccountTransactionQuery> {
    StoreCreditAccountTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The store credit account that the transaction belongs to.
    */
    public StoreCreditAccountTransactionQuery account(StoreCreditAccountQueryDefinition queryDef) {
        startField("account");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of the transaction.
    */
    public StoreCreditAccountTransactionQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The balance of the account after the transaction.
    */
    public StoreCreditAccountTransactionQuery balanceAfterTransaction(MoneyV2QueryDefinition queryDef) {
        startField("balanceAfterTransaction");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the transaction was created.
    */
    public StoreCreditAccountTransactionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */
    public StoreCreditAccountTransactionQuery event() {
        startField("event");

        return this;
    }

    /**
    * The origin of the store credit account transaction.
    */
    public StoreCreditAccountTransactionQuery origin(StoreCreditAccountTransactionOriginQueryDefinition queryDef) {
        startField("origin");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountTransactionOriginQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public StoreCreditAccountTransactionQuery onStoreCreditAccountCreditTransaction(StoreCreditAccountCreditTransactionQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountCreditTransaction");
        queryDef.define(new StoreCreditAccountCreditTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public StoreCreditAccountTransactionQuery onStoreCreditAccountDebitRevertTransaction(StoreCreditAccountDebitRevertTransactionQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountDebitRevertTransaction");
        queryDef.define(new StoreCreditAccountDebitRevertTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public StoreCreditAccountTransactionQuery onStoreCreditAccountDebitTransaction(StoreCreditAccountDebitTransactionQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountDebitTransaction");
        queryDef.define(new StoreCreditAccountDebitTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public StoreCreditAccountTransactionQuery onStoreCreditAccountExpirationTransaction(StoreCreditAccountExpirationTransactionQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountExpirationTransaction");
        queryDef.define(new StoreCreditAccountExpirationTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
