// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible values for the marketing subscription opt-in level enabled at the time the customer
* consented to receive marketing information.
* The levels are defined by [the M3AAWG best practices guideline
* document](https://www.m3aawg.org/sites/maawg/files/news/M3AAWG_Senders_BCP_Ver3-2015-02.pdf).
*/
public enum CustomerMarketingOptInLevel {
    /**
    * After providing their information, the customer receives a confirmation and is required to
    * perform a intermediate step before receiving marketing information.
    */
    CONFIRMED_OPT_IN,

    /**
    * After providing their information, the customer receives marketing information without any
    * intermediate steps.
    */
    SINGLE_OPT_IN,

    /**
    * The customer receives marketing information but how they were opted in is unknown.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static CustomerMarketingOptInLevel fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CONFIRMED_OPT_IN": {
                return CONFIRMED_OPT_IN;
            }

            case "SINGLE_OPT_IN": {
                return SINGLE_OPT_IN;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CONFIRMED_OPT_IN: {
                return "CONFIRMED_OPT_IN";
            }

            case SINGLE_OPT_IN: {
                return "SINGLE_OPT_IN";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

