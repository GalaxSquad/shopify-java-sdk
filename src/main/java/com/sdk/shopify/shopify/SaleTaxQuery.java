// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The tax allocated to a sale from a single tax line.
*/
public class SaleTaxQuery extends Query<SaleTaxQuery> {
    SaleTaxQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The portion of the total tax amount on the related sale that comes from the associated tax line.
    */
    public SaleTaxQuery amount(MoneyBagQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID for the sale tax.
    */
    public SaleTaxQuery id() {
        startField("id");

        return this;
    }

    /**
    * The tax line associated with the sale.
    */
    public SaleTaxQuery taxLine(TaxLineQueryDefinition queryDef) {
        startField("taxLine");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
