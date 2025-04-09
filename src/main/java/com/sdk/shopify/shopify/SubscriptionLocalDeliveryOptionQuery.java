// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A local delivery option for a subscription contract.
*/
public class SubscriptionLocalDeliveryOptionQuery extends Query<SubscriptionLocalDeliveryOptionQuery> {
    SubscriptionLocalDeliveryOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The description of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * Whether a phone number is required for the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery phoneRequired() {
        startField("phoneRequired");

        return this;
    }

    /**
    * The presentment title of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The price of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the local delivery option.
    */
    public SubscriptionLocalDeliveryOptionQuery title() {
        startField("title");

        return this;
    }
}
