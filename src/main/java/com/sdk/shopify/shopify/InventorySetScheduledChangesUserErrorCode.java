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
* Possible error codes that can be returned by `InventorySetScheduledChangesUserError`.
*/
public enum InventorySetScheduledChangesUserErrorCode {
    /**
    * The item can only have one scheduled change for quantity name as the fromName.
    */
    DUPLICATE_FROM_NAME,

    /**
    * The item can only have one scheduled change for quantity name as the toName.
    */
    DUPLICATE_TO_NAME,

    /**
    * There was an error updating the scheduled changes.
    */
    ERROR_UPDATING_SCHEDULED,

    /**
    * The specified field is invalid.
    */
    INCLUSION,

    /**
    * The specified fromName is invalid.
    */
    INVALID_FROM_NAME,

    /**
    * The specified reason is invalid.
    */
    INVALID_REASON,

    /**
    * The specified toName is invalid.
    */
    INVALID_TO_NAME,

    /**
    * The inventory item was not found.
    */
    INVENTORY_ITEM_NOT_FOUND,

    /**
    * The inventory item was not found at the location specified.
    */
    INVENTORY_STATE_NOT_FOUND,

    /**
    * At least 1 item must be provided.
    */
    ITEMS_EMPTY,

    /**
    * The ledger document URI is invalid.
    */
    LEDGER_DOCUMENT_INVALID,

    /**
    * The location couldn't be found.
    */
    LOCATION_NOT_FOUND,

    /**
    * The from_name and to_name can't be the same.
    */
    SAME_FROM_TO_NAMES,

    UNKNOWN_VALUE;

    public static InventorySetScheduledChangesUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DUPLICATE_FROM_NAME": {
                return DUPLICATE_FROM_NAME;
            }

            case "DUPLICATE_TO_NAME": {
                return DUPLICATE_TO_NAME;
            }

            case "ERROR_UPDATING_SCHEDULED": {
                return ERROR_UPDATING_SCHEDULED;
            }

            case "INCLUSION": {
                return INCLUSION;
            }

            case "INVALID_FROM_NAME": {
                return INVALID_FROM_NAME;
            }

            case "INVALID_REASON": {
                return INVALID_REASON;
            }

            case "INVALID_TO_NAME": {
                return INVALID_TO_NAME;
            }

            case "INVENTORY_ITEM_NOT_FOUND": {
                return INVENTORY_ITEM_NOT_FOUND;
            }

            case "INVENTORY_STATE_NOT_FOUND": {
                return INVENTORY_STATE_NOT_FOUND;
            }

            case "ITEMS_EMPTY": {
                return ITEMS_EMPTY;
            }

            case "LEDGER_DOCUMENT_INVALID": {
                return LEDGER_DOCUMENT_INVALID;
            }

            case "LOCATION_NOT_FOUND": {
                return LOCATION_NOT_FOUND;
            }

            case "SAME_FROM_TO_NAMES": {
                return SAME_FROM_TO_NAMES;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DUPLICATE_FROM_NAME: {
                return "DUPLICATE_FROM_NAME";
            }

            case DUPLICATE_TO_NAME: {
                return "DUPLICATE_TO_NAME";
            }

            case ERROR_UPDATING_SCHEDULED: {
                return "ERROR_UPDATING_SCHEDULED";
            }

            case INCLUSION: {
                return "INCLUSION";
            }

            case INVALID_FROM_NAME: {
                return "INVALID_FROM_NAME";
            }

            case INVALID_REASON: {
                return "INVALID_REASON";
            }

            case INVALID_TO_NAME: {
                return "INVALID_TO_NAME";
            }

            case INVENTORY_ITEM_NOT_FOUND: {
                return "INVENTORY_ITEM_NOT_FOUND";
            }

            case INVENTORY_STATE_NOT_FOUND: {
                return "INVENTORY_STATE_NOT_FOUND";
            }

            case ITEMS_EMPTY: {
                return "ITEMS_EMPTY";
            }

            case LEDGER_DOCUMENT_INVALID: {
                return "LEDGER_DOCUMENT_INVALID";
            }

            case LOCATION_NOT_FOUND: {
                return "LOCATION_NOT_FOUND";
            }

            case SAME_FROM_TO_NAMES: {
                return "SAME_FROM_TO_NAMES";
            }

            default: {
                return "";
            }
        }
    }
}

