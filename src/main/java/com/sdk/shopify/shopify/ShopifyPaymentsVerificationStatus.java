// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The status of a verification.
*/
public enum ShopifyPaymentsVerificationStatus {
    /**
    * The verification request has been submitted but a response has not yet been given.
    */
    PENDING,

    /**
    * The verification has not yet been verified.
    */
    UNVERIFIED,

    /**
    * The verification has been verified.
    */
    VERIFIED,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsVerificationStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PENDING": {
                return PENDING;
            }

            case "UNVERIFIED": {
                return UNVERIFIED;
            }

            case "VERIFIED": {
                return VERIFIED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PENDING: {
                return "PENDING";
            }

            case UNVERIFIED: {
                return "UNVERIFIED";
            }

            case VERIFIED: {
                return "VERIFIED";
            }

            default: {
                return "";
            }
        }
    }
}

