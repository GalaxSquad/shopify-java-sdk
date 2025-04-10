// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `priceListFixedPricesByProductUpdate` mutation.
*/
public class PriceListFixedPricesByProductUpdatePayloadQuery extends Query<PriceListFixedPricesByProductUpdatePayloadQuery> {
    PriceListFixedPricesByProductUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The price list for which the fixed prices were modified.
    */
    public PriceListFixedPricesByProductUpdatePayloadQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product for which the fixed prices were added.
    */
    public PriceListFixedPricesByProductUpdatePayloadQuery pricesToAddProducts(ProductQueryDefinition queryDef) {
        startField("pricesToAddProducts");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product for which the fixed prices were deleted.
    */
    public PriceListFixedPricesByProductUpdatePayloadQuery pricesToDeleteProducts(ProductQueryDefinition queryDef) {
        startField("pricesToDeleteProducts");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PriceListFixedPricesByProductUpdatePayloadQuery userErrors(PriceListFixedPricesByProductBulkUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PriceListFixedPricesByProductBulkUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
