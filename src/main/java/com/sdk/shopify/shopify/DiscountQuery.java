// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A discount.
*/
public class DiscountQuery extends Query<DiscountQuery> {
    DiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountQuery onDiscountAutomaticApp(DiscountAutomaticAppQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticApp");
        queryDef.define(new DiscountAutomaticAppQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountQuery onDiscountAutomaticBasic(DiscountAutomaticBasicQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticBasic");
        queryDef.define(new DiscountAutomaticBasicQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountQuery onDiscountAutomaticBxgy(DiscountAutomaticBxgyQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticBxgy");
        queryDef.define(new DiscountAutomaticBxgyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountQuery onDiscountAutomaticFreeShipping(DiscountAutomaticFreeShippingQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticFreeShipping");
        queryDef.define(new DiscountAutomaticFreeShippingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountQuery onDiscountCodeApp(DiscountCodeAppQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeApp");
        queryDef.define(new DiscountCodeAppQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountQuery onDiscountCodeBasic(DiscountCodeBasicQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeBasic");
        queryDef.define(new DiscountCodeBasicQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountQuery onDiscountCodeBxgy(DiscountCodeBxgyQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeBxgy");
        queryDef.define(new DiscountCodeBxgyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountQuery onDiscountCodeFreeShipping(DiscountCodeFreeShippingQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeFreeShipping");
        queryDef.define(new DiscountCodeFreeShippingQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
