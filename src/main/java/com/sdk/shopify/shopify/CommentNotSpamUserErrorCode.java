// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `CommentNotSpamUserError`.
*/
public enum CommentNotSpamUserErrorCode {
    /**
    * The record with the ID used as the input value couldn't be found.
    */
    NOT_FOUND,

    UNKNOWN_VALUE;

    public static CommentNotSpamUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

