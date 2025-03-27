// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ApiCustomerAccessTokenCreateInput implements Serializable {
    private String email;

    private String password;

    private Input<String> clientMutationId = Input.undefined();

    public ApiCustomerAccessTokenCreateInput(String email, String password) {
        this.email = email;

        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public ApiCustomerAccessTokenCreateInput setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ApiCustomerAccessTokenCreateInput setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public ApiCustomerAccessTokenCreateInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public ApiCustomerAccessTokenCreateInput setClientMutationIdInput(Input<String> clientMutationId) {
        if (clientMutationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.clientMutationId = clientMutationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("email:");
        Query.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("password:");
        Query.appendQuotedString(_queryBuilder, password.toString());

        if (this.clientMutationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("clientMutationId:");
            if (clientMutationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, clientMutationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
