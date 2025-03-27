// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `priceListDelete` mutation.
*/
public class PriceListDeletePayloadQuery extends Query<PriceListDeletePayloadQuery> {
    PriceListDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted price list.
    */
    public PriceListDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PriceListDeletePayloadQuery userErrors(PriceListUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PriceListUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
