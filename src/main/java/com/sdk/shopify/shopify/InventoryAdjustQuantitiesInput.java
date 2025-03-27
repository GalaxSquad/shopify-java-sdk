// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryAdjustQuantitiesInput implements Serializable {
    private String reason;

    private String name;

    private List<InventoryChangeInput> changes;

    private Input<String> referenceDocumentUri = Input.undefined();

    public InventoryAdjustQuantitiesInput(String reason, String name, List<InventoryChangeInput> changes) {
        this.reason = reason;

        this.name = name;

        this.changes = changes;
    }

    public String getReason() {
        return reason;
    }

    public InventoryAdjustQuantitiesInput setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getName() {
        return name;
    }

    public InventoryAdjustQuantitiesInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<InventoryChangeInput> getChanges() {
        return changes;
    }

    public InventoryAdjustQuantitiesInput setChanges(List<InventoryChangeInput> changes) {
        this.changes = changes;
        return this;
    }

    public String getReferenceDocumentUri() {
        return referenceDocumentUri.getValue();
    }

    public Input<String> getReferenceDocumentUriInput() {
        return referenceDocumentUri;
    }

    public InventoryAdjustQuantitiesInput setReferenceDocumentUri(String referenceDocumentUri) {
        this.referenceDocumentUri = Input.optional(referenceDocumentUri);
        return this;
    }

    public InventoryAdjustQuantitiesInput setReferenceDocumentUriInput(Input<String> referenceDocumentUri) {
        if (referenceDocumentUri == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referenceDocumentUri = referenceDocumentUri;
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
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("changes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryChangeInput item1 : changes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.referenceDocumentUri.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referenceDocumentUri:");
            if (referenceDocumentUri.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, referenceDocumentUri.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
