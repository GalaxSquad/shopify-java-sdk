// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible choices for the font size.
* Note that the value in pixels of these settings can be customized with the
* [typography
* size](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/CheckoutBrandingFontSizeInput)
* object. Refer to the [typography
* tutorial](https://shopify.dev/docs/apps/checkout/styling/customize-typography)
* for more information.
*/
public enum CheckoutBrandingTypographySize {
    /**
    * The base font size. Example: 14px.
    */
    BASE,

    /**
    * The extra extra large font size. Example: 24px.
    */
    EXTRA_EXTRA_LARGE,

    /**
    * The extra large font size. Example: 21px.
    */
    EXTRA_LARGE,

    /**
    * The extra small font size. Example: 10px.
    */
    EXTRA_SMALL,

    /**
    * The large font size. Example: 19px.
    */
    LARGE,

    /**
    * The medium font size. Example: 16px.
    */
    MEDIUM,

    /**
    * The small font size. Example: 12px.
    */
    SMALL,

    UNKNOWN_VALUE;

    public static CheckoutBrandingTypographySize fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "EXTRA_EXTRA_LARGE": {
                return EXTRA_EXTRA_LARGE;
            }

            case "EXTRA_LARGE": {
                return EXTRA_LARGE;
            }

            case "EXTRA_SMALL": {
                return EXTRA_SMALL;
            }

            case "LARGE": {
                return LARGE;
            }

            case "MEDIUM": {
                return MEDIUM;
            }

            case "SMALL": {
                return SMALL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BASE: {
                return "BASE";
            }

            case EXTRA_EXTRA_LARGE: {
                return "EXTRA_EXTRA_LARGE";
            }

            case EXTRA_LARGE: {
                return "EXTRA_LARGE";
            }

            case EXTRA_SMALL: {
                return "EXTRA_SMALL";
            }

            case LARGE: {
                return "LARGE";
            }

            case MEDIUM: {
                return "MEDIUM";
            }

            case SMALL: {
                return "SMALL";
            }

            default: {
                return "";
            }
        }
    }
}

