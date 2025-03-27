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
