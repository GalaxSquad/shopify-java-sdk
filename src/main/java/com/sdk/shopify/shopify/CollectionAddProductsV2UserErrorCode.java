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
* Possible error codes that can be returned by `CollectionAddProductsV2UserError`.
*/
public enum CollectionAddProductsV2UserErrorCode {
    /**
    * Can't manually add products to a smart collection.
    */
    CANT_ADD_TO_SMART_COLLECTION,

    /**
    * Collection doesn't exist.
    */
    COLLECTION_DOES_NOT_EXIST,

    UNKNOWN_VALUE;

    public static CollectionAddProductsV2UserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANT_ADD_TO_SMART_COLLECTION": {
                return CANT_ADD_TO_SMART_COLLECTION;
            }

            case "COLLECTION_DOES_NOT_EXIST": {
                return COLLECTION_DOES_NOT_EXIST;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANT_ADD_TO_SMART_COLLECTION: {
                return "CANT_ADD_TO_SMART_COLLECTION";
            }

            case COLLECTION_DOES_NOT_EXIST: {
                return "COLLECTION_DOES_NOT_EXIST";
            }

            default: {
                return "";
            }
        }
    }
}

