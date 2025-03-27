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
* Possible error codes that can be returned by `PaymentTermsUpdateUserError`.
*/
public enum PaymentTermsUpdateUserErrorCode {
    /**
    * An error occurred while updating payment terms.
    */
    PAYMENT_TERMS_UPDATE_UNSUCCESSFUL,

    UNKNOWN_VALUE;

    public static PaymentTermsUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PAYMENT_TERMS_UPDATE_UNSUCCESSFUL": {
                return PAYMENT_TERMS_UPDATE_UNSUCCESSFUL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PAYMENT_TERMS_UPDATE_UNSUCCESSFUL: {
                return "PAYMENT_TERMS_UPDATE_UNSUCCESSFUL";
            }

            default: {
                return "";
            }
        }
    }
}

