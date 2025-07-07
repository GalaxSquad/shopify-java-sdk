// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The financial transfer details for a return outcome that results in an invoice.
*/
public class InvoiceReturnOutcomeQuery extends Query<InvoiceReturnOutcomeQuery> {
    InvoiceReturnOutcomeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total monetary value to be invoiced in shop and presentment currencies.
    */
    public InvoiceReturnOutcomeQuery amount(MoneyBagQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
