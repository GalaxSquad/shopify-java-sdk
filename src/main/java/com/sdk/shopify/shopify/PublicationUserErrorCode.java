// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `PublicationUserError`.
*/
public enum PublicationUserErrorCode {
    /**
    * The input value is blank.
    */
    BLANK,

    /**
    * Cannot modify a catalog for an app.
    */
    CANNOT_MODIFY_APP_CATALOG,

    /**
    * Can't modify a publication that belongs to an app catalog.
    */
    CANNOT_MODIFY_APP_CATALOG_PUBLICATION,

    /**
    * Cannot modify a catalog for a market.
    */
    CANNOT_MODIFY_MARKET_CATALOG,

    /**
    * Can't modify a publication that belongs to a market catalog.
    */
    CANNOT_MODIFY_MARKET_CATALOG_PUBLICATION,

    /**
    * Catalog does not exist.
    */
    CATALOG_NOT_FOUND,

    /**
    * The input value is invalid.
    */
    INVALID,

    /**
    * Publishable ID not found.
    */
    INVALID_PUBLISHABLE_ID,

    /**
    * Market does not exist.
    */
    MARKET_NOT_FOUND,

    /**
    * A product publication cannot be created because the catalog type associated with this publication
    * does not permit publications of this product type.
    */
    PRODUCT_TYPE_INCOMPATIBLE_WITH_CATALOG_TYPE,

    /**
    * The publication is currently being modified. Please try again later.
    */
    PUBLICATION_LOCKED,

    /**
    * Publication not found.
    */
    PUBLICATION_NOT_FOUND,

    /**
    * The limit for simultaneous publication updates has been exceeded.
    */
    PUBLICATION_UPDATE_LIMIT_EXCEEDED,

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
    * Can't perform this action on a publication.
    */
    UNSUPPORTED_PUBLICATION_ACTION,

    /**
    * A catalog publication can only contain products.
    */
    UNSUPPORTED_PUBLISHABLE_TYPE,

    UNKNOWN_VALUE;

    public static PublicationUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BLANK": {
                return BLANK;
            }

            case "CANNOT_MODIFY_APP_CATALOG": {
                return CANNOT_MODIFY_APP_CATALOG;
            }

            case "CANNOT_MODIFY_APP_CATALOG_PUBLICATION": {
                return CANNOT_MODIFY_APP_CATALOG_PUBLICATION;
            }

            case "CANNOT_MODIFY_MARKET_CATALOG": {
                return CANNOT_MODIFY_MARKET_CATALOG;
            }

            case "CANNOT_MODIFY_MARKET_CATALOG_PUBLICATION": {
                return CANNOT_MODIFY_MARKET_CATALOG_PUBLICATION;
            }

            case "CATALOG_NOT_FOUND": {
                return CATALOG_NOT_FOUND;
            }

            case "INVALID": {
                return INVALID;
            }

            case "INVALID_PUBLISHABLE_ID": {
                return INVALID_PUBLISHABLE_ID;
            }

            case "MARKET_NOT_FOUND": {
                return MARKET_NOT_FOUND;
            }

            case "PRODUCT_TYPE_INCOMPATIBLE_WITH_CATALOG_TYPE": {
                return PRODUCT_TYPE_INCOMPATIBLE_WITH_CATALOG_TYPE;
            }

            case "PUBLICATION_LOCKED": {
                return PUBLICATION_LOCKED;
            }

            case "PUBLICATION_NOT_FOUND": {
                return PUBLICATION_NOT_FOUND;
            }

            case "PUBLICATION_UPDATE_LIMIT_EXCEEDED": {
                return PUBLICATION_UPDATE_LIMIT_EXCEEDED;
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

            case "UNSUPPORTED_PUBLICATION_ACTION": {
                return UNSUPPORTED_PUBLICATION_ACTION;
            }

            case "UNSUPPORTED_PUBLISHABLE_TYPE": {
                return UNSUPPORTED_PUBLISHABLE_TYPE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BLANK: {
                return "BLANK";
            }

            case CANNOT_MODIFY_APP_CATALOG: {
                return "CANNOT_MODIFY_APP_CATALOG";
            }

            case CANNOT_MODIFY_APP_CATALOG_PUBLICATION: {
                return "CANNOT_MODIFY_APP_CATALOG_PUBLICATION";
            }

            case CANNOT_MODIFY_MARKET_CATALOG: {
                return "CANNOT_MODIFY_MARKET_CATALOG";
            }

            case CANNOT_MODIFY_MARKET_CATALOG_PUBLICATION: {
                return "CANNOT_MODIFY_MARKET_CATALOG_PUBLICATION";
            }

            case CATALOG_NOT_FOUND: {
                return "CATALOG_NOT_FOUND";
            }

            case INVALID: {
                return "INVALID";
            }

            case INVALID_PUBLISHABLE_ID: {
                return "INVALID_PUBLISHABLE_ID";
            }

            case MARKET_NOT_FOUND: {
                return "MARKET_NOT_FOUND";
            }

            case PRODUCT_TYPE_INCOMPATIBLE_WITH_CATALOG_TYPE: {
                return "PRODUCT_TYPE_INCOMPATIBLE_WITH_CATALOG_TYPE";
            }

            case PUBLICATION_LOCKED: {
                return "PUBLICATION_LOCKED";
            }

            case PUBLICATION_NOT_FOUND: {
                return "PUBLICATION_NOT_FOUND";
            }

            case PUBLICATION_UPDATE_LIMIT_EXCEEDED: {
                return "PUBLICATION_UPDATE_LIMIT_EXCEEDED";
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

            case UNSUPPORTED_PUBLICATION_ACTION: {
                return "UNSUPPORTED_PUBLICATION_ACTION";
            }

            case UNSUPPORTED_PUBLISHABLE_TYPE: {
                return "UNSUPPORTED_PUBLISHABLE_TYPE";
            }

            default: {
                return "";
            }
        }
    }
}

