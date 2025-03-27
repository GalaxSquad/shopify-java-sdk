// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The role of the combined listing.
*/
public enum CombinedListingsRole {
    /**
    * The product is the child of a combined listing.
    */
    CHILD,

    /**
    * The product is the parent of a combined listing.
    */
    PARENT,

    UNKNOWN_VALUE;

    public static CombinedListingsRole fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CHILD": {
                return CHILD;
            }

            case "PARENT": {
                return PARENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CHILD: {
                return "CHILD";
            }

            case PARENT: {
                return "PARENT";
            }

            default: {
                return "";
            }
        }
    }
}

