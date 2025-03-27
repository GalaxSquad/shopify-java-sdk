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

public class InventorySetScheduledChangesInput implements Serializable {
    private String reason;

    private List<InventoryScheduledChangeItemInput> items;

    private String referenceDocumentUri;

    public InventorySetScheduledChangesInput(String reason, List<InventoryScheduledChangeItemInput> items, String referenceDocumentUri) {
        this.reason = reason;

        this.items = items;

        this.referenceDocumentUri = referenceDocumentUri;
    }

    public String getReason() {
        return reason;
    }

    public InventorySetScheduledChangesInput setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public List<InventoryScheduledChangeItemInput> getItems() {
        return items;
    }

    public InventorySetScheduledChangesInput setItems(List<InventoryScheduledChangeItemInput> items) {
        this.items = items;
        return this;
    }

    public String getReferenceDocumentUri() {
        return referenceDocumentUri;
    }

    public InventorySetScheduledChangesInput setReferenceDocumentUri(String referenceDocumentUri) {
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
        _queryBuilder.append("items:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryScheduledChangeItemInput item1 : items) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("referenceDocumentUri:");
        Query.appendQuotedString(_queryBuilder, referenceDocumentUri.toString());

        _queryBuilder.append('}');
    }
}
