// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class OrderCreateUpsertCustomerAttributesInput implements Serializable {
    private Input<List<OrderCreateCustomerAddressInput>> addresses = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<String> firstName = Input.undefined();

    private Input<ID> id = Input.undefined();

    private Input<String> lastName = Input.undefined();

    private Input<String> multipassIdentifier = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<Boolean> taxExempt = Input.undefined();

    public List<OrderCreateCustomerAddressInput> getAddresses() {
        return addresses.getValue();
    }

    public Input<List<OrderCreateCustomerAddressInput>> getAddressesInput() {
        return addresses;
    }

    public OrderCreateUpsertCustomerAttributesInput setAddresses(List<OrderCreateCustomerAddressInput> addresses) {
        this.addresses = Input.optional(addresses);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setAddressesInput(Input<List<OrderCreateCustomerAddressInput>> addresses) {
        if (addresses == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.addresses = addresses;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public OrderCreateUpsertCustomerAttributesInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public Input<String> getFirstNameInput() {
        return firstName;
    }

    public OrderCreateUpsertCustomerAttributesInput setFirstName(String firstName) {
        this.firstName = Input.optional(firstName);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setFirstNameInput(Input<String> firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstName = firstName;
        return this;
    }

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public OrderCreateUpsertCustomerAttributesInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getLastName() {
        return lastName.getValue();
    }

    public Input<String> getLastNameInput() {
        return lastName;
    }

    public OrderCreateUpsertCustomerAttributesInput setLastName(String lastName) {
        this.lastName = Input.optional(lastName);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setLastNameInput(Input<String> lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastName = lastName;
        return this;
    }

    public String getMultipassIdentifier() {
        return multipassIdentifier.getValue();
    }

    public Input<String> getMultipassIdentifierInput() {
        return multipassIdentifier;
    }

    public OrderCreateUpsertCustomerAttributesInput setMultipassIdentifier(String multipassIdentifier) {
        this.multipassIdentifier = Input.optional(multipassIdentifier);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setMultipassIdentifierInput(Input<String> multipassIdentifier) {
        if (multipassIdentifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.multipassIdentifier = multipassIdentifier;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public OrderCreateUpsertCustomerAttributesInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public OrderCreateUpsertCustomerAttributesInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public OrderCreateUpsertCustomerAttributesInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public Boolean getTaxExempt() {
        return taxExempt.getValue();
    }

    public Input<Boolean> getTaxExemptInput() {
        return taxExempt;
    }

    public OrderCreateUpsertCustomerAttributesInput setTaxExempt(Boolean taxExempt) {
        this.taxExempt = Input.optional(taxExempt);
        return this;
    }

    public OrderCreateUpsertCustomerAttributesInput setTaxExemptInput(Input<Boolean> taxExempt) {
        if (taxExempt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxExempt = taxExempt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.addresses.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("addresses:");
            if (addresses.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateCustomerAddressInput item1 : addresses.getValue()) {
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

        if (this.firstName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("firstName:");
            if (firstName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, firstName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lastName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lastName:");
            if (lastName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, lastName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.multipassIdentifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("multipassIdentifier:");
            if (multipassIdentifier.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, multipassIdentifier.getValue().toString());
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

        if (this.phone.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("phone:");
            if (phone.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, phone.getValue().toString());
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

        if (this.taxExempt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxExempt:");
            if (taxExempt.getValue() != null) {
                _queryBuilder.append(taxExempt.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
