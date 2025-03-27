// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The minimum subtotal required for the discount to apply.
*/
public class DiscountMinimumSubtotalQuery extends Query<DiscountMinimumSubtotalQuery> {
    DiscountMinimumSubtotalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The minimum subtotal that's required for the discount to be applied.
    */
    public DiscountMinimumSubtotalQuery greaterThanOrEqualToSubtotal(MoneyV2QueryDefinition queryDef) {
        startField("greaterThanOrEqualToSubtotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
