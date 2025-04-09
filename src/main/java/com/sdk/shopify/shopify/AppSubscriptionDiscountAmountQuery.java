// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The fixed amount value of a discount.
*/
public class AppSubscriptionDiscountAmountQuery extends Query<AppSubscriptionDiscountAmountQuery> {
    AppSubscriptionDiscountAmountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fixed amount value of a discount.
    */
    public AppSubscriptionDiscountAmountQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
