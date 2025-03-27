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

import java.util.List;

public class QueryResponse {
    private TopLevelResponse response;
    private QueryRoot data;

    public QueryResponse(TopLevelResponse response) throws SchemaViolationError {
        this.response = response;
        this.data = response.getData() != null ? new QueryRoot(response.getData()) : null;
    }

    public QueryRoot getData() {
        return data;
    }

    public List<Error> getErrors() {
        return response.getErrors();
    }

    public String toJson() {
        return new Gson().toJson(response);
    }

    public String prettyPrintJson() {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(response);
    }

    public static QueryResponse fromJson(String json) throws SchemaViolationError {
        final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
        return new QueryResponse(response);
    }
}