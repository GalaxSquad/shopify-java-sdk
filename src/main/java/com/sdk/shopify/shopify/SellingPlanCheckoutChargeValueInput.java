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

import java.math.BigDecimal;

import java.io.Serializable;

public class SellingPlanCheckoutChargeValueInput implements Serializable {
    private Input<Double> percentage = Input.undefined();

    private Input<BigDecimal> fixedValue = Input.undefined();

    public Double getPercentage() {
        return percentage.getValue();
    }

    public Input<Double> getPercentageInput() {
        return percentage;
    }

    public SellingPlanCheckoutChargeValueInput setPercentage(Double percentage) {
        this.percentage = Input.optional(percentage);
        return this;
    }

    public SellingPlanCheckoutChargeValueInput setPercentageInput(Input<Double> percentage) {
        if (percentage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentage = percentage;
        return this;
    }

    public BigDecimal getFixedValue() {
        return fixedValue.getValue();
    }

    public Input<BigDecimal> getFixedValueInput() {
        return fixedValue;
    }

    public SellingPlanCheckoutChargeValueInput setFixedValue(BigDecimal fixedValue) {
        this.fixedValue = Input.optional(fixedValue);
        return this;
    }

    public SellingPlanCheckoutChargeValueInput setFixedValueInput(Input<BigDecimal> fixedValue) {
        if (fixedValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fixedValue = fixedValue;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.percentage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("percentage:");
            if (percentage.getValue() != null) {
                _queryBuilder.append(percentage.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fixedValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fixedValue:");
            if (fixedValue.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, fixedValue.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
