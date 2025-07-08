// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the SubscriptionBillingCycles query.
*/
public enum SubscriptionBillingCyclesSortKeys {
    /**
    * Sort by the `cycle_index` value.
    */
    CYCLE_INDEX,

    /**
    * Sort by the `id` value.
    */
    ID,

    UNKNOWN_VALUE;

    public static SubscriptionBillingCyclesSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CYCLE_INDEX": {
                return CYCLE_INDEX;
            }

            case "ID": {
                return ID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CYCLE_INDEX: {
                return "CYCLE_INDEX";
            }

            case ID: {
                return "ID";
            }

            default: {
                return "";
            }
        }
    }
}

