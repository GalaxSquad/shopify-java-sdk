// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Generic attributes of a suggested refund method.
*/
public class SuggestedRefundMethodQuery extends Query<SuggestedRefundMethodQuery> {
    SuggestedRefundMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The suggested amount to refund in shop and presentment currencies.
    */
    public SuggestedRefundMethodQuery amount(MoneyBagQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The maximum available amount to refund in shop and presentment currencies.
    */
    public SuggestedRefundMethodQuery maximumRefundable(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundable");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public SuggestedRefundMethodQuery onSuggestedStoreCreditRefund(SuggestedStoreCreditRefundQueryDefinition queryDef) {
        startInlineFragment("SuggestedStoreCreditRefund");
        queryDef.define(new SuggestedStoreCreditRefundQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
