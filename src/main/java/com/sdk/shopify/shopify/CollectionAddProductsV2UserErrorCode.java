// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





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

