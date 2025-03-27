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
* Possible error codes that can be returned by `InventoryAdjustQuantitiesUserError`.
*/
public enum InventoryAdjustQuantitiesUserErrorCode {
    /**
    * The quantities couldn't be adjusted. Try again.
    */
    ADJUST_QUANTITIES_FAILED,

    /**
    * Internal (gid://shopify/) ledger documents are not allowed to be adjusted via API.
    */
    INTERNAL_LEDGER_DOCUMENT,

    /**
    * A ledger document URI is not allowed when adjusting available.
    */
    INVALID_AVAILABLE_DOCUMENT,

    /**
    * The specified inventory item could not be found.
    */
    INVALID_INVENTORY_ITEM,

    /**
    * The specified ledger document is invalid.
    */
    INVALID_LEDGER_DOCUMENT,

    /**
    * The specified location could not be found.
    */
    INVALID_LOCATION,

    /**
    * A ledger document URI is required except when adjusting available.
    */
    INVALID_QUANTITY_DOCUMENT,

    /**
    * The specified quantity name is invalid.
    */
    INVALID_QUANTITY_NAME,

    /**
    * The quantity can't be higher than 2,000,000,000.
    */
    INVALID_QUANTITY_TOO_HIGH,

    /**
    * The quantity can't be lower than -2,000,000,000.
    */
    INVALID_QUANTITY_TOO_LOW,

    /**
    * The specified reason is invalid.
    */
    INVALID_REASON,

    /**
    * The specified reference document is invalid.
    */
    INVALID_REFERENCE_DOCUMENT,

    /**
    * The inventory item is not stocked at the location.
    */
    ITEM_NOT_STOCKED_AT_LOCATION,

    /**
    * All changes must have the same ledger document URI or, in the case of adjusting available, no ledger
    * document URI.
    */
    MAX_ONE_LEDGER_DOCUMENT,

    /**
    * The specified inventory item is not allowed to be adjusted via API. Example: if the inventory item
    * is a parent bundle.
    */
    NON_MUTABLE_INVENTORY_ITEM,

    UNKNOWN_VALUE;

    public static InventoryAdjustQuantitiesUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADJUST_QUANTITIES_FAILED": {
                return ADJUST_QUANTITIES_FAILED;
            }

            case "INTERNAL_LEDGER_DOCUMENT": {
                return INTERNAL_LEDGER_DOCUMENT;
            }

            case "INVALID_AVAILABLE_DOCUMENT": {
                return INVALID_AVAILABLE_DOCUMENT;
            }

            case "INVALID_INVENTORY_ITEM": {
                return INVALID_INVENTORY_ITEM;
            }

            case "INVALID_LEDGER_DOCUMENT": {
                return INVALID_LEDGER_DOCUMENT;
            }

            case "INVALID_LOCATION": {
                return INVALID_LOCATION;
            }

            case "INVALID_QUANTITY_DOCUMENT": {
                return INVALID_QUANTITY_DOCUMENT;
            }

            case "INVALID_QUANTITY_NAME": {
                return INVALID_QUANTITY_NAME;
            }

            case "INVALID_QUANTITY_TOO_HIGH": {
                return INVALID_QUANTITY_TOO_HIGH;
            }

            case "INVALID_QUANTITY_TOO_LOW": {
                return INVALID_QUANTITY_TOO_LOW;
            }

            case "INVALID_REASON": {
                return INVALID_REASON;
            }

            case "INVALID_REFERENCE_DOCUMENT": {
                return INVALID_REFERENCE_DOCUMENT;
            }

            case "ITEM_NOT_STOCKED_AT_LOCATION": {
                return ITEM_NOT_STOCKED_AT_LOCATION;
            }

            case "MAX_ONE_LEDGER_DOCUMENT": {
                return MAX_ONE_LEDGER_DOCUMENT;
            }

            case "NON_MUTABLE_INVENTORY_ITEM": {
                return NON_MUTABLE_INVENTORY_ITEM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADJUST_QUANTITIES_FAILED: {
                return "ADJUST_QUANTITIES_FAILED";
            }

            case INTERNAL_LEDGER_DOCUMENT: {
                return "INTERNAL_LEDGER_DOCUMENT";
            }

            case INVALID_AVAILABLE_DOCUMENT: {
                return "INVALID_AVAILABLE_DOCUMENT";
            }

            case INVALID_INVENTORY_ITEM: {
                return "INVALID_INVENTORY_ITEM";
            }

            case INVALID_LEDGER_DOCUMENT: {
                return "INVALID_LEDGER_DOCUMENT";
            }

            case INVALID_LOCATION: {
                return "INVALID_LOCATION";
            }

            case INVALID_QUANTITY_DOCUMENT: {
                return "INVALID_QUANTITY_DOCUMENT";
            }

            case INVALID_QUANTITY_NAME: {
                return "INVALID_QUANTITY_NAME";
            }

            case INVALID_QUANTITY_TOO_HIGH: {
                return "INVALID_QUANTITY_TOO_HIGH";
            }

            case INVALID_QUANTITY_TOO_LOW: {
                return "INVALID_QUANTITY_TOO_LOW";
            }

            case INVALID_REASON: {
                return "INVALID_REASON";
            }

            case INVALID_REFERENCE_DOCUMENT: {
                return "INVALID_REFERENCE_DOCUMENT";
            }

            case ITEM_NOT_STOCKED_AT_LOCATION: {
                return "ITEM_NOT_STOCKED_AT_LOCATION";
            }

            case MAX_ONE_LEDGER_DOCUMENT: {
                return "MAX_ONE_LEDGER_DOCUMENT";
            }

            case NON_MUTABLE_INVENTORY_ITEM: {
                return "NON_MUTABLE_INVENTORY_ITEM";
            }

            default: {
                return "";
            }
        }
    }
}

