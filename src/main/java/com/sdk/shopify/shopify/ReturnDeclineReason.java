// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* The reason why the merchant declined a customer's return request.
*/
public enum ReturnDeclineReason {
    /**
    * The return contains final sale items.
    */
    FINAL_SALE,

    /**
    * The return is declined for another reason.
    */
    OTHER,

    /**
    * The return period has ended.
    */
    RETURN_PERIOD_ENDED,

    UNKNOWN_VALUE;

    public static ReturnDeclineReason fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "FINAL_SALE": {
                return FINAL_SALE;
            }

            case "OTHER": {
                return OTHER;
            }

            case "RETURN_PERIOD_ENDED": {
                return RETURN_PERIOD_ENDED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case FINAL_SALE: {
                return "FINAL_SALE";
            }

            case OTHER: {
                return "OTHER";
            }

            case RETURN_PERIOD_ENDED: {
                return "RETURN_PERIOD_ENDED";
            }

            default: {
                return "";
            }
        }
    }
}

