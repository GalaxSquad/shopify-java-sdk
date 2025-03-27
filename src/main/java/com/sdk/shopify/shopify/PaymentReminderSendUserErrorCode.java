// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `PaymentReminderSendUserError`.
*/
public enum PaymentReminderSendUserErrorCode {
    /**
    * An error occurred while sending the payment reminder.
    */
    PAYMENT_REMINDER_SEND_UNSUCCESSFUL,

    UNKNOWN_VALUE;

    public static PaymentReminderSendUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PAYMENT_REMINDER_SEND_UNSUCCESSFUL": {
                return PAYMENT_REMINDER_SEND_UNSUCCESSFUL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PAYMENT_REMINDER_SEND_UNSUCCESSFUL: {
                return "PAYMENT_REMINDER_SEND_UNSUCCESSFUL";
            }

            default: {
                return "";
            }
        }
    }
}

