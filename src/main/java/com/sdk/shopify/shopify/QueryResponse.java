// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;

public class QueryResponse extends Response<QueryRoot> {

    public QueryResponse(TopLevelResponse response) throws SchemaViolationError {
        super(response);
        this.data = response.getData() != null ? new QueryRoot(response.getData()) : null;
    }
    public static QueryResponse fromJson(String json) throws SchemaViolationError {
        return new QueryResponse(buildTopLevelResponse(json));
    }
}