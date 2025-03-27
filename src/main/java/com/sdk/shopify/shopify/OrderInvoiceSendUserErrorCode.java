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
* Possible error codes that can be returned by `OrderInvoiceSendUserError`.
*/
public enum OrderInvoiceSendUserErrorCode {
    /**
    * An error occurred while sending the invoice.
    */
    ORDER_INVOICE_SEND_UNSUCCESSFUL,

    UNKNOWN_VALUE;

    public static OrderInvoiceSendUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORDER_INVOICE_SEND_UNSUCCESSFUL": {
                return ORDER_INVOICE_SEND_UNSUCCESSFUL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ORDER_INVOICE_SEND_UNSUCCESSFUL: {
                return "ORDER_INVOICE_SEND_UNSUCCESSFUL";
            }

            default: {
                return "";
            }
        }
    }
}

