// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The selling plan inventory policy.
*/
public class SellingPlanInventoryPolicyQuery extends Query<SellingPlanInventoryPolicyQuery> {
    SellingPlanInventoryPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * When to reserve inventory for the order.
    */
    public SellingPlanInventoryPolicyQuery reserve() {
        startField("reserve");

        return this;
    }
}
