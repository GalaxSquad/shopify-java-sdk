// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* PayPal Wallet payment details related to a transaction.
*/
public class PaypalWalletPaymentDetailsQuery extends Query<PaypalWalletPaymentDetailsQuery> {
    PaypalWalletPaymentDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of payment method used by the buyer.
    */
    public PaypalWalletPaymentDetailsQuery paymentMethodName() {
        startField("paymentMethodName");

        return this;
    }
}
