// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketingEngagementCreate` mutation.
*/
public class MarketingEngagementCreatePayloadQuery extends Query<MarketingEngagementCreatePayloadQuery> {
    MarketingEngagementCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The marketing engagement that was created. This represents customer activity taken on a marketing
    * activity or a marketing channel.
    */
    public MarketingEngagementCreatePayloadQuery marketingEngagement(MarketingEngagementQueryDefinition queryDef) {
        startField("marketingEngagement");

        _queryBuilder.append('{');
        queryDef.define(new MarketingEngagementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingEngagementCreatePayloadQuery userErrors(MarketingActivityUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
