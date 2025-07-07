// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a collection of general settings and information about the shop.
*/
public class Shop extends AbstractResponse<Shop> implements HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, MetafieldReferencer, Node {
    public Shop() {
    }

    public Shop(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accountOwner": {
                    responseData.put(key, new StaffMember(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "alerts": {
                    List<ShopAlert> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopAlert(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "allProductCategoriesList": {
                    List<TaxonomyCategory> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxonomyCategory(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "availableChannelApps": {
                    responseData.put(key, new AppConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "billingAddress": {
                    responseData.put(key, new ShopAddress(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "channelDefinitionsForInstalledChannels": {
                    List<AvailableChannelDefinitionsByChannel> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AvailableChannelDefinitionsByChannel(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "checkoutApiSupported": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "contactEmail": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "countriesInShippingZones": {
                    responseData.put(key, new CountriesInShippingZones(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "currencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "currencyFormats": {
                    responseData.put(key, new CurrencyFormats(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currencySettings": {
                    responseData.put(key, new CurrencySettingConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerAccounts": {
                    responseData.put(key, ShopCustomerAccountsSetting.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "customerAccountsV2": {
                    responseData.put(key, new CustomerAccountsV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerTags": {
                    responseData.put(key, new StringConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderTags": {
                    responseData.put(key, new StringConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "email": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "enabledPresentmentCurrencies": {
                    List<CurrencyCode> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(CurrencyCode.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "entitlements": {
                    responseData.put(key, new EntitlementsType(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "features": {
                    responseData.put(key, new ShopFeatures(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillmentServices": {
                    List<FulfillmentService> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentService(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "ianaTimezone": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "marketingSmsConsentEnabledAtCheckout": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "merchantApprovalSignals": {
                    MerchantApprovalSignals optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MerchantApprovalSignals(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "myshopifyDomain": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "navigationSettings": {
                    List<NavigationItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new NavigationItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "orderNumberFormatPrefix": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "orderNumberFormatSuffix": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "orderTags": {
                    responseData.put(key, new StringConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "paymentSettings": {
                    responseData.put(key, new PaymentSettings(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "plan": {
                    responseData.put(key, new ShopPlan(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "primaryDomain": {
                    responseData.put(key, new Domain(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "resourceLimits": {
                    responseData.put(key, new ShopResourceLimits(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "richTextEditorUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "search": {
                    responseData.put(key, new SearchResultConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "searchFilters": {
                    responseData.put(key, new SearchFilterOptions(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "setupRequired": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "shipsToCountries": {
                    List<CountryCode> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(CountryCode.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "shopOwnerName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "shopPolicies": {
                    List<ShopPolicy> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopPolicy(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "storefrontAccessTokens": {
                    responseData.put(key, new StorefrontAccessTokenConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "taxShipping": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "taxesIncluded": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "timezoneAbbreviation": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "timezoneOffset": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "timezoneOffsetMinutes": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "transactionalSmsDisabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "unitSystem": {
                    responseData.put(key, UnitSystem.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "url": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "weightUnit": {
                    responseData.put(key, WeightUnit.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public Shop(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Shop";
    }

    /**
    * Account owner information.
    */

    public StaffMember getAccountOwner() {
        return (StaffMember) get("accountOwner");
    }

    public Shop setAccountOwner(StaffMember arg) {
        optimisticData.put(getKey("accountOwner"), arg);
        return this;
    }

    /**
    * A list of the shop's active alert messages that appear in the Shopify admin.
    */

    public List<ShopAlert> getAlerts() {
        return (List<ShopAlert>) get("alerts");
    }

    public Shop setAlerts(List<ShopAlert> arg) {
        optimisticData.put(getKey("alerts"), arg);
        return this;
    }

    /**
    * A list of the shop's product categories. Limit: 1000 product categories.
    */

    public List<TaxonomyCategory> getAllProductCategoriesList() {
        return (List<TaxonomyCategory>) get("allProductCategoriesList");
    }

    public Shop setAllProductCategoriesList(List<TaxonomyCategory> arg) {
        optimisticData.put(getKey("allProductCategoriesList"), arg);
        return this;
    }

    /**
    * The list of sales channels not currently installed on the shop.
    */

    public AppConnection getAvailableChannelApps() {
        return (AppConnection) get("availableChannelApps");
    }

    public Shop setAvailableChannelApps(AppConnection arg) {
        optimisticData.put(getKey("availableChannelApps"), arg);
        return this;
    }

    /**
    * The shop's billing address information.
    */

    public ShopAddress getBillingAddress() {
        return (ShopAddress) get("billingAddress");
    }

    public Shop setBillingAddress(ShopAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * List of all channel definitions associated with a shop.
    */

    public List<AvailableChannelDefinitionsByChannel> getChannelDefinitionsForInstalledChannels() {
        return (List<AvailableChannelDefinitionsByChannel>) get("channelDefinitionsForInstalledChannels");
    }

    public Shop setChannelDefinitionsForInstalledChannels(List<AvailableChannelDefinitionsByChannel> arg) {
        optimisticData.put(getKey("channelDefinitionsForInstalledChannels"), arg);
        return this;
    }

    /**
    * Specifies whether the shop supports checkouts via Checkout API.
    */

    public Boolean getCheckoutApiSupported() {
        return (Boolean) get("checkoutApiSupported");
    }

    public Shop setCheckoutApiSupported(Boolean arg) {
        optimisticData.put(getKey("checkoutApiSupported"), arg);
        return this;
    }

    /**
    * The public-facing contact email address for the shop.
    * Customers will use this email to communicate with the shop owner.
    */

    public String getContactEmail() {
        return (String) get("contactEmail");
    }

    public Shop setContactEmail(String arg) {
        optimisticData.put(getKey("contactEmail"), arg);
        return this;
    }

    /**
    * Countries that have been defined in shipping zones for the shop.
    */

    public CountriesInShippingZones getCountriesInShippingZones() {
        return (CountriesInShippingZones) get("countriesInShippingZones");
    }

    public Shop setCountriesInShippingZones(CountriesInShippingZones arg) {
        optimisticData.put(getKey("countriesInShippingZones"), arg);
        return this;
    }

    /**
    * The date and time when the shop was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Shop setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The three letter code for the currency that the shop sells in.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public Shop setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * How currencies are displayed on your store.
    */

    public CurrencyFormats getCurrencyFormats() {
        return (CurrencyFormats) get("currencyFormats");
    }

    public Shop setCurrencyFormats(CurrencyFormats arg) {
        optimisticData.put(getKey("currencyFormats"), arg);
        return this;
    }

    /**
    * The presentment currency settings for the shop excluding the shop's own currency.
    */

    public CurrencySettingConnection getCurrencySettings() {
        return (CurrencySettingConnection) get("currencySettings");
    }

    public Shop setCurrencySettings(CurrencySettingConnection arg) {
        optimisticData.put(getKey("currencySettings"), arg);
        return this;
    }

    /**
    * Whether customer accounts are required, optional, or disabled for the shop.
    */

    public ShopCustomerAccountsSetting getCustomerAccounts() {
        return (ShopCustomerAccountsSetting) get("customerAccounts");
    }

    public Shop setCustomerAccounts(ShopCustomerAccountsSetting arg) {
        optimisticData.put(getKey("customerAccounts"), arg);
        return this;
    }

    /**
    * Information about the shop's customer accounts.
    */

    public CustomerAccountsV2 getCustomerAccountsV2() {
        return (CustomerAccountsV2) get("customerAccountsV2");
    }

    public Shop setCustomerAccountsV2(CustomerAccountsV2 arg) {
        optimisticData.put(getKey("customerAccountsV2"), arg);
        return this;
    }

    /**
    * A list of tags that have been added to customer accounts.
    */

    public StringConnection getCustomerTags() {
        return (StringConnection) get("customerTags");
    }

    public Shop setCustomerTags(StringConnection arg) {
        optimisticData.put(getKey("customerTags"), arg);
        return this;
    }

    /**
    * The shop's meta description used in search engine results.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Shop setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * A list of tags that have been added to draft orders.
    */

    public StringConnection getDraftOrderTags() {
        return (StringConnection) get("draftOrderTags");
    }

    public Shop setDraftOrderTags(StringConnection arg) {
        optimisticData.put(getKey("draftOrderTags"), arg);
        return this;
    }

    /**
    * The shop owner's email address.
    * Shopify will use this email address to communicate with the shop owner.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public Shop setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * The presentment currencies enabled for the shop.
    */

    public List<CurrencyCode> getEnabledPresentmentCurrencies() {
        return (List<CurrencyCode>) get("enabledPresentmentCurrencies");
    }

    public Shop setEnabledPresentmentCurrencies(List<CurrencyCode> arg) {
        optimisticData.put(getKey("enabledPresentmentCurrencies"), arg);
        return this;
    }

    /**
    * The entitlements for a shop.
    */

    public EntitlementsType getEntitlements() {
        return (EntitlementsType) get("entitlements");
    }

    public Shop setEntitlements(EntitlementsType arg) {
        optimisticData.put(getKey("entitlements"), arg);
        return this;
    }

    /**
    * The set of features enabled for the shop.
    */

    public ShopFeatures getFeatures() {
        return (ShopFeatures) get("features");
    }

    public Shop setFeatures(ShopFeatures arg) {
        optimisticData.put(getKey("features"), arg);
        return this;
    }

    /**
    * List of the shop's installed fulfillment services.
    */

    public List<FulfillmentService> getFulfillmentServices() {
        return (List<FulfillmentService>) get("fulfillmentServices");
    }

    public Shop setFulfillmentServices(List<FulfillmentService> arg) {
        optimisticData.put(getKey("fulfillmentServices"), arg);
        return this;
    }

    /**
    * The shop's time zone as defined by the IANA.
    */

    public String getIanaTimezone() {
        return (String) get("ianaTimezone");
    }

    public Shop setIanaTimezone(String arg) {
        optimisticData.put(getKey("ianaTimezone"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether SMS marketing has been enabled on the shop's checkout configuration settings.
    */

    public Boolean getMarketingSmsConsentEnabledAtCheckout() {
        return (Boolean) get("marketingSmsConsentEnabledAtCheckout");
    }

    public Shop setMarketingSmsConsentEnabledAtCheckout(Boolean arg) {
        optimisticData.put(getKey("marketingSmsConsentEnabledAtCheckout"), arg);
        return this;
    }

    /**
    * The approval signals for a shop to support onboarding to channel apps.
    */

    public MerchantApprovalSignals getMerchantApprovalSignals() {
        return (MerchantApprovalSignals) get("merchantApprovalSignals");
    }

    public Shop setMerchantApprovalSignals(MerchantApprovalSignals arg) {
        optimisticData.put(getKey("merchantApprovalSignals"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public Shop setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public Shop setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The shop's .myshopify.com domain name.
    */

    public String getMyshopifyDomain() {
        return (String) get("myshopifyDomain");
    }

    public Shop setMyshopifyDomain(String arg) {
        optimisticData.put(getKey("myshopifyDomain"), arg);
        return this;
    }

    /**
    * The shop's name.
    */

    public String getName() {
        return (String) get("name");
    }

    public Shop setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The shop's settings related to navigation.
    */

    public List<NavigationItem> getNavigationSettings() {
        return (List<NavigationItem>) get("navigationSettings");
    }

    public Shop setNavigationSettings(List<NavigationItem> arg) {
        optimisticData.put(getKey("navigationSettings"), arg);
        return this;
    }

    /**
    * The prefix that appears before order numbers.
    */

    public String getOrderNumberFormatPrefix() {
        return (String) get("orderNumberFormatPrefix");
    }

    public Shop setOrderNumberFormatPrefix(String arg) {
        optimisticData.put(getKey("orderNumberFormatPrefix"), arg);
        return this;
    }

    /**
    * The suffix that appears after order numbers.
    */

    public String getOrderNumberFormatSuffix() {
        return (String) get("orderNumberFormatSuffix");
    }

    public Shop setOrderNumberFormatSuffix(String arg) {
        optimisticData.put(getKey("orderNumberFormatSuffix"), arg);
        return this;
    }

    /**
    * A list of tags that have been added to orders.
    */

    public StringConnection getOrderTags() {
        return (StringConnection) get("orderTags");
    }

    public Shop setOrderTags(StringConnection arg) {
        optimisticData.put(getKey("orderTags"), arg);
        return this;
    }

    /**
    * The shop's settings related to payments.
    */

    public PaymentSettings getPaymentSettings() {
        return (PaymentSettings) get("paymentSettings");
    }

    public Shop setPaymentSettings(PaymentSettings arg) {
        optimisticData.put(getKey("paymentSettings"), arg);
        return this;
    }

    /**
    * The shop's billing plan.
    */

    public ShopPlan getPlan() {
        return (ShopPlan) get("plan");
    }

    public Shop setPlan(ShopPlan arg) {
        optimisticData.put(getKey("plan"), arg);
        return this;
    }

    /**
    * The primary domain of the shop's online store.
    */

    public Domain getPrimaryDomain() {
        return (Domain) get("primaryDomain");
    }

    public Shop setPrimaryDomain(Domain arg) {
        optimisticData.put(getKey("primaryDomain"), arg);
        return this;
    }

    /**
    * The shop's limits for specific resources. For example, the maximum number ofvariants allowed per
    * product, or the maximum number of locations allowed.
    */

    public ShopResourceLimits getResourceLimits() {
        return (ShopResourceLimits) get("resourceLimits");
    }

    public Shop setResourceLimits(ShopResourceLimits arg) {
        optimisticData.put(getKey("resourceLimits"), arg);
        return this;
    }

    /**
    * The URL of the rich text editor that can be used for mobile devices.
    */

    public String getRichTextEditorUrl() {
        return (String) get("richTextEditorUrl");
    }

    public Shop setRichTextEditorUrl(String arg) {
        optimisticData.put(getKey("richTextEditorUrl"), arg);
        return this;
    }

    /**
    * Fetches a list of admin search results by a specified query.
    */

    public SearchResultConnection getSearch() {
        return (SearchResultConnection) get("search");
    }

    public Shop setSearch(SearchResultConnection arg) {
        optimisticData.put(getKey("search"), arg);
        return this;
    }

    /**
    * The list of search filter options for the shop. These can be used to filter productvisibility for
    * the shop.
    */

    public SearchFilterOptions getSearchFilters() {
        return (SearchFilterOptions) get("searchFilters");
    }

    public Shop setSearchFilters(SearchFilterOptions arg) {
        optimisticData.put(getKey("searchFilters"), arg);
        return this;
    }

    /**
    * Whether the shop has outstanding setup steps.
    */

    public Boolean getSetupRequired() {
        return (Boolean) get("setupRequired");
    }

    public Shop setSetupRequired(Boolean arg) {
        optimisticData.put(getKey("setupRequired"), arg);
        return this;
    }

    /**
    * The list of countries that the shop ships to.
    */

    public List<CountryCode> getShipsToCountries() {
        return (List<CountryCode>) get("shipsToCountries");
    }

    public Shop setShipsToCountries(List<CountryCode> arg) {
        optimisticData.put(getKey("shipsToCountries"), arg);
        return this;
    }

    /**
    * The name of the shop owner.
    */

    public String getShopOwnerName() {
        return (String) get("shopOwnerName");
    }

    public Shop setShopOwnerName(String arg) {
        optimisticData.put(getKey("shopOwnerName"), arg);
        return this;
    }

    /**
    * The list of all legal policies associated with a shop.
    */

    public List<ShopPolicy> getShopPolicies() {
        return (List<ShopPolicy>) get("shopPolicies");
    }

    public Shop setShopPolicies(List<ShopPolicy> arg) {
        optimisticData.put(getKey("shopPolicies"), arg);
        return this;
    }

    /**
    * The storefront access token of a private application. These are scoped per-application.
    */

    public StorefrontAccessTokenConnection getStorefrontAccessTokens() {
        return (StorefrontAccessTokenConnection) get("storefrontAccessTokens");
    }

    public Shop setStorefrontAccessTokens(StorefrontAccessTokenConnection arg) {
        optimisticData.put(getKey("storefrontAccessTokens"), arg);
        return this;
    }

    /**
    * Whether the shop charges taxes for shipping.
    */

    public Boolean getTaxShipping() {
        return (Boolean) get("taxShipping");
    }

    public Shop setTaxShipping(Boolean arg) {
        optimisticData.put(getKey("taxShipping"), arg);
        return this;
    }

    /**
    * Whether applicable taxes are included in the shop's product prices.
    */

    public Boolean getTaxesIncluded() {
        return (Boolean) get("taxesIncluded");
    }

    public Shop setTaxesIncluded(Boolean arg) {
        optimisticData.put(getKey("taxesIncluded"), arg);
        return this;
    }

    /**
    * The shop's time zone abbreviation.
    */

    public String getTimezoneAbbreviation() {
        return (String) get("timezoneAbbreviation");
    }

    public Shop setTimezoneAbbreviation(String arg) {
        optimisticData.put(getKey("timezoneAbbreviation"), arg);
        return this;
    }

    /**
    * The shop's time zone offset.
    */

    public String getTimezoneOffset() {
        return (String) get("timezoneOffset");
    }

    public Shop setTimezoneOffset(String arg) {
        optimisticData.put(getKey("timezoneOffset"), arg);
        return this;
    }

    /**
    * The shop's time zone offset expressed as a number of minutes.
    */

    public Integer getTimezoneOffsetMinutes() {
        return (Integer) get("timezoneOffsetMinutes");
    }

    public Shop setTimezoneOffsetMinutes(Integer arg) {
        optimisticData.put(getKey("timezoneOffsetMinutes"), arg);
        return this;
    }

    /**
    * Whether transactional SMS sent by Shopify have been disabled for a shop.
    */

    public Boolean getTransactionalSmsDisabled() {
        return (Boolean) get("transactionalSmsDisabled");
    }

    public Shop setTransactionalSmsDisabled(Boolean arg) {
        optimisticData.put(getKey("transactionalSmsDisabled"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public Shop setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The shop's unit system for weights and measures.
    */

    public UnitSystem getUnitSystem() {
        return (UnitSystem) get("unitSystem");
    }

    public Shop setUnitSystem(UnitSystem arg) {
        optimisticData.put(getKey("unitSystem"), arg);
        return this;
    }

    /**
    * The date and time when the shop was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Shop setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The URL of the shop's online store.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public Shop setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    /**
    * The shop's primary unit of weight for products and shipping.
    */

    public WeightUnit getWeightUnit() {
        return (WeightUnit) get("weightUnit");
    }

    public Shop setWeightUnit(WeightUnit arg) {
        optimisticData.put(getKey("weightUnit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accountOwner": return true;

            case "alerts": return true;

            case "allProductCategoriesList": return true;

            case "availableChannelApps": return true;

            case "billingAddress": return true;

            case "channelDefinitionsForInstalledChannels": return true;

            case "checkoutApiSupported": return false;

            case "contactEmail": return false;

            case "countriesInShippingZones": return true;

            case "createdAt": return false;

            case "currencyCode": return false;

            case "currencyFormats": return true;

            case "currencySettings": return true;

            case "customerAccounts": return false;

            case "customerAccountsV2": return true;

            case "customerTags": return true;

            case "description": return false;

            case "draftOrderTags": return true;

            case "email": return false;

            case "enabledPresentmentCurrencies": return false;

            case "entitlements": return true;

            case "features": return true;

            case "fulfillmentServices": return true;

            case "ianaTimezone": return false;

            case "id": return false;

            case "marketingSmsConsentEnabledAtCheckout": return false;

            case "merchantApprovalSignals": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "myshopifyDomain": return false;

            case "name": return false;

            case "navigationSettings": return true;

            case "orderNumberFormatPrefix": return false;

            case "orderNumberFormatSuffix": return false;

            case "orderTags": return true;

            case "paymentSettings": return true;

            case "plan": return true;

            case "primaryDomain": return true;

            case "resourceLimits": return true;

            case "richTextEditorUrl": return false;

            case "search": return true;

            case "searchFilters": return true;

            case "setupRequired": return false;

            case "shipsToCountries": return false;

            case "shopOwnerName": return false;

            case "shopPolicies": return true;

            case "storefrontAccessTokens": return true;

            case "taxShipping": return false;

            case "taxesIncluded": return false;

            case "timezoneAbbreviation": return false;

            case "timezoneOffset": return false;

            case "timezoneOffsetMinutes": return false;

            case "transactionalSmsDisabled": return false;

            case "translations": return true;

            case "unitSystem": return false;

            case "updatedAt": return false;

            case "url": return false;

            case "weightUnit": return false;

            default: return false;
        }
    }
}

