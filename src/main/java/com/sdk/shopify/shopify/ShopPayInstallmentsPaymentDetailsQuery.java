// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Shop Pay Installments payment details related to a transaction.
*/
public class ShopPayInstallmentsPaymentDetailsQuery extends Query<ShopPayInstallmentsPaymentDetailsQuery> {
    ShopPayInstallmentsPaymentDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of payment method used by the buyer.
    */
    public ShopPayInstallmentsPaymentDetailsQuery paymentMethodName() {
        startField("paymentMethodName");

        return this;
    }
}
