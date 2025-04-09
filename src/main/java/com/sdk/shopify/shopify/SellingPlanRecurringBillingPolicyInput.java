// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;
import java.util.List;

public class SellingPlanRecurringBillingPolicyInput implements Serializable {
    private Input<SellingPlanInterval> interval = Input.undefined();

    private Input<Integer> intervalCount = Input.undefined();

    private Input<List<SellingPlanAnchorInput>> anchors = Input.undefined();

    private Input<Integer> minCycles = Input.undefined();

    private Input<Integer> maxCycles = Input.undefined();

    public SellingPlanInterval getInterval() {
        return interval.getValue();
    }

    public Input<SellingPlanInterval> getIntervalInput() {
        return interval;
    }

    public SellingPlanRecurringBillingPolicyInput setInterval(SellingPlanInterval interval) {
        this.interval = Input.optional(interval);
        return this;
    }

    public SellingPlanRecurringBillingPolicyInput setIntervalInput(Input<SellingPlanInterval> interval) {
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

    public SellingPlanRecurringBillingPolicyInput setIntervalCount(Integer intervalCount) {
        this.intervalCount = Input.optional(intervalCount);
        return this;
    }

    public SellingPlanRecurringBillingPolicyInput setIntervalCountInput(Input<Integer> intervalCount) {
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

    public SellingPlanRecurringBillingPolicyInput setAnchors(List<SellingPlanAnchorInput> anchors) {
        this.anchors = Input.optional(anchors);
        return this;
    }

    public SellingPlanRecurringBillingPolicyInput setAnchorsInput(Input<List<SellingPlanAnchorInput>> anchors) {
        if (anchors == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anchors = anchors;
        return this;
    }

    public Integer getMinCycles() {
        return minCycles.getValue();
    }

    public Input<Integer> getMinCyclesInput() {
        return minCycles;
    }

    public SellingPlanRecurringBillingPolicyInput setMinCycles(Integer minCycles) {
        this.minCycles = Input.optional(minCycles);
        return this;
    }

    public SellingPlanRecurringBillingPolicyInput setMinCyclesInput(Input<Integer> minCycles) {
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

    public SellingPlanRecurringBillingPolicyInput setMaxCycles(Integer maxCycles) {
        this.maxCycles = Input.optional(maxCycles);
        return this;
    }

    public SellingPlanRecurringBillingPolicyInput setMaxCyclesInput(Input<Integer> maxCycles) {
        if (maxCycles == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maxCycles = maxCycles;
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

        _queryBuilder.append('}');
    }
}
