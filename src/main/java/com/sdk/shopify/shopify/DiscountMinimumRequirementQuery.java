// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type of minimum requirement that must be met for the discount to be applied. For example, a
* customer must spend a minimum subtotal to be eligible for the discount. Alternatively, a customer
* must purchase a minimum quantity of items to be eligible for the discount.
*/
public class DiscountMinimumRequirementQuery extends Query<DiscountMinimumRequirementQuery> {
    DiscountMinimumRequirementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountMinimumRequirementQuery onDiscountMinimumQuantity(DiscountMinimumQuantityQueryDefinition queryDef) {
        startInlineFragment("DiscountMinimumQuantity");
        queryDef.define(new DiscountMinimumQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountMinimumRequirementQuery onDiscountMinimumSubtotal(DiscountMinimumSubtotalQueryDefinition queryDef) {
        startInlineFragment("DiscountMinimumSubtotal");
        queryDef.define(new DiscountMinimumSubtotalQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
