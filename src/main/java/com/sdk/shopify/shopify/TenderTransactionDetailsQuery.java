// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Information about the payment instrument used for this transaction.
*/
public class TenderTransactionDetailsQuery extends Query<TenderTransactionDetailsQuery> {
    TenderTransactionDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public TenderTransactionDetailsQuery onTenderTransactionCreditCardDetails(TenderTransactionCreditCardDetailsQueryDefinition queryDef) {
        startInlineFragment("TenderTransactionCreditCardDetails");
        queryDef.define(new TenderTransactionCreditCardDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
