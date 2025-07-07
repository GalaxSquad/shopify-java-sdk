// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryShipmentUpdateItemQuantitiesInput implements Serializable {
    private ID shipmentLineItemId;

    private int quantity;

    public InventoryShipmentUpdateItemQuantitiesInput(ID shipmentLineItemId, int quantity) {
        this.shipmentLineItemId = shipmentLineItemId;

        this.quantity = quantity;
    }

    public ID getShipmentLineItemId() {
        return shipmentLineItemId;
    }

    public InventoryShipmentUpdateItemQuantitiesInput setShipmentLineItemId(ID shipmentLineItemId) {
        this.shipmentLineItemId = shipmentLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public InventoryShipmentUpdateItemQuantitiesInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("shipmentLineItemId:");
        Query.appendQuotedString(_queryBuilder, shipmentLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
