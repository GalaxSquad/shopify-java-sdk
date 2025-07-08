// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A warning indicating that the market region country code is not supported with Markets.
*/
public class DraftOrderMarketRegionCountryCodeNotSupportedWarningQuery extends Query<DraftOrderMarketRegionCountryCodeNotSupportedWarningQuery> {
    DraftOrderMarketRegionCountryCodeNotSupportedWarningQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DraftOrderMarketRegionCountryCodeNotSupportedWarningQuery errorCode() {
        startField("errorCode");

        return this;
    }

    /**
    * The input field that the warning applies to.
    */
    public DraftOrderMarketRegionCountryCodeNotSupportedWarningQuery field() {
        startField("field");

        return this;
    }

    /**
    * The warning message.
    */
    public DraftOrderMarketRegionCountryCodeNotSupportedWarningQuery message() {
        startField("message");

        return this;
    }
}
