// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomerIdentifierInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<UniqueMetafieldValueInput> customId = Input.undefined();

    private Input<String> emailAddress = Input.undefined();

    private Input<String> phoneNumber = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public CustomerIdentifierInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public CustomerIdentifierInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public UniqueMetafieldValueInput getCustomId() {
        return customId.getValue();
    }

    public Input<UniqueMetafieldValueInput> getCustomIdInput() {
        return customId;
    }

    public CustomerIdentifierInput setCustomId(UniqueMetafieldValueInput customId) {
        this.customId = Input.optional(customId);
        return this;
    }

    public CustomerIdentifierInput setCustomIdInput(Input<UniqueMetafieldValueInput> customId) {
        if (customId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customId = customId;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress.getValue();
    }

    public Input<String> getEmailAddressInput() {
        return emailAddress;
    }

    public CustomerIdentifierInput setEmailAddress(String emailAddress) {
        this.emailAddress = Input.optional(emailAddress);
        return this;
    }

    public CustomerIdentifierInput setEmailAddressInput(Input<String> emailAddress) {
        if (emailAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber.getValue();
    }

    public Input<String> getPhoneNumberInput() {
        return phoneNumber;
    }

    public CustomerIdentifierInput setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Input.optional(phoneNumber);
        return this;
    }

    public CustomerIdentifierInput setPhoneNumberInput(Input<String> phoneNumber) {
        if (phoneNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phoneNumber = phoneNumber;
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

        if (this.emailAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("emailAddress:");
            if (emailAddress.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, emailAddress.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.phoneNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("phoneNumber:");
            if (phoneNumber.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, phoneNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
