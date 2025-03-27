// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A pickup option to deliver a subscription contract.
*/
public class SubscriptionPickupOptionQuery extends Query<SubscriptionPickupOptionQuery> {
    SubscriptionPickupOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the pickup option.
    */
    public SubscriptionPickupOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The description of the pickup option.
    */
    public SubscriptionPickupOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The pickup location.
    */
    public SubscriptionPickupOptionQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether a phone number is required for the pickup option.
    */
    public SubscriptionPickupOptionQuery phoneRequired() {
        startField("phoneRequired");

        return this;
    }

    /**
    * The estimated amount of time it takes for the pickup to be ready. For example, "Usually ready in 24
    * hours".).
    */
    public SubscriptionPickupOptionQuery pickupTime() {
        startField("pickupTime");

        return this;
    }

    /**
    * The presentment title of the pickup option.
    */
    public SubscriptionPickupOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The price of the pickup option.
    */
    public SubscriptionPickupOptionQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the pickup option.
    */
    public SubscriptionPickupOptionQuery title() {
        startField("title");

        return this;
    }
}
