// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class OrderInput implements Serializable {
    private ID id;

    private Input<String> email = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<MailingAddressInput> shippingAddress = Input.undefined();

    private Input<List<AttributeInput>> customAttributes = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<List<LocalizedFieldInput>> localizedFields = Input.undefined();

    private Input<String> poNumber = Input.undefined();

    public OrderInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public OrderInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public OrderInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public OrderInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public OrderInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public OrderInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public OrderInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public OrderInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public MailingAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    public Input<MailingAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    public OrderInput setShippingAddress(MailingAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    public OrderInput setShippingAddressInput(Input<MailingAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    public List<AttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<AttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public OrderInput setCustomAttributes(List<AttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public OrderInput setCustomAttributesInput(Input<List<AttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public OrderInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public OrderInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public List<LocalizedFieldInput> getLocalizedFields() {
        return localizedFields.getValue();
    }

    public Input<List<LocalizedFieldInput>> getLocalizedFieldsInput() {
        return localizedFields;
    }

    public OrderInput setLocalizedFields(List<LocalizedFieldInput> localizedFields) {
        this.localizedFields = Input.optional(localizedFields);
        return this;
    }

    public OrderInput setLocalizedFieldsInput(Input<List<LocalizedFieldInput>> localizedFields) {
        if (localizedFields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.localizedFields = localizedFields;
        return this;
    }

    public String getPoNumber() {
        return poNumber.getValue();
    }

    public Input<String> getPoNumberInput() {
        return poNumber;
    }

    public OrderInput setPoNumber(String poNumber) {
        this.poNumber = Input.optional(poNumber);
        return this;
    }

    public OrderInput setPoNumberInput(Input<String> poNumber) {
        if (poNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poNumber = poNumber;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, email.getValue().toString());
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

        if (this.tags.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tags:");
            if (tags.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : tags.getValue()) {
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

        if (this.shippingAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingAddress:");
            if (shippingAddress.getValue() != null) {
                shippingAddress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customAttributes:");
            if (customAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (AttributeInput item1 : customAttributes.getValue()) {
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

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
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

        if (this.localizedFields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("localizedFields:");
            if (localizedFields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocalizedFieldInput item1 : localizedFields.getValue()) {
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

        if (this.poNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poNumber:");
            if (poNumber.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, poNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
