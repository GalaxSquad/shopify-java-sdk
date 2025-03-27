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
* The valid values for the state of a customer's account with a shop.
*/
public enum CustomerState {
    /**
    * The customer declined the email invite to create an account.
    */
    DECLINED,

    /**
    * The customer doesn't have an active account. Customer accounts can be disabled from the Shopify
    * admin at any time.
    */
    DISABLED,

    /**
    * The customer has created an account.
    */
    ENABLED,

    /**
    * The customer has received an email invite to create an account.
    */
    INVITED,

    UNKNOWN_VALUE;

    public static CustomerState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DECLINED": {
                return DECLINED;
            }

            case "DISABLED": {
                return DISABLED;
            }

            case "ENABLED": {
                return ENABLED;
            }

            case "INVITED": {
                return INVITED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DECLINED: {
                return "DECLINED";
            }

            case DISABLED: {
                return "DISABLED";
            }

            case ENABLED: {
                return "ENABLED";
            }

            case INVITED: {
                return "INVITED";
            }

            default: {
                return "";
            }
        }
    }
}

