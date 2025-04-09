// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The associated catalog's type.
*/
public enum CatalogType {
    /**
    * Catalogs belonging to apps.
    */
    APP,

    /**
    * Catalogs belonging to company locations.
    */
    COMPANY_LOCATION,

    /**
    * Catalogs belonging to markets.
    */
    MARKET,

    /**
    * Not associated to a catalog.
    */
    NONE,

    UNKNOWN_VALUE;

    public static CatalogType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP": {
                return APP;
            }

            case "COMPANY_LOCATION": {
                return COMPANY_LOCATION;
            }

            case "MARKET": {
                return MARKET;
            }

            case "NONE": {
                return NONE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP: {
                return "APP";
            }

            case COMPANY_LOCATION: {
                return "COMPANY_LOCATION";
            }

            case MARKET: {
                return "MARKET";
            }

            case NONE: {
                return "NONE";
            }

            default: {
                return "";
            }
        }
    }
}

