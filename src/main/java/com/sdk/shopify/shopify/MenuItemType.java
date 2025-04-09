// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

/**
* A menu item type.
*/
public enum MenuItemType {
    /**
    * The article menu item type.
    */
    ARTICLE,

    /**
    * The blog menu item type.
    */
    BLOG,

    /**
    * The catalog menu item type.
    */
    CATALOG,

    /**
    * The collection menu item type.
    */
    COLLECTION,

    /**
    * The collections menu item type.
    */
    COLLECTIONS,

    /**
    * The customer_account_page menu item type.
    */
    CUSTOMER_ACCOUNT_PAGE,

    /**
    * The frontpage menu item type.
    */
    FRONTPAGE,

    /**
    * The http menu item type.
    */
    HTTP,

    /**
    * The metaobject menu item type.
    */
    METAOBJECT,

    /**
    * The page menu item type.
    */
    PAGE,

    /**
    * The product menu item type.
    */
    PRODUCT,

    /**
    * The search menu item type.
    */
    SEARCH,

    /**
    * The shop_policy menu item type.
    */
    SHOP_POLICY,

    UNKNOWN_VALUE;

    public static MenuItemType fromGraphQl(String value) {
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

            case "CATALOG": {
                return CATALOG;
            }

            case "COLLECTION": {
                return COLLECTION;
            }

            case "COLLECTIONS": {
                return COLLECTIONS;
            }

            case "CUSTOMER_ACCOUNT_PAGE": {
                return CUSTOMER_ACCOUNT_PAGE;
            }

            case "FRONTPAGE": {
                return FRONTPAGE;
            }

            case "HTTP": {
                return HTTP;
            }

            case "METAOBJECT": {
                return METAOBJECT;
            }

            case "PAGE": {
                return PAGE;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            case "SEARCH": {
                return SEARCH;
            }

            case "SHOP_POLICY": {
                return SHOP_POLICY;
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

            case CATALOG: {
                return "CATALOG";
            }

            case COLLECTION: {
                return "COLLECTION";
            }

            case COLLECTIONS: {
                return "COLLECTIONS";
            }

            case CUSTOMER_ACCOUNT_PAGE: {
                return "CUSTOMER_ACCOUNT_PAGE";
            }

            case FRONTPAGE: {
                return "FRONTPAGE";
            }

            case HTTP: {
                return "HTTP";
            }

            case METAOBJECT: {
                return "METAOBJECT";
            }

            case PAGE: {
                return "PAGE";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            case SEARCH: {
                return "SEARCH";
            }

            case SHOP_POLICY: {
                return "SHOP_POLICY";
            }

            default: {
                return "";
            }
        }
    }
}

