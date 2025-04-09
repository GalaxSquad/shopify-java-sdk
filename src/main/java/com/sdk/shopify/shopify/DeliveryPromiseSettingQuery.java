// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The delivery promise settings.
*/
public class DeliveryPromiseSettingQuery extends Query<DeliveryPromiseSettingQuery> {
    DeliveryPromiseSettingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether delivery dates is enabled.
    */
    public DeliveryPromiseSettingQuery deliveryDatesEnabled() {
        startField("deliveryDatesEnabled");

        return this;
    }

    /**
    * The number of business days required for processing the order before the package is handed off to
    * the carrier. Expressed as an ISO8601 duration.
    */
    public DeliveryPromiseSettingQuery processingTime() {
        startField("processingTime");

        return this;
    }
}
