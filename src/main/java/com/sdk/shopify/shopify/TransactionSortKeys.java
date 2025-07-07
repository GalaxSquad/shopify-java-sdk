// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The set of valid sort keys for the Transaction query.
*/
public enum TransactionSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `expires_at` value.
    */
    EXPIRES_AT,

    UNKNOWN_VALUE;

    public static TransactionSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "EXPIRES_AT": {
                return EXPIRES_AT;
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

            case EXPIRES_AT: {
                return "EXPIRES_AT";
            }

            default: {
                return "";
            }
        }
    }
}

