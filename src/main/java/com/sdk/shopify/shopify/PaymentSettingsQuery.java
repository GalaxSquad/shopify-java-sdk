// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Settings related to payments.
*/
public class PaymentSettingsQuery extends Query<PaymentSettingsQuery> {
    PaymentSettingsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of the digital wallets which the shop supports.
    */
    public PaymentSettingsQuery supportedDigitalWallets() {
        startField("supportedDigitalWallets");

        return this;
    }
}
