// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import java.util.List;

public class MutationResponse {
    private TopLevelResponse response;
    private Mutation data;

    public MutationResponse(TopLevelResponse response) throws SchemaViolationError {
        this.response = response;
    
        JsonObject data2 = response.getData();
        this.data = data2 != null ? new Mutation(data2) : null;
    }

    public Mutation getData() {
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

    public static MutationResponse fromJson(String json) throws SchemaViolationError {
        final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
        return new MutationResponse(response);
    }
}