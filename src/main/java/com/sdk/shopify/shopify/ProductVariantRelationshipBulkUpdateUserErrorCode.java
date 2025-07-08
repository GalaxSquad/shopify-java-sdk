// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Possible error codes that can be returned by `ProductVariantRelationshipBulkUpdateUserError`.
*/
public enum ProductVariantRelationshipBulkUpdateUserErrorCode {
    /**
    * Combined listing cannot be child product variants.
    */
    CHILD_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING,

    /**
    * A parent product variant cannot contain itself as a component.
    */
    CIRCULAR_REFERENCE,

    /**
    * A parent product variant must not contain duplicate product variant relationships.
    */
    DUPLICATE_PRODUCT_VARIANT_RELATIONSHIP,

    /**
    * Exceeded the maximum allowable product variant relationships in a parent product variant.
    */
    EXCEEDED_PRODUCT_VARIANT_RELATIONSHIP_LIMIT,

    /**
    * Unable to create parent product variant.
    */
    FAILED_TO_CREATE,

    /**
    * Unable to remove product variant relationships.
    */
    FAILED_TO_REMOVE,

    /**
    * Unable to update product variant relationships.
    */
    FAILED_TO_UPDATE,

    /**
    * Unable to update parent product variant price.
    */
    FAILED_TO_UPDATE_PARENT_PRODUCT_VARIANT_PRICE,

    /**
    * Product variant relationships must have a quantity greater than 0.
    */
    INVALID_QUANTITY,

    /**
    * The product variant relationships to remove must be specified if all the parent product variant's
    * components aren't being removed.
    */
    MUST_SPECIFY_COMPONENTS,

    /**
    * Nested parent product variants aren't supported.
    */
    NESTED_PARENT_PRODUCT_VARIANT,

    /**
    * Combined listing cannot be parent product variants.
    */
    PARENT_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING,

    /**
    * Gift cards cannot be parent product variants.
    */
    PARENT_PRODUCT_VARIANT_CANNOT_BE_GIFT_CARD,

    /**
    * Parent product variants cannot require a selling plan.
    */
    PARENT_PRODUCT_VARIANT_CANNOT_REQUIRE_SELLING_PLAN,

    /**
    * A parent product variant ID or product ID must be provided.
    */
    PARENT_REQUIRED,

    /**
    * The products for these product variants are already owned by another App.
    */
    PRODUCT_EXPANDER_APP_OWNERSHIP_ALREADY_EXISTS,

    /**
    * Some of the provided product variants are not components of the specified parent product variant.
    */
    PRODUCT_VARIANTS_NOT_COMPONENTS,

    /**
    * The product variants were not found.
    */
    PRODUCT_VARIANTS_NOT_FOUND,

    /**
    * A Core type relationship cannot be added to a composite product variant with SFN type relationships.
    */
    PRODUCT_VARIANT_RELATIONSHIP_TYPE_CONFLICT,

    /**
    * Unexpected error.
    */
    UNEXPECTED_ERROR,

    /**
    * Multipack bundles are not supported.
    */
    UNSUPPORTED_MULTIPACK_RELATIONSHIP,

    /**
    * A price must be provided for a parent product variant if the price calucation is set to fixed.
    */
    UPDATE_PARENT_VARIANT_PRICE_REQUIRED,

    UNKNOWN_VALUE;

    public static ProductVariantRelationshipBulkUpdateUserErrorCode fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CHILD_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING": {
                return CHILD_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING;
            }

            case "CIRCULAR_REFERENCE": {
                return CIRCULAR_REFERENCE;
            }

            case "DUPLICATE_PRODUCT_VARIANT_RELATIONSHIP": {
                return DUPLICATE_PRODUCT_VARIANT_RELATIONSHIP;
            }

            case "EXCEEDED_PRODUCT_VARIANT_RELATIONSHIP_LIMIT": {
                return EXCEEDED_PRODUCT_VARIANT_RELATIONSHIP_LIMIT;
            }

            case "FAILED_TO_CREATE": {
                return FAILED_TO_CREATE;
            }

            case "FAILED_TO_REMOVE": {
                return FAILED_TO_REMOVE;
            }

            case "FAILED_TO_UPDATE": {
                return FAILED_TO_UPDATE;
            }

            case "FAILED_TO_UPDATE_PARENT_PRODUCT_VARIANT_PRICE": {
                return FAILED_TO_UPDATE_PARENT_PRODUCT_VARIANT_PRICE;
            }

            case "INVALID_QUANTITY": {
                return INVALID_QUANTITY;
            }

            case "MUST_SPECIFY_COMPONENTS": {
                return MUST_SPECIFY_COMPONENTS;
            }

            case "NESTED_PARENT_PRODUCT_VARIANT": {
                return NESTED_PARENT_PRODUCT_VARIANT;
            }

            case "PARENT_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING": {
                return PARENT_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING;
            }

            case "PARENT_PRODUCT_VARIANT_CANNOT_BE_GIFT_CARD": {
                return PARENT_PRODUCT_VARIANT_CANNOT_BE_GIFT_CARD;
            }

            case "PARENT_PRODUCT_VARIANT_CANNOT_REQUIRE_SELLING_PLAN": {
                return PARENT_PRODUCT_VARIANT_CANNOT_REQUIRE_SELLING_PLAN;
            }

            case "PARENT_REQUIRED": {
                return PARENT_REQUIRED;
            }

            case "PRODUCT_EXPANDER_APP_OWNERSHIP_ALREADY_EXISTS": {
                return PRODUCT_EXPANDER_APP_OWNERSHIP_ALREADY_EXISTS;
            }

            case "PRODUCT_VARIANTS_NOT_COMPONENTS": {
                return PRODUCT_VARIANTS_NOT_COMPONENTS;
            }

            case "PRODUCT_VARIANTS_NOT_FOUND": {
                return PRODUCT_VARIANTS_NOT_FOUND;
            }

            case "PRODUCT_VARIANT_RELATIONSHIP_TYPE_CONFLICT": {
                return PRODUCT_VARIANT_RELATIONSHIP_TYPE_CONFLICT;
            }

            case "UNEXPECTED_ERROR": {
                return UNEXPECTED_ERROR;
            }

            case "UNSUPPORTED_MULTIPACK_RELATIONSHIP": {
                return UNSUPPORTED_MULTIPACK_RELATIONSHIP;
            }

            case "UPDATE_PARENT_VARIANT_PRICE_REQUIRED": {
                return UPDATE_PARENT_VARIANT_PRICE_REQUIRED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CHILD_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING: {
                return "CHILD_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING";
            }

            case CIRCULAR_REFERENCE: {
                return "CIRCULAR_REFERENCE";
            }

            case DUPLICATE_PRODUCT_VARIANT_RELATIONSHIP: {
                return "DUPLICATE_PRODUCT_VARIANT_RELATIONSHIP";
            }

            case EXCEEDED_PRODUCT_VARIANT_RELATIONSHIP_LIMIT: {
                return "EXCEEDED_PRODUCT_VARIANT_RELATIONSHIP_LIMIT";
            }

            case FAILED_TO_CREATE: {
                return "FAILED_TO_CREATE";
            }

            case FAILED_TO_REMOVE: {
                return "FAILED_TO_REMOVE";
            }

            case FAILED_TO_UPDATE: {
                return "FAILED_TO_UPDATE";
            }

            case FAILED_TO_UPDATE_PARENT_PRODUCT_VARIANT_PRICE: {
                return "FAILED_TO_UPDATE_PARENT_PRODUCT_VARIANT_PRICE";
            }

            case INVALID_QUANTITY: {
                return "INVALID_QUANTITY";
            }

            case MUST_SPECIFY_COMPONENTS: {
                return "MUST_SPECIFY_COMPONENTS";
            }

            case NESTED_PARENT_PRODUCT_VARIANT: {
                return "NESTED_PARENT_PRODUCT_VARIANT";
            }

            case PARENT_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING: {
                return "PARENT_PRODUCT_VARIANT_CANNOT_BE_COMBINED_LISTING";
            }

            case PARENT_PRODUCT_VARIANT_CANNOT_BE_GIFT_CARD: {
                return "PARENT_PRODUCT_VARIANT_CANNOT_BE_GIFT_CARD";
            }

            case PARENT_PRODUCT_VARIANT_CANNOT_REQUIRE_SELLING_PLAN: {
                return "PARENT_PRODUCT_VARIANT_CANNOT_REQUIRE_SELLING_PLAN";
            }

            case PARENT_REQUIRED: {
                return "PARENT_REQUIRED";
            }

            case PRODUCT_EXPANDER_APP_OWNERSHIP_ALREADY_EXISTS: {
                return "PRODUCT_EXPANDER_APP_OWNERSHIP_ALREADY_EXISTS";
            }

            case PRODUCT_VARIANTS_NOT_COMPONENTS: {
                return "PRODUCT_VARIANTS_NOT_COMPONENTS";
            }

            case PRODUCT_VARIANTS_NOT_FOUND: {
                return "PRODUCT_VARIANTS_NOT_FOUND";
            }

            case PRODUCT_VARIANT_RELATIONSHIP_TYPE_CONFLICT: {
                return "PRODUCT_VARIANT_RELATIONSHIP_TYPE_CONFLICT";
            }

            case UNEXPECTED_ERROR: {
                return "UNEXPECTED_ERROR";
            }

            case UNSUPPORTED_MULTIPACK_RELATIONSHIP: {
                return "UNSUPPORTED_MULTIPACK_RELATIONSHIP";
            }

            case UPDATE_PARENT_VARIANT_PRICE_REQUIRED: {
                return "UPDATE_PARENT_VARIANT_PRICE_REQUIRED";
            }

            default: {
                return "";
            }
        }
    }
}

