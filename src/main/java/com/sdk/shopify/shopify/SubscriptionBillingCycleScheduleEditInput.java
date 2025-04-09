// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionBillingCycleScheduleEditInput implements Serializable {
    private SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason;

    private Input<Boolean> skip = Input.undefined();

    private Input<String> billingDate = Input.undefined();

    public SubscriptionBillingCycleScheduleEditInput(SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason) {
        this.reason = reason;
    }

    public SubscriptionBillingCycleScheduleEditInputScheduleEditReason getReason() {
        return reason;
    }

    public SubscriptionBillingCycleScheduleEditInput setReason(SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason) {
        this.reason = reason;
        return this;
    }

    public Boolean getSkip() {
        return skip.getValue();
    }

    public Input<Boolean> getSkipInput() {
        return skip;
    }

    public SubscriptionBillingCycleScheduleEditInput setSkip(Boolean skip) {
        this.skip = Input.optional(skip);
        return this;
    }

    public SubscriptionBillingCycleScheduleEditInput setSkipInput(Input<Boolean> skip) {
        if (skip == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.skip = skip;
        return this;
    }

    public String getBillingDate() {
        return billingDate.getValue();
    }

    public Input<String> getBillingDateInput() {
        return billingDate;
    }

    public SubscriptionBillingCycleScheduleEditInput setBillingDate(String billingDate) {
        this.billingDate = Input.optional(billingDate);
        return this;
    }

    public SubscriptionBillingCycleScheduleEditInput setBillingDateInput(Input<String> billingDate) {
        if (billingDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingDate = billingDate;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("reason:");
        _queryBuilder.append(reason.toString());

        if (this.skip.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("skip:");
            if (skip.getValue() != null) {
                _queryBuilder.append(skip.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.billingDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingDate:");
            if (billingDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, billingDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
