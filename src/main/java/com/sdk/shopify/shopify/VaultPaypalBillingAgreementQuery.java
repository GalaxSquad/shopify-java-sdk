// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a paypal billing agreement payment instrument.
*/
public class VaultPaypalBillingAgreementQuery extends Query<VaultPaypalBillingAgreementQuery> {
    VaultPaypalBillingAgreementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the paypal billing agreement is inactive.
    */
    public VaultPaypalBillingAgreementQuery inactive() {
        startField("inactive");

        return this;
    }

    /**
    * The paypal account name.
    */
    public VaultPaypalBillingAgreementQuery name() {
        startField("name");

        return this;
    }

    /**
    * The paypal account email address.
    */
    public VaultPaypalBillingAgreementQuery paypalAccountEmail() {
        startField("paypalAccountEmail");

        return this;
    }
}
