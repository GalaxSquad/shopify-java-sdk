// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* Specifies the type of resources that are translatable.
*/
public enum TranslatableResourceType {
    /**
    * A blog post. Translatable fields: `title`, `body_html`, `summary_html`, `handle`, `meta_title`,
    * `meta_description`.
    */
    ARTICLE,

    /**
    * A blog. Translatable fields: `title`, `handle`, `meta_title`, `meta_description`.
    */
    BLOG,

    /**
    * A product collection. Translatable fields: `title`, `body_html`, `handle`, `meta_title`,
    * `meta_description`.
    */
    COLLECTION,

    /**
    * The delivery method definition. For example, "Standard", or "Expedited". Translatable fields:
    * `name`.
    */
    DELIVERY_METHOD_DEFINITION,

    /**
    * An email template. Translatable fields: `title`, `body_html`.
    */
    EMAIL_TEMPLATE,

    /**
    * A filter. Translatable fields: `label`.
    */
    FILTER,

    /**
    * A link to direct users. Translatable fields: `title`.
    */
    LINK,

    /**
    * A category of links. Translatable fields: `title`.
    */
    MENU,

    /**
    * A Metafield. Translatable fields: `value`.
    */
    METAFIELD,

    /**
    * A Metaobject. Translatable fields are determined by the Metaobject type.
    */
    METAOBJECT,

    /**
    * An online store theme. Translatable fields: `dynamic keys based on theme data`.
    */
    ONLINE_STORE_THEME,

    /**
    * A theme app embed. Translatable fields: `dynamic keys based on theme data`.
    */
    ONLINE_STORE_THEME_APP_EMBED,

    /**
    * A theme json template. Translatable fields: `dynamic keys based on theme data`.
    */
    ONLINE_STORE_THEME_JSON_TEMPLATE,

    /**
    * Locale file content of an online store theme. Translatable fields: `dynamic keys based on theme
    * data`.
    */
    ONLINE_STORE_THEME_LOCALE_CONTENT,

    /**
    * A theme json section group. Translatable fields: `dynamic keys based on theme data`.
    */
    ONLINE_STORE_THEME_SECTION_GROUP,

    /**
    * A theme setting category. Translatable fields: `dynamic keys based on theme data`.
    */
    ONLINE_STORE_THEME_SETTINGS_CATEGORY,

    /**
    * Shared static sections of an online store theme. Translatable fields: `dynamic keys based on theme
    * data`.
    */
    ONLINE_STORE_THEME_SETTINGS_DATA_SECTIONS,

    /**
    * A packing slip template. Translatable fields: `body`.
    */
    PACKING_SLIP_TEMPLATE,

    /**
    * A page. Translatable fields: `title`, `body_html`, `handle`, `meta_title`, `meta_description`.
    */
    PAGE,

    /**
    * A payment gateway. Translatable fields: `name`, `message`, `before_payment_instructions`.
    */
    PAYMENT_GATEWAY,

    /**
    * An online store product. Translatable fields: `title`, `body_html`, `handle`, `product_type`,
    * `meta_title`, `meta_description`.
    */
    PRODUCT,

    /**
    * An online store custom product property name. For example, "Size", "Color", or "Material".
    * Translatable fields: `name`.
    */
    PRODUCT_OPTION,

    /**
    * The product option value names. For example, "Red", "Blue", and "Green" for a "Color" option.
    * Translatable fields: `name`.
    */
    PRODUCT_OPTION_VALUE,

    /**
    * A selling plan. Translatable fields:`name`, `option1`, `option2`, `option3`, `description`.
    */
    SELLING_PLAN,

    /**
    * A selling plan group. Translatable fields: `name`, `option1`, `option2`, `option3`.
    */
    SELLING_PLAN_GROUP,

    /**
    * A shop. Translatable fields: `meta_title`, `meta_description`.
    */
    SHOP,

    /**
    * A shop policy. Translatable fields: `body`.
    */
    SHOP_POLICY,

    UNKNOWN_VALUE;

    public static TranslatableResourceType fromGraphQl(String value) {
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

            case "DELIVERY_METHOD_DEFINITION": {
                return DELIVERY_METHOD_DEFINITION;
            }

            case "EMAIL_TEMPLATE": {
                return EMAIL_TEMPLATE;
            }

            case "FILTER": {
                return FILTER;
            }

            case "LINK": {
                return LINK;
            }

            case "MENU": {
                return MENU;
            }

            case "METAFIELD": {
                return METAFIELD;
            }

            case "METAOBJECT": {
                return METAOBJECT;
            }

            case "ONLINE_STORE_THEME": {
                return ONLINE_STORE_THEME;
            }

            case "ONLINE_STORE_THEME_APP_EMBED": {
                return ONLINE_STORE_THEME_APP_EMBED;
            }

            case "ONLINE_STORE_THEME_JSON_TEMPLATE": {
                return ONLINE_STORE_THEME_JSON_TEMPLATE;
            }

            case "ONLINE_STORE_THEME_LOCALE_CONTENT": {
                return ONLINE_STORE_THEME_LOCALE_CONTENT;
            }

            case "ONLINE_STORE_THEME_SECTION_GROUP": {
                return ONLINE_STORE_THEME_SECTION_GROUP;
            }

            case "ONLINE_STORE_THEME_SETTINGS_CATEGORY": {
                return ONLINE_STORE_THEME_SETTINGS_CATEGORY;
            }

            case "ONLINE_STORE_THEME_SETTINGS_DATA_SECTIONS": {
                return ONLINE_STORE_THEME_SETTINGS_DATA_SECTIONS;
            }

            case "PACKING_SLIP_TEMPLATE": {
                return PACKING_SLIP_TEMPLATE;
            }

            case "PAGE": {
                return PAGE;
            }

            case "PAYMENT_GATEWAY": {
                return PAYMENT_GATEWAY;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            case "PRODUCT_OPTION": {
                return PRODUCT_OPTION;
            }

            case "PRODUCT_OPTION_VALUE": {
                return PRODUCT_OPTION_VALUE;
            }

            case "SELLING_PLAN": {
                return SELLING_PLAN;
            }

            case "SELLING_PLAN_GROUP": {
                return SELLING_PLAN_GROUP;
            }

            case "SHOP": {
                return SHOP;
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

            case COLLECTION: {
                return "COLLECTION";
            }

            case DELIVERY_METHOD_DEFINITION: {
                return "DELIVERY_METHOD_DEFINITION";
            }

            case EMAIL_TEMPLATE: {
                return "EMAIL_TEMPLATE";
            }

            case FILTER: {
                return "FILTER";
            }

            case LINK: {
                return "LINK";
            }

            case MENU: {
                return "MENU";
            }

            case METAFIELD: {
                return "METAFIELD";
            }

            case METAOBJECT: {
                return "METAOBJECT";
            }

            case ONLINE_STORE_THEME: {
                return "ONLINE_STORE_THEME";
            }

            case ONLINE_STORE_THEME_APP_EMBED: {
                return "ONLINE_STORE_THEME_APP_EMBED";
            }

            case ONLINE_STORE_THEME_JSON_TEMPLATE: {
                return "ONLINE_STORE_THEME_JSON_TEMPLATE";
            }

            case ONLINE_STORE_THEME_LOCALE_CONTENT: {
                return "ONLINE_STORE_THEME_LOCALE_CONTENT";
            }

            case ONLINE_STORE_THEME_SECTION_GROUP: {
                return "ONLINE_STORE_THEME_SECTION_GROUP";
            }

            case ONLINE_STORE_THEME_SETTINGS_CATEGORY: {
                return "ONLINE_STORE_THEME_SETTINGS_CATEGORY";
            }

            case ONLINE_STORE_THEME_SETTINGS_DATA_SECTIONS: {
                return "ONLINE_STORE_THEME_SETTINGS_DATA_SECTIONS";
            }

            case PACKING_SLIP_TEMPLATE: {
                return "PACKING_SLIP_TEMPLATE";
            }

            case PAGE: {
                return "PAGE";
            }

            case PAYMENT_GATEWAY: {
                return "PAYMENT_GATEWAY";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            case PRODUCT_OPTION: {
                return "PRODUCT_OPTION";
            }

            case PRODUCT_OPTION_VALUE: {
                return "PRODUCT_OPTION_VALUE";
            }

            case SELLING_PLAN: {
                return "SELLING_PLAN";
            }

            case SELLING_PLAN_GROUP: {
                return "SELLING_PLAN_GROUP";
            }

            case SHOP: {
                return "SHOP";
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

