// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The financial transfer details for a return outcome that results in a refund.
*/
public class RefundReturnOutcomeQuery extends Query<RefundReturnOutcomeQuery> {
    RefundReturnOutcomeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total monetary value to be refunded in shop and presentment currencies.
    */
    public RefundReturnOutcomeQuery amount(MoneyBagQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of suggested refund methods.
    */
    public RefundReturnOutcomeQuery suggestedRefundMethods(SuggestedRefundMethodQueryDefinition queryDef) {
        startField("suggestedRefundMethods");

        _queryBuilder.append('{');
        queryDef.define(new SuggestedRefundMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of suggested order transactions.
    */
    public RefundReturnOutcomeQuery suggestedTransactions(SuggestedOrderTransactionQueryDefinition queryDef) {
        startField("suggestedTransactions");

        _queryBuilder.append('{');
        queryDef.define(new SuggestedOrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
