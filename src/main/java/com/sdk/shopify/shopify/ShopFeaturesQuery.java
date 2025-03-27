// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the feature set available to the shop.
* Most fields specify whether a feature is enabled for a shop, and some fields return information
* related to specific features.
*/
public class ShopFeaturesQuery extends Query<ShopFeaturesQuery> {
    ShopFeaturesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether a shop has access to Avalara AvaTax.
    */
    public ShopFeaturesQuery avalaraAvatax() {
        startField("avalaraAvatax");

        return this;
    }

    /**
    * The branding of the shop, which influences its look and feel in the Shopify admin.
    */
    public ShopFeaturesQuery branding() {
        startField("branding");

        return this;
    }

    /**
    * Represents the Bundles feature configuration for the shop.
    */
    public ShopFeaturesQuery bundles(BundlesFeatureQueryDefinition queryDef) {
        startField("bundles");

        _queryBuilder.append('{');
        queryDef.define(new BundlesFeatureQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether a shop's online store can have CAPTCHA protection.
    */
    public ShopFeaturesQuery captcha() {
        startField("captcha");

        return this;
    }

    /**
    * Represents the cart transform feature configuration for the shop.
    */
    public ShopFeaturesQuery cartTransform(CartTransformFeatureQueryDefinition queryDef) {
        startField("cartTransform");

        _queryBuilder.append('{');
        queryDef.define(new CartTransformFeatureQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether a shop has access to the Google Analytics dynamic remarketing feature.
    */
    public ShopFeaturesQuery dynamicRemarketing() {
        startField("dynamicRemarketing");

        return this;
    }

    /**
    * Whether a shop can be migrated to use Shopify subscriptions.
    */
    public ShopFeaturesQuery eligibleForSubscriptionMigration() {
        startField("eligibleForSubscriptionMigration");

        return this;
    }

    /**
    * Whether a shop is configured properly to sell subscriptions.
    */
    public ShopFeaturesQuery eligibleForSubscriptions() {
        startField("eligibleForSubscriptions");

        return this;
    }

    /**
    * Whether a shop can create gift cards.
    */
    public ShopFeaturesQuery giftCards() {
        startField("giftCards");

        return this;
    }

    /**
    * Whether a shop displays Harmonized System codes on products. This is used for customs when shipping
    * internationally.
    */
    public ShopFeaturesQuery harmonizedSystemCode() {
        startField("harmonizedSystemCode");

        return this;
    }

    /**
    * Whether a shop can enable international price overrides.
    */
    public ShopFeaturesQuery internationalPriceOverrides() {
        startField("internationalPriceOverrides");

        return this;
    }

    /**
    * Whether a shop can enable international price rules.
    */
    public ShopFeaturesQuery internationalPriceRules() {
        startField("internationalPriceRules");

        return this;
    }

    /**
    * Whether a shop has enabled a legacy subscription gateway to handle older subscriptions.
    */
    public ShopFeaturesQuery legacySubscriptionGatewayEnabled() {
        startField("legacySubscriptionGatewayEnabled");

        return this;
    }

    /**
    * Whether to show the Live View metrics in the Shopify admin. Live view is hidden from merchants that
    * are on a trial
    * or don't have a storefront.
    */
    public ShopFeaturesQuery liveView() {
        startField("liveView");

        return this;
    }

    /**
    * Whether a shop is configured to sell subscriptions with PayPal Express.
    */
    public ShopFeaturesQuery paypalExpressSubscriptionGatewayStatus() {
        startField("paypalExpressSubscriptionGatewayStatus");

        return this;
    }

    /**
    * Whether a shop has access to all reporting features.
    */
    public ShopFeaturesQuery reports() {
        startField("reports");

        return this;
    }

    /**
    * Whether a shop has ever had subscription products.
    */
    public ShopFeaturesQuery sellsSubscriptions() {
        startField("sellsSubscriptions");

        return this;
    }

    /**
    * Whether to show metrics in the Shopify admin. Metrics are hidden for new merchants until they become
    * meaningful.
    */
    public ShopFeaturesQuery showMetrics() {
        startField("showMetrics");

        return this;
    }

    /**
    * Whether a shop has an online store.
    */
    public ShopFeaturesQuery storefront() {
        startField("storefront");

        return this;
    }

    /**
    * Whether a shop is using Shopify Balance.
    */
    public ShopFeaturesQuery usingShopifyBalance() {
        startField("usingShopifyBalance");

        return this;
    }
}
