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

public class AppRecurringPricingInput implements Serializable {
    private MoneyInput price;

    private Input<AppPricingInterval> interval = Input.undefined();

    private Input<AppSubscriptionDiscountInput> discount = Input.undefined();

    public AppRecurringPricingInput(MoneyInput price) {
        this.price = price;
    }

    public MoneyInput getPrice() {
        return price;
    }

    public AppRecurringPricingInput setPrice(MoneyInput price) {
        this.price = price;
        return this;
    }

    public AppPricingInterval getInterval() {
        return interval.getValue();
    }

    public Input<AppPricingInterval> getIntervalInput() {
        return interval;
    }

    public AppRecurringPricingInput setInterval(AppPricingInterval interval) {
        this.interval = Input.optional(interval);
        return this;
    }

    public AppRecurringPricingInput setIntervalInput(Input<AppPricingInterval> interval) {
        if (interval == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.interval = interval;
        return this;
    }

    public AppSubscriptionDiscountInput getDiscount() {
        return discount.getValue();
    }

    public Input<AppSubscriptionDiscountInput> getDiscountInput() {
        return discount;
    }

    public AppRecurringPricingInput setDiscount(AppSubscriptionDiscountInput discount) {
        this.discount = Input.optional(discount);
        return this;
    }

    public AppRecurringPricingInput setDiscountInput(Input<AppSubscriptionDiscountInput> discount) {
        if (discount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discount = discount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("price:");
        price.appendTo(_queryBuilder);

        if (this.interval.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("interval:");
            if (interval.getValue() != null) {
                _queryBuilder.append(interval.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.discount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discount:");
            if (discount.getValue() != null) {
                discount.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
