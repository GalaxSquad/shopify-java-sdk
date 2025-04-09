// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `appSubscriptionTrialExtend` mutation.
*/
public class AppSubscriptionTrialExtendPayloadQuery extends Query<AppSubscriptionTrialExtendPayloadQuery> {
    AppSubscriptionTrialExtendPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The app subscription that had its trial extended.
    */
    public AppSubscriptionTrialExtendPayloadQuery appSubscription(AppSubscriptionQueryDefinition queryDef) {
        startField("appSubscription");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppSubscriptionTrialExtendPayloadQuery userErrors(AppSubscriptionTrialExtendUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionTrialExtendUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
