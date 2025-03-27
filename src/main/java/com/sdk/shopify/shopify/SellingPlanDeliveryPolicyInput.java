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

public class SellingPlanDeliveryPolicyInput implements Serializable {
    private Input<SellingPlanFixedDeliveryPolicyInput> fixed = Input.undefined();

    private Input<SellingPlanRecurringDeliveryPolicyInput> recurring = Input.undefined();

    public SellingPlanFixedDeliveryPolicyInput getFixed() {
        return fixed.getValue();
    }

    public Input<SellingPlanFixedDeliveryPolicyInput> getFixedInput() {
        return fixed;
    }

    public SellingPlanDeliveryPolicyInput setFixed(SellingPlanFixedDeliveryPolicyInput fixed) {
        this.fixed = Input.optional(fixed);
        return this;
    }

    public SellingPlanDeliveryPolicyInput setFixedInput(Input<SellingPlanFixedDeliveryPolicyInput> fixed) {
        if (fixed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fixed = fixed;
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyInput getRecurring() {
        return recurring.getValue();
    }

    public Input<SellingPlanRecurringDeliveryPolicyInput> getRecurringInput() {
        return recurring;
    }

    public SellingPlanDeliveryPolicyInput setRecurring(SellingPlanRecurringDeliveryPolicyInput recurring) {
        this.recurring = Input.optional(recurring);
        return this;
    }

    public SellingPlanDeliveryPolicyInput setRecurringInput(Input<SellingPlanRecurringDeliveryPolicyInput> recurring) {
        if (recurring == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recurring = recurring;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        _queryBuilder.append('}');
    }
}
