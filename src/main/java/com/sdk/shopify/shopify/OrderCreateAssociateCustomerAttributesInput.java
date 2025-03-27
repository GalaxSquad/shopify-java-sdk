// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderCreateAssociateCustomerAttributesInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> email = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public OrderCreateAssociateCustomerAttributesInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public OrderCreateAssociateCustomerAttributesInput setIdInput(Input<ID> id) {
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

    public OrderCreateAssociateCustomerAttributesInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public OrderCreateAssociateCustomerAttributesInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
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

        _queryBuilder.append('}');
    }
}
