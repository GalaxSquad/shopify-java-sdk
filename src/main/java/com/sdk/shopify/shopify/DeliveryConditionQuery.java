// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
