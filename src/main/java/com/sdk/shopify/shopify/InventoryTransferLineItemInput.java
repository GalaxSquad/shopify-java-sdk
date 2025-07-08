// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryTransferLineItemInput implements Serializable {
    private ID inventoryItemId;

    private int quantity;

    public InventoryTransferLineItemInput(ID inventoryItemId, int quantity) {
        this.inventoryItemId = inventoryItemId;

        this.quantity = quantity;
    }

    public ID getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryTransferLineItemInput setInventoryItemId(ID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public InventoryTransferLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
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

        _queryBuilder.append('}');
    }
}
