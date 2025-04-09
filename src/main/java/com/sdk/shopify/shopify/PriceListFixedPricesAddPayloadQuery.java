// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `priceListFixedPricesAdd` mutation.
*/
public class PriceListFixedPricesAddPayloadQuery extends Query<PriceListFixedPricesAddPayloadQuery> {
    PriceListFixedPricesAddPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of fixed prices that were added to or updated in the price list.
    */
    public PriceListFixedPricesAddPayloadQuery prices(PriceListPriceQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new PriceListPriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PriceListFixedPricesAddPayloadQuery userErrors(PriceListPriceUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PriceListPriceUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
