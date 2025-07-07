// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `LocationDeactivateUserError`.
*/
public enum LocationDeactivateUserErrorCode {
    /**
    * At least one location must fulfill online orders.
    */
    CANNOT_DISABLE_ONLINE_ORDER_FULFILLMENT,

    /**
    * Destination location is the same as the location to be deactivated.
    */
    DESTINATION_LOCATION_IS_THE_SAME_LOCATION,

    /**
    * Destination location is not found or inactive.
    */
    DESTINATION_LOCATION_NOT_FOUND_OR_INACTIVE,

    /**
    * Destination location is not Shopify managed.
    */
    DESTINATION_LOCATION_NOT_SHOPIFY_MANAGED,

    /**
    * Failed to relocate active inventories to the destination location.
    */
    FAILED_TO_RELOCATE_ACTIVE_INVENTORIES,

    /**
    * Failed to relocate incoming movements to the destination location.
    */
    FAILED_TO_RELOCATE_INCOMING_MOVEMENTS,

    /**
    * Failed to relocate open purchase orders to the destination location.
    */
    FAILED_TO_RELOCATE_OPEN_PURCHASE_ORDERS,

    /**
    * Location could not be deactivated without specifying where to relocate inventory at the location.
    */
    HAS_ACTIVE_INVENTORY_ERROR,

    /**
    * Location needs to be removed from Shopify POS for Retail subscription in Point of Sale channel.
    */
    HAS_ACTIVE_RETAIL_SUBSCRIPTIONS,

    /**
    * Location could not be deactivated because it has pending orders.
    */
    HAS_FULFILLMENT_ORDERS_ERROR,

    /**
    * Location could not be deactivated because it has open Shopify Fulfillment Network transfers.
    */
    HAS_INCOMING_MOVEMENTS_ERROR,

    /**
    * Location could not be deactivated because it has open purchase orders.
    */
    HAS_OPEN_PURCHASE_ORDERS_ERROR,

    /**
    * Location not found.
    */
    LOCATION_NOT_FOUND,

    /**
    * Location either has a fulfillment service or is the only location with a shipping address.
    */
    PERMANENTLY_BLOCKED_FROM_DEACTIVATION_ERROR,

    /**
    * Location has incoming inventory. The location can be deactivated after the inventory has been
    * received.
    */
    TEMPORARILY_BLOCKED_FROM_DEACTIVATION_ERROR,

    UNKNOWN_VALUE;

    public static LocationDeactivateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_DISABLE_ONLINE_ORDER_FULFILLMENT": {
                return CANNOT_DISABLE_ONLINE_ORDER_FULFILLMENT;
            }

            case "DESTINATION_LOCATION_IS_THE_SAME_LOCATION": {
                return DESTINATION_LOCATION_IS_THE_SAME_LOCATION;
            }

            case "DESTINATION_LOCATION_NOT_FOUND_OR_INACTIVE": {
                return DESTINATION_LOCATION_NOT_FOUND_OR_INACTIVE;
            }

            case "DESTINATION_LOCATION_NOT_SHOPIFY_MANAGED": {
                return DESTINATION_LOCATION_NOT_SHOPIFY_MANAGED;
            }

            case "FAILED_TO_RELOCATE_ACTIVE_INVENTORIES": {
                return FAILED_TO_RELOCATE_ACTIVE_INVENTORIES;
            }

            case "FAILED_TO_RELOCATE_INCOMING_MOVEMENTS": {
                return FAILED_TO_RELOCATE_INCOMING_MOVEMENTS;
            }

            case "FAILED_TO_RELOCATE_OPEN_PURCHASE_ORDERS": {
                return FAILED_TO_RELOCATE_OPEN_PURCHASE_ORDERS;
            }

            case "HAS_ACTIVE_INVENTORY_ERROR": {
                return HAS_ACTIVE_INVENTORY_ERROR;
            }

            case "HAS_ACTIVE_RETAIL_SUBSCRIPTIONS": {
                return HAS_ACTIVE_RETAIL_SUBSCRIPTIONS;
            }

            case "HAS_FULFILLMENT_ORDERS_ERROR": {
                return HAS_FULFILLMENT_ORDERS_ERROR;
            }

            case "HAS_INCOMING_MOVEMENTS_ERROR": {
                return HAS_INCOMING_MOVEMENTS_ERROR;
            }

            case "HAS_OPEN_PURCHASE_ORDERS_ERROR": {
                return HAS_OPEN_PURCHASE_ORDERS_ERROR;
            }

            case "LOCATION_NOT_FOUND": {
                return LOCATION_NOT_FOUND;
            }

            case "PERMANENTLY_BLOCKED_FROM_DEACTIVATION_ERROR": {
                return PERMANENTLY_BLOCKED_FROM_DEACTIVATION_ERROR;
            }

            case "TEMPORARILY_BLOCKED_FROM_DEACTIVATION_ERROR": {
                return TEMPORARILY_BLOCKED_FROM_DEACTIVATION_ERROR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANNOT_DISABLE_ONLINE_ORDER_FULFILLMENT: {
                return "CANNOT_DISABLE_ONLINE_ORDER_FULFILLMENT";
            }

            case DESTINATION_LOCATION_IS_THE_SAME_LOCATION: {
                return "DESTINATION_LOCATION_IS_THE_SAME_LOCATION";
            }

            case DESTINATION_LOCATION_NOT_FOUND_OR_INACTIVE: {
                return "DESTINATION_LOCATION_NOT_FOUND_OR_INACTIVE";
            }

            case DESTINATION_LOCATION_NOT_SHOPIFY_MANAGED: {
                return "DESTINATION_LOCATION_NOT_SHOPIFY_MANAGED";
            }

            case FAILED_TO_RELOCATE_ACTIVE_INVENTORIES: {
                return "FAILED_TO_RELOCATE_ACTIVE_INVENTORIES";
            }

            case FAILED_TO_RELOCATE_INCOMING_MOVEMENTS: {
                return "FAILED_TO_RELOCATE_INCOMING_MOVEMENTS";
            }

            case FAILED_TO_RELOCATE_OPEN_PURCHASE_ORDERS: {
                return "FAILED_TO_RELOCATE_OPEN_PURCHASE_ORDERS";
            }

            case HAS_ACTIVE_INVENTORY_ERROR: {
                return "HAS_ACTIVE_INVENTORY_ERROR";
            }

            case HAS_ACTIVE_RETAIL_SUBSCRIPTIONS: {
                return "HAS_ACTIVE_RETAIL_SUBSCRIPTIONS";
            }

            case HAS_FULFILLMENT_ORDERS_ERROR: {
                return "HAS_FULFILLMENT_ORDERS_ERROR";
            }

            case HAS_INCOMING_MOVEMENTS_ERROR: {
                return "HAS_INCOMING_MOVEMENTS_ERROR";
            }

            case HAS_OPEN_PURCHASE_ORDERS_ERROR: {
                return "HAS_OPEN_PURCHASE_ORDERS_ERROR";
            }

            case LOCATION_NOT_FOUND: {
                return "LOCATION_NOT_FOUND";
            }

            case PERMANENTLY_BLOCKED_FROM_DEACTIVATION_ERROR: {
                return "PERMANENTLY_BLOCKED_FROM_DEACTIVATION_ERROR";
            }

            case TEMPORARILY_BLOCKED_FROM_DEACTIVATION_ERROR: {
                return "TEMPORARILY_BLOCKED_FROM_DEACTIVATION_ERROR";
            }

            default: {
                return "";
            }
        }
    }
}

