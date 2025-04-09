// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketCreate` mutation.
*/
public class MarketCreatePayloadQuery extends Query<MarketCreatePayloadQuery> {
    MarketCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The market object.
    */
    public MarketCreatePayloadQuery market(MarketQueryDefinition queryDef) {
        startField("market");

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketCreatePayloadQuery userErrors(MarketUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
