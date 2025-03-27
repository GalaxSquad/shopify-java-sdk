// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Whether the shop is blocked from converting to full multi-location delivery profiles mode. If the
* shop is blocked, then the blocking reasons are also returned.
*/
public class DeliveryLegacyModeBlockedQuery extends Query<DeliveryLegacyModeBlockedQuery> {
    DeliveryLegacyModeBlockedQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the shop can convert to full multi-location delivery profiles mode.
    */
    public DeliveryLegacyModeBlockedQuery blocked() {
        startField("blocked");

        return this;
    }

    /**
    * The reasons why the shop is blocked from converting to full multi-location delivery profiles mode.
    */
    public DeliveryLegacyModeBlockedQuery reasons() {
        startField("reasons");

        return this;
    }
}
