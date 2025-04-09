// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
