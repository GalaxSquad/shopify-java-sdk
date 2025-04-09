// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventorySetOnHandQuantitiesInput implements Serializable {
    private String reason;

    private List<InventorySetQuantityInput> setQuantities;

    private Input<String> referenceDocumentUri = Input.undefined();

    public InventorySetOnHandQuantitiesInput(String reason, List<InventorySetQuantityInput> setQuantities) {
        this.reason = reason;

        this.setQuantities = setQuantities;
    }

    public String getReason() {
        return reason;
    }

    public InventorySetOnHandQuantitiesInput setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public List<InventorySetQuantityInput> getSetQuantities() {
        return setQuantities;
    }

    public InventorySetOnHandQuantitiesInput setSetQuantities(List<InventorySetQuantityInput> setQuantities) {
        this.setQuantities = setQuantities;
        return this;
    }

    public String getReferenceDocumentUri() {
        return referenceDocumentUri.getValue();
    }

    public Input<String> getReferenceDocumentUriInput() {
        return referenceDocumentUri;
    }

    public InventorySetOnHandQuantitiesInput setReferenceDocumentUri(String referenceDocumentUri) {
        this.referenceDocumentUri = Input.optional(referenceDocumentUri);
        return this;
    }

    public InventorySetOnHandQuantitiesInput setReferenceDocumentUriInput(Input<String> referenceDocumentUri) {
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
        _queryBuilder.append("setQuantities:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventorySetQuantityInput item1 : setQuantities) {
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
