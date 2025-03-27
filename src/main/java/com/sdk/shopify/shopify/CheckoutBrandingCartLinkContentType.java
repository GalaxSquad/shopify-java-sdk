// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible values for the cart link content type for the header.
*/
public enum CheckoutBrandingCartLinkContentType {
    /**
    * The checkout header content type icon value.
    */
    ICON,

    /**
    * The checkout header content type image value.
    */
    IMAGE,

    /**
    * The checkout header content type text value.
    */
    TEXT,

    UNKNOWN_VALUE;

    public static CheckoutBrandingCartLinkContentType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ICON": {
                return ICON;
            }

            case "IMAGE": {
                return IMAGE;
            }

            case "TEXT": {
                return TEXT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ICON: {
                return "ICON";
            }

            case IMAGE: {
                return "IMAGE";
            }

            case TEXT: {
                return "TEXT";
            }

            default: {
                return "";
            }
        }
    }
}

