// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryMoveQuantitiesInput implements Serializable {
    private String reason;

    private String referenceDocumentUri;

    private List<InventoryMoveQuantityChange> changes;

    public InventoryMoveQuantitiesInput(String reason, String referenceDocumentUri, List<InventoryMoveQuantityChange> changes) {
        this.reason = reason;

        this.referenceDocumentUri = referenceDocumentUri;

        this.changes = changes;
    }

    public String getReason() {
        return reason;
    }

    public InventoryMoveQuantitiesInput setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReferenceDocumentUri() {
        return referenceDocumentUri;
    }

    public InventoryMoveQuantitiesInput setReferenceDocumentUri(String referenceDocumentUri) {
        this.referenceDocumentUri = referenceDocumentUri;
        return this;
    }

    public List<InventoryMoveQuantityChange> getChanges() {
        return changes;
    }

    public InventoryMoveQuantitiesInput setChanges(List<InventoryMoveQuantityChange> changes) {
        this.changes = changes;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("reason:");
        Query.appendQuotedString(_queryBuilder, reason.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("referenceDocumentUri:");
        Query.appendQuotedString(_queryBuilder, referenceDocumentUri.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("changes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryMoveQuantityChange item1 : changes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
