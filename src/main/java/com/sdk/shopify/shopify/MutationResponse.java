// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;

public class MutationResponse extends Response<Mutation> {

    public MutationResponse(TopLevelResponse response) throws SchemaViolationError {
        super(response);
        this.data = response.getData() != null ? new Mutation(response.getData()) : null;
    }

    public static MutationResponse fromJson(String json) throws SchemaViolationError {
        return new MutationResponse(buildTopLevelResponse(json));
    }
}