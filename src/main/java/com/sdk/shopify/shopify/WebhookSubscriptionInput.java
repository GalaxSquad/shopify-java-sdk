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

public class WebhookSubscriptionInput implements Serializable {
    private Input<String> callbackUrl = Input.undefined();

    private Input<WebhookSubscriptionFormat> format = Input.undefined();

    private Input<List<String>> includeFields = Input.undefined();

    private Input<String> filter = Input.undefined();

    private Input<List<String>> metafieldNamespaces = Input.undefined();

    public String getCallbackUrl() {
        return callbackUrl.getValue();
    }

    public Input<String> getCallbackUrlInput() {
        return callbackUrl;
    }

    public WebhookSubscriptionInput setCallbackUrl(String callbackUrl) {
        this.callbackUrl = Input.optional(callbackUrl);
        return this;
    }

    public WebhookSubscriptionInput setCallbackUrlInput(Input<String> callbackUrl) {
        if (callbackUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.callbackUrl = callbackUrl;
        return this;
    }

    public WebhookSubscriptionFormat getFormat() {
        return format.getValue();
    }

    public Input<WebhookSubscriptionFormat> getFormatInput() {
        return format;
    }

    public WebhookSubscriptionInput setFormat(WebhookSubscriptionFormat format) {
        this.format = Input.optional(format);
        return this;
    }

    public WebhookSubscriptionInput setFormatInput(Input<WebhookSubscriptionFormat> format) {
        if (format == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.format = format;
        return this;
    }

    public List<String> getIncludeFields() {
        return includeFields.getValue();
    }

    public Input<List<String>> getIncludeFieldsInput() {
        return includeFields;
    }

    public WebhookSubscriptionInput setIncludeFields(List<String> includeFields) {
        this.includeFields = Input.optional(includeFields);
        return this;
    }

    public WebhookSubscriptionInput setIncludeFieldsInput(Input<List<String>> includeFields) {
        if (includeFields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.includeFields = includeFields;
        return this;
    }

    public String getFilter() {
        return filter.getValue();
    }

    public Input<String> getFilterInput() {
        return filter;
    }

    public WebhookSubscriptionInput setFilter(String filter) {
        this.filter = Input.optional(filter);
        return this;
    }

    public WebhookSubscriptionInput setFilterInput(Input<String> filter) {
        if (filter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.filter = filter;
        return this;
    }

    public List<String> getMetafieldNamespaces() {
        return metafieldNamespaces.getValue();
    }

    public Input<List<String>> getMetafieldNamespacesInput() {
        return metafieldNamespaces;
    }

    public WebhookSubscriptionInput setMetafieldNamespaces(List<String> metafieldNamespaces) {
        this.metafieldNamespaces = Input.optional(metafieldNamespaces);
        return this;
    }

    public WebhookSubscriptionInput setMetafieldNamespacesInput(Input<List<String>> metafieldNamespaces) {
        if (metafieldNamespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafieldNamespaces = metafieldNamespaces;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.callbackUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("callbackUrl:");
            if (callbackUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, callbackUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.format.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("format:");
            if (format.getValue() != null) {
                _queryBuilder.append(format.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.includeFields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("includeFields:");
            if (includeFields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : includeFields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.filter.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("filter:");
            if (filter.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, filter.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafieldNamespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafieldNamespaces:");
            if (metafieldNamespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : metafieldNamespaces.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
