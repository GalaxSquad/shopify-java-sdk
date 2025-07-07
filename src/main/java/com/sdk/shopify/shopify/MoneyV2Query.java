// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A precise monetary value and its associated currency. For example, 12.99 USD.
*/
public class MoneyV2Query extends Query<MoneyV2Query> {
    MoneyV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A monetary value in decimal format, allowing for precise representation of cents or fractional
    * currency. For example, 12.99.
    */
    public MoneyV2Query amount() {
        startField("amount");

        return this;
    }

    /**
    * The three-letter currency code that represents a world currency used in a store. Currency codes
    * include standard [standard ISO 4217 codes](https://en.wikipedia.org/wiki/ISO_4217), legacy codes,
    * and non-standard codes. For example, USD.
    */
    public MoneyV2Query currencyCode() {
        startField("currencyCode");

        return this;
    }
}
