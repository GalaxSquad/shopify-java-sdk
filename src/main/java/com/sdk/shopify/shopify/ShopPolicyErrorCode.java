// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ShopPolicyUserError`.
*/
public enum ShopPolicyErrorCode {
    /**
    * The input value is too big.
    */
    TOO_BIG,

    UNKNOWN_VALUE;

    public static ShopPolicyErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "TOO_BIG": {
                return TOO_BIG;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case TOO_BIG: {
                return "TOO_BIG";
            }

            default: {
                return "";
            }
        }
    }
}

