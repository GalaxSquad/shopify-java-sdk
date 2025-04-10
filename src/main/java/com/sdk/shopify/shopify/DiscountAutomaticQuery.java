// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type of discount associated to the automatic discount. For example, the automatic discount might
* offer a basic discount using a fixed percentage, or a fixed amount, on specific products from the
* order. The automatic discount may also be a BXGY discount, which offers customer discounts on select
* products if they add a specific product to their order.
*/
public class DiscountAutomaticQuery extends Query<DiscountAutomaticQuery> {
    DiscountAutomaticQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountAutomaticQuery onDiscountAutomaticApp(DiscountAutomaticAppQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticApp");
        queryDef.define(new DiscountAutomaticAppQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountAutomaticQuery onDiscountAutomaticBasic(DiscountAutomaticBasicQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticBasic");
        queryDef.define(new DiscountAutomaticBasicQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountAutomaticQuery onDiscountAutomaticBxgy(DiscountAutomaticBxgyQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticBxgy");
        queryDef.define(new DiscountAutomaticBxgyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountAutomaticQuery onDiscountAutomaticFreeShipping(DiscountAutomaticFreeShippingQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticFreeShipping");
        queryDef.define(new DiscountAutomaticFreeShippingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
