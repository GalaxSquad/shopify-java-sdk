// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SubscriptionPricingPolicyInput implements Serializable {
    private BigDecimal basePrice;

    private List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts;

    public SubscriptionPricingPolicyInput(BigDecimal basePrice, List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts) {
        this.basePrice = basePrice;

        this.cycleDiscounts = cycleDiscounts;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public SubscriptionPricingPolicyInput setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public List<SubscriptionPricingPolicyCycleDiscountsInput> getCycleDiscounts() {
        return cycleDiscounts;
    }

    public SubscriptionPricingPolicyInput setCycleDiscounts(List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts) {
        this.cycleDiscounts = cycleDiscounts;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("basePrice:");
        Query.appendQuotedString(_queryBuilder, basePrice.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cycleDiscounts:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (SubscriptionPricingPolicyCycleDiscountsInput item1 : cycleDiscounts) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
