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
* The reason for a fulfillment order rejection.
*/
public enum FulfillmentOrderRejectionReason {
    /**
    * The fulfillment order was rejected because of an incorrect address.
    */
    INCORRECT_ADDRESS,

    /**
    * The fulfillment order was rejected because of an ineligible product.
    */
    INELIGIBLE_PRODUCT,

    /**
    * The fulfillment order was rejected because inventory is out of stock.
    */
    INVENTORY_OUT_OF_STOCK,

    /**
    * The fulfillment order was rejected for another reason.
    */
    OTHER,

    /**
    * The fulfillment order was rejected because of an undeliverable destination.
    */
    UNDELIVERABLE_DESTINATION,

    UNKNOWN_VALUE;

    public static FulfillmentOrderRejectionReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "INCORRECT_ADDRESS": {
                return INCORRECT_ADDRESS;
            }

            case "INELIGIBLE_PRODUCT": {
                return INELIGIBLE_PRODUCT;
            }

            case "INVENTORY_OUT_OF_STOCK": {
                return INVENTORY_OUT_OF_STOCK;
            }

            case "OTHER": {
                return OTHER;
            }

            case "UNDELIVERABLE_DESTINATION": {
                return UNDELIVERABLE_DESTINATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case INCORRECT_ADDRESS: {
                return "INCORRECT_ADDRESS";
            }

            case INELIGIBLE_PRODUCT: {
                return "INELIGIBLE_PRODUCT";
            }

            case INVENTORY_OUT_OF_STOCK: {
                return "INVENTORY_OUT_OF_STOCK";
            }

            case OTHER: {
                return "OTHER";
            }

            case UNDELIVERABLE_DESTINATION: {
                return "UNDELIVERABLE_DESTINATION";
            }

            default: {
                return "";
            }
        }
    }
}

