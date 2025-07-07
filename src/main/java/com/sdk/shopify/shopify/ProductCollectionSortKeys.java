// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for products belonging to a collection.
*/
public enum ProductCollectionSortKeys {
    /**
    * Sort by best selling.
    */
    BEST_SELLING,

    /**
    * Sort by collection default order.
    */
    COLLECTION_DEFAULT,

    /**
    * Sort by creation time.
    */
    CREATED,

    /**
    * Sort by id.
    */
    ID,

    /**
    * Sort by manual order.
    */
    MANUAL,

    /**
    * Sort by price.
    */
    PRICE,

    /**
    * Sort by relevance.
    */
    RELEVANCE,

    /**
    * Sort by title.
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

