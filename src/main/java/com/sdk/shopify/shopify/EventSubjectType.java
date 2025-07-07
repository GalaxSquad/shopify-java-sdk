// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The type of the resource that generated the event.
*/
public enum EventSubjectType {
    /**
    * A Article resource generated the event.
    */
    ARTICLE,

    /**
    * A Blog resource generated the event.
    */
    BLOG,

    /**
    * A Collection resource generated the event.
    */
    COLLECTION,

    /**
    * A Comment resource generated the event.
    */
    COMMENT,

    /**
    * A Company resource generated the event.
    */
    COMPANY,

    /**
    * A CompanyLocation resource generated the event.
    */
    COMPANY_LOCATION,

    /**
    * A Customer resource generated the event.
    */
    CUSTOMER,

    /**
    * A DiscountAutomaticBxgy resource generated the event.
    */
    DISCOUNT_AUTOMATIC_BXGY,

    /**
    * A DiscountAutomaticNode resource generated the event.
    */
    DISCOUNT_AUTOMATIC_NODE,

    /**
    * A DiscountCodeNode resource generated the event.
    */
    DISCOUNT_CODE_NODE,

    /**
    * A DiscountNode resource generated the event.
    */
    DISCOUNT_NODE,

    /**
    * A DraftOrder resource generated the event.
    */
    DRAFT_ORDER,

    /**
    * A InventoryTransfer resource generated the event.
    */
    INVENTORY_TRANSFER,

    /**
    * A Order resource generated the event.
    */
    ORDER,

    /**
    * A Page resource generated the event.
    */
    PAGE,

    /**
    * A PriceRule resource generated the event.
    */
    PRICE_RULE,

    /**
    * A Product resource generated the event.
    */
    PRODUCT,

    /**
    * A ProductVariant resource generated the event.
    */
    PRODUCT_VARIANT,

    /**
    * Subject type is not available. This usually means that the subject isn't available in the current
    * version of the API, using a newer API version may resolve this.
    */
    UNKNOWN,

    UNKNOWN_VALUE;

    public static EventSubjectType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ARTICLE": {
                return ARTICLE;
            }

            case "BLOG": {
                return BLOG;
            }

            case "COLLECTION": {
                return COLLECTION;
            }

            case "COMMENT": {
                return COMMENT;
            }

            case "COMPANY": {
                return COMPANY;
            }

            case "COMPANY_LOCATION": {
                return COMPANY_LOCATION;
            }

            case "CUSTOMER": {
                return CUSTOMER;
            }

            case "DISCOUNT_AUTOMATIC_BXGY": {
                return DISCOUNT_AUTOMATIC_BXGY;
            }

            case "DISCOUNT_AUTOMATIC_NODE": {
                return DISCOUNT_AUTOMATIC_NODE;
            }

            case "DISCOUNT_CODE_NODE": {
                return DISCOUNT_CODE_NODE;
            }

            case "DISCOUNT_NODE": {
                return DISCOUNT_NODE;
            }

            case "DRAFT_ORDER": {
                return DRAFT_ORDER;
            }

            case "INVENTORY_TRANSFER": {
                return INVENTORY_TRANSFER;
            }

            case "ORDER": {
                return ORDER;
            }

            case "PAGE": {
                return PAGE;
            }

            case "PRICE_RULE": {
                return PRICE_RULE;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            case "PRODUCT_VARIANT": {
                return PRODUCT_VARIANT;
            }

            case "UNKNOWN": {
                return UNKNOWN;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ARTICLE: {
                return "ARTICLE";
            }

            case BLOG: {
                return "BLOG";
            }

            case COLLECTION: {
                return "COLLECTION";
            }

            case COMMENT: {
                return "COMMENT";
            }

            case COMPANY: {
                return "COMPANY";
            }

            case COMPANY_LOCATION: {
                return "COMPANY_LOCATION";
            }

            case CUSTOMER: {
                return "CUSTOMER";
            }

            case DISCOUNT_AUTOMATIC_BXGY: {
                return "DISCOUNT_AUTOMATIC_BXGY";
            }

            case DISCOUNT_AUTOMATIC_NODE: {
                return "DISCOUNT_AUTOMATIC_NODE";
            }

            case DISCOUNT_CODE_NODE: {
                return "DISCOUNT_CODE_NODE";
            }

            case DISCOUNT_NODE: {
                return "DISCOUNT_NODE";
            }

            case DRAFT_ORDER: {
                return "DRAFT_ORDER";
            }

            case INVENTORY_TRANSFER: {
                return "INVENTORY_TRANSFER";
            }

            case ORDER: {
                return "ORDER";
            }

            case PAGE: {
                return "PAGE";
            }

            case PRICE_RULE: {
                return "PRICE_RULE";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            case PRODUCT_VARIANT: {
                return "PRODUCT_VARIANT";
            }

            case UNKNOWN: {
                return "UNKNOWN";
            }

            default: {
                return "";
            }
        }
    }
}

