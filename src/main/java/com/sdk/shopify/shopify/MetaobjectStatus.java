// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Defines visibility status for metaobjects.
*/
public enum MetaobjectStatus {
    /**
    * The metaobjects is active for public use.
    */
    ACTIVE,

    /**
    * The metaobjects is an internal record.
    */
    DRAFT,

    UNKNOWN_VALUE;

    public static MetaobjectStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "DRAFT": {
                return DRAFT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case DRAFT: {
                return "DRAFT";
            }

            default: {
                return "";
            }
        }
    }
}

