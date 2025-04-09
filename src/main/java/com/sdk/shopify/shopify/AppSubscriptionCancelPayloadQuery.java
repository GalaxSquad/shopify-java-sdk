// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `appSubscriptionCancel` mutation.
*/
public class AppSubscriptionCancelPayloadQuery extends Query<AppSubscriptionCancelPayloadQuery> {
    AppSubscriptionCancelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The cancelled app subscription.
    */
    public AppSubscriptionCancelPayloadQuery appSubscription(AppSubscriptionQueryDefinition queryDef) {
        startField("appSubscription");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppSubscriptionCancelPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
