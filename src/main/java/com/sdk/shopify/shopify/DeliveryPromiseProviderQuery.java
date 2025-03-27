// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A delivery promise provider. Currently restricted to select approved delivery promise partners.
*/
public class DeliveryPromiseProviderQuery extends Query<DeliveryPromiseProviderQuery> {
    DeliveryPromiseProviderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
    */
    public DeliveryPromiseProviderQuery active() {
        startField("active");

        return this;
    }

    /**
    * The number of seconds to add to the current time as a buffer when looking up delivery promises.
    * Represents how long the shop requires before releasing an order to the fulfillment provider.
    */
    public DeliveryPromiseProviderQuery fulfillmentDelay() {
        startField("fulfillmentDelay");

        return this;
    }

    /**
    * The location associated with this delivery promise provider.
    */
    public DeliveryPromiseProviderQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The time zone to be used for interpreting day of week and cutoff times in delivery schedules when
    * looking up delivery promises.
    */
    public DeliveryPromiseProviderQuery timeZone() {
        startField("timeZone");

        return this;
    }
}
