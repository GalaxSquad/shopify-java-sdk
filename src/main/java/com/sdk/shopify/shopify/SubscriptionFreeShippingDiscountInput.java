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

public class SubscriptionFreeShippingDiscountInput implements Serializable {
    private Input<String> title = Input.undefined();

    private Input<Integer> recurringCycleLimit = Input.undefined();

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public SubscriptionFreeShippingDiscountInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public SubscriptionFreeShippingDiscountInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public Integer getRecurringCycleLimit() {
        return recurringCycleLimit.getValue();
    }

    public Input<Integer> getRecurringCycleLimitInput() {
        return recurringCycleLimit;
    }

    public SubscriptionFreeShippingDiscountInput setRecurringCycleLimit(Integer recurringCycleLimit) {
        this.recurringCycleLimit = Input.optional(recurringCycleLimit);
        return this;
    }

    public SubscriptionFreeShippingDiscountInput setRecurringCycleLimitInput(Input<Integer> recurringCycleLimit) {
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
