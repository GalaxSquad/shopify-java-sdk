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
* The set of valid sort keys for the Payout query.
*/
public enum PayoutSortKeys {
    /**
    * Sort by the `adjustment_gross` value.
    */
    ADJUSTMENT_GROSS,

    /**
    * Sort by the `advance_gross` value.
    */
    ADVANCE_GROSS,

    /**
    * Sort by the `amount` value.
    */
    AMOUNT,

    /**
    * Sort by the `charge_gross` value.
    */
    CHARGE_GROSS,

    /**
    * Sort by the `duties_gross` value.
    */
    DUTIES_GROSS,

    /**
    * Sort by the `fee_amount` value.
    */
    FEE_AMOUNT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `issued_at` value.
    */
    ISSUED_AT,

    /**
    * Sort by the `refund_gross` value.
    */
    REFUND_GROSS,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `shipping_label_gross` value.
    */
    SHIPPING_LABEL_GROSS,

    /**
    * Sort by the `status` value.
    */
    STATUS,

    UNKNOWN_VALUE;

    public static PayoutSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADJUSTMENT_GROSS": {
                return ADJUSTMENT_GROSS;
            }

            case "ADVANCE_GROSS": {
                return ADVANCE_GROSS;
            }

            case "AMOUNT": {
                return AMOUNT;
            }

            case "CHARGE_GROSS": {
                return CHARGE_GROSS;
            }

            case "DUTIES_GROSS": {
                return DUTIES_GROSS;
            }

            case "FEE_AMOUNT": {
                return FEE_AMOUNT;
            }

            case "ID": {
                return ID;
            }

            case "ISSUED_AT": {
                return ISSUED_AT;
            }

            case "REFUND_GROSS": {
                return REFUND_GROSS;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "SHIPPING_LABEL_GROSS": {
                return SHIPPING_LABEL_GROSS;
            }

            case "STATUS": {
                return STATUS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADJUSTMENT_GROSS: {
                return "ADJUSTMENT_GROSS";
            }

            case ADVANCE_GROSS: {
                return "ADVANCE_GROSS";
            }

            case AMOUNT: {
                return "AMOUNT";
            }

            case CHARGE_GROSS: {
                return "CHARGE_GROSS";
            }

            case DUTIES_GROSS: {
                return "DUTIES_GROSS";
            }

            case FEE_AMOUNT: {
                return "FEE_AMOUNT";
            }

            case ID: {
                return "ID";
            }

            case ISSUED_AT: {
                return "ISSUED_AT";
            }

            case REFUND_GROSS: {
                return "REFUND_GROSS";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case SHIPPING_LABEL_GROSS: {
                return "SHIPPING_LABEL_GROSS";
            }

            case STATUS: {
                return "STATUS";
            }

            default: {
                return "";
            }
        }
    }
}

