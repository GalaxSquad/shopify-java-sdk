// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class CustomerMergeOverrideFields implements Serializable {
    private Input<ID> customerIdOfFirstNameToKeep = Input.undefined();

    private Input<ID> customerIdOfLastNameToKeep = Input.undefined();

    private Input<ID> customerIdOfEmailToKeep = Input.undefined();

    private Input<ID> customerIdOfPhoneNumberToKeep = Input.undefined();

    private Input<ID> customerIdOfDefaultAddressToKeep = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    public ID getCustomerIdOfFirstNameToKeep() {
        return customerIdOfFirstNameToKeep.getValue();
    }

    public Input<ID> getCustomerIdOfFirstNameToKeepInput() {
        return customerIdOfFirstNameToKeep;
    }

    public CustomerMergeOverrideFields setCustomerIdOfFirstNameToKeep(ID customerIdOfFirstNameToKeep) {
        this.customerIdOfFirstNameToKeep = Input.optional(customerIdOfFirstNameToKeep);
        return this;
    }

    public CustomerMergeOverrideFields setCustomerIdOfFirstNameToKeepInput(Input<ID> customerIdOfFirstNameToKeep) {
        if (customerIdOfFirstNameToKeep == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerIdOfFirstNameToKeep = customerIdOfFirstNameToKeep;
        return this;
    }

    public ID getCustomerIdOfLastNameToKeep() {
        return customerIdOfLastNameToKeep.getValue();
    }

    public Input<ID> getCustomerIdOfLastNameToKeepInput() {
        return customerIdOfLastNameToKeep;
    }

    public CustomerMergeOverrideFields setCustomerIdOfLastNameToKeep(ID customerIdOfLastNameToKeep) {
        this.customerIdOfLastNameToKeep = Input.optional(customerIdOfLastNameToKeep);
        return this;
    }

    public CustomerMergeOverrideFields setCustomerIdOfLastNameToKeepInput(Input<ID> customerIdOfLastNameToKeep) {
        if (customerIdOfLastNameToKeep == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerIdOfLastNameToKeep = customerIdOfLastNameToKeep;
        return this;
    }

    public ID getCustomerIdOfEmailToKeep() {
        return customerIdOfEmailToKeep.getValue();
    }

    public Input<ID> getCustomerIdOfEmailToKeepInput() {
        return customerIdOfEmailToKeep;
    }

    public CustomerMergeOverrideFields setCustomerIdOfEmailToKeep(ID customerIdOfEmailToKeep) {
        this.customerIdOfEmailToKeep = Input.optional(customerIdOfEmailToKeep);
        return this;
    }

    public CustomerMergeOverrideFields setCustomerIdOfEmailToKeepInput(Input<ID> customerIdOfEmailToKeep) {
        if (customerIdOfEmailToKeep == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerIdOfEmailToKeep = customerIdOfEmailToKeep;
        return this;
    }

    public ID getCustomerIdOfPhoneNumberToKeep() {
        return customerIdOfPhoneNumberToKeep.getValue();
    }

    public Input<ID> getCustomerIdOfPhoneNumberToKeepInput() {
        return customerIdOfPhoneNumberToKeep;
    }

    public CustomerMergeOverrideFields setCustomerIdOfPhoneNumberToKeep(ID customerIdOfPhoneNumberToKeep) {
        this.customerIdOfPhoneNumberToKeep = Input.optional(customerIdOfPhoneNumberToKeep);
        return this;
    }

    public CustomerMergeOverrideFields setCustomerIdOfPhoneNumberToKeepInput(Input<ID> customerIdOfPhoneNumberToKeep) {
        if (customerIdOfPhoneNumberToKeep == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerIdOfPhoneNumberToKeep = customerIdOfPhoneNumberToKeep;
        return this;
    }

    public ID getCustomerIdOfDefaultAddressToKeep() {
        return customerIdOfDefaultAddressToKeep.getValue();
    }

    public Input<ID> getCustomerIdOfDefaultAddressToKeepInput() {
        return customerIdOfDefaultAddressToKeep;
    }

    public CustomerMergeOverrideFields setCustomerIdOfDefaultAddressToKeep(ID customerIdOfDefaultAddressToKeep) {
        this.customerIdOfDefaultAddressToKeep = Input.optional(customerIdOfDefaultAddressToKeep);
        return this;
    }

    public CustomerMergeOverrideFields setCustomerIdOfDefaultAddressToKeepInput(Input<ID> customerIdOfDefaultAddressToKeep) {
        if (customerIdOfDefaultAddressToKeep == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerIdOfDefaultAddressToKeep = customerIdOfDefaultAddressToKeep;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public CustomerMergeOverrideFields setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public CustomerMergeOverrideFields setNoteInput(Input<String> note) {
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

    public CustomerMergeOverrideFields setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public CustomerMergeOverrideFields setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.customerIdOfFirstNameToKeep.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerIdOfFirstNameToKeep:");
            if (customerIdOfFirstNameToKeep.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerIdOfFirstNameToKeep.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerIdOfLastNameToKeep.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerIdOfLastNameToKeep:");
            if (customerIdOfLastNameToKeep.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerIdOfLastNameToKeep.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerIdOfEmailToKeep.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerIdOfEmailToKeep:");
            if (customerIdOfEmailToKeep.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerIdOfEmailToKeep.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerIdOfPhoneNumberToKeep.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerIdOfPhoneNumberToKeep:");
            if (customerIdOfPhoneNumberToKeep.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerIdOfPhoneNumberToKeep.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerIdOfDefaultAddressToKeep.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerIdOfDefaultAddressToKeep:");
            if (customerIdOfDefaultAddressToKeep.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerIdOfDefaultAddressToKeep.getValue().toString());
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

        _queryBuilder.append('}');
    }
}
