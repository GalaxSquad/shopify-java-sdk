// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class EventBridgeWebhookSubscriptionInput implements Serializable {
    private Input<WebhookSubscriptionFormat> format = Input.undefined();

    private Input<List<String>> includeFields = Input.undefined();

    private Input<String> filter = Input.undefined();

    private Input<List<String>> metafieldNamespaces = Input.undefined();

    private Input<List<HasMetafieldsMetafieldIdentifierInput>> metafields = Input.undefined();

    private Input<String> arn = Input.undefined();

    public WebhookSubscriptionFormat getFormat() {
        return format.getValue();
    }

    public Input<WebhookSubscriptionFormat> getFormatInput() {
        return format;
    }

    public EventBridgeWebhookSubscriptionInput setFormat(WebhookSubscriptionFormat format) {
        this.format = Input.optional(format);
        return this;
    }

    public EventBridgeWebhookSubscriptionInput setFormatInput(Input<WebhookSubscriptionFormat> format) {
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

    public EventBridgeWebhookSubscriptionInput setIncludeFields(List<String> includeFields) {
        this.includeFields = Input.optional(includeFields);
        return this;
    }

    public EventBridgeWebhookSubscriptionInput setIncludeFieldsInput(Input<List<String>> includeFields) {
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

    public EventBridgeWebhookSubscriptionInput setFilter(String filter) {
        this.filter = Input.optional(filter);
        return this;
    }

    public EventBridgeWebhookSubscriptionInput setFilterInput(Input<String> filter) {
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

    public EventBridgeWebhookSubscriptionInput setMetafieldNamespaces(List<String> metafieldNamespaces) {
        this.metafieldNamespaces = Input.optional(metafieldNamespaces);
        return this;
    }

    public EventBridgeWebhookSubscriptionInput setMetafieldNamespacesInput(Input<List<String>> metafieldNamespaces) {
        if (metafieldNamespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafieldNamespaces = metafieldNamespaces;
        return this;
    }

    public List<HasMetafieldsMetafieldIdentifierInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<HasMetafieldsMetafieldIdentifierInput>> getMetafieldsInput() {
        return metafields;
    }

    public EventBridgeWebhookSubscriptionInput setMetafields(List<HasMetafieldsMetafieldIdentifierInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public EventBridgeWebhookSubscriptionInput setMetafieldsInput(Input<List<HasMetafieldsMetafieldIdentifierInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public String getArn() {
        return arn.getValue();
    }

    public Input<String> getArnInput() {
        return arn;
    }

    public EventBridgeWebhookSubscriptionInput setArn(String arn) {
        this.arn = Input.optional(arn);
        return this;
    }

    public EventBridgeWebhookSubscriptionInput setArnInput(Input<String> arn) {
        if (arn == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.arn = arn;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (HasMetafieldsMetafieldIdentifierInput item1 : metafields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.arn.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("arn:");
            if (arn.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, arn.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
