// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type of discount associated with the discount code. For example, the discount code might offer a
* basic discount of a fixed percentage, or a fixed amount, on specific products or the order.
* Alternatively, the discount might offer the customer free shipping on their order. A third option is
* a Buy X, Get Y (BXGY) discount, which offers a customer discounts on select products if they add a
* specific product to their order.
*/
public class DiscountCodeQuery extends Query<DiscountCodeQuery> {
    DiscountCodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountCodeQuery onDiscountCodeApp(DiscountCodeAppQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeApp");
        queryDef.define(new DiscountCodeAppQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCodeQuery onDiscountCodeBasic(DiscountCodeBasicQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeBasic");
        queryDef.define(new DiscountCodeBasicQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCodeQuery onDiscountCodeBxgy(DiscountCodeBxgyQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeBxgy");
        queryDef.define(new DiscountCodeBxgyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountCodeQuery onDiscountCodeFreeShipping(DiscountCodeFreeShippingQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeFreeShipping");
        queryDef.define(new DiscountCodeFreeShippingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
