// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the selected shipping option on a subscription contract.
*/
public class SubscriptionDeliveryMethodShippingOptionQuery extends Query<SubscriptionDeliveryMethodShippingOptionQuery> {
    SubscriptionDeliveryMethodShippingOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The description of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The presentment title of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The title of the shipping option.
    */
    public SubscriptionDeliveryMethodShippingOptionQuery title() {
        startField("title");

        return this;
    }
}
