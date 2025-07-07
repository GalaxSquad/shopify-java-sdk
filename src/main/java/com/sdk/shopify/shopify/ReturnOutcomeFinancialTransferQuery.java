// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The financial transfer details for the return outcome.
*/
public class ReturnOutcomeFinancialTransferQuery extends Query<ReturnOutcomeFinancialTransferQuery> {
    ReturnOutcomeFinancialTransferQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public ReturnOutcomeFinancialTransferQuery onInvoiceReturnOutcome(InvoiceReturnOutcomeQueryDefinition queryDef) {
        startInlineFragment("InvoiceReturnOutcome");
        queryDef.define(new InvoiceReturnOutcomeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ReturnOutcomeFinancialTransferQuery onRefundReturnOutcome(RefundReturnOutcomeQueryDefinition queryDef) {
        startInlineFragment("RefundReturnOutcome");
        queryDef.define(new RefundReturnOutcomeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
