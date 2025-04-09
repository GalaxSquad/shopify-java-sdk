// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type of the discount value and how it will be applied. For example, it might be a percentage
* discount on a fixed number of items. Alternatively, it might be a fixed amount evenly distributed
* across all items or on each individual item. A third example is a percentage discount on all items.
*/
public class DiscountCustomerGetsValueQuery extends Query<DiscountCustomerGetsValueQuery> {
    DiscountCustomerGetsValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountCustomerGetsValueQuery onDiscountAmount(DiscountAmountQueryDefinition queryDef) {
        startInlineFragment("DiscountAmount");
        queryDef.define(new DiscountAmountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCustomerGetsValueQuery onDiscountOnQuantity(DiscountOnQuantityQueryDefinition queryDef) {
        startInlineFragment("DiscountOnQuantity");
        queryDef.define(new DiscountOnQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCustomerGetsValueQuery onDiscountPercentage(DiscountPercentageQueryDefinition queryDef) {
        startInlineFragment("DiscountPercentage");
        queryDef.define(new DiscountPercentageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
