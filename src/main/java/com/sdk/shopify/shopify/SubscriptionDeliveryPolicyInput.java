// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;
import java.util.List;

public class SubscriptionDeliveryPolicyInput implements Serializable {
    private SellingPlanInterval interval;

    private int intervalCount;

    private Input<List<SellingPlanAnchorInput>> anchors = Input.undefined();

    public SubscriptionDeliveryPolicyInput(SellingPlanInterval interval, int intervalCount) {
        this.interval = interval;

        this.intervalCount = intervalCount;
    }

    public SellingPlanInterval getInterval() {
        return interval;
    }

    public SubscriptionDeliveryPolicyInput setInterval(SellingPlanInterval interval) {
        this.interval = interval;
        return this;
    }

    public int getIntervalCount() {
        return intervalCount;
    }

    public SubscriptionDeliveryPolicyInput setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
        return this;
    }

    public List<SellingPlanAnchorInput> getAnchors() {
        return anchors.getValue();
    }

    public Input<List<SellingPlanAnchorInput>> getAnchorsInput() {
        return anchors;
    }

    public SubscriptionDeliveryPolicyInput setAnchors(List<SellingPlanAnchorInput> anchors) {
        this.anchors = Input.optional(anchors);
        return this;
    }

    public SubscriptionDeliveryPolicyInput setAnchorsInput(Input<List<SellingPlanAnchorInput>> anchors) {
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
