// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MarketingActivityBudgetInput implements Serializable {
    private Input<MarketingBudgetBudgetType> budgetType = Input.undefined();

    private Input<MoneyInput> total = Input.undefined();

    public MarketingBudgetBudgetType getBudgetType() {
        return budgetType.getValue();
    }

    public Input<MarketingBudgetBudgetType> getBudgetTypeInput() {
        return budgetType;
    }

    public MarketingActivityBudgetInput setBudgetType(MarketingBudgetBudgetType budgetType) {
        this.budgetType = Input.optional(budgetType);
        return this;
    }

    public MarketingActivityBudgetInput setBudgetTypeInput(Input<MarketingBudgetBudgetType> budgetType) {
        if (budgetType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.budgetType = budgetType;
        return this;
    }

    public MoneyInput getTotal() {
        return total.getValue();
    }

    public Input<MoneyInput> getTotalInput() {
        return total;
    }

    public MarketingActivityBudgetInput setTotal(MoneyInput total) {
        this.total = Input.optional(total);
        return this;
    }

    public MarketingActivityBudgetInput setTotalInput(Input<MoneyInput> total) {
        if (total == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.total = total;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.budgetType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("budgetType:");
            if (budgetType.getValue() != null) {
                _queryBuilder.append(budgetType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.total.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("total:");
            if (total.getValue() != null) {
                total.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
