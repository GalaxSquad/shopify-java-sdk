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
* The [discount
* class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
* that's used to control how discounts can be combined.
*/
public enum DiscountClass {
    /**
    * The discount is combined with an
    * [order
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    ORDER,

    /**
    * The discount is combined with a
    * [product
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    PRODUCT,

    /**
    * The discount is combined with a
    * [shipping
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    SHIPPING,

    UNKNOWN_VALUE;

    public static DiscountClass fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ORDER": {
                return ORDER;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            case "SHIPPING": {
                return SHIPPING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ORDER: {
                return "ORDER";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            case SHIPPING: {
                return "SHIPPING";
            }

            default: {
                return "";
            }
        }
    }
}

