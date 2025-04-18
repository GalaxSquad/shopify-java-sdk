// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryScheduledChangeItemInput implements Serializable {
    private ID inventoryItemId;

    private ID locationId;

    private String ledgerDocumentUri;

    private List<InventoryScheduledChangeInput> scheduledChanges;

    public InventoryScheduledChangeItemInput(ID inventoryItemId, ID locationId, String ledgerDocumentUri, List<InventoryScheduledChangeInput> scheduledChanges) {
        this.inventoryItemId = inventoryItemId;

        this.locationId = locationId;

        this.ledgerDocumentUri = ledgerDocumentUri;

        this.scheduledChanges = scheduledChanges;
    }

    public ID getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryScheduledChangeItemInput setInventoryItemId(ID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public ID getLocationId() {
        return locationId;
    }

    public InventoryScheduledChangeItemInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getLedgerDocumentUri() {
        return ledgerDocumentUri;
    }

    public InventoryScheduledChangeItemInput setLedgerDocumentUri(String ledgerDocumentUri) {
        this.ledgerDocumentUri = ledgerDocumentUri;
        return this;
    }

    public List<InventoryScheduledChangeInput> getScheduledChanges() {
        return scheduledChanges;
    }

    public InventoryScheduledChangeItemInput setScheduledChanges(List<InventoryScheduledChangeInput> scheduledChanges) {
        this.scheduledChanges = scheduledChanges;
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
        _queryBuilder.append("ledgerDocumentUri:");
        Query.appendQuotedString(_queryBuilder, ledgerDocumentUri.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("scheduledChanges:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryScheduledChangeInput item1 : scheduledChanges) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
