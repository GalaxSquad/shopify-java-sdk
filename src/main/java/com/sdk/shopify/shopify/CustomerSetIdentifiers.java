// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerSetIdentifiers implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<UniqueMetafieldValueInput> customId = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public CustomerSetIdentifiers setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public CustomerSetIdentifiers setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public CustomerSetIdentifiers setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public CustomerSetIdentifiers setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public CustomerSetIdentifiers setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public CustomerSetIdentifiers setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public UniqueMetafieldValueInput getCustomId() {
        return customId.getValue();
    }

    public Input<UniqueMetafieldValueInput> getCustomIdInput() {
        return customId;
    }

    public CustomerSetIdentifiers setCustomId(UniqueMetafieldValueInput customId) {
        this.customId = Input.optional(customId);
        return this;
    }

    public CustomerSetIdentifiers setCustomIdInput(Input<UniqueMetafieldValueInput> customId) {
        if (customId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customId = customId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.customId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customId:");
            if (customId.getValue() != null) {
                customId.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
