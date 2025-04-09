// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shipping option for delivery of a subscription contract.
*/
public class SubscriptionShippingOptionResultSuccessQuery extends Query<SubscriptionShippingOptionResultSuccessQuery> {
    SubscriptionShippingOptionResultSuccessQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Available shipping options.
    */
    public SubscriptionShippingOptionResultSuccessQuery shippingOptions(SubscriptionShippingOptionQueryDefinition queryDef) {
        startField("shippingOptions");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionShippingOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
