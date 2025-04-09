// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventorySetQuantityInput implements Serializable {
    private ID inventoryItemId;

    private ID locationId;

    private int quantity;

    public InventorySetQuantityInput(ID inventoryItemId, ID locationId, int quantity) {
        this.inventoryItemId = inventoryItemId;

        this.locationId = locationId;

        this.quantity = quantity;
    }

    public ID getInventoryItemId() {
        return inventoryItemId;
    }

    public InventorySetQuantityInput setInventoryItemId(ID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public ID getLocationId() {
        return locationId;
    }

    public InventorySetQuantityInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public InventorySetQuantityInput setQuantity(int quantity) {
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
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
