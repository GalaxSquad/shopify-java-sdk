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
* The price of a product variant in a specific country.
* Prices vary between countries.
*/
public class ProductVariantContextualPricingQuery extends Query<ProductVariantContextualPricingQuery> {
    ProductVariantContextualPricingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The final compare-at price after all adjustments are applied.
    */
    public ProductVariantContextualPricingQuery compareAtPrice(MoneyV2QueryDefinition queryDef) {
        startField("compareAtPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The final price after all adjustments are applied.
    */
    public ProductVariantContextualPricingQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QuantityPriceBreaksArguments extends Arguments {
        QuantityPriceBreaksArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public QuantityPriceBreaksArguments first(Integer value) {
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
        public QuantityPriceBreaksArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public QuantityPriceBreaksArguments last(Integer value) {
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
        public QuantityPriceBreaksArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public QuantityPriceBreaksArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list using a key. If your query is slow or returns an error, then [try
        * specifying a sort key that matches the field used in the
        * search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
        */
        public QuantityPriceBreaksArguments sortKey(QuantityPriceBreakSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface QuantityPriceBreaksArgumentsDefinition {
        void define(QuantityPriceBreaksArguments args);
    }

    /**
    * A list of quantity breaks for the product variant.
    */
    public ProductVariantContextualPricingQuery quantityPriceBreaks(QuantityPriceBreakConnectionQueryDefinition queryDef) {
        return quantityPriceBreaks(args -> {}, queryDef);
    }

    /**
    * A list of quantity breaks for the product variant.
    */
    public ProductVariantContextualPricingQuery quantityPriceBreaks(QuantityPriceBreaksArgumentsDefinition argsDef, QuantityPriceBreakConnectionQueryDefinition queryDef) {
        startField("quantityPriceBreaks");

        QuantityPriceBreaksArguments args = new QuantityPriceBreaksArguments(_queryBuilder);
        argsDef.define(args);
        QuantityPriceBreaksArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new QuantityPriceBreakConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity rule applied for a given context.
    */
    public ProductVariantContextualPricingQuery quantityRule(QuantityRuleQueryDefinition queryDef) {
        startField("quantityRule");

        _queryBuilder.append('{');
        queryDef.define(new QuantityRuleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
