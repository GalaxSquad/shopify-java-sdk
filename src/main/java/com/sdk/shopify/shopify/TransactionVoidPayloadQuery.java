// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `transactionVoid` mutation.
*/
public class TransactionVoidPayloadQuery extends Query<TransactionVoidPayloadQuery> {
    TransactionVoidPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created void transaction.
    */
    public TransactionVoidPayloadQuery transaction(OrderTransactionQueryDefinition queryDef) {
        startField("transaction");

        _queryBuilder.append('{');
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public TransactionVoidPayloadQuery userErrors(TransactionVoidUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new TransactionVoidUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
