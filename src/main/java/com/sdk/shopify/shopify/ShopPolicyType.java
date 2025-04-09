// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Available shop policy types.
*/
public enum ShopPolicyType {
    /**
    * The contact information.
    */
    CONTACT_INFORMATION,

    /**
    * The legal notice.
    */
    LEGAL_NOTICE,

    /**
    * The privacy policy.
    */
    PRIVACY_POLICY,

    /**
    * The refund policy.
    */
    REFUND_POLICY,

    /**
    * The shipping policy.
    */
    SHIPPING_POLICY,

    /**
    * The cancellation policy.
    */
    SUBSCRIPTION_POLICY,

    /**
    * The terms of sale.
    */
    TERMS_OF_SALE,

    /**
    * The terms of service.
    */
    TERMS_OF_SERVICE,

    UNKNOWN_VALUE;

    public static ShopPolicyType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONTACT_INFORMATION": {
                return CONTACT_INFORMATION;
            }

            case "LEGAL_NOTICE": {
                return LEGAL_NOTICE;
            }

            case "PRIVACY_POLICY": {
                return PRIVACY_POLICY;
            }

            case "REFUND_POLICY": {
                return REFUND_POLICY;
            }

            case "SHIPPING_POLICY": {
                return SHIPPING_POLICY;
            }

            case "SUBSCRIPTION_POLICY": {
                return SUBSCRIPTION_POLICY;
            }

            case "TERMS_OF_SALE": {
                return TERMS_OF_SALE;
            }

            case "TERMS_OF_SERVICE": {
                return TERMS_OF_SERVICE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONTACT_INFORMATION: {
                return "CONTACT_INFORMATION";
            }

            case LEGAL_NOTICE: {
                return "LEGAL_NOTICE";
            }

            case PRIVACY_POLICY: {
                return "PRIVACY_POLICY";
            }

            case REFUND_POLICY: {
                return "REFUND_POLICY";
            }

            case SHIPPING_POLICY: {
                return "SHIPPING_POLICY";
            }

            case SUBSCRIPTION_POLICY: {
                return "SUBSCRIPTION_POLICY";
            }

            case TERMS_OF_SALE: {
                return "TERMS_OF_SALE";
            }

            case TERMS_OF_SERVICE: {
                return "TERMS_OF_SERVICE";
            }

            default: {
                return "";
            }
        }
    }
}

