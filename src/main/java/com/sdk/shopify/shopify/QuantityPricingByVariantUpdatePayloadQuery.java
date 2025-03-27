// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `quantityPricingByVariantUpdate` mutation.
*/
public class QuantityPricingByVariantUpdatePayloadQuery extends Query<QuantityPricingByVariantUpdatePayloadQuery> {
    QuantityPricingByVariantUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The variants for which quantity pricing was created successfully in the price list.
    */
    public QuantityPricingByVariantUpdatePayloadQuery productVariants(ProductVariantQueryDefinition queryDef) {
        startField("productVariants");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public QuantityPricingByVariantUpdatePayloadQuery userErrors(QuantityPricingByVariantUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new QuantityPricingByVariantUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
