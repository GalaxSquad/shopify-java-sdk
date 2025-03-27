// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the selected pickup option on a subscription contract.
*/
public class SubscriptionDeliveryMethodPickupOptionQuery extends Query<SubscriptionDeliveryMethodPickupOptionQuery> {
    SubscriptionDeliveryMethodPickupOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A custom reference to the delivery method for use with automations.
    */
    public SubscriptionDeliveryMethodPickupOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The details displayed to the customer to describe the pickup option.
    */
    public SubscriptionDeliveryMethodPickupOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The location where the customer will pick up the merchandise.
    */
    public SubscriptionDeliveryMethodPickupOptionQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The presentment title of the pickup option.
    */
    public SubscriptionDeliveryMethodPickupOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The title of the pickup option.
    */
    public SubscriptionDeliveryMethodPickupOptionQuery title() {
        startField("title");

        return this;
    }
}
