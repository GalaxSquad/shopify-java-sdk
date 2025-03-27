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
* The type of refund to perform for a particular refund duty.
*/
public enum RefundDutyRefundType {
    /**
    * The duty is fully refunded.
    */
    FULL,

    /**
    * The duty is proportionally refunded based on the quantity of the refunded line item.
    */
    PROPORTIONAL,

    UNKNOWN_VALUE;

    public static RefundDutyRefundType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULL": {
                return FULL;
            }

            case "PROPORTIONAL": {
                return PROPORTIONAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULL: {
                return "FULL";
            }

            case PROPORTIONAL: {
                return "PROPORTIONAL";
            }

            default: {
                return "";
            }
        }
    }
}

