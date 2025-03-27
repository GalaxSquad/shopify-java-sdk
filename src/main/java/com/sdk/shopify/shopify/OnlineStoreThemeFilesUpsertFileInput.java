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

public class OnlineStoreThemeFilesUpsertFileInput implements Serializable {
    private String filename;

    private OnlineStoreThemeFileBodyInput body;

    public OnlineStoreThemeFilesUpsertFileInput(String filename, OnlineStoreThemeFileBodyInput body) {
        this.filename = filename;

        this.body = body;
    }

    public String getFilename() {
        return filename;
    }

    public OnlineStoreThemeFilesUpsertFileInput setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public OnlineStoreThemeFileBodyInput getBody() {
        return body;
    }

    public OnlineStoreThemeFilesUpsertFileInput setBody(OnlineStoreThemeFileBodyInput body) {
        this.body = body;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("filename:");
        Query.appendQuotedString(_queryBuilder, filename.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("body:");
        body.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
