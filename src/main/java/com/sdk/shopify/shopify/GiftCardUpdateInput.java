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

public class GiftCardUpdateInput implements Serializable {
    private Input<String> note = Input.undefined();

    private Input<String> expiresOn = Input.undefined();

    private Input<ID> customerId = Input.undefined();

    private Input<GiftCardRecipientInput> recipientAttributes = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public GiftCardUpdateInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public GiftCardUpdateInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public String getExpiresOn() {
        return expiresOn.getValue();
    }

    public Input<String> getExpiresOnInput() {
        return expiresOn;
    }

    public GiftCardUpdateInput setExpiresOn(String expiresOn) {
        this.expiresOn = Input.optional(expiresOn);
        return this;
    }

    public GiftCardUpdateInput setExpiresOnInput(Input<String> expiresOn) {
        if (expiresOn == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.expiresOn = expiresOn;
        return this;
    }

    public ID getCustomerId() {
        return customerId.getValue();
    }

    public Input<ID> getCustomerIdInput() {
        return customerId;
    }

    public GiftCardUpdateInput setCustomerId(ID customerId) {
        this.customerId = Input.optional(customerId);
        return this;
    }

    public GiftCardUpdateInput setCustomerIdInput(Input<ID> customerId) {
        if (customerId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerId = customerId;
        return this;
    }

    public GiftCardRecipientInput getRecipientAttributes() {
        return recipientAttributes.getValue();
    }

    public Input<GiftCardRecipientInput> getRecipientAttributesInput() {
        return recipientAttributes;
    }

    public GiftCardUpdateInput setRecipientAttributes(GiftCardRecipientInput recipientAttributes) {
        this.recipientAttributes = Input.optional(recipientAttributes);
        return this;
    }

    public GiftCardUpdateInput setRecipientAttributesInput(Input<GiftCardRecipientInput> recipientAttributes) {
        if (recipientAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recipientAttributes = recipientAttributes;
        return this;
    }

    public String getTemplateSuffix() {
        return templateSuffix.getValue();
    }

    public Input<String> getTemplateSuffixInput() {
        return templateSuffix;
    }

    public GiftCardUpdateInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public GiftCardUpdateInput setTemplateSuffixInput(Input<String> templateSuffix) {
        if (templateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.templateSuffix = templateSuffix;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.expiresOn.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("expiresOn:");
            if (expiresOn.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, expiresOn.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerId:");
            if (customerId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.recipientAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("recipientAttributes:");
            if (recipientAttributes.getValue() != null) {
                recipientAttributes.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.templateSuffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("templateSuffix:");
            if (templateSuffix.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, templateSuffix.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
