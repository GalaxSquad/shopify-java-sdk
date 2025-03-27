// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryMoveQuantityTerminalInput implements Serializable {
    private ID locationId;

    private String name;

    private Input<String> ledgerDocumentUri = Input.undefined();

    public InventoryMoveQuantityTerminalInput(ID locationId, String name) {
        this.locationId = locationId;

        this.name = name;
    }

    public ID getLocationId() {
        return locationId;
    }

    public InventoryMoveQuantityTerminalInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getName() {
        return name;
    }

    public InventoryMoveQuantityTerminalInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getLedgerDocumentUri() {
        return ledgerDocumentUri.getValue();
    }

    public Input<String> getLedgerDocumentUriInput() {
        return ledgerDocumentUri;
    }

    public InventoryMoveQuantityTerminalInput setLedgerDocumentUri(String ledgerDocumentUri) {
        this.ledgerDocumentUri = Input.optional(ledgerDocumentUri);
        return this;
    }

    public InventoryMoveQuantityTerminalInput setLedgerDocumentUriInput(Input<String> ledgerDocumentUri) {
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
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

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
