// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SellingPlanPricingPolicyInput implements Serializable {
    private Input<SellingPlanRecurringPricingPolicyInput> recurring = Input.undefined();

    private Input<SellingPlanFixedPricingPolicyInput> fixed = Input.undefined();

    public SellingPlanRecurringPricingPolicyInput getRecurring() {
        return recurring.getValue();
    }

    public Input<SellingPlanRecurringPricingPolicyInput> getRecurringInput() {
        return recurring;
    }

    public SellingPlanPricingPolicyInput setRecurring(SellingPlanRecurringPricingPolicyInput recurring) {
        this.recurring = Input.optional(recurring);
        return this;
    }

    public SellingPlanPricingPolicyInput setRecurringInput(Input<SellingPlanRecurringPricingPolicyInput> recurring) {
        if (recurring == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recurring = recurring;
        return this;
    }

    public SellingPlanFixedPricingPolicyInput getFixed() {
        return fixed.getValue();
    }

    public Input<SellingPlanFixedPricingPolicyInput> getFixedInput() {
        return fixed;
    }

    public SellingPlanPricingPolicyInput setFixed(SellingPlanFixedPricingPolicyInput fixed) {
        this.fixed = Input.optional(fixed);
        return this;
    }

    public SellingPlanPricingPolicyInput setFixedInput(Input<SellingPlanFixedPricingPolicyInput> fixed) {
        if (fixed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fixed = fixed;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.recurring.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("recurring:");
            if (recurring.getValue() != null) {
                recurring.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fixed.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fixed:");
            if (fixed.getValue() != null) {
                fixed.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
