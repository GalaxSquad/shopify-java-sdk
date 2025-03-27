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

public class InventoryQuantityInput implements Serializable {
    private ID inventoryItemId;

    private ID locationId;

    private int quantity;

    private Input<Integer> compareQuantity = Input.undefined();

    public InventoryQuantityInput(ID inventoryItemId, ID locationId, int quantity) {
        this.inventoryItemId = inventoryItemId;

        this.locationId = locationId;

        this.quantity = quantity;
    }

    public ID getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryQuantityInput setInventoryItemId(ID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public ID getLocationId() {
        return locationId;
    }

    public InventoryQuantityInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public InventoryQuantityInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Integer getCompareQuantity() {
        return compareQuantity.getValue();
    }

    public Input<Integer> getCompareQuantityInput() {
        return compareQuantity;
    }

    public InventoryQuantityInput setCompareQuantity(Integer compareQuantity) {
        this.compareQuantity = Input.optional(compareQuantity);
        return this;
    }

    public InventoryQuantityInput setCompareQuantityInput(Input<Integer> compareQuantity) {
        if (compareQuantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.compareQuantity = compareQuantity;
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

        if (this.compareQuantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("compareQuantity:");
            if (compareQuantity.getValue() != null) {
                _queryBuilder.append(compareQuantity.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
