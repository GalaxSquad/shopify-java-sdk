// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The resolved values based on the markets configuration for a buyer signal. Resolved values include
* the resolved catalogs, web presences, currency, and price inclusivity.
*/
public class MarketsResolvedValuesQuery extends Query<MarketsResolvedValuesQuery> {
    MarketsResolvedValuesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
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
    * The resolved catalogs.
    */
    public MarketsResolvedValuesQuery catalogs(MarketCatalogConnectionQueryDefinition queryDef) {
        return catalogs(args -> {}, queryDef);
    }

    /**
    * The resolved catalogs.
    */
    public MarketsResolvedValuesQuery catalogs(CatalogsArgumentsDefinition argsDef, MarketCatalogConnectionQueryDefinition queryDef) {
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
    * The resolved currency code.
    */
    public MarketsResolvedValuesQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * The resolved price inclusivity attributes.
    */
    public MarketsResolvedValuesQuery priceInclusivity(ResolvedPriceInclusivityQueryDefinition queryDef) {
        startField("priceInclusivity");

        _queryBuilder.append('{');
        queryDef.define(new ResolvedPriceInclusivityQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    * The resolved web presences ordered by priority.
    */
    public MarketsResolvedValuesQuery webPresences(MarketWebPresenceConnectionQueryDefinition queryDef) {
        return webPresences(args -> {}, queryDef);
    }

    /**
    * The resolved web presences ordered by priority.
    */
    public MarketsResolvedValuesQuery webPresences(WebPresencesArgumentsDefinition argsDef, MarketWebPresenceConnectionQueryDefinition queryDef) {
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
