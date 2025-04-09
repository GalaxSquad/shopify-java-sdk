// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The set of valid sort keys for the Product query.
*/
public enum ProductSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `inventory_total` value.
    */
    INVENTORY_TOTAL,

    /**
    * Sort by the `product_type` value.
    */
    PRODUCT_TYPE,

    /**
    * Sort by the `published_at` value.
    */
    PUBLISHED_AT,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    /**
    * Sort by the `vendor` value.
    */
    VENDOR,

    UNKNOWN_VALUE;

    public static ProductSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "ID": {
                return ID;
            }

            case "INVENTORY_TOTAL": {
                return INVENTORY_TOTAL;
            }

            case "PRODUCT_TYPE": {
                return PRODUCT_TYPE;
            }

            case "PUBLISHED_AT": {
                return PUBLISHED_AT;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TITLE": {
                return TITLE;
            }

            case "UPDATED_AT": {
                return UPDATED_AT;
            }

            case "VENDOR": {
                return VENDOR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATED_AT: {
                return "CREATED_AT";
            }

            case ID: {
                return "ID";
            }

            case INVENTORY_TOTAL: {
                return "INVENTORY_TOTAL";
            }

            case PRODUCT_TYPE: {
                return "PRODUCT_TYPE";
            }

            case PUBLISHED_AT: {
                return "PUBLISHED_AT";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TITLE: {
                return "TITLE";
            }

            case UPDATED_AT: {
                return "UPDATED_AT";
            }

            case VENDOR: {
                return "VENDOR";
            }

            default: {
                return "";
            }
        }
    }
}

