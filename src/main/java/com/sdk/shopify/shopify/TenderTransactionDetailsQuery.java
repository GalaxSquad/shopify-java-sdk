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
* Information about the payment instrument used for this transaction.
*/
public class TenderTransactionDetailsQuery extends Query<TenderTransactionDetailsQuery> {
    TenderTransactionDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public TenderTransactionDetailsQuery onTenderTransactionCreditCardDetails(TenderTransactionCreditCardDetailsQueryDefinition queryDef) {
        startInlineFragment("TenderTransactionCreditCardDetails");
        queryDef.define(new TenderTransactionCreditCardDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
