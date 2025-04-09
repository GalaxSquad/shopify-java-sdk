// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The supported subject types of deletion events.
*/
public enum DeletionEventSubjectType {
    COLLECTION,

    PRODUCT,

    UNKNOWN_VALUE;

    public static DeletionEventSubjectType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "COLLECTION": {
                return COLLECTION;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case COLLECTION: {
                return "COLLECTION";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            default: {
                return "";
            }
        }
    }
}

