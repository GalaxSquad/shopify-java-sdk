// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed price list fixed prices by product bulk update operations.
*/
public class PriceListFixedPricesByProductBulkUpdateUserErrorQuery extends Query<PriceListFixedPricesByProductBulkUpdateUserErrorQuery> {
    PriceListFixedPricesByProductBulkUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PriceListFixedPricesByProductBulkUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PriceListFixedPricesByProductBulkUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PriceListFixedPricesByProductBulkUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
