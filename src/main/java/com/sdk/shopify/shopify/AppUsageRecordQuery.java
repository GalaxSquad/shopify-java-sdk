// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Store usage for app subscriptions with usage pricing.
*/
public class AppUsageRecordQuery extends Query<AppUsageRecordQuery> {
    AppUsageRecordQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The date and time when the usage record was created.
    */
    public AppUsageRecordQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The description of the app usage record.
    */
    public AppUsageRecordQuery description() {
        startField("description");

        return this;
    }

    /**
    * A unique key generated by the client to avoid duplicate charges.
    */
    public AppUsageRecordQuery idempotencyKey() {
        startField("idempotencyKey");

        return this;
    }

    /**
    * The price of the usage record.
    */
    public AppUsageRecordQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Defines the usage pricing plan the merchant is subscribed to.
    */
    public AppUsageRecordQuery subscriptionLineItem(AppSubscriptionLineItemQueryDefinition queryDef) {
        startField("subscriptionLineItem");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
