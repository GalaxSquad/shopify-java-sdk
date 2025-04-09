// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PaymentScheduleInput implements Serializable {
    private Input<String> issuedAt = Input.undefined();

    private Input<String> dueAt = Input.undefined();

    public String getIssuedAt() {
        return issuedAt.getValue();
    }

    public Input<String> getIssuedAtInput() {
        return issuedAt;
    }

    public PaymentScheduleInput setIssuedAt(String issuedAt) {
        this.issuedAt = Input.optional(issuedAt);
        return this;
    }

    public PaymentScheduleInput setIssuedAtInput(Input<String> issuedAt) {
        if (issuedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.issuedAt = issuedAt;
        return this;
    }

    public String getDueAt() {
        return dueAt.getValue();
    }

    public Input<String> getDueAtInput() {
        return dueAt;
    }

    public PaymentScheduleInput setDueAt(String dueAt) {
        this.dueAt = Input.optional(dueAt);
        return this;
    }

    public PaymentScheduleInput setDueAtInput(Input<String> dueAt) {
        if (dueAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dueAt = dueAt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.issuedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("issuedAt:");
            if (issuedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, issuedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dueAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dueAt:");
            if (dueAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dueAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
