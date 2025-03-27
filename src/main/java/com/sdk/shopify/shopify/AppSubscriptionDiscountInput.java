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

import java.io.Serializable;

public class AppSubscriptionDiscountInput implements Serializable {
    private Input<AppSubscriptionDiscountValueInput> value = Input.undefined();

    private Input<Integer> durationLimitInIntervals = Input.undefined();

    public AppSubscriptionDiscountValueInput getValue() {
        return value.getValue();
    }

    public Input<AppSubscriptionDiscountValueInput> getValueInput() {
        return value;
    }

    public AppSubscriptionDiscountInput setValue(AppSubscriptionDiscountValueInput value) {
        this.value = Input.optional(value);
        return this;
    }

    public AppSubscriptionDiscountInput setValueInput(Input<AppSubscriptionDiscountValueInput> value) {
        if (value == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.value = value;
        return this;
    }

    public Integer getDurationLimitInIntervals() {
        return durationLimitInIntervals.getValue();
    }

    public Input<Integer> getDurationLimitInIntervalsInput() {
        return durationLimitInIntervals;
    }

    public AppSubscriptionDiscountInput setDurationLimitInIntervals(Integer durationLimitInIntervals) {
        this.durationLimitInIntervals = Input.optional(durationLimitInIntervals);
        return this;
    }

    public AppSubscriptionDiscountInput setDurationLimitInIntervalsInput(Input<Integer> durationLimitInIntervals) {
        if (durationLimitInIntervals == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.durationLimitInIntervals = durationLimitInIntervals;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.durationLimitInIntervals.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("durationLimitInIntervals:");
            if (durationLimitInIntervals.getValue() != null) {
                _queryBuilder.append(durationLimitInIntervals.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
