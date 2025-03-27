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
import java.util.List;

public class InventorySetQuantitiesInput implements Serializable {
    private String reason;

    private String name;

    private List<InventoryQuantityInput> quantities;

    private Input<String> referenceDocumentUri = Input.undefined();

    private Input<Boolean> ignoreCompareQuantity = Input.undefined();

    public InventorySetQuantitiesInput(String reason, String name, List<InventoryQuantityInput> quantities) {
        this.reason = reason;

        this.name = name;

        this.quantities = quantities;
    }

    public String getReason() {
        return reason;
    }

    public InventorySetQuantitiesInput setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getName() {
        return name;
    }

    public InventorySetQuantitiesInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<InventoryQuantityInput> getQuantities() {
        return quantities;
    }

    public InventorySetQuantitiesInput setQuantities(List<InventoryQuantityInput> quantities) {
        this.quantities = quantities;
        return this;
    }

    public String getReferenceDocumentUri() {
        return referenceDocumentUri.getValue();
    }

    public Input<String> getReferenceDocumentUriInput() {
        return referenceDocumentUri;
    }

    public InventorySetQuantitiesInput setReferenceDocumentUri(String referenceDocumentUri) {
        this.referenceDocumentUri = Input.optional(referenceDocumentUri);
        return this;
    }

    public InventorySetQuantitiesInput setReferenceDocumentUriInput(Input<String> referenceDocumentUri) {
        if (referenceDocumentUri == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referenceDocumentUri = referenceDocumentUri;
        return this;
    }

    public Boolean getIgnoreCompareQuantity() {
        return ignoreCompareQuantity.getValue();
    }

    public Input<Boolean> getIgnoreCompareQuantityInput() {
        return ignoreCompareQuantity;
    }

    public InventorySetQuantitiesInput setIgnoreCompareQuantity(Boolean ignoreCompareQuantity) {
        this.ignoreCompareQuantity = Input.optional(ignoreCompareQuantity);
        return this;
    }

    public InventorySetQuantitiesInput setIgnoreCompareQuantityInput(Input<Boolean> ignoreCompareQuantity) {
        if (ignoreCompareQuantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ignoreCompareQuantity = ignoreCompareQuantity;
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
        _queryBuilder.append("quantities:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryQuantityInput item1 : quantities) {
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

        if (this.ignoreCompareQuantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ignoreCompareQuantity:");
            if (ignoreCompareQuantity.getValue() != null) {
                _queryBuilder.append(ignoreCompareQuantity.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
