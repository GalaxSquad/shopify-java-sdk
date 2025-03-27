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
* The type of resources that are market localizable.
*/
public enum MarketLocalizableResourceType {
    /**
    * A metafield. Market localizable fields: `value`.
    */
    METAFIELD,

    /**
    * A Metaobject. Market Localizable fields are determined by the Metaobject type.
    */
    METAOBJECT,

    UNKNOWN_VALUE;

    public static MarketLocalizableResourceType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "METAFIELD": {
                return METAFIELD;
            }

            case "METAOBJECT": {
                return METAOBJECT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case METAFIELD: {
                return "METAFIELD";
            }

            case METAOBJECT: {
                return "METAOBJECT";
            }

            default: {
                return "";
            }
        }
    }
}

