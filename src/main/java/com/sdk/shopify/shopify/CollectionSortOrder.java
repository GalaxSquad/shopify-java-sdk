// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Specifies the sort order for the products in the collection.
*/
public enum CollectionSortOrder {
    /**
    * Alphabetically, in ascending order (A - Z).
    */
    ALPHA_ASC,

    /**
    * Alphabetically, in descending order (Z - A).
    */
    ALPHA_DESC,

    /**
    * By best-selling products.
    */
    BEST_SELLING,

    /**
    * By date created, in ascending order (oldest - newest).
    */
    CREATED,

    /**
    * By date created, in descending order (newest - oldest).
    */
    CREATED_DESC,

    /**
    * In the order set manually by the merchant.
    */
    MANUAL,

    /**
    * By price, in ascending order (lowest - highest).
    */
    PRICE_ASC,

    /**
    * By price, in descending order (highest - lowest).
    */
    PRICE_DESC,

    UNKNOWN_VALUE;

    public static CollectionSortOrder fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALPHA_ASC": {
                return ALPHA_ASC;
            }

            case "ALPHA_DESC": {
                return ALPHA_DESC;
            }

            case "BEST_SELLING": {
                return BEST_SELLING;
            }

            case "CREATED": {
                return CREATED;
            }

            case "CREATED_DESC": {
                return CREATED_DESC;
            }

            case "MANUAL": {
                return MANUAL;
            }

            case "PRICE_ASC": {
                return PRICE_ASC;
            }

            case "PRICE_DESC": {
                return PRICE_DESC;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALPHA_ASC: {
                return "ALPHA_ASC";
            }

            case ALPHA_DESC: {
                return "ALPHA_DESC";
            }

            case BEST_SELLING: {
                return "BEST_SELLING";
            }

            case CREATED: {
                return "CREATED";
            }

            case CREATED_DESC: {
                return "CREATED_DESC";
            }

            case MANUAL: {
                return "MANUAL";
            }

            case PRICE_ASC: {
                return "PRICE_ASC";
            }

            case PRICE_DESC: {
                return "PRICE_DESC";
            }

            default: {
                return "";
            }
        }
    }
}

