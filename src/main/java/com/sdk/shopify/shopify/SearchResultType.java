// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Specifies the type of resources to be returned from a search.
*/
public enum SearchResultType {
    /**
    * An article.
    */
    ARTICLE,

    /**
    * A balance transaction.
    */
    BALANCE_TRANSACTION,

    /**
    * A blog.
    */
    BLOG,

    COLLECTION,

    CUSTOMER,

    /**
    * A code discount redeem code.
    */
    DISCOUNT_REDEEM_CODE,

    DRAFT_ORDER,

    /**
    * A file.
    */
    FILE,

    ORDER,

    /**
    * A page.
    */
    PAGE,

    PRICE_RULE,

    PRODUCT,

    /**
    * A URL redirect.
    */
    URL_REDIRECT,

    UNKNOWN_VALUE;

    public static SearchResultType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ARTICLE": {
                return ARTICLE;
            }

            case "BALANCE_TRANSACTION": {
                return BALANCE_TRANSACTION;
            }

            case "BLOG": {
                return BLOG;
            }

            case "COLLECTION": {
                return COLLECTION;
            }

            case "CUSTOMER": {
                return CUSTOMER;
            }

            case "DISCOUNT_REDEEM_CODE": {
                return DISCOUNT_REDEEM_CODE;
            }

            case "DRAFT_ORDER": {
                return DRAFT_ORDER;
            }

            case "FILE": {
                return FILE;
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

            case "URL_REDIRECT": {
                return URL_REDIRECT;
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

            case BALANCE_TRANSACTION: {
                return "BALANCE_TRANSACTION";
            }

            case BLOG: {
                return "BLOG";
            }

            case COLLECTION: {
                return "COLLECTION";
            }

            case CUSTOMER: {
                return "CUSTOMER";
            }

            case DISCOUNT_REDEEM_CODE: {
                return "DISCOUNT_REDEEM_CODE";
            }

            case DRAFT_ORDER: {
                return "DRAFT_ORDER";
            }

            case FILE: {
                return "FILE";
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

            case URL_REDIRECT: {
                return "URL_REDIRECT";
            }

            default: {
                return "";
            }
        }
    }
}

