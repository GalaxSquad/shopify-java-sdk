// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* The set of valid sort keys for the Transfer query.
*/
public enum TransferSortKeys {
    /**
    * Sort by the `created_at` value.
    */
    CREATED_AT,

    /**
    * Sort by the `destination_name` value.
    */
    DESTINATION_NAME,

    /**
    * Sort by the `expected_shipment_arrival` value.
    */
    EXPECTED_SHIPMENT_ARRIVAL,

    /**
    * Sort by the `id` value.
    */
    ID,

    /**
    * Sort by the `name` value.
    */
    NAME,

    /**
    * Sort by the `origin_name` value.
    */
    ORIGIN_NAME,

    /**
    * Sort by the `source_name` value.
    */
    SOURCE_NAME,

    /**
    * Sort by the `status` value.
    */
    STATUS,

    UNKNOWN_VALUE;

    public static TransferSortKeys fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CREATED_AT": {
                return CREATED_AT;
            }

            case "DESTINATION_NAME": {
                return DESTINATION_NAME;
            }

            case "EXPECTED_SHIPMENT_ARRIVAL": {
                return EXPECTED_SHIPMENT_ARRIVAL;
            }

            case "ID": {
                return ID;
            }

            case "NAME": {
                return NAME;
            }

            case "ORIGIN_NAME": {
                return ORIGIN_NAME;
            }

            case "SOURCE_NAME": {
                return SOURCE_NAME;
            }

            case "STATUS": {
                return STATUS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CREATED_AT: {
                return "CREATED_AT";
            }

            case DESTINATION_NAME: {
                return "DESTINATION_NAME";
            }

            case EXPECTED_SHIPMENT_ARRIVAL: {
                return "EXPECTED_SHIPMENT_ARRIVAL";
            }

            case ID: {
                return "ID";
            }

            case NAME: {
                return "NAME";
            }

            case ORIGIN_NAME: {
                return "ORIGIN_NAME";
            }

            case SOURCE_NAME: {
                return "SOURCE_NAME";
            }

            case STATUS: {
                return "STATUS";
            }

            default: {
                return "";
            }
        }
    }
}

