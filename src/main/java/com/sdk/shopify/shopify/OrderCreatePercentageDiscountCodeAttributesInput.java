// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderCreatePercentageDiscountCodeAttributesInput implements Serializable {
    private String code;

    private Input<Double> percentage = Input.undefined();

    public OrderCreatePercentageDiscountCodeAttributesInput(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public OrderCreatePercentageDiscountCodeAttributesInput setCode(String code) {
        this.code = code;
        return this;
    }

    public Double getPercentage() {
        return percentage.getValue();
    }

    public Input<Double> getPercentageInput() {
        return percentage;
    }

    public OrderCreatePercentageDiscountCodeAttributesInput setPercentage(Double percentage) {
        this.percentage = Input.optional(percentage);
        return this;
    }

    public OrderCreatePercentageDiscountCodeAttributesInput setPercentageInput(Input<Double> percentage) {
        if (percentage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentage = percentage;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("code:");
        Query.appendQuotedString(_queryBuilder, code.toString());

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

        _queryBuilder.append('}');
    }
}
