// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* The possible HTTP methods that can be used when sending a request to upload a file using information
* from a
* [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarg
* et).
*/
public enum StagedUploadHttpMethodType {
    /**
    * The POST HTTP method.
    */
    POST,

    /**
    * The PUT HTTP method.
    */
    PUT,

    UNKNOWN_VALUE;

    public static StagedUploadHttpMethodType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "POST": {
                return POST;
            }

            case "PUT": {
                return PUT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case POST: {
                return "POST";
            }

            case PUT: {
                return "PUT";
            }

            default: {
                return "";
            }
        }
    }
}

