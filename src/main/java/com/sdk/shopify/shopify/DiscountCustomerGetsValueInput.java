// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class DiscountCustomerGetsValueInput implements Serializable {
    private Input<DiscountOnQuantityInput> discountOnQuantity = Input.undefined();

    private Input<Double> percentage = Input.undefined();

    private Input<DiscountAmountInput> discountAmount = Input.undefined();

    public DiscountOnQuantityInput getDiscountOnQuantity() {
        return discountOnQuantity.getValue();
    }

    public Input<DiscountOnQuantityInput> getDiscountOnQuantityInput() {
        return discountOnQuantity;
    }

    public DiscountCustomerGetsValueInput setDiscountOnQuantity(DiscountOnQuantityInput discountOnQuantity) {
        this.discountOnQuantity = Input.optional(discountOnQuantity);
        return this;
    }

    public DiscountCustomerGetsValueInput setDiscountOnQuantityInput(Input<DiscountOnQuantityInput> discountOnQuantity) {
        if (discountOnQuantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discountOnQuantity = discountOnQuantity;
        return this;
    }

    public Double getPercentage() {
        return percentage.getValue();
    }

    public Input<Double> getPercentageInput() {
        return percentage;
    }

    public DiscountCustomerGetsValueInput setPercentage(Double percentage) {
        this.percentage = Input.optional(percentage);
        return this;
    }

    public DiscountCustomerGetsValueInput setPercentageInput(Input<Double> percentage) {
        if (percentage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentage = percentage;
        return this;
    }

    public DiscountAmountInput getDiscountAmount() {
        return discountAmount.getValue();
    }

    public Input<DiscountAmountInput> getDiscountAmountInput() {
        return discountAmount;
    }

    public DiscountCustomerGetsValueInput setDiscountAmount(DiscountAmountInput discountAmount) {
        this.discountAmount = Input.optional(discountAmount);
        return this;
    }

    public DiscountCustomerGetsValueInput setDiscountAmountInput(Input<DiscountAmountInput> discountAmount) {
        if (discountAmount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discountAmount = discountAmount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.discountOnQuantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discountOnQuantity:");
            if (discountOnQuantity.getValue() != null) {
                discountOnQuantity.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.discountAmount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discountAmount:");
            if (discountAmount.getValue() != null) {
                discountAmount.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
