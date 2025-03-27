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

public class ShopPolicyInput implements Serializable {
    private ShopPolicyType type;

    private String body;

    public ShopPolicyInput(ShopPolicyType type, String body) {
        this.type = type;

        this.body = body;
    }

    public ShopPolicyType getType() {
        return type;
    }

    public ShopPolicyInput setType(ShopPolicyType type) {
        this.type = type;
        return this;
    }

    public String getBody() {
        return body;
    }

    public ShopPolicyInput setBody(String body) {
        this.body = body;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        _queryBuilder.append(type.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("body:");
        Query.appendQuotedString(_queryBuilder, body.toString());

        _queryBuilder.append('}');
    }
}
