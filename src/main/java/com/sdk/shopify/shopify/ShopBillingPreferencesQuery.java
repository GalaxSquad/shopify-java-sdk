// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Billing preferences for the shop.
*/
public class ShopBillingPreferencesQuery extends Query<ShopBillingPreferencesQuery> {
    ShopBillingPreferencesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The currency the shop uses to pay for apps and services.
    */
    public ShopBillingPreferencesQuery currency() {
        startField("currency");

        return this;
    }
}
