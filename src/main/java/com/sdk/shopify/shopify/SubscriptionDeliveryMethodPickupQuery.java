// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A delivery method with a pickup option.
*/
public class SubscriptionDeliveryMethodPickupQuery extends Query<SubscriptionDeliveryMethodPickupQuery> {
    SubscriptionDeliveryMethodPickupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The details of the pickup delivery method to use.
    */
    public SubscriptionDeliveryMethodPickupQuery pickupOption(SubscriptionDeliveryMethodPickupOptionQueryDefinition queryDef) {
        startField("pickupOption");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryMethodPickupOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
