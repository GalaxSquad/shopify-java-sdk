// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryChangeInput implements Serializable {
    private int delta;

    private ID inventoryItemId;

    private ID locationId;

    private Input<String> ledgerDocumentUri = Input.undefined();

    public InventoryChangeInput(int delta, ID inventoryItemId, ID locationId) {
        this.delta = delta;

        this.inventoryItemId = inventoryItemId;

        this.locationId = locationId;
    }

    public int getDelta() {
        return delta;
    }

    public InventoryChangeInput setDelta(int delta) {
        this.delta = delta;
        return this;
    }

    public ID getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryChangeInput setInventoryItemId(ID inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public ID getLocationId() {
        return locationId;
    }

    public InventoryChangeInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getLedgerDocumentUri() {
        return ledgerDocumentUri.getValue();
    }

    public Input<String> getLedgerDocumentUriInput() {
        return ledgerDocumentUri;
    }

    public InventoryChangeInput setLedgerDocumentUri(String ledgerDocumentUri) {
        this.ledgerDocumentUri = Input.optional(ledgerDocumentUri);
        return this;
    }

    public InventoryChangeInput setLedgerDocumentUriInput(Input<String> ledgerDocumentUri) {
        if (ledgerDocumentUri == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ledgerDocumentUri = ledgerDocumentUri;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("delta:");
        _queryBuilder.append(delta);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("inventoryItemId:");
        Query.appendQuotedString(_queryBuilder, inventoryItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        if (this.ledgerDocumentUri.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ledgerDocumentUri:");
            if (ledgerDocumentUri.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, ledgerDocumentUri.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
