// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Represents the state of this product operation.
*/
public enum ProductOperationStatus {
    /**
    * Operation is currently running.
    */
    ACTIVE,

    /**
    * Operation is complete.
    */
    COMPLETE,

    /**
    * Operation has been created.
    */
    CREATED,

    UNKNOWN_VALUE;

    public static ProductOperationStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ACTIVE": {
                return ACTIVE;
            }

            case "COMPLETE": {
                return COMPLETE;
            }

            case "CREATED": {
                return CREATED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACTIVE: {
                return "ACTIVE";
            }

            case COMPLETE: {
                return "COMPLETE";
            }

            case CREATED: {
                return "CREATED";
            }

            default: {
                return "";
            }
        }
    }
}

