// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

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

