// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Card payment details related to a transaction.
*/
public class CardPaymentDetailsQuery extends Query<CardPaymentDetailsQuery> {
    CardPaymentDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The response code from the address verification system (AVS). The code is always a single letter.
    */
    public CardPaymentDetailsQuery avsResultCode() {
        startField("avsResultCode");

        return this;
    }

    /**
    * The issuer identification number (IIN), formerly known as bank identification number (BIN) of the
    * customer's credit card. This is made up of the first few digits of the credit card number.
    */
    public CardPaymentDetailsQuery bin() {
        startField("bin");

        return this;
    }

    /**
    * The name of the company that issued the customer's credit card.
    */
    public CardPaymentDetailsQuery company() {
        startField("company");

        return this;
    }

    /**
    * The response code from the credit card company indicating whether the customer entered the card
    * security code, or card verification value, correctly. The code is a single letter or empty string.
    */
    public CardPaymentDetailsQuery cvvResultCode() {
        startField("cvvResultCode");

        return this;
    }

    /**
    * The month in which the used credit card expires.
    */
    public CardPaymentDetailsQuery expirationMonth() {
        startField("expirationMonth");

        return this;
    }

    /**
    * The year in which the used credit card expires.
    */
    public CardPaymentDetailsQuery expirationYear() {
        startField("expirationYear");

        return this;
    }

    /**
    * The holder of the credit card.
    */
    public CardPaymentDetailsQuery name() {
        startField("name");

        return this;
    }

    /**
    * The customer's credit card number, with most of the leading digits redacted.
    */
    public CardPaymentDetailsQuery number() {
        startField("number");

        return this;
    }

    /**
    * The name of payment method used by the buyer.
    */
    public CardPaymentDetailsQuery paymentMethodName() {
        startField("paymentMethodName");

        return this;
    }

    /**
    * Digital wallet used for the payment.
    */
    public CardPaymentDetailsQuery wallet() {
        startField("wallet");

        return this;
    }
}
