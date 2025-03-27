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

public class ProductResourceFeedbackInput implements Serializable {
    private ID productId;

    private ResourceFeedbackState state;

    private String feedbackGeneratedAt;

    private String productUpdatedAt;

    private Input<List<String>> messages = Input.undefined();

    public ProductResourceFeedbackInput(ID productId, ResourceFeedbackState state, String feedbackGeneratedAt, String productUpdatedAt) {
        this.productId = productId;

        this.state = state;

        this.feedbackGeneratedAt = feedbackGeneratedAt;

        this.productUpdatedAt = productUpdatedAt;
    }

    public ID getProductId() {
        return productId;
    }

    public ProductResourceFeedbackInput setProductId(ID productId) {
        this.productId = productId;
        return this;
    }

    public ResourceFeedbackState getState() {
        return state;
    }

    public ProductResourceFeedbackInput setState(ResourceFeedbackState state) {
        this.state = state;
        return this;
    }

    public String getFeedbackGeneratedAt() {
        return feedbackGeneratedAt;
    }

    public ProductResourceFeedbackInput setFeedbackGeneratedAt(String feedbackGeneratedAt) {
        this.feedbackGeneratedAt = feedbackGeneratedAt;
        return this;
    }

    public String getProductUpdatedAt() {
        return productUpdatedAt;
    }

    public ProductResourceFeedbackInput setProductUpdatedAt(String productUpdatedAt) {
        this.productUpdatedAt = productUpdatedAt;
        return this;
    }

    public List<String> getMessages() {
        return messages.getValue();
    }

    public Input<List<String>> getMessagesInput() {
        return messages;
    }

    public ProductResourceFeedbackInput setMessages(List<String> messages) {
        this.messages = Input.optional(messages);
        return this;
    }

    public ProductResourceFeedbackInput setMessagesInput(Input<List<String>> messages) {
        if (messages == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.messages = messages;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("state:");
        _queryBuilder.append(state.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("feedbackGeneratedAt:");
        Query.appendQuotedString(_queryBuilder, feedbackGeneratedAt.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("productUpdatedAt:");
        Query.appendQuotedString(_queryBuilder, productUpdatedAt.toString());

        if (this.messages.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("messages:");
            if (messages.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : messages.getValue()) {
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
