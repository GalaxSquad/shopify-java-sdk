// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The receipt of Shop Pay payment request session submission.
*/
public class ShopPayPaymentRequestReceiptQuery extends Query<ShopPayPaymentRequestReceiptQuery> {
    ShopPayPaymentRequestReceiptQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date and time when the payment request receipt was created.
    */
    public ShopPayPaymentRequestReceiptQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The order that's associated with the payment request receipt.
    */
    public ShopPayPaymentRequestReceiptQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop pay payment request object.
    */
    public ShopPayPaymentRequestReceiptQuery paymentRequest(ShopPayPaymentRequestQueryDefinition queryDef) {
        startField("paymentRequest");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the payment request session submission.
    */
    public ShopPayPaymentRequestReceiptQuery processingStatus(ShopPayPaymentRequestReceiptProcessingStatusQueryDefinition queryDef) {
        startField("processingStatus");

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestReceiptProcessingStatusQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The source identifier provided in the `ShopPayPaymentRequestSessionCreate` mutation.
    */
    public ShopPayPaymentRequestReceiptQuery sourceIdentifier() {
        startField("sourceIdentifier");

        return this;
    }

    /**
    * The token of the receipt, initially returned by an `ShopPayPaymentRequestSessionSubmit` mutation.
    */
    public ShopPayPaymentRequestReceiptQuery token() {
        startField("token");

        return this;
    }
}
