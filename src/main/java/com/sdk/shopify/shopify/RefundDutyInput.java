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

public class RefundDutyInput implements Serializable {
    private ID dutyId;

    private Input<RefundDutyRefundType> refundType = Input.undefined();

    public RefundDutyInput(ID dutyId) {
        this.dutyId = dutyId;
    }

    public ID getDutyId() {
        return dutyId;
    }

    public RefundDutyInput setDutyId(ID dutyId) {
        this.dutyId = dutyId;
        return this;
    }

    public RefundDutyRefundType getRefundType() {
        return refundType.getValue();
    }

    public Input<RefundDutyRefundType> getRefundTypeInput() {
        return refundType;
    }

    public RefundDutyInput setRefundType(RefundDutyRefundType refundType) {
        this.refundType = Input.optional(refundType);
        return this;
    }

    public RefundDutyInput setRefundTypeInput(Input<RefundDutyRefundType> refundType) {
        if (refundType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundType = refundType;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("dutyId:");
        Query.appendQuotedString(_queryBuilder, dutyId.toString());

        if (this.refundType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundType:");
            if (refundType.getValue() != null) {
                _queryBuilder.append(refundType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
