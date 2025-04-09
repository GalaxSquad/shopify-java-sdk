// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type of discount that will be applied. Currently, only a percentage discount is supported.
*/
public class DiscountEffectQuery extends Query<DiscountEffectQuery> {
    DiscountEffectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountEffectQuery onDiscountAmount(DiscountAmountQueryDefinition queryDef) {
        startInlineFragment("DiscountAmount");
        queryDef.define(new DiscountAmountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountEffectQuery onDiscountPercentage(DiscountPercentageQueryDefinition queryDef) {
        startInlineFragment("DiscountPercentage");
        queryDef.define(new DiscountPercentageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
