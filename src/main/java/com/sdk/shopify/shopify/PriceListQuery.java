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
* Represents a price list, including information about related prices and eligibility rules.
* You can use price lists to specify either fixed prices or adjusted relative prices that
* override initial product variant prices. Price lists are applied to customers
* using context rules, which determine price list eligibility.
* For more information on price lists, refer to
* [Support different pricing
* models](https://shopify.dev/apps/internationalization/product-price-lists).
*/
public class PriceListQuery extends Query<PriceListQuery> {
    PriceListQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The catalog that the price list is associated with.
    */
    public PriceListQuery catalog(CatalogQueryDefinition queryDef) {
        startField("catalog");

        _queryBuilder.append('{');
        queryDef.define(new CatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The currency for fixed prices associated with this price list.
    */
    public PriceListQuery currency() {
        startField("currency");

        return this;
    }

    /**
    * The number of fixed prices on the price list.
    */
    public PriceListQuery fixedPricesCount() {
        startField("fixedPricesCount");

        return this;
    }

    /**
    * The unique name of the price list, used as a human-readable identifier.
    */
    public PriceListQuery name() {
        startField("name");

        return this;
    }

    /**
    * Relative adjustments to other prices.
    */
    public PriceListQuery parent(PriceListParentQueryDefinition queryDef) {
        startField("parent");

        _queryBuilder.append('{');
        queryDef.define(new PriceListParentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PricesArguments extends Arguments {
        PricesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The origin of this price, either fixed (defined on the price list)
        * or relative (calculated using an adjustment via a price list parent configuration).
        */
        public PricesArguments originType(PriceListPriceOriginType value) {
            if (value != null) {
                startArgument("originType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PricesArguments first(Integer value) {
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
        public PricesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PricesArguments last(Integer value) {
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
        public PricesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PricesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | product_id | id |
        * | variant_id | id |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public PricesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface PricesArgumentsDefinition {
        void define(PricesArguments args);
    }

    /**
    * A list of prices associated with the price list.
    */
    public PriceListQuery prices(PriceListPriceConnectionQueryDefinition queryDef) {
        return prices(args -> {}, queryDef);
    }

    /**
    * A list of prices associated with the price list.
    */
    public PriceListQuery prices(PricesArgumentsDefinition argsDef, PriceListPriceConnectionQueryDefinition queryDef) {
        startField("prices");

        PricesArguments args = new PricesArguments(_queryBuilder);
        argsDef.define(args);
        PricesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PriceListPriceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QuantityRulesArguments extends Arguments {
        QuantityRulesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether the quantity rule is fixed (defined on the price list) or relative
        * (the default quantity rule for the shop).
        */
        public QuantityRulesArguments originType(QuantityRuleOriginType value) {
            if (value != null) {
                startArgument("originType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public QuantityRulesArguments first(Integer value) {
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
        public QuantityRulesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public QuantityRulesArguments last(Integer value) {
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
        public QuantityRulesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public QuantityRulesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QuantityRulesArgumentsDefinition {
        void define(QuantityRulesArguments args);
    }

    /**
    * A list of quantity rules associated with the price list, ordered by product variants.
    */
    public PriceListQuery quantityRules(QuantityRuleConnectionQueryDefinition queryDef) {
        return quantityRules(args -> {}, queryDef);
    }

    /**
    * A list of quantity rules associated with the price list, ordered by product variants.
    */
    public PriceListQuery quantityRules(QuantityRulesArgumentsDefinition argsDef, QuantityRuleConnectionQueryDefinition queryDef) {
        startField("quantityRules");

        QuantityRulesArguments args = new QuantityRulesArguments(_queryBuilder);
        argsDef.define(args);
        QuantityRulesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new QuantityRuleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
