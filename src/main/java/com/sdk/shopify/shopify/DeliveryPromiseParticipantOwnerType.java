// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The type of object that the participant is attached to.
*/
public enum DeliveryPromiseParticipantOwnerType {
    /**
    * A product variant.
    */
    PRODUCTVARIANT,

    UNKNOWN_VALUE;

    public static DeliveryPromiseParticipantOwnerType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PRODUCTVARIANT": {
                return PRODUCTVARIANT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PRODUCTVARIANT: {
                return "PRODUCTVARIANT";
            }

            default: {
                return "";
            }
        }
    }
}

