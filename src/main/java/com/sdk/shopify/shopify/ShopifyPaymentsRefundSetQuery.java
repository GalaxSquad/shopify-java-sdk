// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
