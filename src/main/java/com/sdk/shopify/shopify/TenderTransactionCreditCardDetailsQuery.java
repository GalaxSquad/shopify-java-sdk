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
* Information about the credit card used for this transaction.
*/
public class TenderTransactionCreditCardDetailsQuery extends Query<TenderTransactionCreditCardDetailsQuery> {
    TenderTransactionCreditCardDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of the company that issued the customer's credit card. Example: `Visa`.
    */
    public TenderTransactionCreditCardDetailsQuery creditCardCompany() {
        startField("creditCardCompany");

        return this;
    }

    /**
    * The customer's credit card number, with all digits except the last 4 redacted. Example: `•••• ••••
    * •••• 1234`
    */
    public TenderTransactionCreditCardDetailsQuery creditCardNumber() {
        startField("creditCardNumber");

        return this;
    }
}
