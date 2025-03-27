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
* A condition that must pass for a delivery method definition to be applied to an order.
*/
public class DeliveryConditionQuery extends Query<DeliveryConditionQuery> {
    DeliveryConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The value (weight or price) that the condition field is compared to.
    */
    public DeliveryConditionQuery conditionCriteria(DeliveryConditionCriteriaQueryDefinition queryDef) {
        startField("conditionCriteria");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryConditionCriteriaQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The field to compare the criterion value against, using the operator.
    */
    public DeliveryConditionQuery field() {
        startField("field");

        return this;
    }

    /**
    * The operator to compare the field and criterion value.
    */
    public DeliveryConditionQuery operator() {
        startField("operator");

        return this;
    }
}
