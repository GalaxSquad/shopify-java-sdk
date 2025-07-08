// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A list of products with publishing and pricing information associated with markets.
*/
public class MarketCatalogQuery extends Query<MarketCatalogQuery> {
    MarketCatalogQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class MarketsArguments extends Arguments {
        MarketsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filters markets by type.
        */
        public MarketsArguments type(MarketType value) {
            if (value != null) {
                startArgument("type");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Filters markets by status.
        */
        public MarketsArguments status(MarketStatus value) {
            if (value != null) {
                startArgument("status");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments first(Integer value) {
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
        public MarketsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments last(Integer value) {
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
        public MarketsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MarketsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MarketsArgumentsDefinition {
        void define(MarketsArguments args);
    }

    /**
    * The markets associated with the catalog.
    */
    public MarketCatalogQuery markets(MarketConnectionQueryDefinition queryDef) {
        return markets(args -> {}, queryDef);
    }

    /**
    * The markets associated with the catalog.
    */
    public MarketCatalogQuery markets(MarketsArgumentsDefinition argsDef, MarketConnectionQueryDefinition queryDef) {
        startField("markets");

        MarketsArguments args = new MarketsArguments(_queryBuilder);
        argsDef.define(args);
        MarketsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketsCountArguments extends Arguments {
        MarketsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filters markets by type.
        */
        public MarketsCountArguments type(MarketType value) {
            if (value != null) {
                startArgument("type");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Filters markets by status.
        */
        public MarketsCountArguments status(MarketStatus value) {
            if (value != null) {
                startArgument("status");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | market_condition_types | string | A comma-separated list of condition types. |
        * | market_type | string |
        * | name | string |
        * | status | string | | - `ACTIVE`<br/> - `DRAFT` |
        * | wildcard_company_location_with_country_code | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MarketsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public MarketsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MarketsCountArgumentsDefinition {
        void define(MarketsCountArguments args);
    }

    /**
    * The number of markets associated with the catalog.
    */
    public MarketCatalogQuery marketsCount(CountQueryDefinition queryDef) {
        return marketsCount(args -> {}, queryDef);
    }

    /**
    * The number of markets associated with the catalog.
    */
    public MarketCatalogQuery marketsCount(MarketsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("marketsCount");

        MarketsCountArguments args = new MarketsCountArguments(_queryBuilder);
        argsDef.define(args);
        MarketsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Most recent catalog operations.
    */
    public MarketCatalogQuery operations(ResourceOperationQueryDefinition queryDef) {
        startField("operations");

        _queryBuilder.append('{');
        queryDef.define(new ResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price list associated with the catalog.
    */
    public MarketCatalogQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A group of products and collections that's published to a catalog.
    */
    public MarketCatalogQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the catalog.
    */
    public MarketCatalogQuery status() {
        startField("status");

        return this;
    }

    /**
    * The name of the catalog.
    */
    public MarketCatalogQuery title() {
        startField("title");

        return this;
    }
}
