// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Local pickup settings associated with a location.
*/
public class DeliveryLocalPickupSettingsQuery extends Query<DeliveryLocalPickupSettingsQuery> {
    DeliveryLocalPickupSettingsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Additional instructions or information related to the local pickup.
    */
    public DeliveryLocalPickupSettingsQuery instructions() {
        startField("instructions");

        return this;
    }

    /**
    * The estimated pickup time to show customers at checkout.
    */
    public DeliveryLocalPickupSettingsQuery pickupTime() {
        startField("pickupTime");

        return this;
    }
}
