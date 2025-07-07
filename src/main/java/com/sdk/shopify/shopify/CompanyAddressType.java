// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The valid values for the address type of a company.
*/
public enum CompanyAddressType {
    /**
    * The address is a billing address.
    */
    BILLING,

    /**
    * The address is a shipping address.
    */
    SHIPPING,

    UNKNOWN_VALUE;

    public static CompanyAddressType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BILLING": {
                return BILLING;
            }

            case "SHIPPING": {
                return SHIPPING;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BILLING: {
                return "BILLING";
            }

            case SHIPPING: {
                return "SHIPPING";
            }

            default: {
                return "";
            }
        }
    }
}

