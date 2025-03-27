// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ResourceFeedbackCreateInput implements Serializable {
    private String feedbackGeneratedAt;

    private ResourceFeedbackState state;

    private Input<List<String>> messages = Input.undefined();

    public ResourceFeedbackCreateInput(String feedbackGeneratedAt, ResourceFeedbackState state) {
        this.feedbackGeneratedAt = feedbackGeneratedAt;

        this.state = state;
    }

    public String getFeedbackGeneratedAt() {
        return feedbackGeneratedAt;
    }

    public ResourceFeedbackCreateInput setFeedbackGeneratedAt(String feedbackGeneratedAt) {
        this.feedbackGeneratedAt = feedbackGeneratedAt;
        return this;
    }

    public ResourceFeedbackState getState() {
        return state;
    }

    public ResourceFeedbackCreateInput setState(ResourceFeedbackState state) {
        this.state = state;
        return this;
    }

    public List<String> getMessages() {
        return messages.getValue();
    }

    public Input<List<String>> getMessagesInput() {
        return messages;
    }

    public ResourceFeedbackCreateInput setMessages(List<String> messages) {
        this.messages = Input.optional(messages);
        return this;
    }

    public ResourceFeedbackCreateInput setMessagesInput(Input<List<String>> messages) {
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
        _queryBuilder.append("feedbackGeneratedAt:");
        Query.appendQuotedString(_queryBuilder, feedbackGeneratedAt.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("state:");
        _queryBuilder.append(state.toString());

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
