// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class AuthorInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<ID> userId = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AuthorInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AuthorInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public ID getUserId() {
        return userId.getValue();
    }

    public Input<ID> getUserIdInput() {
        return userId;
    }

    public AuthorInput setUserId(ID userId) {
        this.userId = Input.optional(userId);
        return this;
    }

    public AuthorInput setUserIdInput(Input<ID> userId) {
        if (userId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.userId = userId;
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

        if (this.userId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("userId:");
            if (userId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, userId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
