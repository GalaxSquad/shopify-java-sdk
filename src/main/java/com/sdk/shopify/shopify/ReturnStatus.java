// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The status of a return.
*/
public enum ReturnStatus {
    /**
    * The return has been canceled.
    */
    CANCELED,

    /**
    * The return has been completed.
    */
    CLOSED,

    /**
    * The return was declined.
    */
    DECLINED,

    /**
    * The return is in progress.
    */
    OPEN,

    /**
    * The return was requested.
    */
    REQUESTED,

    UNKNOWN_VALUE;

    public static ReturnStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANCELED": {
                return CANCELED;
            }

            case "CLOSED": {
                return CLOSED;
            }

            case "DECLINED": {
                return DECLINED;
            }

            case "OPEN": {
                return OPEN;
            }

            case "REQUESTED": {
                return REQUESTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANCELED: {
                return "CANCELED";
            }

            case CLOSED: {
                return "CLOSED";
            }

            case DECLINED: {
                return "DECLINED";
            }

            case OPEN: {
                return "OPEN";
            }

            case REQUESTED: {
                return "REQUESTED";
            }

            default: {
                return "";
            }
        }
    }
}

