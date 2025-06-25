package com.sdk.shopify.helper;

import com.sdk.shopify.ShopifySdk;

public class QueryAdminFactory {  

    private GraphQLAdminHelper graphQLAdminHelperInstance;
    private MutationAdminHelper mutationAdminHelperInstance;

    public QueryAdminFactory(ShopifySdk shopifySdk) {
        graphQLAdminHelperInstance = new GraphQLAdminHelper(shopifySdk);
        mutationAdminHelperInstance = new MutationAdminHelper(shopifySdk);
    }

    public QueryAdminHelper<?, ?> createAdminHelper(AdminHelperType adminHelperType) {
        switch (adminHelperType) {
            case GRAPHQL:
                return graphQLAdminHelperInstance;
            case MUTATION:
                return mutationAdminHelperInstance;
            default:
                throw new IllegalArgumentException("Invalid admin helper type: " + adminHelperType);
        }
    }

    public enum AdminHelperType {
        GRAPHQL,
        MUTATION
    }
}
