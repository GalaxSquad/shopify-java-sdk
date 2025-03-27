// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
