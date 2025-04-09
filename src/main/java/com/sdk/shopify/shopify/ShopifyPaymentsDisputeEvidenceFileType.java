// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The possible dispute evidence file types.
*/
public enum ShopifyPaymentsDisputeEvidenceFileType {
    /**
    * Cancellation Policy File.
    */
    CANCELLATION_POLICY_FILE,

    /**
    * Customer Communication File.
    */
    CUSTOMER_COMMUNICATION_FILE,

    /**
    * Refund Policy File.
    */
    REFUND_POLICY_FILE,

    /**
    * Service Documentation File.
    */
    SERVICE_DOCUMENTATION_FILE,

    /**
    * Shipping Documentation File.
    */
    SHIPPING_DOCUMENTATION_FILE,

    /**
    * Uncategorized File.
    */
    UNCATEGORIZED_FILE,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsDisputeEvidenceFileType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELLATION_POLICY_FILE": {
                return CANCELLATION_POLICY_FILE;
            }

            case "CUSTOMER_COMMUNICATION_FILE": {
                return CUSTOMER_COMMUNICATION_FILE;
            }

            case "REFUND_POLICY_FILE": {
                return REFUND_POLICY_FILE;
            }

            case "SERVICE_DOCUMENTATION_FILE": {
                return SERVICE_DOCUMENTATION_FILE;
            }

            case "SHIPPING_DOCUMENTATION_FILE": {
                return SHIPPING_DOCUMENTATION_FILE;
            }

            case "UNCATEGORIZED_FILE": {
                return UNCATEGORIZED_FILE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELLATION_POLICY_FILE: {
                return "CANCELLATION_POLICY_FILE";
            }

            case CUSTOMER_COMMUNICATION_FILE: {
                return "CUSTOMER_COMMUNICATION_FILE";
            }

            case REFUND_POLICY_FILE: {
                return "REFUND_POLICY_FILE";
            }

            case SERVICE_DOCUMENTATION_FILE: {
                return "SERVICE_DOCUMENTATION_FILE";
            }

            case SHIPPING_DOCUMENTATION_FILE: {
                return "SHIPPING_DOCUMENTATION_FILE";
            }

            case UNCATEGORIZED_FILE: {
                return "UNCATEGORIZED_FILE";
            }

            default: {
                return "";
            }
        }
    }
}

