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

import java.io.Serializable;

public class DeliveryWeightConditionInput implements Serializable {
    private Input<WeightInput> criteria = Input.undefined();

    private Input<DeliveryConditionOperator> operator = Input.undefined();

    public WeightInput getCriteria() {
        return criteria.getValue();
    }

    public Input<WeightInput> getCriteriaInput() {
        return criteria;
    }

    public DeliveryWeightConditionInput setCriteria(WeightInput criteria) {
        this.criteria = Input.optional(criteria);
        return this;
    }

    public DeliveryWeightConditionInput setCriteriaInput(Input<WeightInput> criteria) {
        if (criteria == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.criteria = criteria;
        return this;
    }

    public DeliveryConditionOperator getOperator() {
        return operator.getValue();
    }

    public Input<DeliveryConditionOperator> getOperatorInput() {
        return operator;
    }

    public DeliveryWeightConditionInput setOperator(DeliveryConditionOperator operator) {
        this.operator = Input.optional(operator);
        return this;
    }

    public DeliveryWeightConditionInput setOperatorInput(Input<DeliveryConditionOperator> operator) {
        if (operator == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.operator = operator;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.criteria.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("criteria:");
            if (criteria.getValue() != null) {
                criteria.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.operator.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("operator:");
            if (operator.getValue() != null) {
                _queryBuilder.append(operator.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
