// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The different types of method definitions to filter by.
*/
public enum DeliveryMethodDefinitionType {
    /**
    * A static merchant-defined rate.
    */
    MERCHANT,

    /**
    * A dynamic participant rate.
    */
    PARTICIPANT,

    UNKNOWN_VALUE;

    public static DeliveryMethodDefinitionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MERCHANT": {
                return MERCHANT;
            }

            case "PARTICIPANT": {
                return PARTICIPANT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MERCHANT: {
                return "MERCHANT";
            }

            case PARTICIPANT: {
                return "PARTICIPANT";
            }

            default: {
                return "";
            }
        }
    }
}

