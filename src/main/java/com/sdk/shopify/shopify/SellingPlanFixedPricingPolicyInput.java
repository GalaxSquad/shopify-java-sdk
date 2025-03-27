// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SellingPlanFixedPricingPolicyInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<SellingPlanPricingPolicyAdjustmentType> adjustmentType = Input.undefined();

    private Input<SellingPlanPricingPolicyValueInput> adjustmentValue = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public SellingPlanFixedPricingPolicyInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public SellingPlanFixedPricingPolicyInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
        return adjustmentType.getValue();
    }

    public Input<SellingPlanPricingPolicyAdjustmentType> getAdjustmentTypeInput() {
        return adjustmentType;
    }

    public SellingPlanFixedPricingPolicyInput setAdjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
        this.adjustmentType = Input.optional(adjustmentType);
        return this;
    }

    public SellingPlanFixedPricingPolicyInput setAdjustmentTypeInput(Input<SellingPlanPricingPolicyAdjustmentType> adjustmentType) {
        if (adjustmentType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.adjustmentType = adjustmentType;
        return this;
    }

    public SellingPlanPricingPolicyValueInput getAdjustmentValue() {
        return adjustmentValue.getValue();
    }

    public Input<SellingPlanPricingPolicyValueInput> getAdjustmentValueInput() {
        return adjustmentValue;
    }

    public SellingPlanFixedPricingPolicyInput setAdjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
        this.adjustmentValue = Input.optional(adjustmentValue);
        return this;
    }

    public SellingPlanFixedPricingPolicyInput setAdjustmentValueInput(Input<SellingPlanPricingPolicyValueInput> adjustmentValue) {
        if (adjustmentValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.adjustmentValue = adjustmentValue;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.adjustmentType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("adjustmentType:");
            if (adjustmentType.getValue() != null) {
                _queryBuilder.append(adjustmentType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.adjustmentValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("adjustmentValue:");
            if (adjustmentValue.getValue() != null) {
                adjustmentValue.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
