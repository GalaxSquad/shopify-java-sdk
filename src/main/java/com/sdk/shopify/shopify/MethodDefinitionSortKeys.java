// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the MethodDefinition query.
*/
public enum MethodDefinitionSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `rate_provider_type` value.
    */
    RATE_PROVIDER_TYPE,

    UNKNOWN_VALUE;

    public static MethodDefinitionSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ID": {
                return ID;
            }

            case "RATE_PROVIDER_TYPE": {
                return RATE_PROVIDER_TYPE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ID: {
                return "ID";
            }

            case RATE_PROVIDER_TYPE: {
                return "RATE_PROVIDER_TYPE";
            }

            default: {
                return "";
            }
        }
    }
}

