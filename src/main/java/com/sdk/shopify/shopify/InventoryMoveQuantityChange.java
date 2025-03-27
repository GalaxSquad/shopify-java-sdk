// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryMoveQuantityChange implements Serializable {
    private ID inventoryItemId;

    private int quantity;

    private InventoryMoveQuantityTerminalInput from;

    private InventoryMoveQuantityTerminalInput to;

    public InventoryMoveQuantityChange(ID inventoryItemId, int quantity, InventoryMoveQuantityTerminalInput from, InventoryMoveQuantityTerminalInput to) {
        this.inventoryItemId = inventoryItemId;

        this.quantity = quantity;

        this.from = from;

        this.to = to;
    }

    public ID getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryMoveQuantityChange setInventoryItemId(ID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public InventoryMoveQuantityChange setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public InventoryMoveQuantityTerminalInput getFrom() {
        return from;
    }

    public InventoryMoveQuantityChange setFrom(InventoryMoveQuantityTerminalInput from) {
        this.from = from;
        return this;
    }

    public InventoryMoveQuantityTerminalInput getTo() {
        return to;
    }

    public InventoryMoveQuantityChange setTo(InventoryMoveQuantityTerminalInput to) {
        this.to = to;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("inventoryItemId:");
        Query.appendQuotedString(_queryBuilder, inventoryItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("from:");
        from.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("to:");
        to.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
