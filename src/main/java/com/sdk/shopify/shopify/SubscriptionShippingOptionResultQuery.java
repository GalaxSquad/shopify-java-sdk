// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The result of the query to fetch shipping options for the subscription contract.
*/
public class SubscriptionShippingOptionResultQuery extends Query<SubscriptionShippingOptionResultQuery> {
    SubscriptionShippingOptionResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SubscriptionShippingOptionResultQuery onSubscriptionShippingOptionResultFailure(SubscriptionShippingOptionResultFailureQueryDefinition queryDef) {
        startInlineFragment("SubscriptionShippingOptionResultFailure");
        queryDef.define(new SubscriptionShippingOptionResultFailureQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SubscriptionShippingOptionResultQuery onSubscriptionShippingOptionResultSuccess(SubscriptionShippingOptionResultSuccessQueryDefinition queryDef) {
        startInlineFragment("SubscriptionShippingOptionResultSuccess");
        queryDef.define(new SubscriptionShippingOptionResultSuccessQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
