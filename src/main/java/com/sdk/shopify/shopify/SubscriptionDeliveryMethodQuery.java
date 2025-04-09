// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Describes the delivery method to use to get the physical goods to the customer.
*/
public class SubscriptionDeliveryMethodQuery extends Query<SubscriptionDeliveryMethodQuery> {
    SubscriptionDeliveryMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionDeliveryMethodQuery onSubscriptionDeliveryMethodLocalDelivery(SubscriptionDeliveryMethodLocalDeliveryQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryMethodLocalDelivery");
        queryDef.define(new SubscriptionDeliveryMethodLocalDeliveryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryMethodQuery onSubscriptionDeliveryMethodPickup(SubscriptionDeliveryMethodPickupQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryMethodPickup");
        queryDef.define(new SubscriptionDeliveryMethodPickupQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryMethodQuery onSubscriptionDeliveryMethodShipping(SubscriptionDeliveryMethodShippingQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDeliveryMethodShipping");
        queryDef.define(new SubscriptionDeliveryMethodShippingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
