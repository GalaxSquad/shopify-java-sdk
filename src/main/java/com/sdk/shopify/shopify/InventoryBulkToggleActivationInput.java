// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryBulkToggleActivationInput implements Serializable {
    private ID locationId;

    private boolean activate;

    public InventoryBulkToggleActivationInput(ID locationId, boolean activate) {
        this.locationId = locationId;

        this.activate = activate;
    }

    public ID getLocationId() {
        return locationId;
    }

    public InventoryBulkToggleActivationInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public boolean getActivate() {
        return activate;
    }

    public InventoryBulkToggleActivationInput setActivate(boolean activate) {
        this.activate = activate;
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
        _queryBuilder.append("activate:");
        _queryBuilder.append(activate);

        _queryBuilder.append('}');
    }
}
