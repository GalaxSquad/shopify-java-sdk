// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

public class ApiCustomerAccessTokenCreatePayloadQuery extends Query<ApiCustomerAccessTokenCreatePayloadQuery> {
    ApiCustomerAccessTokenCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public ApiCustomerAccessTokenCreatePayloadQuery apiCustomerAccessToken(ApiCustomerAccessTokenQueryDefinition queryDef) {
        startField("apiCustomerAccessToken");

        _queryBuilder.append('{');
        queryDef.define(new ApiCustomerAccessTokenQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ApiCustomerAccessTokenCreatePayloadQuery clientMutationId() {
        startField("clientMutationId");

        return this;
    }

    public ApiCustomerAccessTokenCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
