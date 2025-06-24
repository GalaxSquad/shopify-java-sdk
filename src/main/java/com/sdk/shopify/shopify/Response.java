package com.sdk.shopify.shopify;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.TopLevelResponse;

public class Response<T extends AbstractResponse<T>> {
    protected TopLevelResponse response;
    protected T data;

    public Response(TopLevelResponse response) {
        this.response = response;
    }

    public TopLevelResponse getResponse() {
        return response;
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

    public T getData() {
        return data;
    }

    protected static TopLevelResponse buildTopLevelResponse(String json) {
        return new Gson().fromJson(json, TopLevelResponse.class);
    }

    public static <T extends AbstractResponse<T>> Response<T> fromJson(String json) throws SchemaViolationError {
        return new Response<>(buildTopLevelResponse(json));
    }
}
