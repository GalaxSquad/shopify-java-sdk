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

public class SellingPlanRecurringDeliveryPolicyInput implements Serializable {
    private Input<SellingPlanInterval> interval = Input.undefined();

    private Input<Integer> intervalCount = Input.undefined();

    private Input<List<SellingPlanAnchorInput>> anchors = Input.undefined();

    private Input<Integer> cutoff = Input.undefined();

    private Input<SellingPlanRecurringDeliveryPolicyIntent> intent = Input.undefined();

    private Input<SellingPlanRecurringDeliveryPolicyPreAnchorBehavior> preAnchorBehavior = Input.undefined();

    public SellingPlanInterval getInterval() {
        return interval.getValue();
    }

    public Input<SellingPlanInterval> getIntervalInput() {
        return interval;
    }

    public SellingPlanRecurringDeliveryPolicyInput setInterval(SellingPlanInterval interval) {
        this.interval = Input.optional(interval);
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyInput setIntervalInput(Input<SellingPlanInterval> interval) {
        if (interval == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.interval = interval;
        return this;
    }

    public Integer getIntervalCount() {
        return intervalCount.getValue();
    }

    public Input<Integer> getIntervalCountInput() {
        return intervalCount;
    }

    public SellingPlanRecurringDeliveryPolicyInput setIntervalCount(Integer intervalCount) {
        this.intervalCount = Input.optional(intervalCount);
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyInput setIntervalCountInput(Input<Integer> intervalCount) {
        if (intervalCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.intervalCount = intervalCount;
        return this;
    }

    public List<SellingPlanAnchorInput> getAnchors() {
        return anchors.getValue();
    }

    public Input<List<SellingPlanAnchorInput>> getAnchorsInput() {
        return anchors;
    }

    public SellingPlanRecurringDeliveryPolicyInput setAnchors(List<SellingPlanAnchorInput> anchors) {
        this.anchors = Input.optional(anchors);
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyInput setAnchorsInput(Input<List<SellingPlanAnchorInput>> anchors) {
        if (anchors == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anchors = anchors;
        return this;
    }

    public Integer getCutoff() {
        return cutoff.getValue();
    }

    public Input<Integer> getCutoffInput() {
        return cutoff;
    }

    public SellingPlanRecurringDeliveryPolicyInput setCutoff(Integer cutoff) {
        this.cutoff = Input.optional(cutoff);
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyInput setCutoffInput(Input<Integer> cutoff) {
        if (cutoff == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cutoff = cutoff;
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyIntent getIntent() {
        return intent.getValue();
    }

    public Input<SellingPlanRecurringDeliveryPolicyIntent> getIntentInput() {
        return intent;
    }

    public SellingPlanRecurringDeliveryPolicyInput setIntent(SellingPlanRecurringDeliveryPolicyIntent intent) {
        this.intent = Input.optional(intent);
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyInput setIntentInput(Input<SellingPlanRecurringDeliveryPolicyIntent> intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.intent = intent;
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
        return preAnchorBehavior.getValue();
    }

    public Input<SellingPlanRecurringDeliveryPolicyPreAnchorBehavior> getPreAnchorBehaviorInput() {
        return preAnchorBehavior;
    }

    public SellingPlanRecurringDeliveryPolicyInput setPreAnchorBehavior(SellingPlanRecurringDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
        this.preAnchorBehavior = Input.optional(preAnchorBehavior);
        return this;
    }

    public SellingPlanRecurringDeliveryPolicyInput setPreAnchorBehaviorInput(Input<SellingPlanRecurringDeliveryPolicyPreAnchorBehavior> preAnchorBehavior) {
        if (preAnchorBehavior == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.preAnchorBehavior = preAnchorBehavior;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.intervalCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("intervalCount:");
            if (intervalCount.getValue() != null) {
                _queryBuilder.append(intervalCount.getValue());
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

        if (this.cutoff.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cutoff:");
            if (cutoff.getValue() != null) {
                _queryBuilder.append(cutoff.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.intent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("intent:");
            if (intent.getValue() != null) {
                _queryBuilder.append(intent.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.preAnchorBehavior.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("preAnchorBehavior:");
            if (preAnchorBehavior.getValue() != null) {
                _queryBuilder.append(preAnchorBehavior.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
