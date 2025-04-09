// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* Possible error codes that can be returned by `CatalogUserError`.
*/
public enum CatalogUserErrorCode {
    /**
    * An app catalog cannot be assigned to a price list.
    */
    APP_CATALOG_PRICE_LIST_ASSIGNMENT,

    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * The catalog can't be associated with more than one market.
    */
    CANNOT_ADD_MORE_THAN_ONE_MARKET,

    /**
    * Cannot create a catalog for an app.
    */
    CANNOT_CREATE_APP_CATALOG,

    /**
    * Cannot create a catalog for a market.
    */
    CANNOT_CREATE_MARKET_CATALOG,

    /**
    * Cannot delete a catalog for an app.
    */
    CANNOT_DELETE_APP_CATALOG,

    /**
    * Cannot delete a catalog for a market.
    */
    CANNOT_DELETE_MARKET_CATALOG,

    /**
    * Cannot modify a catalog for an app.
    */
    CANNOT_MODIFY_APP_CATALOG,

    /**
    * Cannot modify a catalog for a market.
    */
    CANNOT_MODIFY_MARKET_CATALOG,

    /**
    * Quantity price breaks can be associated only with company location catalogs.
    */
    CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS,

    /**
    * Quantity rules can be associated only with company location catalogs.
    */
    CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES,

    /**
    * Catalog failed to save.
    */
    CATALOG_FAILED_TO_SAVE,

    /**
    * The catalog wasn't found.
    */
    CATALOG_NOT_FOUND,

    /**
    * A company location catalog outside of a supported plan can only have an archived status.
    */
    COMPANY_LOCATION_CATALOG_STATUS_PLAN,

    /**
    * The company location could not be found.
    */
    COMPANY_LOCATION_NOT_FOUND,

    /**
    * Context driver already assigned to this catalog.
    */
    CONTEXT_ALREADY_ASSIGNED_TO_CATALOG,

    /**
    * Cannot save the catalog because the catalog limit for the context was reached.
    */
    CONTEXT_CATALOG_LIMIT_REACHED,

    /**
    * The arguments `contextsToAdd` and `contextsToRemove` must match existing catalog context type.
    */
    CONTEXT_DRIVER_MISMATCH,

    /**
    * A country price list cannot be assigned to a catalog.
    */
    COUNTRY_PRICE_LIST_ASSIGNMENT,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * The catalog context type is invalid.
    */
    INVALID_CATALOG_CONTEXT_TYPE,

    /**
    * The catalog's market and price list currencies do not match.
    */
    MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH,

    /**
    * A market catalog must have an active status.
    */
    MARKET_CATALOG_STATUS,

    /**
    * Market not found.
    */
    MARKET_NOT_FOUND,

    /**
    * Market already belongs to another catalog.
    */
    MARKET_TAKEN,

    /**
    * Must provide exactly one context type.
    */
    MUST_PROVIDE_EXACTLY_ONE_CONTEXT_TYPE,

    /**
    * Price list failed to save.
    */
    PRICE_LIST_FAILED_TO_SAVE,

    /**
    * The price list is currently being modified. Please try again later.
    */
    PRICE_LIST_LOCKED,

    /**
    * A price list cannot be assigned to the primary market.
    */
    PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET,

    /**
    * Price list not found.
    */
    PRICE_LIST_NOT_FOUND,

    /**
    * Publication not found.
    */
    PUBLICATION_NOT_FOUND,

    /**
    * Must have `contexts_to_add` or `contexts_to_remove` argument.
    */
    REQUIRES_CONTEXTS_TO_ADD_OR_REMOVE,

    /**
    * The input value is already taken.
    */
    TAKEN,

    /**
    * The input value is too long.
    */
    TOO_LONG,

    /**
    * The input value is too short.
    */
    TOO_SHORT,

    /**
    * Can't perform this action on a catalog of this type.
    */
    UNSUPPORTED_CATALOG_ACTION,

    UNKNOWN_VALUE;

    public static CatalogUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APP_CATALOG_PRICE_LIST_ASSIGNMENT": {
                return APP_CATALOG_PRICE_LIST_ASSIGNMENT;
            }

            case "BLANK": {
                return BLANK;
            }

            case "CANNOT_ADD_MORE_THAN_ONE_MARKET": {
                return CANNOT_ADD_MORE_THAN_ONE_MARKET;
            }

            case "CANNOT_CREATE_APP_CATALOG": {
                return CANNOT_CREATE_APP_CATALOG;
            }

            case "CANNOT_CREATE_MARKET_CATALOG": {
                return CANNOT_CREATE_MARKET_CATALOG;
            }

            case "CANNOT_DELETE_APP_CATALOG": {
                return CANNOT_DELETE_APP_CATALOG;
            }

            case "CANNOT_DELETE_MARKET_CATALOG": {
                return CANNOT_DELETE_MARKET_CATALOG;
            }

            case "CANNOT_MODIFY_APP_CATALOG": {
                return CANNOT_MODIFY_APP_CATALOG;
            }

            case "CANNOT_MODIFY_MARKET_CATALOG": {
                return CANNOT_MODIFY_MARKET_CATALOG;
            }

            case "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS": {
                return CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS;
            }

            case "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES": {
                return CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES;
            }

            case "CATALOG_FAILED_TO_SAVE": {
                return CATALOG_FAILED_TO_SAVE;
            }

            case "CATALOG_NOT_FOUND": {
                return CATALOG_NOT_FOUND;
            }

            case "COMPANY_LOCATION_CATALOG_STATUS_PLAN": {
                return COMPANY_LOCATION_CATALOG_STATUS_PLAN;
            }

            case "COMPANY_LOCATION_NOT_FOUND": {
                return COMPANY_LOCATION_NOT_FOUND;
            }

            case "CONTEXT_ALREADY_ASSIGNED_TO_CATALOG": {
                return CONTEXT_ALREADY_ASSIGNED_TO_CATALOG;
            }

            case "CONTEXT_CATALOG_LIMIT_REACHED": {
                return CONTEXT_CATALOG_LIMIT_REACHED;
            }

            case "CONTEXT_DRIVER_MISMATCH": {
                return CONTEXT_DRIVER_MISMATCH;
            }

            case "COUNTRY_PRICE_LIST_ASSIGNMENT": {
                return COUNTRY_PRICE_LIST_ASSIGNMENT;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_CATALOG_CONTEXT_TYPE": {
                return INVALID_CATALOG_CONTEXT_TYPE;
            }

            case "MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH": {
                return MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH;
            }

            case "MARKET_CATALOG_STATUS": {
                return MARKET_CATALOG_STATUS;
            }

            case "MARKET_NOT_FOUND": {
                return MARKET_NOT_FOUND;
            }

            case "MARKET_TAKEN": {
                return MARKET_TAKEN;
            }

            case "MUST_PROVIDE_EXACTLY_ONE_CONTEXT_TYPE": {
                return MUST_PROVIDE_EXACTLY_ONE_CONTEXT_TYPE;
            }

            case "PRICE_LIST_FAILED_TO_SAVE": {
                return PRICE_LIST_FAILED_TO_SAVE;
            }

            case "PRICE_LIST_LOCKED": {
                return PRICE_LIST_LOCKED;
            }

            case "PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET": {
                return PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET;
            }

            case "PRICE_LIST_NOT_FOUND": {
                return PRICE_LIST_NOT_FOUND;
            }

            case "PUBLICATION_NOT_FOUND": {
                return PUBLICATION_NOT_FOUND;
            }

            case "REQUIRES_CONTEXTS_TO_ADD_OR_REMOVE": {
                return REQUIRES_CONTEXTS_TO_ADD_OR_REMOVE;
            }

            case "TAKEN": {
                return TAKEN;
            }

            case "TOO_LONG": {
                return TOO_LONG;
            }

            case "TOO_SHORT": {
                return TOO_SHORT;
            }

            case "UNSUPPORTED_CATALOG_ACTION": {
                return UNSUPPORTED_CATALOG_ACTION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case APP_CATALOG_PRICE_LIST_ASSIGNMENT: {
                return "APP_CATALOG_PRICE_LIST_ASSIGNMENT";
            }

            case BLANK: {
                return "BLANK";
            }

            case CANNOT_ADD_MORE_THAN_ONE_MARKET: {
                return "CANNOT_ADD_MORE_THAN_ONE_MARKET";
            }

            case CANNOT_CREATE_APP_CATALOG: {
                return "CANNOT_CREATE_APP_CATALOG";
            }

            case CANNOT_CREATE_MARKET_CATALOG: {
                return "CANNOT_CREATE_MARKET_CATALOG";
            }

            case CANNOT_DELETE_APP_CATALOG: {
                return "CANNOT_DELETE_APP_CATALOG";
            }

            case CANNOT_DELETE_MARKET_CATALOG: {
                return "CANNOT_DELETE_MARKET_CATALOG";
            }

            case CANNOT_MODIFY_APP_CATALOG: {
                return "CANNOT_MODIFY_APP_CATALOG";
            }

            case CANNOT_MODIFY_MARKET_CATALOG: {
                return "CANNOT_MODIFY_MARKET_CATALOG";
            }

            case CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS: {
                return "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_PRICE_BREAKS";
            }

            case CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES: {
                return "CATALOG_CONTEXT_DOES_NOT_SUPPORT_QUANTITY_RULES";
            }

            case CATALOG_FAILED_TO_SAVE: {
                return "CATALOG_FAILED_TO_SAVE";
            }

            case CATALOG_NOT_FOUND: {
                return "CATALOG_NOT_FOUND";
            }

            case COMPANY_LOCATION_CATALOG_STATUS_PLAN: {
                return "COMPANY_LOCATION_CATALOG_STATUS_PLAN";
            }

            case COMPANY_LOCATION_NOT_FOUND: {
                return "COMPANY_LOCATION_NOT_FOUND";
            }

            case CONTEXT_ALREADY_ASSIGNED_TO_CATALOG: {
                return "CONTEXT_ALREADY_ASSIGNED_TO_CATALOG";
            }

            case CONTEXT_CATALOG_LIMIT_REACHED: {
                return "CONTEXT_CATALOG_LIMIT_REACHED";
            }

            case CONTEXT_DRIVER_MISMATCH: {
                return "CONTEXT_DRIVER_MISMATCH";
            }

            case COUNTRY_PRICE_LIST_ASSIGNMENT: {
                return "COUNTRY_PRICE_LIST_ASSIGNMENT";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_CATALOG_CONTEXT_TYPE: {
                return "INVALID_CATALOG_CONTEXT_TYPE";
            }

            case MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH: {
                return "MARKET_AND_PRICE_LIST_CURRENCY_MISMATCH";
            }

            case MARKET_CATALOG_STATUS: {
                return "MARKET_CATALOG_STATUS";
            }

            case MARKET_NOT_FOUND: {
                return "MARKET_NOT_FOUND";
            }

            case MARKET_TAKEN: {
                return "MARKET_TAKEN";
            }

            case MUST_PROVIDE_EXACTLY_ONE_CONTEXT_TYPE: {
                return "MUST_PROVIDE_EXACTLY_ONE_CONTEXT_TYPE";
            }

            case PRICE_LIST_FAILED_TO_SAVE: {
                return "PRICE_LIST_FAILED_TO_SAVE";
            }

            case PRICE_LIST_LOCKED: {
                return "PRICE_LIST_LOCKED";
            }

            case PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET: {
                return "PRICE_LIST_NOT_ALLOWED_FOR_PRIMARY_MARKET";
            }

            case PRICE_LIST_NOT_FOUND: {
                return "PRICE_LIST_NOT_FOUND";
            }

            case PUBLICATION_NOT_FOUND: {
                return "PUBLICATION_NOT_FOUND";
            }

            case REQUIRES_CONTEXTS_TO_ADD_OR_REMOVE: {
                return "REQUIRES_CONTEXTS_TO_ADD_OR_REMOVE";
            }

            case TAKEN: {
                return "TAKEN";
            }

            case TOO_LONG: {
                return "TOO_LONG";
            }

            case TOO_SHORT: {
                return "TOO_SHORT";
            }

            case UNSUPPORTED_CATALOG_ACTION: {
                return "UNSUPPORTED_CATALOG_ACTION";
            }

            default: {
                return "";
            }
        }
    }
}

