// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Possible error codes that can be returned by `MetafieldDefinitionDeleteUserError`.
*/
public enum MetafieldDefinitionDeleteUserErrorCode {
    /**
    * Owner type can't be used in this mutation.
    */
    DISALLOWED_OWNER_TYPE,

    /**
    * Deleting an id type metafield definition requires deletion of its associated metafields.
    */
    ID_TYPE_DELETION_ERROR,

    /**
    * An internal error occurred.
    */
    INTERNAL_ERROR,

    /**
    * Action cannot proceed. Definition is currently in use.
    */
    METAFIELD_DEFINITION_IN_USE,

    /**
    * Definition not found.
    */
    NOT_FOUND,

    /**
    * The input value needs to be blank.
    */
    PRESENT,

    /**
    * Deleting a reference type metafield definition requires deletion of its associated metafields.
    */
    REFERENCE_TYPE_DELETION_ERROR,

    /**
    * Deleting a definition in a reserved namespace requires deletion of its associated metafields.
    */
    RESERVED_NAMESPACE_ORPHANED_METAFIELDS,

    UNKNOWN_VALUE;

    public static MetafieldDefinitionDeleteUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "DISALLOWED_OWNER_TYPE": {
                return DISALLOWED_OWNER_TYPE;
            }

            case "ID_TYPE_DELETION_ERROR": {
                return ID_TYPE_DELETION_ERROR;
            }

            case "INTERNAL_ERROR": {
                return INTERNAL_ERROR;
            }

            case "METAFIELD_DEFINITION_IN_USE": {
                return METAFIELD_DEFINITION_IN_USE;
            }

            case "NOT_FOUND": {
                return NOT_FOUND;
            }

            case "PRESENT": {
                return PRESENT;
            }

            case "REFERENCE_TYPE_DELETION_ERROR": {
                return REFERENCE_TYPE_DELETION_ERROR;
            }

            case "RESERVED_NAMESPACE_ORPHANED_METAFIELDS": {
                return RESERVED_NAMESPACE_ORPHANED_METAFIELDS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DISALLOWED_OWNER_TYPE: {
                return "DISALLOWED_OWNER_TYPE";
            }

            case ID_TYPE_DELETION_ERROR: {
                return "ID_TYPE_DELETION_ERROR";
            }

            case INTERNAL_ERROR: {
                return "INTERNAL_ERROR";
            }

            case METAFIELD_DEFINITION_IN_USE: {
                return "METAFIELD_DEFINITION_IN_USE";
            }

            case NOT_FOUND: {
                return "NOT_FOUND";
            }

            case PRESENT: {
                return "PRESENT";
            }

            case REFERENCE_TYPE_DELETION_ERROR: {
                return "REFERENCE_TYPE_DELETION_ERROR";
            }

            case RESERVED_NAMESPACE_ORPHANED_METAFIELDS: {
                return "RESERVED_NAMESPACE_ORPHANED_METAFIELDS";
            }

            default: {
                return "";
            }
        }
    }
}

