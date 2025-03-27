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
* Possible error codes that can be returned by `FulfillmentConstraintRuleDeleteUserError`.
*/
public enum FulfillmentConstraintRuleDeleteUserErrorCode {
    /**
    * Could not find fulfillment constraint rule for provided id.
    */
    NOT_FOUND,

    /**
    * Unauthorized app scope.
    */
    UNAUTHORIZED_APP_SCOPE,

    UNKNOWN_VALUE;

    public static FulfillmentConstraintRuleDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "UNAUTHORIZED_APP_SCOPE": {
                return UNAUTHORIZED_APP_SCOPE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case UNAUTHORIZED_APP_SCOPE: {
                return "UNAUTHORIZED_APP_SCOPE";
            }

            default: {
                return "";
            }
        }
    }
}

