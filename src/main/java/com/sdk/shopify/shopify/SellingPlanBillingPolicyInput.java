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

public class SellingPlanBillingPolicyInput implements Serializable {
    private Input<SellingPlanFixedBillingPolicyInput> fixed = Input.undefined();

    private Input<SellingPlanRecurringBillingPolicyInput> recurring = Input.undefined();

    public SellingPlanFixedBillingPolicyInput getFixed() {
        return fixed.getValue();
    }

    public Input<SellingPlanFixedBillingPolicyInput> getFixedInput() {
        return fixed;
    }

    public SellingPlanBillingPolicyInput setFixed(SellingPlanFixedBillingPolicyInput fixed) {
        this.fixed = Input.optional(fixed);
        return this;
    }

    public SellingPlanBillingPolicyInput setFixedInput(Input<SellingPlanFixedBillingPolicyInput> fixed) {
        if (fixed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fixed = fixed;
        return this;
    }

    public SellingPlanRecurringBillingPolicyInput getRecurring() {
        return recurring.getValue();
    }

    public Input<SellingPlanRecurringBillingPolicyInput> getRecurringInput() {
        return recurring;
    }

    public SellingPlanBillingPolicyInput setRecurring(SellingPlanRecurringBillingPolicyInput recurring) {
        this.recurring = Input.optional(recurring);
        return this;
    }

    public SellingPlanBillingPolicyInput setRecurringInput(Input<SellingPlanRecurringBillingPolicyInput> recurring) {
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
