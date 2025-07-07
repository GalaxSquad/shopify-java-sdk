// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class UnitPriceMeasurementInput implements Serializable {
    private Input<Double> quantityValue = Input.undefined();

    private Input<UnitPriceMeasurementMeasuredUnit> quantityUnit = Input.undefined();

    private Input<Integer> referenceValue = Input.undefined();

    private Input<UnitPriceMeasurementMeasuredUnit> referenceUnit = Input.undefined();

    public Double getQuantityValue() {
        return quantityValue.getValue();
    }

    public Input<Double> getQuantityValueInput() {
        return quantityValue;
    }

    public UnitPriceMeasurementInput setQuantityValue(Double quantityValue) {
        this.quantityValue = Input.optional(quantityValue);
        return this;
    }

    public UnitPriceMeasurementInput setQuantityValueInput(Input<Double> quantityValue) {
        if (quantityValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantityValue = quantityValue;
        return this;
    }

    public UnitPriceMeasurementMeasuredUnit getQuantityUnit() {
        return quantityUnit.getValue();
    }

    public Input<UnitPriceMeasurementMeasuredUnit> getQuantityUnitInput() {
        return quantityUnit;
    }

    public UnitPriceMeasurementInput setQuantityUnit(UnitPriceMeasurementMeasuredUnit quantityUnit) {
        this.quantityUnit = Input.optional(quantityUnit);
        return this;
    }

    public UnitPriceMeasurementInput setQuantityUnitInput(Input<UnitPriceMeasurementMeasuredUnit> quantityUnit) {
        if (quantityUnit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantityUnit = quantityUnit;
        return this;
    }

    public Integer getReferenceValue() {
        return referenceValue.getValue();
    }

    public Input<Integer> getReferenceValueInput() {
        return referenceValue;
    }

    public UnitPriceMeasurementInput setReferenceValue(Integer referenceValue) {
        this.referenceValue = Input.optional(referenceValue);
        return this;
    }

    public UnitPriceMeasurementInput setReferenceValueInput(Input<Integer> referenceValue) {
        if (referenceValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referenceValue = referenceValue;
        return this;
    }

    public UnitPriceMeasurementMeasuredUnit getReferenceUnit() {
        return referenceUnit.getValue();
    }

    public Input<UnitPriceMeasurementMeasuredUnit> getReferenceUnitInput() {
        return referenceUnit;
    }

    public UnitPriceMeasurementInput setReferenceUnit(UnitPriceMeasurementMeasuredUnit referenceUnit) {
        this.referenceUnit = Input.optional(referenceUnit);
        return this;
    }

    public UnitPriceMeasurementInput setReferenceUnitInput(Input<UnitPriceMeasurementMeasuredUnit> referenceUnit) {
        if (referenceUnit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referenceUnit = referenceUnit;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.quantityValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantityValue:");
            if (quantityValue.getValue() != null) {
                _queryBuilder.append(quantityValue.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.quantityUnit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantityUnit:");
            if (quantityUnit.getValue() != null) {
                _queryBuilder.append(quantityUnit.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.referenceValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referenceValue:");
            if (referenceValue.getValue() != null) {
                _queryBuilder.append(referenceValue.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.referenceUnit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referenceUnit:");
            if (referenceUnit.getValue() != null) {
                _queryBuilder.append(referenceUnit.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
