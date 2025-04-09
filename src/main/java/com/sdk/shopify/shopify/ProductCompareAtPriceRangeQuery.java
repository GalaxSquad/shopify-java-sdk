// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The compare-at price range of the product.
*/
public class ProductCompareAtPriceRangeQuery extends Query<ProductCompareAtPriceRangeQuery> {
    ProductCompareAtPriceRangeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The highest variant's compare-at price.
    */
    public ProductCompareAtPriceRangeQuery maxVariantCompareAtPrice(MoneyV2QueryDefinition queryDef) {
        startField("maxVariantCompareAtPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The lowest variant's compare-at price.
    */
    public ProductCompareAtPriceRangeQuery minVariantCompareAtPrice(MoneyV2QueryDefinition queryDef) {
        startField("minVariantCompareAtPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
