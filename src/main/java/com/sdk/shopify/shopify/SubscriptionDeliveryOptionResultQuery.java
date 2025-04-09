// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The result of the query to fetch delivery options for the subscription contract.
*/
public class SubscriptionDeliveryOptionResultQuery extends Query<SubscriptionDeliveryOptionResultQuery> {
    SubscriptionDeliveryOptionResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionDeliveryOptionResultQuery onSubscriptionDeliveryOptionResultFailure(SubscriptionDeliveryOptionResultFailureQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryOptionResultFailure");
        queryDef.define(new SubscriptionDeliveryOptionResultFailureQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryOptionResultQuery onSubscriptionDeliveryOptionResultSuccess(SubscriptionDeliveryOptionResultSuccessQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryOptionResultSuccess");
        queryDef.define(new SubscriptionDeliveryOptionResultSuccessQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
