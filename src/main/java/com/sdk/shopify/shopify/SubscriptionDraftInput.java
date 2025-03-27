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

import java.math.BigDecimal;

import java.io.Serializable;
import java.util.List;

public class SubscriptionDraftInput implements Serializable {
    private Input<SubscriptionContractSubscriptionStatus> status = Input.undefined();

    private Input<ID> paymentMethodId = Input.undefined();

    private Input<String> nextBillingDate = Input.undefined();

    private Input<SubscriptionBillingPolicyInput> billingPolicy = Input.undefined();

    private Input<SubscriptionDeliveryPolicyInput> deliveryPolicy = Input.undefined();

    private Input<BigDecimal> deliveryPrice = Input.undefined();

    private Input<SubscriptionDeliveryMethodInput> deliveryMethod = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<List<AttributeInput>> customAttributes = Input.undefined();

    public SubscriptionContractSubscriptionStatus getStatus() {
        return status.getValue();
    }

    public Input<SubscriptionContractSubscriptionStatus> getStatusInput() {
        return status;
    }

    public SubscriptionDraftInput setStatus(SubscriptionContractSubscriptionStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public SubscriptionDraftInput setStatusInput(Input<SubscriptionContractSubscriptionStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public ID getPaymentMethodId() {
        return paymentMethodId.getValue();
    }

    public Input<ID> getPaymentMethodIdInput() {
        return paymentMethodId;
    }

    public SubscriptionDraftInput setPaymentMethodId(ID paymentMethodId) {
        this.paymentMethodId = Input.optional(paymentMethodId);
        return this;
    }

    public SubscriptionDraftInput setPaymentMethodIdInput(Input<ID> paymentMethodId) {
        if (paymentMethodId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentMethodId = paymentMethodId;
        return this;
    }

    public String getNextBillingDate() {
        return nextBillingDate.getValue();
    }

    public Input<String> getNextBillingDateInput() {
        return nextBillingDate;
    }

    public SubscriptionDraftInput setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = Input.optional(nextBillingDate);
        return this;
    }

    public SubscriptionDraftInput setNextBillingDateInput(Input<String> nextBillingDate) {
        if (nextBillingDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.nextBillingDate = nextBillingDate;
        return this;
    }

    public SubscriptionBillingPolicyInput getBillingPolicy() {
        return billingPolicy.getValue();
    }

    public Input<SubscriptionBillingPolicyInput> getBillingPolicyInput() {
        return billingPolicy;
    }

    public SubscriptionDraftInput setBillingPolicy(SubscriptionBillingPolicyInput billingPolicy) {
        this.billingPolicy = Input.optional(billingPolicy);
        return this;
    }

    public SubscriptionDraftInput setBillingPolicyInput(Input<SubscriptionBillingPolicyInput> billingPolicy) {
        if (billingPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingPolicy = billingPolicy;
        return this;
    }

    public SubscriptionDeliveryPolicyInput getDeliveryPolicy() {
        return deliveryPolicy.getValue();
    }

    public Input<SubscriptionDeliveryPolicyInput> getDeliveryPolicyInput() {
        return deliveryPolicy;
    }

    public SubscriptionDraftInput setDeliveryPolicy(SubscriptionDeliveryPolicyInput deliveryPolicy) {
        this.deliveryPolicy = Input.optional(deliveryPolicy);
        return this;
    }

    public SubscriptionDraftInput setDeliveryPolicyInput(Input<SubscriptionDeliveryPolicyInput> deliveryPolicy) {
        if (deliveryPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.deliveryPolicy = deliveryPolicy;
        return this;
    }

    public BigDecimal getDeliveryPrice() {
        return deliveryPrice.getValue();
    }

    public Input<BigDecimal> getDeliveryPriceInput() {
        return deliveryPrice;
    }

    public SubscriptionDraftInput setDeliveryPrice(BigDecimal deliveryPrice) {
        this.deliveryPrice = Input.optional(deliveryPrice);
        return this;
    }

    public SubscriptionDraftInput setDeliveryPriceInput(Input<BigDecimal> deliveryPrice) {
        if (deliveryPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.deliveryPrice = deliveryPrice;
        return this;
    }

    public SubscriptionDeliveryMethodInput getDeliveryMethod() {
        return deliveryMethod.getValue();
    }

    public Input<SubscriptionDeliveryMethodInput> getDeliveryMethodInput() {
        return deliveryMethod;
    }

    public SubscriptionDraftInput setDeliveryMethod(SubscriptionDeliveryMethodInput deliveryMethod) {
        this.deliveryMethod = Input.optional(deliveryMethod);
        return this;
    }

    public SubscriptionDraftInput setDeliveryMethodInput(Input<SubscriptionDeliveryMethodInput> deliveryMethod) {
        if (deliveryMethod == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.deliveryMethod = deliveryMethod;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public SubscriptionDraftInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public SubscriptionDraftInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public List<AttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<AttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public SubscriptionDraftInput setCustomAttributes(List<AttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public SubscriptionDraftInput setCustomAttributesInput(Input<List<AttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.paymentMethodId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("paymentMethodId:");
            if (paymentMethodId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, paymentMethodId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.nextBillingDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("nextBillingDate:");
            if (nextBillingDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, nextBillingDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.billingPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingPolicy:");
            if (billingPolicy.getValue() != null) {
                billingPolicy.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.deliveryPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("deliveryPolicy:");
            if (deliveryPolicy.getValue() != null) {
                deliveryPolicy.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.deliveryPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("deliveryPrice:");
            if (deliveryPrice.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, deliveryPrice.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.deliveryMethod.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("deliveryMethod:");
            if (deliveryMethod.getValue() != null) {
                deliveryMethod.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customAttributes:");
            if (customAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (AttributeInput item1 : customAttributes.getValue()) {
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
