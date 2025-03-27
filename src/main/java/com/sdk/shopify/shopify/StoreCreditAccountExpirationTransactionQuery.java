// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An expiration transaction which decreases the store credit account balance.
* Expiration transactions are created automatically when a [store credit account credit
* transaction](https://shopify.dev/api/admin-graphql/latest/objects/StoreCreditAccountCreditTransactio
* n) expires.
* The amount subtracted from the balance is equal to the remaining amount of the credit transaction.
*/
public class StoreCreditAccountExpirationTransactionQuery extends Query<StoreCreditAccountExpirationTransactionQuery> {
    StoreCreditAccountExpirationTransactionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The store credit account that the transaction belongs to.
    */
    public StoreCreditAccountExpirationTransactionQuery account(StoreCreditAccountQueryDefinition queryDef) {
        startField("account");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The amount of the transaction.
    */
    public StoreCreditAccountExpirationTransactionQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The balance of the account after the transaction.
    */
    public StoreCreditAccountExpirationTransactionQuery balanceAfterTransaction(MoneyV2QueryDefinition queryDef) {
        startField("balanceAfterTransaction");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the transaction was created.
    */
    public StoreCreditAccountExpirationTransactionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The credit transaction which expired.
    */
    public StoreCreditAccountExpirationTransactionQuery creditTransaction(StoreCreditAccountCreditTransactionQueryDefinition queryDef) {
        startField("creditTransaction");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountCreditTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The event that caused the store credit account transaction.
    */
    public StoreCreditAccountExpirationTransactionQuery event() {
        startField("event");

        return this;
    }

    /**
    * The origin of the store credit account transaction.
    */
    public StoreCreditAccountExpirationTransactionQuery origin(StoreCreditAccountTransactionOriginQueryDefinition queryDef) {
        startField("origin");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountTransactionOriginQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
