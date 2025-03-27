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

public class SellingPlanFixedDeliveryPolicyInput implements Serializable {
    private Input<List<SellingPlanAnchorInput>> anchors = Input.undefined();

    private Input<SellingPlanFulfillmentTrigger> fulfillmentTrigger = Input.undefined();

    private Input<String> fulfillmentExactTime = Input.undefined();

    private Input<Integer> cutoff = Input.undefined();

    private Input<SellingPlanFixedDeliveryPolicyIntent> intent = Input.undefined();

    private Input<SellingPlanFixedDeliveryPolicyPreAnchorBehavior> preAnchorBehavior = Input.undefined();

    public List<SellingPlanAnchorInput> getAnchors() {
        return anchors.getValue();
    }

    public Input<List<SellingPlanAnchorInput>> getAnchorsInput() {
        return anchors;
    }

    public SellingPlanFixedDeliveryPolicyInput setAnchors(List<SellingPlanAnchorInput> anchors) {
        this.anchors = Input.optional(anchors);
        return this;
    }

    public SellingPlanFixedDeliveryPolicyInput setAnchorsInput(Input<List<SellingPlanAnchorInput>> anchors) {
        if (anchors == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anchors = anchors;
        return this;
    }

    public SellingPlanFulfillmentTrigger getFulfillmentTrigger() {
        return fulfillmentTrigger.getValue();
    }

    public Input<SellingPlanFulfillmentTrigger> getFulfillmentTriggerInput() {
        return fulfillmentTrigger;
    }

    public SellingPlanFixedDeliveryPolicyInput setFulfillmentTrigger(SellingPlanFulfillmentTrigger fulfillmentTrigger) {
        this.fulfillmentTrigger = Input.optional(fulfillmentTrigger);
        return this;
    }

    public SellingPlanFixedDeliveryPolicyInput setFulfillmentTriggerInput(Input<SellingPlanFulfillmentTrigger> fulfillmentTrigger) {
        if (fulfillmentTrigger == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillmentTrigger = fulfillmentTrigger;
        return this;
    }

    public String getFulfillmentExactTime() {
        return fulfillmentExactTime.getValue();
    }

    public Input<String> getFulfillmentExactTimeInput() {
        return fulfillmentExactTime;
    }

    public SellingPlanFixedDeliveryPolicyInput setFulfillmentExactTime(String fulfillmentExactTime) {
        this.fulfillmentExactTime = Input.optional(fulfillmentExactTime);
        return this;
    }

    public SellingPlanFixedDeliveryPolicyInput setFulfillmentExactTimeInput(Input<String> fulfillmentExactTime) {
        if (fulfillmentExactTime == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillmentExactTime = fulfillmentExactTime;
        return this;
    }

    public Integer getCutoff() {
        return cutoff.getValue();
    }

    public Input<Integer> getCutoffInput() {
        return cutoff;
    }

    public SellingPlanFixedDeliveryPolicyInput setCutoff(Integer cutoff) {
        this.cutoff = Input.optional(cutoff);
        return this;
    }

    public SellingPlanFixedDeliveryPolicyInput setCutoffInput(Input<Integer> cutoff) {
        if (cutoff == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cutoff = cutoff;
        return this;
    }

    public SellingPlanFixedDeliveryPolicyIntent getIntent() {
        return intent.getValue();
    }

    public Input<SellingPlanFixedDeliveryPolicyIntent> getIntentInput() {
        return intent;
    }

    public SellingPlanFixedDeliveryPolicyInput setIntent(SellingPlanFixedDeliveryPolicyIntent intent) {
        this.intent = Input.optional(intent);
        return this;
    }

    public SellingPlanFixedDeliveryPolicyInput setIntentInput(Input<SellingPlanFixedDeliveryPolicyIntent> intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.intent = intent;
        return this;
    }

    public SellingPlanFixedDeliveryPolicyPreAnchorBehavior getPreAnchorBehavior() {
        return preAnchorBehavior.getValue();
    }

    public Input<SellingPlanFixedDeliveryPolicyPreAnchorBehavior> getPreAnchorBehaviorInput() {
        return preAnchorBehavior;
    }

    public SellingPlanFixedDeliveryPolicyInput setPreAnchorBehavior(SellingPlanFixedDeliveryPolicyPreAnchorBehavior preAnchorBehavior) {
        this.preAnchorBehavior = Input.optional(preAnchorBehavior);
        return this;
    }

    public SellingPlanFixedDeliveryPolicyInput setPreAnchorBehaviorInput(Input<SellingPlanFixedDeliveryPolicyPreAnchorBehavior> preAnchorBehavior) {
        if (preAnchorBehavior == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.preAnchorBehavior = preAnchorBehavior;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.fulfillmentTrigger.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillmentTrigger:");
            if (fulfillmentTrigger.getValue() != null) {
                _queryBuilder.append(fulfillmentTrigger.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fulfillmentExactTime.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillmentExactTime:");
            if (fulfillmentExactTime.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, fulfillmentExactTime.getValue().toString());
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
