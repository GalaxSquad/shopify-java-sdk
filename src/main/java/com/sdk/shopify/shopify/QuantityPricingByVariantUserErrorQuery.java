// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed volume pricing operations.
*/
public class QuantityPricingByVariantUserErrorQuery extends Query<QuantityPricingByVariantUserErrorQuery> {
    QuantityPricingByVariantUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public QuantityPricingByVariantUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public QuantityPricingByVariantUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public QuantityPricingByVariantUserErrorQuery message() {
        startField("message");

        return this;
    }
}
