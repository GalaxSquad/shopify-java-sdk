// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The RFM (Recency, Frequency, Monetary) group for a customer.
*/
public enum CustomerRfmGroup {
    /**
    * Customers with recent purchases, some orders, and moderate spend.
    */
    ACTIVE,

    /**
    * Customers without recent purchases, fewer orders, and with lower spend.
    */
    ALMOST_LOST,

    /**
    * Customers without recent purchases, but with a strong history of orders and spend.
    */
    AT_RISK,

    /**
    * Customers with very recent purchases, many orders, and the most spend.
    */
    CHAMPIONS,

    /**
    * Customers without recent orders, with infrequent orders, and with low spend.
    */
    DORMANT,

    /**
    * Customers with recent purchases, many orders, and the most spend.
    */
    LOYAL,

    /**
    * Customers with recent purchases, some orders, and moderate spend.
    */
    NEEDS_ATTENTION,

    /**
    * Customers with very recent purchases, few orders, and low spend.
    */
    NEW,

    /**
    * Customers without recent purchases, but with a very strong history of orders and spend.
    */
    PREVIOUSLY_LOYAL,

    /**
    * Customers with recent purchases, few orders, and low spend.
    */
    PROMISING,

    /**
    * Customers with no orders yet.
    */
    PROSPECTS,

    UNKNOWN_VALUE;

    public static CustomerRfmGroup fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "ALMOST_LOST": {
                return ALMOST_LOST;
            }

            case "AT_RISK": {
                return AT_RISK;
            }

            case "CHAMPIONS": {
                return CHAMPIONS;
            }

            case "DORMANT": {
                return DORMANT;
            }

            case "LOYAL": {
                return LOYAL;
            }

            case "NEEDS_ATTENTION": {
                return NEEDS_ATTENTION;
            }

            case "NEW": {
                return NEW;
            }

            case "PREVIOUSLY_LOYAL": {
                return PREVIOUSLY_LOYAL;
            }

            case "PROMISING": {
                return PROMISING;
            }

            case "PROSPECTS": {
                return PROSPECTS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case ALMOST_LOST: {
                return "ALMOST_LOST";
            }

            case AT_RISK: {
                return "AT_RISK";
            }

            case CHAMPIONS: {
                return "CHAMPIONS";
            }

            case DORMANT: {
                return "DORMANT";
            }

            case LOYAL: {
                return "LOYAL";
            }

            case NEEDS_ATTENTION: {
                return "NEEDS_ATTENTION";
            }

            case NEW: {
                return "NEW";
            }

            case PREVIOUSLY_LOYAL: {
                return "PREVIOUSLY_LOYAL";
            }

            case PROMISING: {
                return "PROMISING";
            }

            case PROSPECTS: {
                return "PROSPECTS";
            }

            default: {
                return "";
            }
        }
    }
}

