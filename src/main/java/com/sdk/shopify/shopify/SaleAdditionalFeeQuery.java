// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The additional fee details for a line item.
*/
public class SaleAdditionalFeeQuery extends Query<SaleAdditionalFeeQuery> {
    SaleAdditionalFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the additional fee.
    */
    public SaleAdditionalFeeQuery name() {
        startField("name");

        return this;
    }

    /**
    * The price of the additional fee.
    */
    public SaleAdditionalFeeQuery price(MoneyBagQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of taxes charged on the additional fee.
    */
    public SaleAdditionalFeeQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
