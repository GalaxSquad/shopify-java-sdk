// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The selected delivery option on a subscription contract.
*/
public class SubscriptionDeliveryMethodLocalDeliveryOptionQuery extends Query<SubscriptionDeliveryMethodLocalDeliveryOptionQuery> {
    SubscriptionDeliveryMethodLocalDeliveryOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A custom reference to the delivery method for use with automations.
    */
    public SubscriptionDeliveryMethodLocalDeliveryOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The details displayed to the customer to describe the local delivery option.
    */
    public SubscriptionDeliveryMethodLocalDeliveryOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The delivery instructions that the customer can provide to the merchant.
    */
    public SubscriptionDeliveryMethodLocalDeliveryOptionQuery instructions() {
        startField("instructions");

        return this;
    }

    /**
    * The phone number that the customer provided to the merchant.
    * Formatted using E.164 standard. For example, `+16135551111`.
    */
    public SubscriptionDeliveryMethodLocalDeliveryOptionQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The presentment title of the local delivery option.
    */
    public SubscriptionDeliveryMethodLocalDeliveryOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The title of the local delivery option.
    */
    public SubscriptionDeliveryMethodLocalDeliveryOptionQuery title() {
        startField("title");

        return this;
    }
}
