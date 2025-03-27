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
* Possible error codes that can be returned by `UrlRedirectBulkDeleteByIdsUserError`.
*/
public enum UrlRedirectBulkDeleteByIdsUserErrorCode {
    /**
    * You must pass one or more [`URLRedirect`](
        * https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect
        * ) object IDs.
        */
        IDS_EMPTY,

        UNKNOWN_VALUE;

        public static UrlRedirectBulkDeleteByIdsUserErrorCode fromGraphQl(String value) {
            if (value == null) {
                return null;
            }

            switch (value) {
                case "IDS_EMPTY": {
                    return IDS_EMPTY;
                }

                default: {
                    return UNKNOWN_VALUE;
                }
            }
        }
        public String toString() {
            switch (this) {
                case IDS_EMPTY: {
                    return "IDS_EMPTY";
                }

                default: {
                    return "";
                }
            }
        }
    }

