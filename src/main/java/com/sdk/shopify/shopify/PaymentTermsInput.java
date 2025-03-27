// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class PaymentTermsInput implements Serializable {
    private Input<ID> paymentTermsTemplateId = Input.undefined();

    private Input<List<PaymentScheduleInput>> paymentSchedules = Input.undefined();

    public ID getPaymentTermsTemplateId() {
        return paymentTermsTemplateId.getValue();
    }

    public Input<ID> getPaymentTermsTemplateIdInput() {
        return paymentTermsTemplateId;
    }

    public PaymentTermsInput setPaymentTermsTemplateId(ID paymentTermsTemplateId) {
        this.paymentTermsTemplateId = Input.optional(paymentTermsTemplateId);
        return this;
    }

    public PaymentTermsInput setPaymentTermsTemplateIdInput(Input<ID> paymentTermsTemplateId) {
        if (paymentTermsTemplateId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentTermsTemplateId = paymentTermsTemplateId;
        return this;
    }

    public List<PaymentScheduleInput> getPaymentSchedules() {
        return paymentSchedules.getValue();
    }

    public Input<List<PaymentScheduleInput>> getPaymentSchedulesInput() {
        return paymentSchedules;
    }

    public PaymentTermsInput setPaymentSchedules(List<PaymentScheduleInput> paymentSchedules) {
        this.paymentSchedules = Input.optional(paymentSchedules);
        return this;
    }

    public PaymentTermsInput setPaymentSchedulesInput(Input<List<PaymentScheduleInput>> paymentSchedules) {
        if (paymentSchedules == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentSchedules = paymentSchedules;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.paymentTermsTemplateId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("paymentTermsTemplateId:");
            if (paymentTermsTemplateId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, paymentTermsTemplateId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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
