// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class DelegateAccessTokenInput implements Serializable {
    private List<String> delegateAccessScope;

    private Input<Integer> expiresIn = Input.undefined();

    public DelegateAccessTokenInput(List<String> delegateAccessScope) {
        this.delegateAccessScope = delegateAccessScope;
    }

    public List<String> getDelegateAccessScope() {
        return delegateAccessScope;
    }

    public DelegateAccessTokenInput setDelegateAccessScope(List<String> delegateAccessScope) {
        this.delegateAccessScope = delegateAccessScope;
        return this;
    }

    public Integer getExpiresIn() {
        return expiresIn.getValue();
    }

    public Input<Integer> getExpiresInInput() {
        return expiresIn;
    }

    public DelegateAccessTokenInput setExpiresIn(Integer expiresIn) {
        this.expiresIn = Input.optional(expiresIn);
        return this;
    }

    public DelegateAccessTokenInput setExpiresInInput(Input<Integer> expiresIn) {
        if (expiresIn == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.expiresIn = expiresIn;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("delegateAccessScope:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : delegateAccessScope) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        if (this.expiresIn.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("expiresIn:");
            if (expiresIn.getValue() != null) {
                _queryBuilder.append(expiresIn.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
