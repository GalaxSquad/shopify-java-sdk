// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The input fields for a shop's privacy settings.
*/
public enum PrivacyFeaturesEnum {
    /**
    * The cookie banner feature.
    */
    COOKIE_BANNER,

    /**
    * The data sale opt out page feature.
    */
    DATA_SALE_OPT_OUT_PAGE,

    /**
    * The privacy policy feature.
    */
    PRIVACY_POLICY,

    UNKNOWN_VALUE;

    public static PrivacyFeaturesEnum fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COOKIE_BANNER": {
                return COOKIE_BANNER;
            }

            case "DATA_SALE_OPT_OUT_PAGE": {
                return DATA_SALE_OPT_OUT_PAGE;
            }

            case "PRIVACY_POLICY": {
                return PRIVACY_POLICY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COOKIE_BANNER: {
                return "COOKIE_BANNER";
            }

            case DATA_SALE_OPT_OUT_PAGE: {
                return "DATA_SALE_OPT_OUT_PAGE";
            }

            case PRIVACY_POLICY: {
                return "PRIVACY_POLICY";
            }

            default: {
                return "";
            }
        }
    }
}

