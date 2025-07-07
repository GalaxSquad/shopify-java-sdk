// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the Markets query.
*/
public enum MarketsSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `market_condition_types` value.
    */
    MARKET_CONDITION_TYPES,

    /**
    * Sort by the `market_type` value.
    */
    MARKET_TYPE,

    /**
    * Sort by the `name` value.
    */
    NAME,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static MarketsSortKeys fromGraphQl(String value) {
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

            case "MARKET_CONDITION_TYPES": {
                return MARKET_CONDITION_TYPES;
            }

            case "MARKET_TYPE": {
                return MARKET_TYPE;
            }

            case "NAME": {
                return NAME;
            }

            case "UPDATED_AT": {
                return UPDATED_AT;
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

            case MARKET_CONDITION_TYPES: {
                return "MARKET_CONDITION_TYPES";
            }

            case MARKET_TYPE: {
                return "MARKET_TYPE";
            }

            case NAME: {
                return "NAME";
            }

            case UPDATED_AT: {
                return "UPDATED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

