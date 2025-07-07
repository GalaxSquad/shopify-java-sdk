// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The processing status of a Shop Pay payment request.
* Represents the different states a payment request can be in during its lifecycle,
* from initial creation through to completion or failure.
*/
public class ShopPayPaymentRequestReceiptProcessingStatusQuery extends Query<ShopPayPaymentRequestReceiptProcessingStatusQuery> {
    ShopPayPaymentRequestReceiptProcessingStatusQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A standardized error code, independent of the payment provider.
    */
    public ShopPayPaymentRequestReceiptProcessingStatusQuery errorCode() {
        startField("errorCode");

        return this;
    }

    /**
    * The message of the payment request receipt.
    */
    public ShopPayPaymentRequestReceiptProcessingStatusQuery message() {
        startField("message");

        return this;
    }

    /**
    * The state of the payment request receipt.
    */
    public ShopPayPaymentRequestReceiptProcessingStatusQuery state() {
        startField("state");

        return this;
    }
}
