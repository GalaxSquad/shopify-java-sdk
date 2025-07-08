// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `AbandonmentUpdateActivitiesDeliveryStatusesUserError`.
*/
public enum AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCode {
    /**
    * Unable to find an Abandonment for the provided ID.
    */
    ABANDONMENT_NOT_FOUND,

    /**
    * Unable to find delivery status info for the provided ID.
    */
    DELIVERY_STATUS_INFO_NOT_FOUND,

    /**
    * Unable to find a marketing activity for the provided ID.
    */
    MARKETING_ACTIVITY_NOT_FOUND,

    UNKNOWN_VALUE;

    public static AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ABANDONMENT_NOT_FOUND": {
                return ABANDONMENT_NOT_FOUND;
            }

            case "DELIVERY_STATUS_INFO_NOT_FOUND": {
                return DELIVERY_STATUS_INFO_NOT_FOUND;
            }

            case "MARKETING_ACTIVITY_NOT_FOUND": {
                return MARKETING_ACTIVITY_NOT_FOUND;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ABANDONMENT_NOT_FOUND: {
                return "ABANDONMENT_NOT_FOUND";
            }

            case DELIVERY_STATUS_INFO_NOT_FOUND: {
                return "DELIVERY_STATUS_INFO_NOT_FOUND";
            }

            case MARKETING_ACTIVITY_NOT_FOUND: {
                return "MARKETING_ACTIVITY_NOT_FOUND";
            }

            default: {
                return "";
            }
        }
    }
}

