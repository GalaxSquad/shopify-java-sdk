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
* Presents all Shopify Payments specific information related to an order refund.
*/
public class ShopifyPaymentsRefundSetQuery extends Query<ShopifyPaymentsRefundSetQuery> {
    ShopifyPaymentsRefundSetQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The acquirer reference number (ARN) code generated for Visa/Mastercard transactions.
    */
    public ShopifyPaymentsRefundSetQuery acquirerReferenceNumber() {
        startField("acquirerReferenceNumber");

        return this;
    }
}
