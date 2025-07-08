// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ArticleUpdateUserError`.
*/
public enum ArticleUpdateUserErrorCode {
    /**
    * Can't update an article author if both author name and user ID are supplied.
    */
    AMBIGUOUS_AUTHOR,

    /**
    * Can't create a blog from input if a blog ID is supplied.
    */
    AMBIGUOUS_BLOG,

    /**
    * User must exist if a user ID is supplied.
    */
    AUTHOR_MUST_EXIST,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Can’t set isPublished to true and also set a future publish date.
    */
    INVALID_PUBLISH_DATE,

    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * Image upload failed.
    */
    UPLOAD_FAILED,

    UNKNOWN_VALUE;

    public static ArticleUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "AMBIGUOUS_AUTHOR": {
                return AMBIGUOUS_AUTHOR;
            }

            case "AMBIGUOUS_BLOG": {
                return AMBIGUOUS_BLOG;
            }

            case "AUTHOR_MUST_EXIST": {
                return AUTHOR_MUST_EXIST;
            }

            case "BLANK": {
                return BLANK;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_PUBLISH_DATE": {
                return INVALID_PUBLISH_DATE;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "UPLOAD_FAILED": {
                return UPLOAD_FAILED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case AMBIGUOUS_AUTHOR: {
                return "AMBIGUOUS_AUTHOR";
            }

            case AMBIGUOUS_BLOG: {
                return "AMBIGUOUS_BLOG";
            }

            case AUTHOR_MUST_EXIST: {
                return "AUTHOR_MUST_EXIST";
            }

            case BLANK: {
                return "BLANK";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_PUBLISH_DATE: {
                return "INVALID_PUBLISH_DATE";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case UPLOAD_FAILED: {
                return "UPLOAD_FAILED";
            }

            default: {
                return "";
            }
        }
    }
}

