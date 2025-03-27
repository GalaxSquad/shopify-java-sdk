// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The options for customizing the corner radius of checkout-related objects. Examples include the
* primary
* button, the name text fields and the sections within the main area (if they have borders).
* Refer to this complete
* [list](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius#fieldswi
* th)
* for objects with customizable corner radii.
* The design system defines the corner radius pixel size for each option. Modify the defaults by
* setting the
* [designSystem.cornerRadius](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/Checkout
* BrandingDesignSystemInput#field-checkoutbrandingdesignsysteminput-cornerradius)
* input fields.
*/
public enum CheckoutBrandingCornerRadius {
    /**
    * The corner radius with a pixel value defined by designSystem.cornerRadius.base.
    */
    BASE,

    /**
    * The corner radius with a pixel value defined by designSystem.cornerRadius.large.
    */
    LARGE,

    /**
    * The 0px corner radius (square corners).
    */
    NONE,

    /**
    * The corner radius with a pixel value defined by designSystem.cornerRadius.small.
    */
    SMALL,

    UNKNOWN_VALUE;

    public static CheckoutBrandingCornerRadius fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BASE": {
                return BASE;
            }

            case "LARGE": {
                return LARGE;
            }

            case "NONE": {
                return NONE;
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

            case LARGE: {
                return "LARGE";
            }

            case NONE: {
                return "NONE";
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

