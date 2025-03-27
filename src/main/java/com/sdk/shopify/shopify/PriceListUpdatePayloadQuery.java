// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `priceListUpdate` mutation.
*/
public class PriceListUpdatePayloadQuery extends Query<PriceListUpdatePayloadQuery> {
    PriceListUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated price list.
    */
    public PriceListUpdatePayloadQuery priceList(PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PriceListUpdatePayloadQuery userErrors(PriceListUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PriceListUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
