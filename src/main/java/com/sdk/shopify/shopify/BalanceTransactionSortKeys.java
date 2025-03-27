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
* The set of valid sort keys for the BalanceTransaction query.
*/
public enum BalanceTransactionSortKeys {
    /**
    * Sort by the `amount` value.
    */
    AMOUNT,

    /**
    * Sort by the `fee` value.
    */
    FEE,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `net` value.
    */
    NET,

    /**
    * Sort by the `order_name` value.
    */
    ORDER_NAME,

    /**
    * Sort by the `payment_method_name` value.
    */
    PAYMENT_METHOD_NAME,

    /**
    * Sort by the `payout_date` value.
    */
    PAYOUT_DATE,

    /**
    * Sort by the `payout_status` value.
    */
    PAYOUT_STATUS,

    /**
    * Sort by the `processed_at` value.
    */
    PROCESSED_AT,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `transaction_type` value.
    */
    TRANSACTION_TYPE,

    UNKNOWN_VALUE;

    public static BalanceTransactionSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMOUNT": {
                return AMOUNT;
            }

            case "FEE": {
                return FEE;
            }

            case "ID": {
                return ID;
            }

            case "NET": {
                return NET;
            }

            case "ORDER_NAME": {
                return ORDER_NAME;
            }

            case "PAYMENT_METHOD_NAME": {
                return PAYMENT_METHOD_NAME;
            }

            case "PAYOUT_DATE": {
                return PAYOUT_DATE;
            }

            case "PAYOUT_STATUS": {
                return PAYOUT_STATUS;
            }

            case "PROCESSED_AT": {
                return PROCESSED_AT;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TRANSACTION_TYPE": {
                return TRANSACTION_TYPE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AMOUNT: {
                return "AMOUNT";
            }

            case FEE: {
                return "FEE";
            }

            case ID: {
                return "ID";
            }

            case NET: {
                return "NET";
            }

            case ORDER_NAME: {
                return "ORDER_NAME";
            }

            case PAYMENT_METHOD_NAME: {
                return "PAYMENT_METHOD_NAME";
            }

            case PAYOUT_DATE: {
                return "PAYOUT_DATE";
            }

            case PAYOUT_STATUS: {
                return "PAYOUT_STATUS";
            }

            case PROCESSED_AT: {
                return "PROCESSED_AT";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TRANSACTION_TYPE: {
                return "TRANSACTION_TYPE";
            }

            default: {
                return "";
            }
        }
    }
}

