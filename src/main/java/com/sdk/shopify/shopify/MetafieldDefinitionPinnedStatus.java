// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible metafield definition pinned statuses.
*/
public enum MetafieldDefinitionPinnedStatus {
    /**
    * All metafield definitions.
    */
    ANY,

    /**
    * Only metafield definitions that are pinned.
    */
    PINNED,

    /**
    * Only metafield definitions that are not pinned.
    */
    UNPINNED,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionPinnedStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ANY": {
                return ANY;
            }

            case "PINNED": {
                return PINNED;
            }

            case "UNPINNED": {
                return UNPINNED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ANY: {
                return "ANY";
            }

            case PINNED: {
                return "PINNED";
            }

            case UNPINNED: {
                return "UNPINNED";
            }

            default: {
                return "";
            }
        }
    }
}

