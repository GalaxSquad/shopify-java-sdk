// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Presents all Shopify Payments information related to an extended authorization.
*/
public class ShopifyPaymentsExtendedAuthorizationQuery extends Query<ShopifyPaymentsExtendedAuthorizationQuery> {
    ShopifyPaymentsExtendedAuthorizationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The time after which the extended authorization expires. After the expiry, the merchant is unable to
    * capture the payment.
    */
    public ShopifyPaymentsExtendedAuthorizationQuery extendedAuthorizationExpiresAt() {
        startField("extendedAuthorizationExpiresAt");

        return this;
    }

    /**
    * The time after which capture will incur an additional fee.
    */
    public ShopifyPaymentsExtendedAuthorizationQuery standardAuthorizationExpiresAt() {
        startField("standardAuthorizationExpiresAt");

        return this;
    }
}
