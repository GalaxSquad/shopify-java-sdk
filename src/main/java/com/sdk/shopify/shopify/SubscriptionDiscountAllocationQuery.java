// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents what a particular discount reduces from a line price.
*/
public class SubscriptionDiscountAllocationQuery extends Query<SubscriptionDiscountAllocationQuery> {
    SubscriptionDiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Allocation amount.
    */
    public SubscriptionDiscountAllocationQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Discount that created the allocation.
    */
    public SubscriptionDiscountAllocationQuery discount(SubscriptionDiscountQueryDefinition queryDef) {
        startField("discount");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
