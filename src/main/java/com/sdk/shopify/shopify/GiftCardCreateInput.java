// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class GiftCardCreateInput implements Serializable {
    private BigDecimal initialValue;

    private Input<String> code = Input.undefined();

    private Input<ID> customerId = Input.undefined();

    private Input<String> expiresOn = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<GiftCardRecipientInput> recipientAttributes = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    public GiftCardCreateInput(BigDecimal initialValue) {
        this.initialValue = initialValue;
    }

    public BigDecimal getInitialValue() {
        return initialValue;
    }

    public GiftCardCreateInput setInitialValue(BigDecimal initialValue) {
        this.initialValue = initialValue;
        return this;
    }

    public String getCode() {
        return code.getValue();
    }

    public Input<String> getCodeInput() {
        return code;
    }

    public GiftCardCreateInput setCode(String code) {
        this.code = Input.optional(code);
        return this;
    }

    public GiftCardCreateInput setCodeInput(Input<String> code) {
        if (code == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.code = code;
        return this;
    }

    public ID getCustomerId() {
        return customerId.getValue();
    }

    public Input<ID> getCustomerIdInput() {
        return customerId;
    }

    public GiftCardCreateInput setCustomerId(ID customerId) {
        this.customerId = Input.optional(customerId);
        return this;
    }

    public GiftCardCreateInput setCustomerIdInput(Input<ID> customerId) {
        if (customerId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerId = customerId;
        return this;
    }

    public String getExpiresOn() {
        return expiresOn.getValue();
    }

    public Input<String> getExpiresOnInput() {
        return expiresOn;
    }

    public GiftCardCreateInput setExpiresOn(String expiresOn) {
        this.expiresOn = Input.optional(expiresOn);
        return this;
    }

    public GiftCardCreateInput setExpiresOnInput(Input<String> expiresOn) {
        if (expiresOn == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.expiresOn = expiresOn;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public GiftCardCreateInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public GiftCardCreateInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public GiftCardRecipientInput getRecipientAttributes() {
        return recipientAttributes.getValue();
    }

    public Input<GiftCardRecipientInput> getRecipientAttributesInput() {
        return recipientAttributes;
    }

    public GiftCardCreateInput setRecipientAttributes(GiftCardRecipientInput recipientAttributes) {
        this.recipientAttributes = Input.optional(recipientAttributes);
        return this;
    }

    public GiftCardCreateInput setRecipientAttributesInput(Input<GiftCardRecipientInput> recipientAttributes) {
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

    public GiftCardCreateInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public GiftCardCreateInput setTemplateSuffixInput(Input<String> templateSuffix) {
        if (templateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.templateSuffix = templateSuffix;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("initialValue:");
        Query.appendQuotedString(_queryBuilder, initialValue.toString());

        if (this.code.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("code:");
            if (code.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, code.getValue().toString());
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
