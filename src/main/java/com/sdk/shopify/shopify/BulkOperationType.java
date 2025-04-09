// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The valid values for the bulk operation's type.
*/
public enum BulkOperationType {
    /**
    * The bulk operation is a mutation.
    */
    MUTATION,

    /**
    * The bulk operation is a query.
    */
    QUERY,

    UNKNOWN_VALUE;

    public static BulkOperationType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MUTATION": {
                return MUTATION;
            }

            case "QUERY": {
                return QUERY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MUTATION: {
                return "MUTATION";
            }

            case QUERY: {
                return "QUERY";
            }

            default: {
                return "";
            }
        }
    }
}

