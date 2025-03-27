// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a shipping delivery method: a mailing address and a shipping option.
*/
public class SubscriptionDeliveryMethodShippingQuery extends Query<SubscriptionDeliveryMethodShippingQuery> {
    SubscriptionDeliveryMethodShippingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The address to ship to.
    */
    public SubscriptionDeliveryMethodShippingQuery address(SubscriptionMailingAddressQueryDefinition queryDef) {
        startField("address");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionMailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The details of the shipping method to use.
    */
    public SubscriptionDeliveryMethodShippingQuery shippingOption(SubscriptionDeliveryMethodShippingOptionQueryDefinition queryDef) {
        startField("shippingOption");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryMethodShippingOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
