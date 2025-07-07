// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The status of a comment.
*/
public enum CommentStatus {
    /**
    * The comment is pending approval.
    */
    PENDING,

    /**
    * The comment is published.
    */
    PUBLISHED,

    /**
    * The comment has been removed.
    */
    REMOVED,

    /**
    * The comment is marked as spam.
    */
    SPAM,

    /**
    * The comment is unapproved.
    */
    UNAPPROVED,

    UNKNOWN_VALUE;

    public static CommentStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PENDING": {
                return PENDING;
            }

            case "PUBLISHED": {
                return PUBLISHED;
            }

            case "REMOVED": {
                return REMOVED;
            }

            case "SPAM": {
                return SPAM;
            }

            case "UNAPPROVED": {
                return UNAPPROVED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PENDING: {
                return "PENDING";
            }

            case PUBLISHED: {
                return "PUBLISHED";
            }

            case REMOVED: {
                return "REMOVED";
            }

            case SPAM: {
                return "SPAM";
            }

            case UNAPPROVED: {
                return "UNAPPROVED";
            }

            default: {
                return "";
            }
        }
    }
}

