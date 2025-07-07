// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible choices to override corner radius customizations on all applicable objects. Note that this
* selection 
* can only be used to set the override to `NONE` (0px).
* For more customizations options, set the [corner
* radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
* selection on specific objects while leaving the global corner radius unset.
*/
public enum CheckoutBrandingGlobalCornerRadius {
    /**
    * Set the global corner radius override to 0px (square corners).
    */
    NONE,

    UNKNOWN_VALUE;

    public static CheckoutBrandingGlobalCornerRadius fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NONE": {
                return NONE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NONE: {
                return "NONE";
            }

            default: {
                return "";
            }
        }
    }
}

