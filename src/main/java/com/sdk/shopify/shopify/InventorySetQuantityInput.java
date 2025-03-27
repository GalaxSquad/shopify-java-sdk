// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
