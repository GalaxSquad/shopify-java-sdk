// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionBillingCycleSelector implements Serializable {
    private Input<Integer> index = Input.undefined();

    private Input<String> date = Input.undefined();

    public Integer getIndex() {
        return index.getValue();
    }

    public Input<Integer> getIndexInput() {
        return index;
    }

    public SubscriptionBillingCycleSelector setIndex(Integer index) {
        this.index = Input.optional(index);
        return this;
    }

    public SubscriptionBillingCycleSelector setIndexInput(Input<Integer> index) {
        if (index == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.index = index;
        return this;
    }

    public String getDate() {
        return date.getValue();
    }

    public Input<String> getDateInput() {
        return date;
    }

    public SubscriptionBillingCycleSelector setDate(String date) {
        this.date = Input.optional(date);
        return this;
    }

    public SubscriptionBillingCycleSelector setDateInput(Input<String> date) {
        if (date == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.date = date;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.index.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("index:");
            if (index.getValue() != null) {
                _queryBuilder.append(index.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.date.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("date:");
            if (date.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, date.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
