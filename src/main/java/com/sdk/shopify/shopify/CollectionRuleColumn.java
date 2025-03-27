// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Specifies the attribute of a product being used to populate the smart collection.
*/
public enum CollectionRuleColumn {
    /**
    * An attribute evaluated based on the `compare_at_price` attribute of the product's variants.
    * With `is_set` relation, the rule matches products with at least one variant with `compare_at_price`
    * set.
    * With `is_not_set` relation, the rule matches matches products with at least one variant with
    * `compare_at_price` not set.
    */
    IS_PRICE_REDUCED,

    /**
    * This rule type is designed to dynamically include products in a smart collection based on their
    * category id.
    * When a specific product category is set as a condition, this rule will match products that are
    * directly assigned to the specified category.
    */
    PRODUCT_CATEGORY_ID,

    /**
    * This category includes metafield definitions that have the `useAsCollectionCondition` flag set to
    * true.
    */
    PRODUCT_METAFIELD_DEFINITION,

    /**
    * The
    * [`product_taxonomy_node_id`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-prod
    * uct-productcategory) attribute.
    */
    PRODUCT_TAXONOMY_NODE_ID,

    /**
    * The [`tag`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-product-producttype)
    * attribute.
    */
    TAG,

    /**
    * The [`title`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-product-title)
    * attribute.
    */
    TITLE,

    /**
    * The [`type`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-product-producttype)
    * attribute.
    */
    TYPE,

    /**
    * The
    * [`variant_compare_at_price`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#fie
    * ld-productvariant-compareatprice) attribute.
    */
    VARIANT_COMPARE_AT_PRICE,

    /**
    * The
    * [`variant_inventory`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-prod
    * uctvariant-inventoryquantity) attribute.
    */
    VARIANT_INVENTORY,

    /**
    * This category includes metafield definitions that have the `useAsCollectionCondition` flag set to
    * true.
    */
    VARIANT_METAFIELD_DEFINITION,

    /**
    * The
    * [`variant_price`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-productv
    * ariant-price) attribute.
    */
    VARIANT_PRICE,

    /**
    * The
    * [`variant_title`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-productv
    * ariant-title) attribute.
    */
    VARIANT_TITLE,

    /**
    * The
    * [`variant_weight`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-product
    * variant-weight) attribute.
    */
    VARIANT_WEIGHT,

    /**
    * The [`vendor`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-product-vendor)
    * attribute.
    */
    VENDOR,

    UNKNOWN_VALUE;

    public static CollectionRuleColumn fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "IS_PRICE_REDUCED": {
                return IS_PRICE_REDUCED;
            }

            case "PRODUCT_CATEGORY_ID": {
                return PRODUCT_CATEGORY_ID;
            }

            case "PRODUCT_METAFIELD_DEFINITION": {
                return PRODUCT_METAFIELD_DEFINITION;
            }

            case "PRODUCT_TAXONOMY_NODE_ID": {
                return PRODUCT_TAXONOMY_NODE_ID;
            }

            case "TAG": {
                return TAG;
            }

            case "TITLE": {
                return TITLE;
            }

            case "TYPE": {
                return TYPE;
            }

            case "VARIANT_COMPARE_AT_PRICE": {
                return VARIANT_COMPARE_AT_PRICE;
            }

            case "VARIANT_INVENTORY": {
                return VARIANT_INVENTORY;
            }

            case "VARIANT_METAFIELD_DEFINITION": {
                return VARIANT_METAFIELD_DEFINITION;
            }

            case "VARIANT_PRICE": {
                return VARIANT_PRICE;
            }

            case "VARIANT_TITLE": {
                return VARIANT_TITLE;
            }

            case "VARIANT_WEIGHT": {
                return VARIANT_WEIGHT;
            }

            case "VENDOR": {
                return VENDOR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case IS_PRICE_REDUCED: {
                return "IS_PRICE_REDUCED";
            }

            case PRODUCT_CATEGORY_ID: {
                return "PRODUCT_CATEGORY_ID";
            }

            case PRODUCT_METAFIELD_DEFINITION: {
                return "PRODUCT_METAFIELD_DEFINITION";
            }

            case PRODUCT_TAXONOMY_NODE_ID: {
                return "PRODUCT_TAXONOMY_NODE_ID";
            }

            case TAG: {
                return "TAG";
            }

            case TITLE: {
                return "TITLE";
            }

            case TYPE: {
                return "TYPE";
            }

            case VARIANT_COMPARE_AT_PRICE: {
                return "VARIANT_COMPARE_AT_PRICE";
            }

            case VARIANT_INVENTORY: {
                return "VARIANT_INVENTORY";
            }

            case VARIANT_METAFIELD_DEFINITION: {
                return "VARIANT_METAFIELD_DEFINITION";
            }

            case VARIANT_PRICE: {
                return "VARIANT_PRICE";
            }

            case VARIANT_TITLE: {
                return "VARIANT_TITLE";
            }

            case VARIANT_WEIGHT: {
                return "VARIANT_WEIGHT";
            }

            case VENDOR: {
                return "VENDOR";
            }

            default: {
                return "";
            }
        }
    }
}

