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

public class InventoryLevelInput implements Serializable {
    private int availableQuantity;

    private ID locationId;

    public InventoryLevelInput(int availableQuantity, ID locationId) {
        this.availableQuantity = availableQuantity;

        this.locationId = locationId;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public InventoryLevelInput setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    public ID getLocationId() {
        return locationId;
    }

    public InventoryLevelInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("availableQuantity:");
        _queryBuilder.append(availableQuantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append('}');
    }
}
