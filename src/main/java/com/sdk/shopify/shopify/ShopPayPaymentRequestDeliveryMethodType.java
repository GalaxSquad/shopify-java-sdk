// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents the delivery method type for a Shop Pay payment request.
*/
public enum ShopPayPaymentRequestDeliveryMethodType {
    /**
    * The delivery method type is pickup.
    */
    PICKUP,

    /**
    * The delivery method type is shipping.
    */
    SHIPPING,

    UNKNOWN_VALUE;

    public static ShopPayPaymentRequestDeliveryMethodType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PICKUP": {
                return PICKUP;
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
            case PICKUP: {
                return "PICKUP";
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

