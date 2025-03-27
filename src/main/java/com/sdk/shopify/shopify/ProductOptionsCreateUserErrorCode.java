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
* Possible error codes that can be returned by `ProductOptionsCreateUserError`.
*/
public enum ProductOptionsCreateUserErrorCode {
    /**
    * Cannot combine linked metafield and option values.
    */
    CANNOT_COMBINE_LINKED_METAFIELD_AND_OPTION_VALUES,

    /**
    * At least one of the product variants has invalid SKUs.
    */
    CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU,

    /**
    * Duplicated option name.
    */
    DUPLICATED_OPTION_NAME,

    /**
    * Duplicated option value.
    */
    DUPLICATED_OPTION_VALUE,

    /**
    * Cannot link multiple options to the same metafield.
    */
    DUPLICATE_LINKED_OPTION,

    /**
    * Invalid metafield value for linked option.
    */
    INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION,

    /**
    * The name provided is not valid.
    */
    INVALID_NAME,

    /**
    * No valid metafield definition found for linked option.
    */
    LINKED_METAFIELD_DEFINITION_NOT_FOUND,

    /**
    * Cannot specify 'linkedMetafieldValue' for an option that is not linked to a metafield.
    */
    LINKED_METAFIELD_VALUE_WITHOUT_LINKED_OPTION,

    /**
    * Linked options are currently not supported for this shop.
    */
    LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP,

    /**
    * Missing metafield values for linked option.
    */
    MISSING_METAFIELD_VALUES_FOR_LINKED_OPTION,

    /**
    * Cannot create new options without values for all existing variants.
    */
    NEW_OPTION_WITHOUT_VALUE_FOR_EXISTING_VARIANTS,

    /**
    * Options count is over the allowed limit.
    */
    OPTIONS_OVER_LIMIT,

    /**
    * Option already exists.
    */
    OPTION_ALREADY_EXISTS,

    /**
    * An option linked to the provided metafield already exists.
    */
    OPTION_LINKED_METAFIELD_ALREADY_TAKEN,

    /**
    * Each option must have a name specified.
    */
    OPTION_NAME_MISSING,

    /**
    * If specified, position field must be present in all option inputs.
    */
    OPTION_POSITION_MISSING,

    /**
    * Each option must have at least one option value specified.
    */
    OPTION_VALUES_MISSING,

    /**
    * Option values count is over the allowed limit.
    */
    OPTION_VALUES_OVER_LIMIT,

    /**
    * Position must be between 1 and the maximum number of options per product.
    */
    POSITION_OUT_OF_BOUNDS,

    /**
    * Product does not exist.
    */
    PRODUCT_DOES_NOT_EXIST,

    /**
    * Product is suspended.
    */
    PRODUCT_SUSPENDED,

    /**
    * The number of option values created with the CREATE strategy would exceed the variant limit.
    */
    TOO_MANY_VARIANTS_CREATED,

    /**
    * Operation is not supported for a combined listing parent product.
    */
    UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION,

    UNKNOWN_VALUE;

    public static ProductOptionsCreateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CANNOT_COMBINE_LINKED_METAFIELD_AND_OPTION_VALUES": {
                return CANNOT_COMBINE_LINKED_METAFIELD_AND_OPTION_VALUES;
            }

            case "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU": {
                return CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU;
            }

            case "DUPLICATED_OPTION_NAME": {
                return DUPLICATED_OPTION_NAME;
            }

            case "DUPLICATED_OPTION_VALUE": {
                return DUPLICATED_OPTION_VALUE;
            }

            case "DUPLICATE_LINKED_OPTION": {
                return DUPLICATE_LINKED_OPTION;
            }

            case "INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION": {
                return INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION;
            }

            case "INVALID_NAME": {
                return INVALID_NAME;
            }

            case "LINKED_METAFIELD_DEFINITION_NOT_FOUND": {
                return LINKED_METAFIELD_DEFINITION_NOT_FOUND;
            }

            case "LINKED_METAFIELD_VALUE_WITHOUT_LINKED_OPTION": {
                return LINKED_METAFIELD_VALUE_WITHOUT_LINKED_OPTION;
            }

            case "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP": {
                return LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP;
            }

            case "MISSING_METAFIELD_VALUES_FOR_LINKED_OPTION": {
                return MISSING_METAFIELD_VALUES_FOR_LINKED_OPTION;
            }

            case "NEW_OPTION_WITHOUT_VALUE_FOR_EXISTING_VARIANTS": {
                return NEW_OPTION_WITHOUT_VALUE_FOR_EXISTING_VARIANTS;
            }

            case "OPTIONS_OVER_LIMIT": {
                return OPTIONS_OVER_LIMIT;
            }

            case "OPTION_ALREADY_EXISTS": {
                return OPTION_ALREADY_EXISTS;
            }

            case "OPTION_LINKED_METAFIELD_ALREADY_TAKEN": {
                return OPTION_LINKED_METAFIELD_ALREADY_TAKEN;
            }

            case "OPTION_NAME_MISSING": {
                return OPTION_NAME_MISSING;
            }

            case "OPTION_POSITION_MISSING": {
                return OPTION_POSITION_MISSING;
            }

            case "OPTION_VALUES_MISSING": {
                return OPTION_VALUES_MISSING;
            }

            case "OPTION_VALUES_OVER_LIMIT": {
                return OPTION_VALUES_OVER_LIMIT;
            }

            case "POSITION_OUT_OF_BOUNDS": {
                return POSITION_OUT_OF_BOUNDS;
            }

            case "PRODUCT_DOES_NOT_EXIST": {
                return PRODUCT_DOES_NOT_EXIST;
            }

            case "PRODUCT_SUSPENDED": {
                return PRODUCT_SUSPENDED;
            }

            case "TOO_MANY_VARIANTS_CREATED": {
                return TOO_MANY_VARIANTS_CREATED;
            }

            case "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION": {
                return UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CANNOT_COMBINE_LINKED_METAFIELD_AND_OPTION_VALUES: {
                return "CANNOT_COMBINE_LINKED_METAFIELD_AND_OPTION_VALUES";
            }

            case CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU: {
                return "CANNOT_MAKE_CHANGES_IF_VARIANT_IS_MISSING_REQUIRED_SKU";
            }

            case DUPLICATED_OPTION_NAME: {
                return "DUPLICATED_OPTION_NAME";
            }

            case DUPLICATED_OPTION_VALUE: {
                return "DUPLICATED_OPTION_VALUE";
            }

            case DUPLICATE_LINKED_OPTION: {
                return "DUPLICATE_LINKED_OPTION";
            }

            case INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION: {
                return "INVALID_METAFIELD_VALUE_FOR_LINKED_OPTION";
            }

            case INVALID_NAME: {
                return "INVALID_NAME";
            }

            case LINKED_METAFIELD_DEFINITION_NOT_FOUND: {
                return "LINKED_METAFIELD_DEFINITION_NOT_FOUND";
            }

            case LINKED_METAFIELD_VALUE_WITHOUT_LINKED_OPTION: {
                return "LINKED_METAFIELD_VALUE_WITHOUT_LINKED_OPTION";
            }

            case LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP: {
                return "LINKED_OPTIONS_NOT_SUPPORTED_FOR_SHOP";
            }

            case MISSING_METAFIELD_VALUES_FOR_LINKED_OPTION: {
                return "MISSING_METAFIELD_VALUES_FOR_LINKED_OPTION";
            }

            case NEW_OPTION_WITHOUT_VALUE_FOR_EXISTING_VARIANTS: {
                return "NEW_OPTION_WITHOUT_VALUE_FOR_EXISTING_VARIANTS";
            }

            case OPTIONS_OVER_LIMIT: {
                return "OPTIONS_OVER_LIMIT";
            }

            case OPTION_ALREADY_EXISTS: {
                return "OPTION_ALREADY_EXISTS";
            }

            case OPTION_LINKED_METAFIELD_ALREADY_TAKEN: {
                return "OPTION_LINKED_METAFIELD_ALREADY_TAKEN";
            }

            case OPTION_NAME_MISSING: {
                return "OPTION_NAME_MISSING";
            }

            case OPTION_POSITION_MISSING: {
                return "OPTION_POSITION_MISSING";
            }

            case OPTION_VALUES_MISSING: {
                return "OPTION_VALUES_MISSING";
            }

            case OPTION_VALUES_OVER_LIMIT: {
                return "OPTION_VALUES_OVER_LIMIT";
            }

            case POSITION_OUT_OF_BOUNDS: {
                return "POSITION_OUT_OF_BOUNDS";
            }

            case PRODUCT_DOES_NOT_EXIST: {
                return "PRODUCT_DOES_NOT_EXIST";
            }

            case PRODUCT_SUSPENDED: {
                return "PRODUCT_SUSPENDED";
            }

            case TOO_MANY_VARIANTS_CREATED: {
                return "TOO_MANY_VARIANTS_CREATED";
            }

            case UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION: {
                return "UNSUPPORTED_COMBINED_LISTING_PARENT_OPERATION";
            }

            default: {
                return "";
            }
        }
    }
}

