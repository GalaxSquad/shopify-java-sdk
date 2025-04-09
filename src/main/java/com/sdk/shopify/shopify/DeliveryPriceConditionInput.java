// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class DeliveryPriceConditionInput implements Serializable {
    private Input<MoneyInput> criteria = Input.undefined();

    private Input<DeliveryConditionOperator> operator = Input.undefined();

    public MoneyInput getCriteria() {
        return criteria.getValue();
    }

    public Input<MoneyInput> getCriteriaInput() {
        return criteria;
    }

    public DeliveryPriceConditionInput setCriteria(MoneyInput criteria) {
        this.criteria = Input.optional(criteria);
        return this;
    }

    public DeliveryPriceConditionInput setCriteriaInput(Input<MoneyInput> criteria) {
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

    public DeliveryPriceConditionInput setOperator(DeliveryConditionOperator operator) {
        this.operator = Input.optional(operator);
        return this;
    }

    public DeliveryPriceConditionInput setOperatorInput(Input<DeliveryConditionOperator> operator) {
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
