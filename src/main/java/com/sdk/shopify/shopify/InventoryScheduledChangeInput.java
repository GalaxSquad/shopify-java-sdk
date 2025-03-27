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

public class InventoryScheduledChangeInput implements Serializable {
    private String expectedAt;

    private String fromName;

    private String toName;

    public InventoryScheduledChangeInput(String expectedAt, String fromName, String toName) {
        this.expectedAt = expectedAt;

        this.fromName = fromName;

        this.toName = toName;
    }

    public String getExpectedAt() {
        return expectedAt;
    }

    public InventoryScheduledChangeInput setExpectedAt(String expectedAt) {
        this.expectedAt = expectedAt;
        return this;
    }

    public String getFromName() {
        return fromName;
    }

    public InventoryScheduledChangeInput setFromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public String getToName() {
        return toName;
    }

    public InventoryScheduledChangeInput setToName(String toName) {
        this.toName = toName;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("expectedAt:");
        Query.appendQuotedString(_queryBuilder, expectedAt.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fromName:");
        Query.appendQuotedString(_queryBuilder, fromName.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("toName:");
        Query.appendQuotedString(_queryBuilder, toName.toString());

        _queryBuilder.append('}');
    }
}
