// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
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
