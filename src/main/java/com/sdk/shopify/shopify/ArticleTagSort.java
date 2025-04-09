// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible sort of tags.
*/
public enum ArticleTagSort {
    /**
    * Sort alphabetically..
    */
    ALPHABETICAL,

    /**
    * Sort by popularity, starting with the most popular tag.
    */
    POPULAR,

    UNKNOWN_VALUE;

    public static ArticleTagSort fromGraphQl(String value) {
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

