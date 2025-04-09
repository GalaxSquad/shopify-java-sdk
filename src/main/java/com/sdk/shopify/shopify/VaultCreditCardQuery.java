// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a credit card payment instrument.
*/
public class VaultCreditCardQuery extends Query<VaultCreditCardQuery> {
    VaultCreditCardQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The billing address of the card.
    */
    public VaultCreditCardQuery billingAddress(CustomerCreditCardBillingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new CustomerCreditCardBillingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The brand for the card.
    */
    public VaultCreditCardQuery brand() {
        startField("brand");

        return this;
    }

    /**
    * Whether the card has been expired.
    */
    public VaultCreditCardQuery expired() {
        startField("expired");

        return this;
    }

    /**
    * The expiry month of the card.
    */
    public VaultCreditCardQuery expiryMonth() {
        startField("expiryMonth");

        return this;
    }

    /**
    * The expiry year of the card.
    */
    public VaultCreditCardQuery expiryYear() {
        startField("expiryYear");

        return this;
    }

    /**
    * The last four digits for the card.
    */
    public VaultCreditCardQuery lastDigits() {
        startField("lastDigits");

        return this;
    }

    /**
    * The name of the card holder.
    */
    public VaultCreditCardQuery name() {
        startField("name");

        return this;
    }
}
