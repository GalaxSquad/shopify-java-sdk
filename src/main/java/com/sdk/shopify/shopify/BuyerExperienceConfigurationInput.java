// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class BuyerExperienceConfigurationInput implements Serializable {
    private Input<Boolean> checkoutToDraft = Input.undefined();

    private Input<ID> paymentTermsTemplateId = Input.undefined();

    private Input<Boolean> editableShippingAddress = Input.undefined();

    private Input<DepositInput> deposit = Input.undefined();

    public Boolean getCheckoutToDraft() {
        return checkoutToDraft.getValue();
    }

    public Input<Boolean> getCheckoutToDraftInput() {
        return checkoutToDraft;
    }

    public BuyerExperienceConfigurationInput setCheckoutToDraft(Boolean checkoutToDraft) {
        this.checkoutToDraft = Input.optional(checkoutToDraft);
        return this;
    }

    public BuyerExperienceConfigurationInput setCheckoutToDraftInput(Input<Boolean> checkoutToDraft) {
        if (checkoutToDraft == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.checkoutToDraft = checkoutToDraft;
        return this;
    }

    public ID getPaymentTermsTemplateId() {
        return paymentTermsTemplateId.getValue();
    }

    public Input<ID> getPaymentTermsTemplateIdInput() {
        return paymentTermsTemplateId;
    }

    public BuyerExperienceConfigurationInput setPaymentTermsTemplateId(ID paymentTermsTemplateId) {
        this.paymentTermsTemplateId = Input.optional(paymentTermsTemplateId);
        return this;
    }

    public BuyerExperienceConfigurationInput setPaymentTermsTemplateIdInput(Input<ID> paymentTermsTemplateId) {
        if (paymentTermsTemplateId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentTermsTemplateId = paymentTermsTemplateId;
        return this;
    }

    public Boolean getEditableShippingAddress() {
        return editableShippingAddress.getValue();
    }

    public Input<Boolean> getEditableShippingAddressInput() {
        return editableShippingAddress;
    }

    public BuyerExperienceConfigurationInput setEditableShippingAddress(Boolean editableShippingAddress) {
        this.editableShippingAddress = Input.optional(editableShippingAddress);
        return this;
    }

    public BuyerExperienceConfigurationInput setEditableShippingAddressInput(Input<Boolean> editableShippingAddress) {
        if (editableShippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editableShippingAddress = editableShippingAddress;
        return this;
    }

    public DepositInput getDeposit() {
        return deposit.getValue();
    }

    public Input<DepositInput> getDepositInput() {
        return deposit;
    }

    public BuyerExperienceConfigurationInput setDeposit(DepositInput deposit) {
        this.deposit = Input.optional(deposit);
        return this;
    }

    public BuyerExperienceConfigurationInput setDepositInput(Input<DepositInput> deposit) {
        if (deposit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.deposit = deposit;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.checkoutToDraft.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("checkoutToDraft:");
            if (checkoutToDraft.getValue() != null) {
                _queryBuilder.append(checkoutToDraft.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.editableShippingAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("editableShippingAddress:");
            if (editableShippingAddress.getValue() != null) {
                _queryBuilder.append(editableShippingAddress.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.deposit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("deposit:");
            if (deposit.getValue() != null) {
                deposit.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
