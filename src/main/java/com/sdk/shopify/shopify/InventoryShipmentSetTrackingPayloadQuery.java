// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentSetTracking` mutation.
*/
public class InventoryShipmentSetTrackingPayloadQuery extends Query<InventoryShipmentSetTrackingPayloadQuery> {
    InventoryShipmentSetTrackingPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The inventory shipment with the edited tracking info.
    */
    public InventoryShipmentSetTrackingPayloadQuery inventoryShipment(InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentSetTrackingPayloadQuery userErrors(InventoryShipmentSetTrackingUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentSetTrackingUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
