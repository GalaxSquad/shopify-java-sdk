// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Provides users access to services and/or features for a duration of time.
*/
public class AppSubscriptionQuery extends Query<AppSubscriptionQuery> {
    AppSubscriptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the app subscription was created.
    */
    public AppSubscriptionQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The date and time when the current app subscription period ends. Returns `null` if the subscription
    * isn't active.
    */
    public AppSubscriptionQuery currentPeriodEnd() {
        startField("currentPeriodEnd");

        return this;
    }

    /**
    * The plans attached to the app subscription.
    */
    public AppSubscriptionQuery lineItems(AppSubscriptionLineItemQueryDefinition queryDef) {
        startField("lineItems");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the app subscription.
    */
    public AppSubscriptionQuery name() {
        startField("name");

        return this;
    }

    /**
    * The URL that the merchant is redirected to after approving the app subscription.
    */
    public AppSubscriptionQuery returnUrl() {
        startField("returnUrl");

        return this;
    }

    /**
    * The status of the app subscription.
    */
    public AppSubscriptionQuery status() {
        startField("status");

        return this;
    }

    /**
    * Specifies whether the app subscription is a test transaction.
    */
    public AppSubscriptionQuery test() {
        startField("test");

        return this;
    }

    /**
    * The number of free trial days, starting at the subscription's creation date, by which billing is
    * delayed.
    */
    public AppSubscriptionQuery trialDays() {
        startField("trialDays");

        return this;
    }
}
