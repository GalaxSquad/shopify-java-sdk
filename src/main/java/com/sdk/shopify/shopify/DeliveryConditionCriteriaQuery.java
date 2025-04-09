// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The value (weight or price) that the condition field is compared to.
*/
public class DeliveryConditionCriteriaQuery extends Query<DeliveryConditionCriteriaQuery> {
    DeliveryConditionCriteriaQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DeliveryConditionCriteriaQuery onMoneyV2(MoneyV2QueryDefinition queryDef) {
        startInlineFragment("MoneyV2");
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DeliveryConditionCriteriaQuery onWeight(WeightQueryDefinition queryDef) {
        startInlineFragment("Weight");
        queryDef.define(new WeightQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
