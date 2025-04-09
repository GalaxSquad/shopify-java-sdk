// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


/**
* The set of valid sort keys for the ProductCollection query.
*/
public enum ProductCollectionSortKeys {
    /**
    * Sort by the `best-selling` value.
    */
    BEST_SELLING,

    /**
    * Sort by the `collection-default` value.
    */
    COLLECTION_DEFAULT,

    /**
    * Sort by the `created` value.
    */
    CREATED,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `manual` value.
    */
    MANUAL,

    /**
    * Sort by the `price` value.
    */
    PRICE,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    UNKNOWN_VALUE;

    public static ProductCollectionSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BEST_SELLING": {
                return BEST_SELLING;
            }

            case "COLLECTION_DEFAULT": {
                return COLLECTION_DEFAULT;
            }

            case "CREATED": {
                return CREATED;
            }

            case "ID": {
                return ID;
            }

            case "MANUAL": {
                return MANUAL;
            }

            case "PRICE": {
                return PRICE;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TITLE": {
                return TITLE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BEST_SELLING: {
                return "BEST_SELLING";
            }

            case COLLECTION_DEFAULT: {
                return "COLLECTION_DEFAULT";
            }

            case CREATED: {
                return "CREATED";
            }

            case ID: {
                return "ID";
            }

            case MANUAL: {
                return "MANUAL";
            }

            case PRICE: {
                return "PRICE";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TITLE: {
                return "TITLE";
            }

            default: {
                return "";
            }
        }
    }
}

