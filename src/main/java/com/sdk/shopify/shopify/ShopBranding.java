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
* Possible branding of a shop.
* Branding can be used to define the look of a shop including its styling and logo in the Shopify
* Admin.
*/
public enum ShopBranding {
    /**
    * Shop has Rogers branding.
    */
    ROGERS,

    /**
    * Shop has Shopify branding.
    */
    SHOPIFY,

    /**
    * Shop has Shopify Gold branding.
    */
    SHOPIFY_GOLD,

    /**
    * Shop has Shopify Plus branding.
    */
    SHOPIFY_PLUS,

    UNKNOWN_VALUE;

    public static ShopBranding fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ROGERS": {
                return ROGERS;
            }

            case "SHOPIFY": {
                return SHOPIFY;
            }

            case "SHOPIFY_GOLD": {
                return SHOPIFY_GOLD;
            }

            case "SHOPIFY_PLUS": {
                return SHOPIFY_PLUS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ROGERS: {
                return "ROGERS";
            }

            case SHOPIFY: {
                return "SHOPIFY";
            }

            case SHOPIFY_GOLD: {
                return "SHOPIFY_GOLD";
            }

            case SHOPIFY_PLUS: {
                return "SHOPIFY_PLUS";
            }

            default: {
                return "";
            }
        }
    }
}

