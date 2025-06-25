package com.sdk.shopify.helper;

import com.sdk.shopify.ShopifySdk;
import com.sdk.shopify.shopify.QueryResponse;
import com.sdk.shopify.shopify.QueryRootQuery;

public class GraphQLAdminHelper extends QueryAdminHelper<QueryRootQuery, QueryResponse> {

    public GraphQLAdminHelper(ShopifySdk shopifySdk) {
        super(shopifySdk);
    }

    @Override
    protected String toJsonPayload(QueryRootQuery query) {
        return toJsonPayload(query.toString());
    }

    @Override
    protected String toJsonPayload(String query) {
        // if query already exist in first position, return the query
        query = query.trim();
        int queryIndex = query.indexOf("query");
        if (queryIndex == 0 || queryIndex == 1) {
            return query;
        }
        // Simple JSON escaping - only escape quotes that are actually in the GraphQL
        // query
        String escapedQuery = query.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r",
                "\\r");
        if (!query.startsWith("{")) {
            return String.format(
                    "{\"query\":\"{%s}\"}", escapedQuery);
        }
        return String.format(
                "{\"query\":\"%s\"}", escapedQuery);
    }

    @Override
    protected QueryResponse fromJson(String json) {
        try {
            return QueryResponse.fromJson(json);
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse JSON response", e);
        }
    }
}
