// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `ArticleCreateUserError`.
*/
public enum ArticleCreateUserErrorCode {
    /**
    * Can't create an article author if both author name and user ID are supplied.
    */
    AMBIGUOUS_AUTHOR,

    /**
    * Can't create a blog from input if a blog ID is supplied.
    */
    AMBIGUOUS_BLOG,

    /**
    * Can't create an article if both author name and user ID are blank.
    */
    AUTHOR_FIELD_REQUIRED,

    /**
    * User must exist if a user ID is supplied.
    */
    AUTHOR_MUST_EXIST,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Must reference or create a blog when creating an article.
    */
    BLOG_REFERENCE_REQUIRED,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Can’t set isPublished to true and also set a future publish date.
    */
    INVALID_PUBLISH_DATE,

    /**
    * The metafield type is invalid.
    */
    INVALID_TYPE,

    /**
    * The value is invalid for the metafield type or for the definition options.
    */
    INVALID_VALUE,

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

    public static ArticleCreateUserErrorCode fromGraphQl(String value) {
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

            case "AUTHOR_FIELD_REQUIRED": {
                return AUTHOR_FIELD_REQUIRED;
            }

            case "AUTHOR_MUST_EXIST": {
                return AUTHOR_MUST_EXIST;
            }

            case "BLANK": {
                return BLANK;
            }

            case "BLOG_REFERENCE_REQUIRED": {
                return BLOG_REFERENCE_REQUIRED;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_PUBLISH_DATE": {
                return INVALID_PUBLISH_DATE;
            }

            case "INVALID_TYPE": {
                return INVALID_TYPE;
            }

            case "INVALID_VALUE": {
                return INVALID_VALUE;
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

            case AUTHOR_FIELD_REQUIRED: {
                return "AUTHOR_FIELD_REQUIRED";
            }

            case AUTHOR_MUST_EXIST: {
                return "AUTHOR_MUST_EXIST";
            }

            case BLANK: {
                return "BLANK";
            }

            case BLOG_REFERENCE_REQUIRED: {
                return "BLOG_REFERENCE_REQUIRED";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_PUBLISH_DATE: {
                return "INVALID_PUBLISH_DATE";
            }

            case INVALID_TYPE: {
                return "INVALID_TYPE";
            }

            case INVALID_VALUE: {
                return "INVALID_VALUE";
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

