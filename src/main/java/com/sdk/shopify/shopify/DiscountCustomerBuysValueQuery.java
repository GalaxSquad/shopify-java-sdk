// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The prerequisite for the discount to be applicable. For example, the discount might require a
* customer to buy a minimum quantity of select items. Alternatively, the discount might require a
* customer to spend a minimum amount on select items.
*/
public class DiscountCustomerBuysValueQuery extends Query<DiscountCustomerBuysValueQuery> {
    DiscountCustomerBuysValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountCustomerBuysValueQuery onDiscountPurchaseAmount(DiscountPurchaseAmountQueryDefinition queryDef) {
        startInlineFragment("DiscountPurchaseAmount");
        queryDef.define(new DiscountPurchaseAmountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCustomerBuysValueQuery onDiscountQuantity(DiscountQuantityQueryDefinition queryDef) {
        startInlineFragment("DiscountQuantity");
        queryDef.define(new DiscountQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
