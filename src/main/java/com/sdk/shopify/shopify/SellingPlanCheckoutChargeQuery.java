// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The amount charged at checkout when the full amount isn't charged at checkout.
*/
public class SellingPlanCheckoutChargeQuery extends Query<SellingPlanCheckoutChargeQuery> {
    SellingPlanCheckoutChargeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The charge type for the checkout charge.
    */
    public SellingPlanCheckoutChargeQuery type() {
        startField("type");

        return this;
    }

    /**
    * The charge value for the checkout charge.
    */
    public SellingPlanCheckoutChargeQuery value(SellingPlanCheckoutChargeValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanCheckoutChargeValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
