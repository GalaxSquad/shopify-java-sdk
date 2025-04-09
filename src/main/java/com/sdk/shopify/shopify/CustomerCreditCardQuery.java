// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a card instrument for customer payment method.
*/
public class CustomerCreditCardQuery extends Query<CustomerCreditCardQuery> {
    CustomerCreditCardQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The billing address of the card.
    */
    public CustomerCreditCardQuery billingAddress(CustomerCreditCardBillingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new CustomerCreditCardBillingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The brand of the card.
    */
    public CustomerCreditCardQuery brand() {
        startField("brand");

        return this;
    }

    /**
    * Whether the card is about to expire.
    */
    public CustomerCreditCardQuery expiresSoon() {
        startField("expiresSoon");

        return this;
    }

    /**
    * The expiry month of the card.
    */
    public CustomerCreditCardQuery expiryMonth() {
        startField("expiryMonth");

        return this;
    }

    /**
    * The expiry year of the card.
    */
    public CustomerCreditCardQuery expiryYear() {
        startField("expiryYear");

        return this;
    }

    /**
    * The card's BIN number.
    */
    public CustomerCreditCardQuery firstDigits() {
        startField("firstDigits");

        return this;
    }

    /**
    * The payment method can be revoked if there are no active subscription contracts.
    */
    public CustomerCreditCardQuery isRevocable() {
        startField("isRevocable");

        return this;
    }

    /**
    * The last 4 digits of the card.
    */
    public CustomerCreditCardQuery lastDigits() {
        startField("lastDigits");

        return this;
    }

    /**
    * The masked card number with only the last 4 digits displayed.
    */
    public CustomerCreditCardQuery maskedNumber() {
        startField("maskedNumber");

        return this;
    }

    /**
    * The name of the card holder.
    */
    public CustomerCreditCardQuery name() {
        startField("name");

        return this;
    }

    /**
    * The source of the card if coming from a wallet such as Apple Pay.
    */
    public CustomerCreditCardQuery source() {
        startField("source");

        return this;
    }

    /**
    * The last 4 digits of the Device Account Number.
    */
    public CustomerCreditCardQuery virtualLastDigits() {
        startField("virtualLastDigits");

        return this;
    }
}
