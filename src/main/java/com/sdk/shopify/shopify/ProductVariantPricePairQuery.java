// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The compare-at price and price of a variant sharing a currency.
*/
public class ProductVariantPricePairQuery extends Query<ProductVariantPricePairQuery> {
    ProductVariantPricePairQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The compare-at price of the variant with associated currency.
    */
    public ProductVariantPricePairQuery compareAtPrice(MoneyV2QueryDefinition queryDef) {
        startField("compareAtPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price of the variant with associated currency.
    */
    public ProductVariantPricePairQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
