// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketingActivitiesDeleteAllExternal` mutation.
*/
public class MarketingActivitiesDeleteAllExternalPayloadQuery extends Query<MarketingActivitiesDeleteAllExternalPayloadQuery> {
    MarketingActivitiesDeleteAllExternalPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job that performs the deletion. The status of the job may be used to determine when
    * it's safe again to create new activities.
    */
    public MarketingActivitiesDeleteAllExternalPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingActivitiesDeleteAllExternalPayloadQuery userErrors(MarketingActivityUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
