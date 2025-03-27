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

public class SubscriptionBillingPolicyInput implements Serializable {
    private SellingPlanInterval interval;

    private int intervalCount;

    private Input<Integer> minCycles = Input.undefined();

    private Input<Integer> maxCycles = Input.undefined();

    private Input<List<SellingPlanAnchorInput>> anchors = Input.undefined();

    public SubscriptionBillingPolicyInput(SellingPlanInterval interval, int intervalCount) {
        this.interval = interval;

        this.intervalCount = intervalCount;
    }

    public SellingPlanInterval getInterval() {
        return interval;
    }

    public SubscriptionBillingPolicyInput setInterval(SellingPlanInterval interval) {
        this.interval = interval;
        return this;
    }

    public int getIntervalCount() {
        return intervalCount;
    }

    public SubscriptionBillingPolicyInput setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
        return this;
    }

    public Integer getMinCycles() {
        return minCycles.getValue();
    }

    public Input<Integer> getMinCyclesInput() {
        return minCycles;
    }

    public SubscriptionBillingPolicyInput setMinCycles(Integer minCycles) {
        this.minCycles = Input.optional(minCycles);
        return this;
    }

    public SubscriptionBillingPolicyInput setMinCyclesInput(Input<Integer> minCycles) {
        if (minCycles == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.minCycles = minCycles;
        return this;
    }

    public Integer getMaxCycles() {
        return maxCycles.getValue();
    }

    public Input<Integer> getMaxCyclesInput() {
        return maxCycles;
    }

    public SubscriptionBillingPolicyInput setMaxCycles(Integer maxCycles) {
        this.maxCycles = Input.optional(maxCycles);
        return this;
    }

    public SubscriptionBillingPolicyInput setMaxCyclesInput(Input<Integer> maxCycles) {
        if (maxCycles == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maxCycles = maxCycles;
        return this;
    }

    public List<SellingPlanAnchorInput> getAnchors() {
        return anchors.getValue();
    }

    public Input<List<SellingPlanAnchorInput>> getAnchorsInput() {
        return anchors;
    }

    public SubscriptionBillingPolicyInput setAnchors(List<SellingPlanAnchorInput> anchors) {
        this.anchors = Input.optional(anchors);
        return this;
    }

    public SubscriptionBillingPolicyInput setAnchorsInput(Input<List<SellingPlanAnchorInput>> anchors) {
        if (anchors == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anchors = anchors;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("interval:");
        _queryBuilder.append(interval.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("intervalCount:");
        _queryBuilder.append(intervalCount);

        if (this.minCycles.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("minCycles:");
            if (minCycles.getValue() != null) {
                _queryBuilder.append(minCycles.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.maxCycles.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("maxCycles:");
            if (maxCycles.getValue() != null) {
                _queryBuilder.append(maxCycles.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.anchors.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("anchors:");
            if (anchors.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SellingPlanAnchorInput item1 : anchors.getValue()) {
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
