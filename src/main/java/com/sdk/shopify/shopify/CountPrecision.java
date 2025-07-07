// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The precision of the value returned by a count field.
*/
public enum CountPrecision {
    /**
    * The count is at least the value. A limit was imposed and reached.
    */
    AT_LEAST,

    /**
    * The count is exactly the value. A write may not be reflected instantaneously.
    */
    EXACT,

    UNKNOWN_VALUE;

    public static CountPrecision fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AT_LEAST": {
                return AT_LEAST;
            }

            case "EXACT": {
                return EXACT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AT_LEAST: {
                return "AT_LEAST";
            }

            case EXACT: {
                return "EXACT";
            }

            default: {
                return "";
            }
        }
    }
}

