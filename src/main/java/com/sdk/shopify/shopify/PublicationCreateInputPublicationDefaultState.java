// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The input fields for the possible values for the default state of a publication.
*/
public enum PublicationCreateInputPublicationDefaultState {
    /**
    * The publication is populated with all products.
    */
    ALL_PRODUCTS,

    /**
    * The publication is empty.
    */
    EMPTY,

    UNKNOWN_VALUE;

    public static PublicationCreateInputPublicationDefaultState fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALL_PRODUCTS": {
                return ALL_PRODUCTS;
            }

            case "EMPTY": {
                return EMPTY;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALL_PRODUCTS: {
                return "ALL_PRODUCTS";
            }

            case EMPTY: {
                return "EMPTY";
            }

            default: {
                return "";
            }
        }
    }
}

