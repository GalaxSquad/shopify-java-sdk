// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketingActivityDeleteExternal` mutation.
*/
public class MarketingActivityDeleteExternalPayloadQuery extends Query<MarketingActivityDeleteExternalPayloadQuery> {
    MarketingActivityDeleteExternalPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the marketing activity that was deleted, if one was deleted.
    */
    public MarketingActivityDeleteExternalPayloadQuery deletedMarketingActivityId() {
        startField("deletedMarketingActivityId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingActivityDeleteExternalPayloadQuery userErrors(MarketingActivityUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
