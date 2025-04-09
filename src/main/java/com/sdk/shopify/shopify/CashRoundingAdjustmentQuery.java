// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The rounding adjustment applied to total payment or refund received for an Order involving cash
* payments.
*/
public class CashRoundingAdjustmentQuery extends Query<CashRoundingAdjustmentQuery> {
    CashRoundingAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The rounding adjustment that can be applied to totalReceived for an Order involving cash payments in
    * shop and presentment currencies. Could be a positive or negative value. Value is 0 if there's no
    * rounding, or for non-cash payments.
    */
    public CashRoundingAdjustmentQuery paymentSet(MoneyBagQueryDefinition queryDef) {
        startField("paymentSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The rounding adjustment that can be applied to totalRefunded for an Order involving cash payments in
    * shop and presentment currencies. Could be a positive or negative value. Value is 0 if there's no
    * rounding, or for non-cash refunds.
    */
    public CashRoundingAdjustmentQuery refundSet(MoneyBagQueryDefinition queryDef) {
        startField("refundSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
