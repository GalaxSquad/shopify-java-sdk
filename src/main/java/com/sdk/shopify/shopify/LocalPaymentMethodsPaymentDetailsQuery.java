// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Local payment methods payment details related to a transaction.
*/
public class LocalPaymentMethodsPaymentDetailsQuery extends Query<LocalPaymentMethodsPaymentDetailsQuery> {
    LocalPaymentMethodsPaymentDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The descriptor by the payment provider. Only available for Amazon Pay and Buy with Prime.
    */
    public LocalPaymentMethodsPaymentDetailsQuery paymentDescriptor() {
        startField("paymentDescriptor");

        return this;
    }

    /**
    * The name of payment method used by the buyer.
    */
    public LocalPaymentMethodsPaymentDetailsQuery paymentMethodName() {
        startField("paymentMethodName");

        return this;
    }
}
