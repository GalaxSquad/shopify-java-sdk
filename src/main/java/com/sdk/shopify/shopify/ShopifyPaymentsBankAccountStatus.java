// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The bank account status.
*/
public enum ShopifyPaymentsBankAccountStatus {
    /**
    * A payout to the bank account failed.
    */
    ERRORED,

    /**
    * A bank account that hasn't had any activity and that's not validated.
    */
    NEW,

    /**
    * It was determined that the bank account exists.
    */
    VALIDATED,

    /**
    * Bank account validation was successful.
    */
    VERIFIED,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsBankAccountStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ERRORED": {
                return ERRORED;
            }

            case "NEW": {
                return NEW;
            }

            case "VALIDATED": {
                return VALIDATED;
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
            case ERRORED: {
                return "ERRORED";
            }

            case NEW: {
                return "NEW";
            }

            case VALIDATED: {
                return "VALIDATED";
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

