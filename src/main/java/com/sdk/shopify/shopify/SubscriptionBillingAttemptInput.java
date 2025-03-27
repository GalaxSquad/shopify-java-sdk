// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionBillingAttemptInput implements Serializable {
    private String idempotencyKey;

    private Input<String> originTime = Input.undefined();

    private Input<SubscriptionBillingCycleSelector> billingCycleSelector = Input.undefined();

    private Input<SubscriptionBillingAttemptInventoryPolicy> inventoryPolicy = Input.undefined();

    public SubscriptionBillingAttemptInput(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public SubscriptionBillingAttemptInput setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    public String getOriginTime() {
        return originTime.getValue();
    }

    public Input<String> getOriginTimeInput() {
        return originTime;
    }

    public SubscriptionBillingAttemptInput setOriginTime(String originTime) {
        this.originTime = Input.optional(originTime);
        return this;
    }

    public SubscriptionBillingAttemptInput setOriginTimeInput(Input<String> originTime) {
        if (originTime == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originTime = originTime;
        return this;
    }

    public SubscriptionBillingCycleSelector getBillingCycleSelector() {
        return billingCycleSelector.getValue();
    }

    public Input<SubscriptionBillingCycleSelector> getBillingCycleSelectorInput() {
        return billingCycleSelector;
    }

    public SubscriptionBillingAttemptInput setBillingCycleSelector(SubscriptionBillingCycleSelector billingCycleSelector) {
        this.billingCycleSelector = Input.optional(billingCycleSelector);
        return this;
    }

    public SubscriptionBillingAttemptInput setBillingCycleSelectorInput(Input<SubscriptionBillingCycleSelector> billingCycleSelector) {
        if (billingCycleSelector == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingCycleSelector = billingCycleSelector;
        return this;
    }

    public SubscriptionBillingAttemptInventoryPolicy getInventoryPolicy() {
        return inventoryPolicy.getValue();
    }

    public Input<SubscriptionBillingAttemptInventoryPolicy> getInventoryPolicyInput() {
        return inventoryPolicy;
    }

    public SubscriptionBillingAttemptInput setInventoryPolicy(SubscriptionBillingAttemptInventoryPolicy inventoryPolicy) {
        this.inventoryPolicy = Input.optional(inventoryPolicy);
        return this;
    }

    public SubscriptionBillingAttemptInput setInventoryPolicyInput(Input<SubscriptionBillingAttemptInventoryPolicy> inventoryPolicy) {
        if (inventoryPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryPolicy = inventoryPolicy;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("idempotencyKey:");
        Query.appendQuotedString(_queryBuilder, idempotencyKey.toString());

        if (this.originTime.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("originTime:");
            if (originTime.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, originTime.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.billingCycleSelector.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingCycleSelector:");
            if (billingCycleSelector.getValue() != null) {
                billingCycleSelector.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.inventoryPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("inventoryPolicy:");
            if (inventoryPolicy.getValue() != null) {
                _queryBuilder.append(inventoryPolicy.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
