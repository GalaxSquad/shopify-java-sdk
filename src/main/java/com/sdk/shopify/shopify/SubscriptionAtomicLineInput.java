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
import java.util.List;

public class SubscriptionAtomicLineInput implements Serializable {
    private SubscriptionLineInput line;

    private Input<List<SubscriptionAtomicManualDiscountInput>> discounts = Input.undefined();

    public SubscriptionAtomicLineInput(SubscriptionLineInput line) {
        this.line = line;
    }

    public SubscriptionLineInput getLine() {
        return line;
    }

    public SubscriptionAtomicLineInput setLine(SubscriptionLineInput line) {
        this.line = line;
        return this;
    }

    public List<SubscriptionAtomicManualDiscountInput> getDiscounts() {
        return discounts.getValue();
    }

    public Input<List<SubscriptionAtomicManualDiscountInput>> getDiscountsInput() {
        return discounts;
    }

    public SubscriptionAtomicLineInput setDiscounts(List<SubscriptionAtomicManualDiscountInput> discounts) {
        this.discounts = Input.optional(discounts);
        return this;
    }

    public SubscriptionAtomicLineInput setDiscountsInput(Input<List<SubscriptionAtomicManualDiscountInput>> discounts) {
        if (discounts == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discounts = discounts;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("line:");
        line.appendTo(_queryBuilder);

        if (this.discounts.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discounts:");
            if (discounts.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SubscriptionAtomicManualDiscountInput item1 : discounts.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
