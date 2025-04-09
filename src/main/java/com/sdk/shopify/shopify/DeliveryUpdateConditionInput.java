// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DeliveryUpdateConditionInput implements Serializable {
    private ID id;

    private Input<Double> criteria = Input.undefined();

    private Input<String> criteriaUnit = Input.undefined();

    private Input<DeliveryConditionField> field = Input.undefined();

    private Input<DeliveryConditionOperator> operator = Input.undefined();

    public DeliveryUpdateConditionInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public DeliveryUpdateConditionInput setId(ID id) {
        this.id = id;
        return this;
    }

    public Double getCriteria() {
        return criteria.getValue();
    }

    public Input<Double> getCriteriaInput() {
        return criteria;
    }

    public DeliveryUpdateConditionInput setCriteria(Double criteria) {
        this.criteria = Input.optional(criteria);
        return this;
    }

    public DeliveryUpdateConditionInput setCriteriaInput(Input<Double> criteria) {
        if (criteria == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.criteria = criteria;
        return this;
    }

    public String getCriteriaUnit() {
        return criteriaUnit.getValue();
    }

    public Input<String> getCriteriaUnitInput() {
        return criteriaUnit;
    }

    public DeliveryUpdateConditionInput setCriteriaUnit(String criteriaUnit) {
        this.criteriaUnit = Input.optional(criteriaUnit);
        return this;
    }

    public DeliveryUpdateConditionInput setCriteriaUnitInput(Input<String> criteriaUnit) {
        if (criteriaUnit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.criteriaUnit = criteriaUnit;
        return this;
    }

    public DeliveryConditionField getField() {
        return field.getValue();
    }

    public Input<DeliveryConditionField> getFieldInput() {
        return field;
    }

    public DeliveryUpdateConditionInput setField(DeliveryConditionField field) {
        this.field = Input.optional(field);
        return this;
    }

    public DeliveryUpdateConditionInput setFieldInput(Input<DeliveryConditionField> field) {
        if (field == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.field = field;
        return this;
    }

    public DeliveryConditionOperator getOperator() {
        return operator.getValue();
    }

    public Input<DeliveryConditionOperator> getOperatorInput() {
        return operator;
    }

    public DeliveryUpdateConditionInput setOperator(DeliveryConditionOperator operator) {
        this.operator = Input.optional(operator);
        return this;
    }

    public DeliveryUpdateConditionInput setOperatorInput(Input<DeliveryConditionOperator> operator) {
        if (operator == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.operator = operator;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.criteria.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("criteria:");
            if (criteria.getValue() != null) {
                _queryBuilder.append(criteria.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.criteriaUnit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("criteriaUnit:");
            if (criteriaUnit.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, criteriaUnit.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.field.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("field:");
            if (field.getValue() != null) {
                _queryBuilder.append(field.getValue().toString());
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
