// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `storeCreditAccountCredit` mutation.
*/
public class StoreCreditAccountCreditPayloadQuery extends Query<StoreCreditAccountCreditPayloadQuery> {
    StoreCreditAccountCreditPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The store credit account transaction that was created.
    */
    public StoreCreditAccountCreditPayloadQuery storeCreditAccountTransaction(StoreCreditAccountCreditTransactionQueryDefinition queryDef) {
        startField("storeCreditAccountTransaction");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountCreditTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public StoreCreditAccountCreditPayloadQuery userErrors(StoreCreditAccountCreditUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountCreditUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
