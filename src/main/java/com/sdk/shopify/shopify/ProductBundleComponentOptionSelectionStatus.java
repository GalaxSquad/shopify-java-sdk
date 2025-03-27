// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* The status of a component option value related to a bundle.
*/
public enum ProductBundleComponentOptionSelectionStatus {
    /**
    * The component option value is not selected as sellable in the bundle.
    */
    DESELECTED,

    /**
    * The component option value was not initially selected, but is now available for the bundle.
    */
    NEW,

    /**
    * The component option value is selected as sellable in the bundle.
    */
    SELECTED,

    /**
    * The component option value was selected, is no longer available for the bundle.
    */
    UNAVAILABLE,

    UNKNOWN_VALUE;

    public static ProductBundleComponentOptionSelectionStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DESELECTED": {
                return DESELECTED;
            }

            case "NEW": {
                return NEW;
            }

            case "SELECTED": {
                return SELECTED;
            }

            case "UNAVAILABLE": {
                return UNAVAILABLE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DESELECTED: {
                return "DESELECTED";
            }

            case NEW: {
                return "NEW";
            }

            case SELECTED: {
                return "SELECTED";
            }

            case UNAVAILABLE: {
                return "UNAVAILABLE";
            }

            default: {
                return "";
            }
        }
    }
}

