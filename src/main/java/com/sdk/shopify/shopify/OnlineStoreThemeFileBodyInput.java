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

public class OnlineStoreThemeFileBodyInput implements Serializable {
    private OnlineStoreThemeFileBodyInputType type;

    private String value;

    public OnlineStoreThemeFileBodyInput(OnlineStoreThemeFileBodyInputType type, String value) {
        this.type = type;

        this.value = value;
    }

    public OnlineStoreThemeFileBodyInputType getType() {
        return type;
    }

    public OnlineStoreThemeFileBodyInput setType(OnlineStoreThemeFileBodyInputType type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public OnlineStoreThemeFileBodyInput setValue(String value) {
        this.value = value;
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
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}
