// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The price range of the product.
*/
public class ProductPriceRangeV2Query extends Query<ProductPriceRangeV2Query> {
    ProductPriceRangeV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The highest variant's price.
    */
    public ProductPriceRangeV2Query maxVariantPrice(MoneyV2QueryDefinition queryDef) {
        startField("maxVariantPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The lowest variant's price.
    */
    public ProductPriceRangeV2Query minVariantPrice(MoneyV2QueryDefinition queryDef) {
        startField("minVariantPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
