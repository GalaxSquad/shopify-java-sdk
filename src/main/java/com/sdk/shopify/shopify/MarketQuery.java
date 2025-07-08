// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* A market is a group of one or more regions that you want to target for international sales.
* By creating a market, you can configure a distinct, localized shopping experience for
* customers from a specific area of the world. For example, you can
* [change
* currency](https://shopify.dev/api/admin-graphql/current/mutations/marketCurrencySettingsUpdate),
* [configure international
* pricing](https://shopify.dev/apps/internationalization/product-price-lists),
* or [add market-specific domains or
* subfolders](https://shopify.dev/api/admin-graphql/current/objects/MarketWebPresence).
*/
public class MarketQuery extends Query<MarketQuery> {
    MarketQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether the market has a customization with the given ID.
    */
    public MarketQuery assignedCustomization(ID customizationId) {
        startField("assignedCustomization");

        _queryBuilder.append("(customizationId:");
        Query.appendQuotedString(_queryBuilder, customizationId.toString());

        _queryBuilder.append(')');

        return this;
    }

    public class CatalogsArguments extends Arguments {
        CatalogsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CatalogsArguments first(Integer value) {
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
        public CatalogsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CatalogsArguments last(Integer value) {
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
        public CatalogsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CatalogsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CatalogsArgumentsDefinition {
        void define(CatalogsArguments args);
    }

    /**
    * The catalogs that belong to the market.
    */
    public MarketQuery catalogs(MarketCatalogConnectionQueryDefinition queryDef) {
        return catalogs(args -> {}, queryDef);
    }

    /**
    * The catalogs that belong to the market.
    */
    public MarketQuery catalogs(CatalogsArgumentsDefinition argsDef, MarketCatalogConnectionQueryDefinition queryDef) {
        startField("catalogs");

        CatalogsArguments args = new CatalogsArguments(_queryBuilder);
        argsDef.define(args);
        CatalogsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketCatalogConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of catalogs that belong to the market.
    */
    public MarketQuery catalogsCount(CountQueryDefinition queryDef) {
        startField("catalogsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The conditions under which a visitor is in the market.
    */
    public MarketQuery conditions(MarketConditionsQueryDefinition queryDef) {
        startField("conditions");

        _queryBuilder.append('{');
        queryDef.define(new MarketConditionsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The market’s currency settings.
    */
    public MarketQuery currencySettings(MarketCurrencySettingsQueryDefinition queryDef) {
        startField("currencySettings");

        _queryBuilder.append('{');
        queryDef.define(new MarketCurrencySettingsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A short, human-readable unique identifier for the market. This is changeable by the merchant.
    */
    public MarketQuery handle() {
        startField("handle");

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
    public MarketQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public MarketQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
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
    public MarketQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public MarketQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
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
    * The name of the market. Not shown to customers.
    */
    public MarketQuery name() {
        startField("name");

        return this;
    }

    /**
    * The inclusive pricing strategy for a market. This determines if prices include duties and / or
    * taxes.
    */
    public MarketQuery priceInclusions(MarketPriceInclusionsQueryDefinition queryDef) {
        startField("priceInclusions");

        _queryBuilder.append('{');
        queryDef.define(new MarketPriceInclusionsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Status of the market. Replaces the enabled field.
    */
    public MarketQuery status() {
        startField("status");

        return this;
    }

    /**
    * The type of the market.
    */
    public MarketQuery type() {
        startField("type");

        return this;
    }

    public class WebPresencesArguments extends Arguments {
        WebPresencesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public WebPresencesArguments first(Integer value) {
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
        public WebPresencesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public WebPresencesArguments last(Integer value) {
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
        public WebPresencesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public WebPresencesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WebPresencesArgumentsDefinition {
        void define(WebPresencesArguments args);
    }

    /**
    * The market’s web presences, which defines its SEO strategy. This can be a different domain,
    * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
    * language variants. If a market doesn't have any web presences, then the market is accessible on the
    * primary market's domains using [country
    * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country
    * -selector).
    */
    public MarketQuery webPresences(MarketWebPresenceConnectionQueryDefinition queryDef) {
        return webPresences(args -> {}, queryDef);
    }

    /**
    * The market’s web presences, which defines its SEO strategy. This can be a different domain,
    * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
    * language variants. If a market doesn't have any web presences, then the market is accessible on the
    * primary market's domains using [country
    * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country
    * -selector).
    */
    public MarketQuery webPresences(WebPresencesArgumentsDefinition argsDef, MarketWebPresenceConnectionQueryDefinition queryDef) {
        startField("webPresences");

        WebPresencesArguments args = new WebPresencesArguments(_queryBuilder);
        argsDef.define(args);
        WebPresencesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketWebPresenceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
