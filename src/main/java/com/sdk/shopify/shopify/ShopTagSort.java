// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible sort of tags.
*/
public enum ShopTagSort {
    /**
    * Alphabetical sort.
    */
    ALPHABETICAL,

    /**
    * Popularity sort.
    */
    POPULAR,

    UNKNOWN_VALUE;

    public static ShopTagSort fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALPHABETICAL": {
                return ALPHABETICAL;
            }

            case "POPULAR": {
                return POPULAR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALPHABETICAL: {
                return "ALPHABETICAL";
            }

            case POPULAR: {
                return "POPULAR";
            }

            default: {
                return "";
            }
        }
    }
}

