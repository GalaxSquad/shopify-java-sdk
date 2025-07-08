// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the ShipmentLineItem query.
*/
public enum ShipmentLineItemSortKeys {
    /**
    * Sort by the `id` value.
    */
    ID,

    UNKNOWN_VALUE;

    public static ShipmentLineItemSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
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
            case ID: {
                return "ID";
            }

            default: {
                return "";
            }
        }
    }
}

