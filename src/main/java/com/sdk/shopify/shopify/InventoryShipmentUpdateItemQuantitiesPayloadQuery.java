// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentUpdateItemQuantities` mutation.
*/
public class InventoryShipmentUpdateItemQuantitiesPayloadQuery extends Query<InventoryShipmentUpdateItemQuantitiesPayloadQuery> {
    InventoryShipmentUpdateItemQuantitiesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The inventory shipment with updated item quantities.
    */
    public InventoryShipmentUpdateItemQuantitiesPayloadQuery shipment(InventoryShipmentQueryDefinition queryDef) {
        startField("shipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The updated item quantities.
    */
    public InventoryShipmentUpdateItemQuantitiesPayloadQuery updatedLineItems(InventoryShipmentLineItemQueryDefinition queryDef) {
        startField("updatedLineItems");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentUpdateItemQuantitiesPayloadQuery userErrors(InventoryShipmentUpdateItemQuantitiesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentUpdateItemQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
