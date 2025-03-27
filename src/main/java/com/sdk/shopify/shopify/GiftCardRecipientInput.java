// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class GiftCardRecipientInput implements Serializable {
    private ID id;

    private Input<String> preferredName = Input.undefined();

    private Input<String> message = Input.undefined();

    private Input<String> sendNotificationAt = Input.undefined();

    public GiftCardRecipientInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public GiftCardRecipientInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getPreferredName() {
        return preferredName.getValue();
    }

    public Input<String> getPreferredNameInput() {
        return preferredName;
    }

    public GiftCardRecipientInput setPreferredName(String preferredName) {
        this.preferredName = Input.optional(preferredName);
        return this;
    }

    public GiftCardRecipientInput setPreferredNameInput(Input<String> preferredName) {
        if (preferredName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.preferredName = preferredName;
        return this;
    }

    public String getMessage() {
        return message.getValue();
    }

    public Input<String> getMessageInput() {
        return message;
    }

    public GiftCardRecipientInput setMessage(String message) {
        this.message = Input.optional(message);
        return this;
    }

    public GiftCardRecipientInput setMessageInput(Input<String> message) {
        if (message == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.message = message;
        return this;
    }

    public String getSendNotificationAt() {
        return sendNotificationAt.getValue();
    }

    public Input<String> getSendNotificationAtInput() {
        return sendNotificationAt;
    }

    public GiftCardRecipientInput setSendNotificationAt(String sendNotificationAt) {
        this.sendNotificationAt = Input.optional(sendNotificationAt);
        return this;
    }

    public GiftCardRecipientInput setSendNotificationAtInput(Input<String> sendNotificationAt) {
        if (sendNotificationAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sendNotificationAt = sendNotificationAt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.preferredName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("preferredName:");
            if (preferredName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, preferredName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.message.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("message:");
            if (message.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, message.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sendNotificationAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sendNotificationAt:");
            if (sendNotificationAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sendNotificationAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
