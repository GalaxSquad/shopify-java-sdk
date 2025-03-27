// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionAtomicManualDiscountInput implements Serializable {
    private Input<String> title = Input.undefined();

    private Input<SubscriptionManualDiscountValueInput> value = Input.undefined();

    private Input<Integer> recurringCycleLimit = Input.undefined();

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public SubscriptionAtomicManualDiscountInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public SubscriptionAtomicManualDiscountInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public SubscriptionManualDiscountValueInput getValue() {
        return value.getValue();
    }

    public Input<SubscriptionManualDiscountValueInput> getValueInput() {
        return value;
    }

    public SubscriptionAtomicManualDiscountInput setValue(SubscriptionManualDiscountValueInput value) {
        this.value = Input.optional(value);
        return this;
    }

    public SubscriptionAtomicManualDiscountInput setValueInput(Input<SubscriptionManualDiscountValueInput> value) {
        if (value == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.value = value;
        return this;
    }

    public Integer getRecurringCycleLimit() {
        return recurringCycleLimit.getValue();
    }

    public Input<Integer> getRecurringCycleLimitInput() {
        return recurringCycleLimit;
    }

    public SubscriptionAtomicManualDiscountInput setRecurringCycleLimit(Integer recurringCycleLimit) {
        this.recurringCycleLimit = Input.optional(recurringCycleLimit);
        return this;
    }

    public SubscriptionAtomicManualDiscountInput setRecurringCycleLimitInput(Input<Integer> recurringCycleLimit) {
        if (recurringCycleLimit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recurringCycleLimit = recurringCycleLimit;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.value.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("value:");
            if (value.getValue() != null) {
                value.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.recurringCycleLimit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("recurringCycleLimit:");
            if (recurringCycleLimit.getValue() != null) {
                _queryBuilder.append(recurringCycleLimit.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
