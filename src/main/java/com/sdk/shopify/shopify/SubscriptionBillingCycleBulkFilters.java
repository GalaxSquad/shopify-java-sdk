// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;
import java.util.List;

public class SubscriptionBillingCycleBulkFilters implements Serializable {
    private Input<List<SubscriptionBillingCycleBillingCycleStatus>> billingCycleStatus = Input.undefined();

    private Input<List<SubscriptionContractSubscriptionStatus>> contractStatus = Input.undefined();

    private Input<SubscriptionBillingCycleBillingAttemptStatus> billingAttemptStatus = Input.undefined();

    public List<SubscriptionBillingCycleBillingCycleStatus> getBillingCycleStatus() {
        return billingCycleStatus.getValue();
    }

    public Input<List<SubscriptionBillingCycleBillingCycleStatus>> getBillingCycleStatusInput() {
        return billingCycleStatus;
    }

    public SubscriptionBillingCycleBulkFilters setBillingCycleStatus(List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus) {
        this.billingCycleStatus = Input.optional(billingCycleStatus);
        return this;
    }

    public SubscriptionBillingCycleBulkFilters setBillingCycleStatusInput(Input<List<SubscriptionBillingCycleBillingCycleStatus>> billingCycleStatus) {
        if (billingCycleStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingCycleStatus = billingCycleStatus;
        return this;
    }

    public List<SubscriptionContractSubscriptionStatus> getContractStatus() {
        return contractStatus.getValue();
    }

    public Input<List<SubscriptionContractSubscriptionStatus>> getContractStatusInput() {
        return contractStatus;
    }

    public SubscriptionBillingCycleBulkFilters setContractStatus(List<SubscriptionContractSubscriptionStatus> contractStatus) {
        this.contractStatus = Input.optional(contractStatus);
        return this;
    }

    public SubscriptionBillingCycleBulkFilters setContractStatusInput(Input<List<SubscriptionContractSubscriptionStatus>> contractStatus) {
        if (contractStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.contractStatus = contractStatus;
        return this;
    }

    public SubscriptionBillingCycleBillingAttemptStatus getBillingAttemptStatus() {
        return billingAttemptStatus.getValue();
    }

    public Input<SubscriptionBillingCycleBillingAttemptStatus> getBillingAttemptStatusInput() {
        return billingAttemptStatus;
    }

    public SubscriptionBillingCycleBulkFilters setBillingAttemptStatus(SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus) {
        this.billingAttemptStatus = Input.optional(billingAttemptStatus);
        return this;
    }

    public SubscriptionBillingCycleBulkFilters setBillingAttemptStatusInput(Input<SubscriptionBillingCycleBillingAttemptStatus> billingAttemptStatus) {
        if (billingAttemptStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingAttemptStatus = billingAttemptStatus;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.billingCycleStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingCycleStatus:");
            if (billingCycleStatus.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SubscriptionBillingCycleBillingCycleStatus item1 : billingCycleStatus.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.contractStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("contractStatus:");
            if (contractStatus.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SubscriptionContractSubscriptionStatus item1 : contractStatus.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.billingAttemptStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingAttemptStatus:");
            if (billingAttemptStatus.getValue() != null) {
                _queryBuilder.append(billingAttemptStatus.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
