// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shipping option to deliver a subscription contract.
*/
public class SubscriptionShippingOptionQuery extends Query<SubscriptionShippingOptionQuery> {
    SubscriptionShippingOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the shipping option.
    */
    public SubscriptionShippingOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * The description of the shipping option.
    */
    public SubscriptionShippingOptionQuery description() {
        startField("description");

        return this;
    }

    /**
    * If a phone number is required for the shipping option.
    */
    public SubscriptionShippingOptionQuery phoneRequired() {
        startField("phoneRequired");

        return this;
    }

    /**
    * The presentment title of the shipping option.
    */
    public SubscriptionShippingOptionQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The price of the shipping option.
    */
    public SubscriptionShippingOptionQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the shipping option.
    */
    public SubscriptionShippingOptionQuery title() {
        startField("title");

        return this;
    }
}
