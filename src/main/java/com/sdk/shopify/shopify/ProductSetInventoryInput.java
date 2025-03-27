// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ProductSetInventoryInput implements Serializable {
    private ID locationId;

    private String name;

    private int quantity;

    public ProductSetInventoryInput(ID locationId, String name, int quantity) {
        this.locationId = locationId;

        this.name = name;

        this.quantity = quantity;
    }

    public ID getLocationId() {
        return locationId;
    }

    public ProductSetInventoryInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductSetInventoryInput setName(String name) {
        this.name = name;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductSetInventoryInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
