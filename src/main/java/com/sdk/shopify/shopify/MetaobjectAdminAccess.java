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
* Metaobject access permissions for the Admin API. When the metaobject is app-owned, the owning app
* always has
* full access.
*/
public enum MetaobjectAdminAccess {
    /**
    * The merchant has read-only access. No other apps have access.
    */
    MERCHANT_READ,

    /**
    * The merchant has read and write access. No other apps have access.
    */
    MERCHANT_READ_WRITE,

    /**
    * The merchant and other apps have no access.
    */
    PRIVATE,

    /**
    * The merchant and other apps have read-only access.
    */
    PUBLIC_READ,

    /**
    * The merchant and other apps have read and write access.
    */
    PUBLIC_READ_WRITE,

    UNKNOWN_VALUE;

    public static MetaobjectAdminAccess fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "MERCHANT_READ": {
                return MERCHANT_READ;
            }

            case "MERCHANT_READ_WRITE": {
                return MERCHANT_READ_WRITE;
            }

            case "PRIVATE": {
                return PRIVATE;
            }

            case "PUBLIC_READ": {
                return PUBLIC_READ;
            }

            case "PUBLIC_READ_WRITE": {
                return PUBLIC_READ_WRITE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case MERCHANT_READ: {
                return "MERCHANT_READ";
            }

            case MERCHANT_READ_WRITE: {
                return "MERCHANT_READ_WRITE";
            }

            case PRIVATE: {
                return "PRIVATE";
            }

            case PUBLIC_READ: {
                return "PUBLIC_READ";
            }

            case PUBLIC_READ_WRITE: {
                return "PUBLIC_READ_WRITE";
            }

            default: {
                return "";
            }
        }
    }
}

