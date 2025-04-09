// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `priceListCreate` mutation.
*/
public class PriceListCreatePayloadQuery extends Query<PriceListCreatePayloadQuery> {
    PriceListCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created price list.
    */
    public PriceListCreatePayloadQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PriceListCreatePayloadQuery userErrors(PriceListUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PriceListUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
