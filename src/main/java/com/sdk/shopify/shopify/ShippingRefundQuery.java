// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the shipping costs refunded on the Refund.
*/
public class ShippingRefundQuery extends Query<ShippingRefundQuery> {
    ShippingRefundQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The monetary value of the shipping fees to be refunded in shop and presentment currencies.
    */
    public ShippingRefundQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The maximum amount of shipping fees currently refundable in shop and presentment currencies.
    */
    public ShippingRefundQuery maximumRefundableSet(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundableSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The monetary value of the tax allocated to shipping fees to be refunded in shop and presentment
    * currencies.
    */
    public ShippingRefundQuery taxSet(MoneyBagQueryDefinition queryDef) {
        startField("taxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
