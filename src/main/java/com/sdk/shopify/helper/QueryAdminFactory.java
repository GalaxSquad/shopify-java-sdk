package com.sdk.shopify.helper;

import com.sdk.shopify.ShopifySdk;

public class QueryAdminFactory {  

    private static GraphQLAdminHelper graphQLAdminHelperInstance;
    private static MutationAdminHelper mutationAdminHelperInstance;

    public static QueryAdminHelper createAdminHelper(ShopifySdk shopifySdk, AdminHelperType adminHelperType) {
        switch (adminHelperType) {
            case GRAPHQL:
                return createGraphQLAdminHelper(shopifySdk);
            case MUTATION:
                return createMutationAdminHelper(shopifySdk);
            default:
                throw new IllegalArgumentException("Invalid admin helper type: " + adminHelperType);
        }
    }
    
    private static GraphQLAdminHelper createGraphQLAdminHelper(ShopifySdk shopifySdk) {
        if (graphQLAdminHelperInstance == null) {
            graphQLAdminHelperInstance = new GraphQLAdminHelper(shopifySdk);
        }
        return graphQLAdminHelperInstance;
    }

    private static MutationAdminHelper createMutationAdminHelper(ShopifySdk shopifySdk) {
        if (mutationAdminHelperInstance == null) {
            mutationAdminHelperInstance = new MutationAdminHelper(shopifySdk);
        }
        return mutationAdminHelperInstance;
    }

    enum AdminHelperType {
        GRAPHQL,
        MUTATION
    }
}
