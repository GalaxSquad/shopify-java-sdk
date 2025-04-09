// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the feature set available to the shop.
* Most fields specify whether a feature is enabled for a shop, and some fields return information
* related to specific features.
*/
public class ShopFeatures extends AbstractResponse<ShopFeatures> {
    public ShopFeatures() {
    }

    public ShopFeatures(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "avalaraAvatax": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "branding": {
                    responseData.put(key, ShopBranding.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "bundles": {
                    responseData.put(key, new BundlesFeature(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "captcha": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "cartTransform": {
                    responseData.put(key, new CartTransformFeature(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "dynamicRemarketing": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "eligibleForSubscriptionMigration": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "eligibleForSubscriptions": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "giftCards": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "harmonizedSystemCode": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "internationalPriceOverrides": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "internationalPriceRules": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "legacySubscriptionGatewayEnabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "liveView": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "paypalExpressSubscriptionGatewayStatus": {
                    responseData.put(key, PaypalExpressSubscriptionsGatewayStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reports": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "sellsSubscriptions": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "showMetrics": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "storefront": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "usingShopifyBalance": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "ShopFeatures";
    }

    /**
    * Whether a shop has access to Avalara AvaTax.
    */

    public Boolean getAvalaraAvatax() {
        return (Boolean) get("avalaraAvatax");
    }

    public ShopFeatures setAvalaraAvatax(Boolean arg) {
        optimisticData.put(getKey("avalaraAvatax"), arg);
        return this;
    }

    /**
    * The branding of the shop, which influences its look and feel in the Shopify admin.
    */

    public ShopBranding getBranding() {
        return (ShopBranding) get("branding");
    }

    public ShopFeatures setBranding(ShopBranding arg) {
        optimisticData.put(getKey("branding"), arg);
        return this;
    }

    /**
    * Represents the Bundles feature configuration for the shop.
    */

    public BundlesFeature getBundles() {
        return (BundlesFeature) get("bundles");
    }

    public ShopFeatures setBundles(BundlesFeature arg) {
        optimisticData.put(getKey("bundles"), arg);
        return this;
    }

    /**
    * Whether a shop's online store can have CAPTCHA protection.
    */

    public Boolean getCaptcha() {
        return (Boolean) get("captcha");
    }

    public ShopFeatures setCaptcha(Boolean arg) {
        optimisticData.put(getKey("captcha"), arg);
        return this;
    }

    /**
    * Represents the cart transform feature configuration for the shop.
    */

    public CartTransformFeature getCartTransform() {
        return (CartTransformFeature) get("cartTransform");
    }

    public ShopFeatures setCartTransform(CartTransformFeature arg) {
        optimisticData.put(getKey("cartTransform"), arg);
        return this;
    }

    /**
    * Whether a shop has access to the Google Analytics dynamic remarketing feature.
    */

    public Boolean getDynamicRemarketing() {
        return (Boolean) get("dynamicRemarketing");
    }

    public ShopFeatures setDynamicRemarketing(Boolean arg) {
        optimisticData.put(getKey("dynamicRemarketing"), arg);
        return this;
    }

    /**
    * Whether a shop can be migrated to use Shopify subscriptions.
    */

    public Boolean getEligibleForSubscriptionMigration() {
        return (Boolean) get("eligibleForSubscriptionMigration");
    }

    public ShopFeatures setEligibleForSubscriptionMigration(Boolean arg) {
        optimisticData.put(getKey("eligibleForSubscriptionMigration"), arg);
        return this;
    }

    /**
    * Whether a shop is configured properly to sell subscriptions.
    */

    public Boolean getEligibleForSubscriptions() {
        return (Boolean) get("eligibleForSubscriptions");
    }

    public ShopFeatures setEligibleForSubscriptions(Boolean arg) {
        optimisticData.put(getKey("eligibleForSubscriptions"), arg);
        return this;
    }

    /**
    * Whether a shop can create gift cards.
    */

    public Boolean getGiftCards() {
        return (Boolean) get("giftCards");
    }

    public ShopFeatures setGiftCards(Boolean arg) {
        optimisticData.put(getKey("giftCards"), arg);
        return this;
    }

    /**
    * Whether a shop displays Harmonized System codes on products. This is used for customs when shipping
    * internationally.
    */

    public Boolean getHarmonizedSystemCode() {
        return (Boolean) get("harmonizedSystemCode");
    }

    public ShopFeatures setHarmonizedSystemCode(Boolean arg) {
        optimisticData.put(getKey("harmonizedSystemCode"), arg);
        return this;
    }

    /**
    * Whether a shop can enable international price overrides.
    */

    public Boolean getInternationalPriceOverrides() {
        return (Boolean) get("internationalPriceOverrides");
    }

    public ShopFeatures setInternationalPriceOverrides(Boolean arg) {
        optimisticData.put(getKey("internationalPriceOverrides"), arg);
        return this;
    }

    /**
    * Whether a shop can enable international price rules.
    */

    public Boolean getInternationalPriceRules() {
        return (Boolean) get("internationalPriceRules");
    }

    public ShopFeatures setInternationalPriceRules(Boolean arg) {
        optimisticData.put(getKey("internationalPriceRules"), arg);
        return this;
    }

    /**
    * Whether a shop has enabled a legacy subscription gateway to handle older subscriptions.
    */

    public Boolean getLegacySubscriptionGatewayEnabled() {
        return (Boolean) get("legacySubscriptionGatewayEnabled");
    }

    public ShopFeatures setLegacySubscriptionGatewayEnabled(Boolean arg) {
        optimisticData.put(getKey("legacySubscriptionGatewayEnabled"), arg);
        return this;
    }

    /**
    * Whether to show the Live View metrics in the Shopify admin. Live view is hidden from merchants that
    * are on a trial
    * or don't have a storefront.
    */

    public Boolean getLiveView() {
        return (Boolean) get("liveView");
    }

    public ShopFeatures setLiveView(Boolean arg) {
        optimisticData.put(getKey("liveView"), arg);
        return this;
    }

    /**
    * Whether a shop is configured to sell subscriptions with PayPal Express.
    */

    public PaypalExpressSubscriptionsGatewayStatus getPaypalExpressSubscriptionGatewayStatus() {
        return (PaypalExpressSubscriptionsGatewayStatus) get("paypalExpressSubscriptionGatewayStatus");
    }

    public ShopFeatures setPaypalExpressSubscriptionGatewayStatus(PaypalExpressSubscriptionsGatewayStatus arg) {
        optimisticData.put(getKey("paypalExpressSubscriptionGatewayStatus"), arg);
        return this;
    }

    /**
    * Whether a shop has access to all reporting features.
    */

    public Boolean getReports() {
        return (Boolean) get("reports");
    }

    public ShopFeatures setReports(Boolean arg) {
        optimisticData.put(getKey("reports"), arg);
        return this;
    }

    /**
    * Whether a shop has ever had subscription products.
    */

    public Boolean getSellsSubscriptions() {
        return (Boolean) get("sellsSubscriptions");
    }

    public ShopFeatures setSellsSubscriptions(Boolean arg) {
        optimisticData.put(getKey("sellsSubscriptions"), arg);
        return this;
    }

    /**
    * Whether to show metrics in the Shopify admin. Metrics are hidden for new merchants until they become
    * meaningful.
    */

    public Boolean getShowMetrics() {
        return (Boolean) get("showMetrics");
    }

    public ShopFeatures setShowMetrics(Boolean arg) {
        optimisticData.put(getKey("showMetrics"), arg);
        return this;
    }

    /**
    * Whether a shop has an online store.
    */

    public Boolean getStorefront() {
        return (Boolean) get("storefront");
    }

    public ShopFeatures setStorefront(Boolean arg) {
        optimisticData.put(getKey("storefront"), arg);
        return this;
    }

    /**
    * Whether a shop is using Shopify Balance.
    */

    public Boolean getUsingShopifyBalance() {
        return (Boolean) get("usingShopifyBalance");
    }

    public ShopFeatures setUsingShopifyBalance(Boolean arg) {
        optimisticData.put(getKey("usingShopifyBalance"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "avalaraAvatax": return false;

            case "branding": return false;

            case "bundles": return true;

            case "captcha": return false;

            case "cartTransform": return true;

            case "dynamicRemarketing": return false;

            case "eligibleForSubscriptionMigration": return false;

            case "eligibleForSubscriptions": return false;

            case "giftCards": return false;

            case "harmonizedSystemCode": return false;

            case "internationalPriceOverrides": return false;

            case "internationalPriceRules": return false;

            case "legacySubscriptionGatewayEnabled": return false;

            case "liveView": return false;

            case "paypalExpressSubscriptionGatewayStatus": return false;

            case "reports": return false;

            case "sellsSubscriptions": return false;

            case "showMetrics": return false;

            case "storefront": return false;

            case "usingShopifyBalance": return false;

            default: return false;
        }
    }
}

