// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryShipmentReceiveItemInput implements Serializable {
    private ID shipmentLineItemId;

    private int quantity;

    private InventoryShipmentReceiveLineItemReason reason;

    public InventoryShipmentReceiveItemInput(ID shipmentLineItemId, int quantity, InventoryShipmentReceiveLineItemReason reason) {
        this.shipmentLineItemId = shipmentLineItemId;

        this.quantity = quantity;

        this.reason = reason;
    }

    public ID getShipmentLineItemId() {
        return shipmentLineItemId;
    }

    public InventoryShipmentReceiveItemInput setShipmentLineItemId(ID shipmentLineItemId) {
        this.shipmentLineItemId = shipmentLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public InventoryShipmentReceiveItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public InventoryShipmentReceiveLineItemReason getReason() {
        return reason;
    }

    public InventoryShipmentReceiveItemInput setReason(InventoryShipmentReceiveLineItemReason reason) {
        this.reason = reason;
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

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("reason:");
        _queryBuilder.append(reason.toString());

        _queryBuilder.append('}');
    }
}
