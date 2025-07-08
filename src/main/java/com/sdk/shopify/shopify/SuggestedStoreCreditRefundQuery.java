// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The suggested values for a refund to store credit.
*/
public class SuggestedStoreCreditRefundQuery extends Query<SuggestedStoreCreditRefundQuery> {
    SuggestedStoreCreditRefundQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The suggested amount to refund in shop and presentment currencies.
    */
    public SuggestedStoreCreditRefundQuery amount(MoneyBagQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The suggested expiration date for the store credit.
    */
    public SuggestedStoreCreditRefundQuery expiresAt() {
        startField("expiresAt");

        return this;
    }

    /**
    * The maximum available amount to refund in shop and presentment currencies.
    */
    public SuggestedStoreCreditRefundQuery maximumRefundable(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundable");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
