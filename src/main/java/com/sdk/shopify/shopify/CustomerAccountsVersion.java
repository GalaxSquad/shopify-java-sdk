// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The login redirection target for customer accounts.
*/
public enum CustomerAccountsVersion {
    /**
    * The customer is redirected to the classic customer accounts login page.
    */
    CLASSIC,

    /**
    * The customer is redirected to the new customer accounts login page.
    */
    NEW_CUSTOMER_ACCOUNTS,

    UNKNOWN_VALUE;

    public static CustomerAccountsVersion fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CLASSIC": {
                return CLASSIC;
            }

            case "NEW_CUSTOMER_ACCOUNTS": {
                return NEW_CUSTOMER_ACCOUNTS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CLASSIC: {
                return "CLASSIC";
            }

            case NEW_CUSTOMER_ACCOUNTS: {
                return "NEW_CUSTOMER_ACCOUNTS";
            }

            default: {
                return "";
            }
        }
    }
}

