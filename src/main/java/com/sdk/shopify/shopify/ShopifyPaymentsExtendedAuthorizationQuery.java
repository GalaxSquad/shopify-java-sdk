// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Presents all Shopify Payments information related to an extended authorization.
*/
public class ShopifyPaymentsExtendedAuthorizationQuery extends Query<ShopifyPaymentsExtendedAuthorizationQuery> {
    ShopifyPaymentsExtendedAuthorizationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The time after which the extended authorization expires. After the expiry, the merchant is unable to
    * capture the payment.
    */
    public ShopifyPaymentsExtendedAuthorizationQuery extendedAuthorizationExpiresAt() {
        startField("extendedAuthorizationExpiresAt");

        return this;
    }

    /**
    * The time after which capture will incur an additional fee.
    */
    public ShopifyPaymentsExtendedAuthorizationQuery standardAuthorizationExpiresAt() {
        startField("standardAuthorizationExpiresAt");

        return this;
    }
}
