// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A monetary value with currency.
*/
public class MoneyV2Query extends Query<MoneyV2Query> {
    MoneyV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Decimal money amount.
    */
    public MoneyV2Query amount() {
        startField("amount");

        return this;
    }

    /**
    * Currency of the money.
    */
    public MoneyV2Query currencyCode() {
        startField("currencyCode");

        return this;
    }
}
