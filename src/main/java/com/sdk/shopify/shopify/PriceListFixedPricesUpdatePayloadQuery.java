// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `priceListFixedPricesUpdate` mutation.
*/
public class PriceListFixedPricesUpdatePayloadQuery extends Query<PriceListFixedPricesUpdatePayloadQuery> {
    PriceListFixedPricesUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of deleted variant IDs for prices.
    */
    public PriceListFixedPricesUpdatePayloadQuery deletedFixedPriceVariantIds() {
        startField("deletedFixedPriceVariantIds");

        return this;
    }

    /**
    * The price list for which the fixed prices were modified.
    */
    public PriceListFixedPricesUpdatePayloadQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The prices that were added to the price list.
    */
    public PriceListFixedPricesUpdatePayloadQuery pricesAdded(PriceListPriceQueryDefinition queryDef) {
        startField("pricesAdded");

        _queryBuilder.append('{');
        queryDef.define(new PriceListPriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PriceListFixedPricesUpdatePayloadQuery userErrors(PriceListPriceUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PriceListPriceUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
