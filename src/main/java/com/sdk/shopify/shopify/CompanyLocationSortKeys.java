// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The set of valid sort keys for the CompanyLocation query.
*/
public enum CompanyLocationSortKeys {
    /**
    * Sort by the `company_and_location_name` value.
    */
    COMPANY_AND_LOCATION_NAME,

    /**
    * Sort by the `company_id` value.
    */
    COMPANY_ID,

    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `name` value.
    */
    NAME,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CompanyLocationSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COMPANY_AND_LOCATION_NAME": {
                return COMPANY_AND_LOCATION_NAME;
            }

            case "COMPANY_ID": {
                return COMPANY_ID;
            }

            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "ID": {
                return ID;
            }

            case "NAME": {
                return NAME;
            }

            case "RELEVANCE": {
                return RELEVANCE;
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
            case COMPANY_AND_LOCATION_NAME: {
                return "COMPANY_AND_LOCATION_NAME";
            }

            case COMPANY_ID: {
                return "COMPANY_ID";
            }

            case CREATED_AT: {
                return "CREATED_AT";
            }

            case ID: {
                return "ID";
            }

            case NAME: {
                return "NAME";
            }

            case RELEVANCE: {
                return "RELEVANCE";
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

