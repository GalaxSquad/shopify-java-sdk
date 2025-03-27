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

public class MetaobjectHandleInput implements Serializable {
    private String type;

    private String handle;

    public MetaobjectHandleInput(String type, String handle) {
        this.type = type;

        this.handle = handle;
    }

    public String getType() {
        return type;
    }

    public MetaobjectHandleInput setType(String type) {
        this.type = type;
        return this;
    }

    public String getHandle() {
        return handle;
    }

    public MetaobjectHandleInput setHandle(String handle) {
        this.handle = handle;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("handle:");
        Query.appendQuotedString(_queryBuilder, handle.toString());

        _queryBuilder.append('}');
    }
}
