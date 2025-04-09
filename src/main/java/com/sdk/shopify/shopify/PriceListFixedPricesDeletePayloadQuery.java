// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `priceListFixedPricesDelete` mutation.
*/
public class PriceListFixedPricesDeletePayloadQuery extends Query<PriceListFixedPricesDeletePayloadQuery> {
    PriceListFixedPricesDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of product variant IDs whose fixed prices were removed from the price list.
    */
    public PriceListFixedPricesDeletePayloadQuery deletedFixedPriceVariantIds() {
        startField("deletedFixedPriceVariantIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PriceListFixedPricesDeletePayloadQuery userErrors(PriceListPriceUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PriceListPriceUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
