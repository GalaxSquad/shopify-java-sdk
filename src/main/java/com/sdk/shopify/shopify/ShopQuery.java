// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.List;

/**
* Represents a collection of general settings and information about the shop.
*/
public class ShopQuery extends Query<ShopQuery> {
    ShopQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Account owner information.
    */
    public ShopQuery accountOwner(StaffMemberQueryDefinition queryDef) {
        startField("accountOwner");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of the shop's active alert messages that appear in the Shopify admin.
    */
    public ShopQuery alerts(ShopAlertQueryDefinition queryDef) {
        startField("alerts");

        _queryBuilder.append('{');
        queryDef.define(new ShopAlertQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of the shop's product categories. Limit: 1000 product categories.
    */
    public ShopQuery allProductCategoriesList(TaxonomyCategoryQueryDefinition queryDef) {
        startField("allProductCategoriesList");

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyCategoryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AvailableChannelAppsArguments extends Arguments {
        AvailableChannelAppsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AvailableChannelAppsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AvailableChannelAppsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AvailableChannelAppsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AvailableChannelAppsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AvailableChannelAppsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AvailableChannelAppsArgumentsDefinition {
        void define(AvailableChannelAppsArguments args);
    }

    /**
    * The list of sales channels not currently installed on the shop.
    */
    public ShopQuery availableChannelApps(AppConnectionQueryDefinition queryDef) {
        return availableChannelApps(args -> {}, queryDef);
    }

    /**
    * The list of sales channels not currently installed on the shop.
    */
    public ShopQuery availableChannelApps(AvailableChannelAppsArgumentsDefinition argsDef, AppConnectionQueryDefinition queryDef) {
        startField("availableChannelApps");

        AvailableChannelAppsArguments args = new AvailableChannelAppsArguments(_queryBuilder);
        argsDef.define(args);
        AvailableChannelAppsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AppConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's billing address information.
    */
    public ShopQuery billingAddress(ShopAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new ShopAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * List of all channel definitions associated with a shop.
    */
    public ShopQuery channelDefinitionsForInstalledChannels(AvailableChannelDefinitionsByChannelQueryDefinition queryDef) {
        startField("channelDefinitionsForInstalledChannels");

        _queryBuilder.append('{');
        queryDef.define(new AvailableChannelDefinitionsByChannelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Specifies whether the shop supports checkouts via Checkout API.
    */
    public ShopQuery checkoutApiSupported() {
        startField("checkoutApiSupported");

        return this;
    }

    /**
    * The public-facing contact email address for the shop.
    * Customers will use this email to communicate with the shop owner.
    */
    public ShopQuery contactEmail() {
        startField("contactEmail");

        return this;
    }

    /**
    * Countries that have been defined in shipping zones for the shop.
    */
    public ShopQuery countriesInShippingZones(CountriesInShippingZonesQueryDefinition queryDef) {
        startField("countriesInShippingZones");

        _queryBuilder.append('{');
        queryDef.define(new CountriesInShippingZonesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the shop was created.
    */
    public ShopQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The three letter code for the currency that the shop sells in.
    */
    public ShopQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * How currencies are displayed on your store.
    */
    public ShopQuery currencyFormats(CurrencyFormatsQueryDefinition queryDef) {
        startField("currencyFormats");

        _queryBuilder.append('{');
        queryDef.define(new CurrencyFormatsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CurrencySettingsArguments extends Arguments {
        CurrencySettingsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CurrencySettingsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CurrencySettingsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CurrencySettingsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CurrencySettingsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CurrencySettingsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CurrencySettingsArgumentsDefinition {
        void define(CurrencySettingsArguments args);
    }

    /**
    * The presentment currency settings for the shop excluding the shop's own currency.
    */
    public ShopQuery currencySettings(CurrencySettingConnectionQueryDefinition queryDef) {
        return currencySettings(args -> {}, queryDef);
    }

    /**
    * The presentment currency settings for the shop excluding the shop's own currency.
    */
    public ShopQuery currencySettings(CurrencySettingsArgumentsDefinition argsDef, CurrencySettingConnectionQueryDefinition queryDef) {
        startField("currencySettings");

        CurrencySettingsArguments args = new CurrencySettingsArguments(_queryBuilder);
        argsDef.define(args);
        CurrencySettingsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CurrencySettingConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether customer accounts are required, optional, or disabled for the shop.
    */
    public ShopQuery customerAccounts() {
        startField("customerAccounts");

        return this;
    }

    /**
    * Information about the shop's customer accounts.
    */
    public ShopQuery customerAccountsV2(CustomerAccountsV2QueryDefinition queryDef) {
        startField("customerAccountsV2");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAccountsV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of tags that have been added to customer accounts.
    */
    public ShopQuery customerTags(int first, StringConnectionQueryDefinition queryDef) {
        startField("customerTags");

        _queryBuilder.append("(first:");
        _queryBuilder.append(first);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StringConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's meta description used in search engine results.
    */
    public ShopQuery description() {
        startField("description");

        return this;
    }

    /**
    * A list of tags that have been added to draft orders.
    */
    public ShopQuery draftOrderTags(int first, StringConnectionQueryDefinition queryDef) {
        startField("draftOrderTags");

        _queryBuilder.append("(first:");
        _queryBuilder.append(first);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StringConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop owner's email address.
    * Shopify will use this email address to communicate with the shop owner.
    */
    public ShopQuery email() {
        startField("email");

        return this;
    }

    /**
    * The presentment currencies enabled for the shop.
    */
    public ShopQuery enabledPresentmentCurrencies() {
        startField("enabledPresentmentCurrencies");

        return this;
    }

    /**
    * The set of features enabled for the shop.
    */
    public ShopQuery features(ShopFeaturesQueryDefinition queryDef) {
        startField("features");

        _queryBuilder.append('{');
        queryDef.define(new ShopFeaturesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * List of the shop's installed fulfillment services.
    */
    public ShopQuery fulfillmentServices(FulfillmentServiceQueryDefinition queryDef) {
        startField("fulfillmentServices");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's time zone as defined by the IANA.
    */
    public ShopQuery ianaTimezone() {
        startField("ianaTimezone");

        return this;
    }

    /**
    * Whether SMS marketing has been enabled on the shop's checkout configuration settings.
    */
    public ShopQuery marketingSmsConsentEnabledAtCheckout() {
        startField("marketingSmsConsentEnabledAtCheckout");

        return this;
    }

    /**
    * The approval signals for a shop to support onboarding to channel apps.
    */
    public ShopQuery merchantApprovalSignals(MerchantApprovalSignalsQueryDefinition queryDef) {
        startField("merchantApprovalSignals");

        _queryBuilder.append('{');
        queryDef.define(new MerchantApprovalSignalsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldArguments extends Arguments {
        MetafieldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldArgumentsDefinition {
        void define(MetafieldArguments args);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public ShopQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public ShopQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
        startField("metafield");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        argsDef.define(new MetafieldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The metafield namespace to filter by. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * List of keys of metafields in the format `namespace.key`, will be returned in the same format.
        */
        public MetafieldsArguments keys(List<String> value) {
            if (value != null) {
                startArgument("keys");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldsArgumentsDefinition {
        void define(MetafieldsArguments args);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public ShopQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public ShopQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's .myshopify.com domain name.
    */
    public ShopQuery myshopifyDomain() {
        startField("myshopifyDomain");

        return this;
    }

    /**
    * The shop's name.
    */
    public ShopQuery name() {
        startField("name");

        return this;
    }

    /**
    * The shop's settings related to navigation.
    */
    public ShopQuery navigationSettings(NavigationItemQueryDefinition queryDef) {
        startField("navigationSettings");

        _queryBuilder.append('{');
        queryDef.define(new NavigationItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The prefix that appears before order numbers.
    */
    public ShopQuery orderNumberFormatPrefix() {
        startField("orderNumberFormatPrefix");

        return this;
    }

    /**
    * The suffix that appears after order numbers.
    */
    public ShopQuery orderNumberFormatSuffix() {
        startField("orderNumberFormatSuffix");

        return this;
    }

    public class OrderTagsArguments extends Arguments {
        OrderTagsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Sort type.
        */
        public OrderTagsArguments sort(ShopTagSort value) {
            if (value != null) {
                startArgument("sort");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface OrderTagsArgumentsDefinition {
        void define(OrderTagsArguments args);
    }

    /**
    * A list of tags that have been added to orders.
    */
    public ShopQuery orderTags(int first, StringConnectionQueryDefinition queryDef) {
        return orderTags(first, args -> {}, queryDef);
    }

    /**
    * A list of tags that have been added to orders.
    */
    public ShopQuery orderTags(int first, OrderTagsArgumentsDefinition argsDef, StringConnectionQueryDefinition queryDef) {
        startField("orderTags");

        _queryBuilder.append("(first:");
        _queryBuilder.append(first);

        argsDef.define(new OrderTagsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StringConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's settings related to payments.
    */
    public ShopQuery paymentSettings(PaymentSettingsQueryDefinition queryDef) {
        startField("paymentSettings");

        _queryBuilder.append('{');
        queryDef.define(new PaymentSettingsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's billing plan.
    */
    public ShopQuery plan(ShopPlanQueryDefinition queryDef) {
        startField("plan");

        _queryBuilder.append('{');
        queryDef.define(new ShopPlanQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The primary domain of the shop's online store.
    */
    public ShopQuery primaryDomain(DomainQueryDefinition queryDef) {
        startField("primaryDomain");

        _queryBuilder.append('{');
        queryDef.define(new DomainQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's limits for specific resources. For example, the maximum number ofvariants allowed per
    * product, or the maximum number of locations allowed.
    */
    public ShopQuery resourceLimits(ShopResourceLimitsQueryDefinition queryDef) {
        startField("resourceLimits");

        _queryBuilder.append('{');
        queryDef.define(new ShopResourceLimitsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL of the rich text editor that can be used for mobile devices.
    */
    public ShopQuery richTextEditorUrl() {
        startField("richTextEditorUrl");

        return this;
    }

    public class SearchArguments extends Arguments {
        SearchArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The search result types to filter by.
        */
        public SearchArguments types(List<SearchResultType> value) {
            if (value != null) {
                startArgument("types");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SearchResultType item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SearchArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SearchArgumentsDefinition {
        void define(SearchArguments args);
    }

    /**
    * Fetches a list of admin search results by a specified query.
    */
    public ShopQuery search(String query, int first, SearchResultConnectionQueryDefinition queryDef) {
        return search(query, first, args -> {}, queryDef);
    }

    /**
    * Fetches a list of admin search results by a specified query.
    */
    public ShopQuery search(String query, int first, SearchArgumentsDefinition argsDef, SearchResultConnectionQueryDefinition queryDef) {
        startField("search");

        _queryBuilder.append("(query:");
        Query.appendQuotedString(_queryBuilder, query.toString());

        _queryBuilder.append(",first:");
        _queryBuilder.append(first);

        argsDef.define(new SearchArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SearchResultConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of search filter options for the shop. These can be used to filter productvisibility for
    * the shop.
    */
    public ShopQuery searchFilters(SearchFilterOptionsQueryDefinition queryDef) {
        startField("searchFilters");

        _queryBuilder.append('{');
        queryDef.define(new SearchFilterOptionsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the shop has outstanding setup steps.
    */
    public ShopQuery setupRequired() {
        startField("setupRequired");

        return this;
    }

    /**
    * The list of countries that the shop ships to.
    */
    public ShopQuery shipsToCountries() {
        startField("shipsToCountries");

        return this;
    }

    /**
    * The name of the shop owner.
    */
    public ShopQuery shopOwnerName() {
        startField("shopOwnerName");

        return this;
    }

    /**
    * The list of all legal policies associated with a shop.
    */
    public ShopQuery shopPolicies(ShopPolicyQueryDefinition queryDef) {
        startField("shopPolicies");

        _queryBuilder.append('{');
        queryDef.define(new ShopPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StorefrontAccessTokensArguments extends Arguments {
        StorefrontAccessTokensArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StorefrontAccessTokensArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StorefrontAccessTokensArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StorefrontAccessTokensArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StorefrontAccessTokensArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public StorefrontAccessTokensArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StorefrontAccessTokensArgumentsDefinition {
        void define(StorefrontAccessTokensArguments args);
    }

    /**
    * The storefront access token of a private application. These are scoped per-application.
    */
    public ShopQuery storefrontAccessTokens(StorefrontAccessTokenConnectionQueryDefinition queryDef) {
        return storefrontAccessTokens(args -> {}, queryDef);
    }

    /**
    * The storefront access token of a private application. These are scoped per-application.
    */
    public ShopQuery storefrontAccessTokens(StorefrontAccessTokensArgumentsDefinition argsDef, StorefrontAccessTokenConnectionQueryDefinition queryDef) {
        startField("storefrontAccessTokens");

        StorefrontAccessTokensArguments args = new StorefrontAccessTokensArguments(_queryBuilder);
        argsDef.define(args);
        StorefrontAccessTokensArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StorefrontAccessTokenConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the shop charges taxes for shipping.
    */
    public ShopQuery taxShipping() {
        startField("taxShipping");

        return this;
    }

    /**
    * Whether applicable taxes are included in the shop's product prices.
    */
    public ShopQuery taxesIncluded() {
        startField("taxesIncluded");

        return this;
    }

    /**
    * The shop's time zone abbreviation.
    */
    public ShopQuery timezoneAbbreviation() {
        startField("timezoneAbbreviation");

        return this;
    }

    /**
    * The shop's time zone offset.
    */
    public ShopQuery timezoneOffset() {
        startField("timezoneOffset");

        return this;
    }

    /**
    * The shop's time zone offset expressed as a number of minutes.
    */
    public ShopQuery timezoneOffsetMinutes() {
        startField("timezoneOffsetMinutes");

        return this;
    }

    /**
    * Whether transactional SMS sent by Shopify have been disabled for a shop.
    */
    public ShopQuery transactionalSmsDisabled() {
        startField("transactionalSmsDisabled");

        return this;
    }

    public class TranslationsArguments extends Arguments {
        TranslationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Filters translations by market ID. Use this argument to retrieve content specific to a market.
        */
        public TranslationsArguments marketId(ID value) {
            if (value != null) {
                startArgument("marketId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface TranslationsArgumentsDefinition {
        void define(TranslationsArguments args);
    }

    /**
    * The published translations associated with the resource.
    */
    public ShopQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public ShopQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
        startField("translations");

        _queryBuilder.append("(locale:");
        Query.appendQuotedString(_queryBuilder, locale.toString());

        argsDef.define(new TranslationsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's unit system for weights and measures.
    */
    public ShopQuery unitSystem() {
        startField("unitSystem");

        return this;
    }

    /**
    * The date and time when the shop was last updated.
    */
    public ShopQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The URL of the shop's online store.
    */
    public ShopQuery url() {
        startField("url");

        return this;
    }

    /**
    * The shop's primary unit of weight for products and shipping.
    */
    public ShopQuery weightUnit() {
        startField("weightUnit");

        return this;
    }
}
