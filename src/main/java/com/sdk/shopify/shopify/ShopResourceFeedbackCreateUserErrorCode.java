// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ShopResourceFeedbackCreateUserError`.
*/
public enum ShopResourceFeedbackCreateUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The feedback date cannot be set in the future.
    */
    FEEDBACK_DATE_IN_FUTURE,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The feedback for a later version of the resource was already accepted.
    */
    OUTDATED_FEEDBACK,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    UNKNOWN_VALUE;

    public static ShopResourceFeedbackCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "FEEDBACK_DATE_IN_FUTURE": {
                return FEEDBACK_DATE_IN_FUTURE;
            }

            case "INVALID": {
                return INVALID;
            }

            case "OUTDATED_FEEDBACK": {
                return OUTDATED_FEEDBACK;
            }

            case "PRESENT": {
                return PRESENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BLANK: {
                return "BLANK";
            }

            case FEEDBACK_DATE_IN_FUTURE: {
                return "FEEDBACK_DATE_IN_FUTURE";
            }

            case INVALID: {
                return "INVALID";
            }

            case OUTDATED_FEEDBACK: {
                return "OUTDATED_FEEDBACK";
            }

            case PRESENT: {
                return "PRESENT";
            }

            default: {
                return "";
            }
        }
    }
}

