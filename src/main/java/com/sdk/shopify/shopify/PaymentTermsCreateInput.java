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

public class PaymentTermsCreateInput implements Serializable {
    private ID paymentTermsTemplateId;

    private Input<List<PaymentScheduleInput>> paymentSchedules = Input.undefined();

    public PaymentTermsCreateInput(ID paymentTermsTemplateId) {
        this.paymentTermsTemplateId = paymentTermsTemplateId;
    }

    public ID getPaymentTermsTemplateId() {
        return paymentTermsTemplateId;
    }

    public PaymentTermsCreateInput setPaymentTermsTemplateId(ID paymentTermsTemplateId) {
        this.paymentTermsTemplateId = paymentTermsTemplateId;
        return this;
    }

    public List<PaymentScheduleInput> getPaymentSchedules() {
        return paymentSchedules.getValue();
    }

    public Input<List<PaymentScheduleInput>> getPaymentSchedulesInput() {
        return paymentSchedules;
    }

    public PaymentTermsCreateInput setPaymentSchedules(List<PaymentScheduleInput> paymentSchedules) {
        this.paymentSchedules = Input.optional(paymentSchedules);
        return this;
    }

    public PaymentTermsCreateInput setPaymentSchedulesInput(Input<List<PaymentScheduleInput>> paymentSchedules) {
        if (paymentSchedules == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentSchedules = paymentSchedules;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("paymentTermsTemplateId:");
        Query.appendQuotedString(_queryBuilder, paymentTermsTemplateId.toString());

        if (this.paymentSchedules.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("paymentSchedules:");
            if (paymentSchedules.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PaymentScheduleInput item1 : paymentSchedules.getValue()) {
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
