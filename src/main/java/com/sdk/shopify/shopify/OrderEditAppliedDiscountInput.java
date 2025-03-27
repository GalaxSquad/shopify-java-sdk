// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderEditAppliedDiscountInput implements Serializable {
    private Input<String> description = Input.undefined();

    private Input<MoneyInput> fixedValue = Input.undefined();

    private Input<Double> percentValue = Input.undefined();

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public OrderEditAppliedDiscountInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public OrderEditAppliedDiscountInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public MoneyInput getFixedValue() {
        return fixedValue.getValue();
    }

    public Input<MoneyInput> getFixedValueInput() {
        return fixedValue;
    }

    public OrderEditAppliedDiscountInput setFixedValue(MoneyInput fixedValue) {
        this.fixedValue = Input.optional(fixedValue);
        return this;
    }

    public OrderEditAppliedDiscountInput setFixedValueInput(Input<MoneyInput> fixedValue) {
        if (fixedValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fixedValue = fixedValue;
        return this;
    }

    public Double getPercentValue() {
        return percentValue.getValue();
    }

    public Input<Double> getPercentValueInput() {
        return percentValue;
    }

    public OrderEditAppliedDiscountInput setPercentValue(Double percentValue) {
        this.percentValue = Input.optional(percentValue);
        return this;
    }

    public OrderEditAppliedDiscountInput setPercentValueInput(Input<Double> percentValue) {
        if (percentValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentValue = percentValue;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fixedValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fixedValue:");
            if (fixedValue.getValue() != null) {
                fixedValue.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.percentValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("percentValue:");
            if (percentValue.getValue() != null) {
                _queryBuilder.append(percentValue.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
