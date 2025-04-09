// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The delivery option for a subscription contract.
*/
public class SubscriptionDeliveryOptionResultSuccessQuery extends Query<SubscriptionDeliveryOptionResultSuccessQuery> {
    SubscriptionDeliveryOptionResultSuccessQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The available delivery options.
    */
    public SubscriptionDeliveryOptionResultSuccessQuery deliveryOptions(SubscriptionDeliveryOptionQueryDefinition queryDef) {
        startField("deliveryOptions");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
