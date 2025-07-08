// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ConsentPolicyError`.
*/
public enum ConsentPolicyErrorCode {
    /**
    * Country code is required.
    */
    COUNTRY_CODE_REQUIRED,

    /**
    * Region code must match the country code.
    */
    REGION_CODE_MUST_MATCH_COUNTRY_CODE,

    /**
    * Region code is required for countries with existing regional policies.
    */
    REGION_CODE_REQUIRED,

    /**
    * Shopify's cookie banner must be disabled.
    */
    SHOPIFY_COOKIE_BANNER_NOT_DISABLED,

    /**
    * Unsupported consent policy.
    */
    UNSUPORTED_CONSENT_POLICY,

    UNKNOWN_VALUE;

    public static ConsentPolicyErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COUNTRY_CODE_REQUIRED": {
                return COUNTRY_CODE_REQUIRED;
            }

            case "REGION_CODE_MUST_MATCH_COUNTRY_CODE": {
                return REGION_CODE_MUST_MATCH_COUNTRY_CODE;
            }

            case "REGION_CODE_REQUIRED": {
                return REGION_CODE_REQUIRED;
            }

            case "SHOPIFY_COOKIE_BANNER_NOT_DISABLED": {
                return SHOPIFY_COOKIE_BANNER_NOT_DISABLED;
            }

            case "UNSUPORTED_CONSENT_POLICY": {
                return UNSUPORTED_CONSENT_POLICY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COUNTRY_CODE_REQUIRED: {
                return "COUNTRY_CODE_REQUIRED";
            }

            case REGION_CODE_MUST_MATCH_COUNTRY_CODE: {
                return "REGION_CODE_MUST_MATCH_COUNTRY_CODE";
            }

            case REGION_CODE_REQUIRED: {
                return "REGION_CODE_REQUIRED";
            }

            case SHOPIFY_COOKIE_BANNER_NOT_DISABLED: {
                return "SHOPIFY_COOKIE_BANNER_NOT_DISABLED";
            }

            case UNSUPORTED_CONSENT_POLICY: {
                return "UNSUPORTED_CONSENT_POLICY";
            }

            default: {
                return "";
            }
        }
    }
}

