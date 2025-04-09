// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible values for the typography letter case.
*/
public enum CheckoutBrandingTypographyLetterCase {
    /**
    * All letters are is lower case.
    */
    LOWER,

    /**
    * No letter casing applied.
    */
    NONE,

    /**
    * Capitalize the first letter of each word.
    */
    TITLE,

    /**
    * All letters are uppercase.
    */
    UPPER,

    UNKNOWN_VALUE;

    public static CheckoutBrandingTypographyLetterCase fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LOWER": {
                return LOWER;
            }

            case "NONE": {
                return NONE;
            }

            case "TITLE": {
                return TITLE;
            }

            case "UPPER": {
                return UPPER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case LOWER: {
                return "LOWER";
            }

            case NONE: {
                return "NONE";
            }

            case TITLE: {
                return "TITLE";
            }

            case UPPER: {
                return "UPPER";
            }

            default: {
                return "";
            }
        }
    }
}

