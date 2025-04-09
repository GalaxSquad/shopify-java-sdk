// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class SubscriptionPricingPolicyCycleDiscountsInput implements Serializable {
    private int afterCycle;

    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    private SellingPlanPricingPolicyValueInput adjustmentValue;

    private BigDecimal computedPrice;

    public SubscriptionPricingPolicyCycleDiscountsInput(int afterCycle, SellingPlanPricingPolicyAdjustmentType adjustmentType, SellingPlanPricingPolicyValueInput adjustmentValue, BigDecimal computedPrice) {
        this.afterCycle = afterCycle;

        this.adjustmentType = adjustmentType;

        this.adjustmentValue = adjustmentValue;

        this.computedPrice = computedPrice;
    }

    public int getAfterCycle() {
        return afterCycle;
    }

    public SubscriptionPricingPolicyCycleDiscountsInput setAfterCycle(int afterCycle) {
        this.afterCycle = afterCycle;
        return this;
    }

    public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    public SubscriptionPricingPolicyCycleDiscountsInput setAdjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    public SellingPlanPricingPolicyValueInput getAdjustmentValue() {
        return adjustmentValue;
    }

    public SubscriptionPricingPolicyCycleDiscountsInput setAdjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }

    public BigDecimal getComputedPrice() {
        return computedPrice;
    }

    public SubscriptionPricingPolicyCycleDiscountsInput setComputedPrice(BigDecimal computedPrice) {
        this.computedPrice = computedPrice;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("afterCycle:");
        _queryBuilder.append(afterCycle);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("adjustmentType:");
        _queryBuilder.append(adjustmentType.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("adjustmentValue:");
        adjustmentValue.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("computedPrice:");
        Query.appendQuotedString(_queryBuilder, computedPrice.toString());

        _queryBuilder.append('}');
    }
}
