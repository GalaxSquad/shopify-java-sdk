// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

public class ApiCustomerAccessTokenQuery extends Query<ApiCustomerAccessTokenQuery> {
    ApiCustomerAccessTokenQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public ApiCustomerAccessTokenQuery accessToken() {
        startField("accessToken");

        return this;
    }

    public ApiCustomerAccessTokenQuery expiresAt() {
        startField("expiresAt");

        return this;
    }
}
