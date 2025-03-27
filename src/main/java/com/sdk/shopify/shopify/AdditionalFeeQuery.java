// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The additional fees that have been applied to the order.
*/
public class AdditionalFeeQuery extends Query<AdditionalFeeQuery> {
    AdditionalFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the additional fee.
    */
    public AdditionalFeeQuery name() {
        startField("name");

        return this;
    }

    /**
    * The price of the additional fee.
    */
    public AdditionalFeeQuery price(MoneyBagQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of taxes charged on the additional fee.
    */
    public AdditionalFeeQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
