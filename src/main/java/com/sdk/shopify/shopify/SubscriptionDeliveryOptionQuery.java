// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The delivery option for a subscription contract.
*/
public class SubscriptionDeliveryOptionQuery extends Query<SubscriptionDeliveryOptionQuery> {
    SubscriptionDeliveryOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionDeliveryOptionQuery onSubscriptionLocalDeliveryOption(SubscriptionLocalDeliveryOptionQueryDefinition queryDef) {
        startInlineFragment("SubscriptionLocalDeliveryOption");
        queryDef.define(new SubscriptionLocalDeliveryOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryOptionQuery onSubscriptionPickupOption(SubscriptionPickupOptionQueryDefinition queryDef) {
        startInlineFragment("SubscriptionPickupOption");
        queryDef.define(new SubscriptionPickupOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionDeliveryOptionQuery onSubscriptionShippingOption(SubscriptionShippingOptionQueryDefinition queryDef) {
        startInlineFragment("SubscriptionShippingOption");
        queryDef.define(new SubscriptionShippingOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
