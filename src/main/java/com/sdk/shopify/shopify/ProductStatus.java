// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible product statuses.
*/
public enum ProductStatus {
    /**
    * The product is ready to sell and can be published to sales channels and apps. Products with an
    * active status aren't automatically published to sales channels, such as the online store, or apps.
    * By default, existing products are set to active.
    */
    ACTIVE,

    /**
    * The product is no longer being sold and isn't available to customers on sales channels and apps.
    */
    ARCHIVED,

    /**
    * The product isn't ready to sell and is unavailable to customers on sales channels and apps. By
    * default, duplicated and unarchived products are set to draft.
    */
    DRAFT,

    UNKNOWN_VALUE;

    public static ProductStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "ARCHIVED": {
                return ARCHIVED;
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

            case ARCHIVED: {
                return "ARCHIVED";
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

