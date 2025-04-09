// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class QuantityRuleInput implements Serializable {
    private int increment;

    private int minimum;

    private ID variantId;

    private Input<Integer> maximum = Input.undefined();

    public QuantityRuleInput(int increment, int minimum, ID variantId) {
        this.increment = increment;

        this.minimum = minimum;

        this.variantId = variantId;
    }

    public int getIncrement() {
        return increment;
    }

    public QuantityRuleInput setIncrement(int increment) {
        this.increment = increment;
        return this;
    }

    public int getMinimum() {
        return minimum;
    }

    public QuantityRuleInput setMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    public ID getVariantId() {
        return variantId;
    }

    public QuantityRuleInput setVariantId(ID variantId) {
        this.variantId = variantId;
        return this;
    }

    public Integer getMaximum() {
        return maximum.getValue();
    }

    public Input<Integer> getMaximumInput() {
        return maximum;
    }

    public QuantityRuleInput setMaximum(Integer maximum) {
        this.maximum = Input.optional(maximum);
        return this;
    }

    public QuantityRuleInput setMaximumInput(Input<Integer> maximum) {
        if (maximum == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maximum = maximum;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("increment:");
        _queryBuilder.append(increment);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("minimum:");
        _queryBuilder.append(minimum);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("variantId:");
        Query.appendQuotedString(_queryBuilder, variantId.toString());

        if (this.maximum.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("maximum:");
            if (maximum.getValue() != null) {
                _queryBuilder.append(maximum.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
