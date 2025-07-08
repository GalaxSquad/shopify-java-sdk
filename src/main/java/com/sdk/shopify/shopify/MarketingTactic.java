// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The available types of tactics for a marketing activity.
*/
public enum MarketingTactic {
    /**
    * An abandoned cart recovery email.
    */
    ABANDONED_CART,

    /**
    * An ad, such as a Facebook ad.
    */
    AD,

    /**
    * An affiliate link.
    */
    AFFILIATE,

    /**
    * A link.
    */
    LINK,

    /**
    * A loyalty program.
    */
    LOYALTY,

    /**
    * A messaging app, such as Facebook Messenger.
    */
    MESSAGE,

    /**
    * A newsletter.
    */
    NEWSLETTER,

    /**
    * A notification in the Shopify admin.
    */
    NOTIFICATION,

    /**
    * A blog post.
    */
    POST,

    /**
    * A retargeting ad.
    */
    RETARGETING,

    /**
    * Search engine optimization.
    */
    SEO,

    /**
    * A popup on the online store.
    */
    STOREFRONT_APP,

    /**
    * A transactional email.
    */
    TRANSACTIONAL,

    UNKNOWN_VALUE;

    public static MarketingTactic fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ABANDONED_CART": {
                return ABANDONED_CART;
            }

            case "AD": {
                return AD;
            }

            case "AFFILIATE": {
                return AFFILIATE;
            }

            case "LINK": {
                return LINK;
            }

            case "LOYALTY": {
                return LOYALTY;
            }

            case "MESSAGE": {
                return MESSAGE;
            }

            case "NEWSLETTER": {
                return NEWSLETTER;
            }

            case "NOTIFICATION": {
                return NOTIFICATION;
            }

            case "POST": {
                return POST;
            }

            case "RETARGETING": {
                return RETARGETING;
            }

            case "SEO": {
                return SEO;
            }

            case "STOREFRONT_APP": {
                return STOREFRONT_APP;
            }

            case "TRANSACTIONAL": {
                return TRANSACTIONAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ABANDONED_CART: {
                return "ABANDONED_CART";
            }

            case AD: {
                return "AD";
            }

            case AFFILIATE: {
                return "AFFILIATE";
            }

            case LINK: {
                return "LINK";
            }

            case LOYALTY: {
                return "LOYALTY";
            }

            case MESSAGE: {
                return "MESSAGE";
            }

            case NEWSLETTER: {
                return "NEWSLETTER";
            }

            case NOTIFICATION: {
                return "NOTIFICATION";
            }

            case POST: {
                return "POST";
            }

            case RETARGETING: {
                return "RETARGETING";
            }

            case SEO: {
                return "SEO";
            }

            case STOREFRONT_APP: {
                return "STOREFRONT_APP";
            }

            case TRANSACTIONAL: {
                return "TRANSACTIONAL";
            }

            default: {
                return "";
            }
        }
    }
}

