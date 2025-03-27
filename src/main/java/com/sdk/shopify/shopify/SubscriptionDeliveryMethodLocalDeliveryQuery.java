// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A subscription delivery method for local delivery.
* The other subscription delivery methods can be found in the `SubscriptionDeliveryMethod` union type.
*/
public class SubscriptionDeliveryMethodLocalDeliveryQuery extends Query<SubscriptionDeliveryMethodLocalDeliveryQuery> {
    SubscriptionDeliveryMethodLocalDeliveryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The address to deliver to.
    */
    public SubscriptionDeliveryMethodLocalDeliveryQuery address(SubscriptionMailingAddressQueryDefinition queryDef) {
        startField("address");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionMailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The details of the local delivery method to use.
    */
    public SubscriptionDeliveryMethodLocalDeliveryQuery localDeliveryOption(SubscriptionDeliveryMethodLocalDeliveryOptionQueryDefinition queryDef) {
        startField("localDeliveryOption");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDeliveryMethodLocalDeliveryOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
