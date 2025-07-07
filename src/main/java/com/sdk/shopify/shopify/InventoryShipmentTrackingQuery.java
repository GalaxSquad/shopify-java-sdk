// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the tracking information for an inventory shipment.
*/
public class InventoryShipmentTrackingQuery extends Query<InventoryShipmentTrackingQuery> {
    InventoryShipmentTrackingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The estimated date and time that the shipment will arrive.
    */
    public InventoryShipmentTrackingQuery arrivesAt() {
        startField("arrivesAt");

        return this;
    }

    /**
    * The name of the shipping carrier company.
    */
    public InventoryShipmentTrackingQuery company() {
        startField("company");

        return this;
    }

    /**
    * The tracking number used by the carrier to identify the shipment.
    */
    public InventoryShipmentTrackingQuery trackingNumber() {
        startField("trackingNumber");

        return this;
    }

    /**
    * The URL to track the shipment.
    * Given a tracking number and a shipping carrier company name from
    * [the
    * list](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#field-company),
    * Shopify will return a generated tracking URL if no tracking URL was set manually.
    */
    public InventoryShipmentTrackingQuery trackingUrl() {
        startField("trackingUrl");

        return this;
    }
}
