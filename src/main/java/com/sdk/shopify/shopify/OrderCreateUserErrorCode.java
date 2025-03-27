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
* Possible error codes that can be returned by `OrderCreateUserError`.
*/
public enum OrderCreateUserErrorCode {
    /**
    * Indicates that the line item fulfillment service handle is invalid.
    */
    FULFILLMENT_SERVICE_INVALID,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Indicates that the inventory claim failed during order creation.
    */
    INVENTORY_CLAIM_FAILED,

    /**
    * Indicates that the processed_at field is invalid, such as when it references a future date.
    */
    PROCESSED_AT_INVALID,

    /**
    * Indicates that both customer_id and customer were provided - only one is permitted.
    */
    REDUNDANT_CUSTOMER_FIELDS,

    /**
    * Indicates that the shop is dormant and cannot create orders.
    */
    SHOP_DORMANT,

    /**
    * Indicates that the tax line rate is missing - only enforced for LineItem or ShippingLine-level tax
    * lines.
    */
    TAX_LINE_RATE_MISSING,

    UNKNOWN_VALUE;

    public static OrderCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FULFILLMENT_SERVICE_INVALID": {
                return FULFILLMENT_SERVICE_INVALID;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVENTORY_CLAIM_FAILED": {
                return INVENTORY_CLAIM_FAILED;
            }

            case "PROCESSED_AT_INVALID": {
                return PROCESSED_AT_INVALID;
            }

            case "REDUNDANT_CUSTOMER_FIELDS": {
                return REDUNDANT_CUSTOMER_FIELDS;
            }

            case "SHOP_DORMANT": {
                return SHOP_DORMANT;
            }

            case "TAX_LINE_RATE_MISSING": {
                return TAX_LINE_RATE_MISSING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FULFILLMENT_SERVICE_INVALID: {
                return "FULFILLMENT_SERVICE_INVALID";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVENTORY_CLAIM_FAILED: {
                return "INVENTORY_CLAIM_FAILED";
            }

            case PROCESSED_AT_INVALID: {
                return "PROCESSED_AT_INVALID";
            }

            case REDUNDANT_CUSTOMER_FIELDS: {
                return "REDUNDANT_CUSTOMER_FIELDS";
            }

            case SHOP_DORMANT: {
                return "SHOP_DORMANT";
            }

            case TAX_LINE_RATE_MISSING: {
                return "TAX_LINE_RATE_MISSING";
            }

            default: {
                return "";
            }
        }
    }
}

