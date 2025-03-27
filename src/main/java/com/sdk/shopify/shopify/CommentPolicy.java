// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible comment policies for a blog.
*/
public enum CommentPolicy {
    /**
    * Readers can post comments to blog articles without moderation.
    */
    AUTO_PUBLISHED,

    /**
    * Readers cannot post comments to blog articles.
    */
    CLOSED,

    /**
    * Readers can post comments to blog articles, but comments must be moderated before they appear.
    */
    MODERATED,

    UNKNOWN_VALUE;

    public static CommentPolicy fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTO_PUBLISHED": {
                return AUTO_PUBLISHED;
            }

            case "CLOSED": {
                return CLOSED;
            }

            case "MODERATED": {
                return MODERATED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTO_PUBLISHED: {
                return "AUTO_PUBLISHED";
            }

            case CLOSED: {
                return "CLOSED";
            }

            case MODERATED: {
                return "MODERATED";
            }

            default: {
                return "";
            }
        }
    }
}

