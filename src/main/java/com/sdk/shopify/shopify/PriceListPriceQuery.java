// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents information about pricing for a product variant
* as defined on a price list, such as the price, compare at price, and origin type. You can use a
* `PriceListPrice` to specify a fixed price for a specific product variant. For examples, refer to
* [PriceListFixedPricesAdd](https://shopify.dev/api/admin-graphql/latest/mutations/priceListFixedPrice
* sAdd) and
* [PriceList](https://shopify.dev/api/admin-graphql/latest/queries/priceList#section-examples).
*/
public class PriceListPriceQuery extends Query<PriceListPriceQuery> {
    PriceListPriceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The compare-at price of the product variant on this price list.
    */
    public PriceListPriceQuery compareAtPrice(MoneyV2QueryDefinition queryDef) {
        startField("compareAtPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The origin of a price, either fixed (defined on the price list) or relative (calculated using a
    * price list adjustment configuration).
    */
    public PriceListPriceQuery originType() {
        startField("originType");

        return this;
    }

    /**
    * The price of the product variant on this price list.
    */
    public PriceListPriceQuery price(MoneyV2QueryDefinition queryDef) {
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
    public PriceListPriceQuery quantityPriceBreaks(QuantityPriceBreakConnectionQueryDefinition queryDef) {
        return quantityPriceBreaks(args -> {}, queryDef);
    }

    /**
    * A list of quantity breaks for the product variant.
    */
    public PriceListPriceQuery quantityPriceBreaks(QuantityPriceBreaksArgumentsDefinition argsDef, QuantityPriceBreakConnectionQueryDefinition queryDef) {
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
    * The product variant associated with this price.
    */
    public PriceListPriceQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
