// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketingActivityUpsertExternal` mutation.
*/
public class MarketingActivityUpsertExternalPayloadQuery extends Query<MarketingActivityUpsertExternalPayloadQuery> {
    MarketingActivityUpsertExternalPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The external marketing activity that was created or updated.
    */
    public MarketingActivityUpsertExternalPayloadQuery marketingActivity(MarketingActivityQueryDefinition queryDef) {
        startField("marketingActivity");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingActivityUpsertExternalPayloadQuery userErrors(MarketingActivityUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
