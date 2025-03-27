// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The price of a product in a specific country.
* Prices vary between countries.
* Refer to
* [Product](https://shopify.dev/docs/api/admin-graphql/latest/queries/product?example=Get+the+price+ra
* nge+for+a+product+for+buyers+from+Canada)
* for more information on how to use this object.
*/
public class ProductContextualPricingQuery extends Query<ProductContextualPricingQuery> {
    ProductContextualPricingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The number of fixed quantity rules for the product's variants on the price list.
    */
    public ProductContextualPricingQuery fixedQuantityRulesCount() {
        startField("fixedQuantityRulesCount");

        return this;
    }

    /**
    * The pricing of the variant with the highest price in the given context.
    */
    public ProductContextualPricingQuery maxVariantPricing(ProductVariantContextualPricingQueryDefinition queryDef) {
        startField("maxVariantPricing");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantContextualPricingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The pricing of the variant with the lowest price in the given context.
    */
    public ProductContextualPricingQuery minVariantPricing(ProductVariantContextualPricingQueryDefinition queryDef) {
        startField("minVariantPricing");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantContextualPricingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The minimum and maximum prices of a product, expressed in decimal numbers.
    * For example, if the product is priced between $10.00 and $50.00,
    * then the price range is $10.00 - $50.00.
    */
    public ProductContextualPricingQuery priceRange(ProductPriceRangeV2QueryDefinition queryDef) {
        startField("priceRange");

        _queryBuilder.append('{');
        queryDef.define(new ProductPriceRangeV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
