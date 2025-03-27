// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The verification subject represents an individual that has to be verified.
*/
public class ShopifyPaymentsVerificationSubjectQuery extends Query<ShopifyPaymentsVerificationSubjectQuery> {
    ShopifyPaymentsVerificationSubjectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The family name of the individual to verify.
    */
    public ShopifyPaymentsVerificationSubjectQuery familyName() {
        startField("familyName");

        return this;
    }

    /**
    * The given name of the individual to verify.
    */
    public ShopifyPaymentsVerificationSubjectQuery givenName() {
        startField("givenName");

        return this;
    }
}
