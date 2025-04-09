// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionBillingAttemptCreate` mutation.
*/
public class SubscriptionBillingAttemptCreatePayloadQuery extends Query<SubscriptionBillingAttemptCreatePayloadQuery> {
    SubscriptionBillingAttemptCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The subscription billing attempt.
    */
    public SubscriptionBillingAttemptCreatePayloadQuery subscriptionBillingAttempt(SubscriptionBillingAttemptQueryDefinition queryDef) {
        startField("subscriptionBillingAttempt");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingAttemptQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingAttemptCreatePayloadQuery userErrors(BillingAttemptUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BillingAttemptUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
