// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The set of valid sort keys for the Article query.
*/
public enum ArticleSortKeys {
    /**
    * Sort by the `author` value.
    */
    AUTHOR,

    /**
    * Sort by the `blog_title` value.
    */
    BLOG_TITLE,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `published_at` value.
    */
    PUBLISHED_AT,

    /**
    * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
    * Don't use this sort key when no search query is specified.
    */
    RELEVANCE,

    /**
    * Sort by the `title` value.
    */
    TITLE,

    /**
    * Sort by the `updated_at` value.
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static ArticleSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AUTHOR": {
                return AUTHOR;
            }

            case "BLOG_TITLE": {
                return BLOG_TITLE;
            }

            case "ID": {
                return ID;
            }

            case "PUBLISHED_AT": {
                return PUBLISHED_AT;
            }

            case "RELEVANCE": {
                return RELEVANCE;
            }

            case "TITLE": {
                return TITLE;
            }

            case "UPDATED_AT": {
                return UPDATED_AT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AUTHOR: {
                return "AUTHOR";
            }

            case BLOG_TITLE: {
                return "BLOG_TITLE";
            }

            case ID: {
                return "ID";
            }

            case PUBLISHED_AT: {
                return "PUBLISHED_AT";
            }

            case RELEVANCE: {
                return "RELEVANCE";
            }

            case TITLE: {
                return "TITLE";
            }

            case UPDATED_AT: {
                return "UPDATED_AT";
            }

            default: {
                return "";
            }
        }
    }
}

