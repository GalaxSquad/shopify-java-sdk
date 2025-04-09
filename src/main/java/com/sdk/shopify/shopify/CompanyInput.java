// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CompanyInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<String> externalId = Input.undefined();

    private Input<String> customerSince = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public CompanyInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CompanyInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public CompanyInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public CompanyInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public String getExternalId() {
        return externalId.getValue();
    }

    public Input<String> getExternalIdInput() {
        return externalId;
    }

    public CompanyInput setExternalId(String externalId) {
        this.externalId = Input.optional(externalId);
        return this;
    }

    public CompanyInput setExternalIdInput(Input<String> externalId) {
        if (externalId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.externalId = externalId;
        return this;
    }

    public String getCustomerSince() {
        return customerSince.getValue();
    }

    public Input<String> getCustomerSinceInput() {
        return customerSince;
    }

    public CompanyInput setCustomerSince(String customerSince) {
        this.customerSince = Input.optional(customerSince);
        return this;
    }

    public CompanyInput setCustomerSinceInput(Input<String> customerSince) {
        if (customerSince == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerSince = customerSince;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
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

        if (this.externalId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("externalId:");
            if (externalId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, externalId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerSince.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerSince:");
            if (customerSince.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerSince.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
