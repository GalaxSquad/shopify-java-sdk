package com.sdk.shopify.helper;

import com.sdk.shopify.ShopifySdk;
import com.sdk.shopify.shopify.MutationQuery;
import com.sdk.shopify.shopify.MutationResponse;

public class MutationAdminHelper extends QueryAdminHelper<MutationQuery, MutationResponse> {

    public MutationAdminHelper(ShopifySdk shopifySdk) {
        super(shopifySdk);
    }

    @Override
    protected String toJsonPayload(MutationQuery mutation) {
        return toJsonPayload(mutation.toString());
    }

    /**
     * Convert a mutation string to JSON payload format.
     * Unlike queries, mutations don't need additional braces.
     */
    @Override
    protected String toJsonPayload(String mutation) {
        // Simple JSON escaping - only escape quotes that are actually in the GraphQL
        // mutation
        String escapedMutation = mutation.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r",
                "\\r");
        return String.format("{\"query\":\"%s\"}", escapedMutation);
    }

    @Override
    protected MutationResponse fromJson(String json) {
        try {
            return MutationResponse.fromJson(json);
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse JSON response", e);
        }
    }
}
