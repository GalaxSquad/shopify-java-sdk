// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CalculateExchangeLineItemInput implements Serializable {
    private int quantity;

    private Input<ID> variantId = Input.undefined();

    private Input<ExchangeLineItemAppliedDiscountInput> appliedDiscount = Input.undefined();

    public CalculateExchangeLineItemInput(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public CalculateExchangeLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ID getVariantId() {
        return variantId.getValue();
    }

    public Input<ID> getVariantIdInput() {
        return variantId;
    }

    public CalculateExchangeLineItemInput setVariantId(ID variantId) {
        this.variantId = Input.optional(variantId);
        return this;
    }

    public CalculateExchangeLineItemInput setVariantIdInput(Input<ID> variantId) {
        if (variantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantId = variantId;
        return this;
    }

    public ExchangeLineItemAppliedDiscountInput getAppliedDiscount() {
        return appliedDiscount.getValue();
    }

    public Input<ExchangeLineItemAppliedDiscountInput> getAppliedDiscountInput() {
        return appliedDiscount;
    }

    public CalculateExchangeLineItemInput setAppliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
        this.appliedDiscount = Input.optional(appliedDiscount);
        return this;
    }

    public CalculateExchangeLineItemInput setAppliedDiscountInput(Input<ExchangeLineItemAppliedDiscountInput> appliedDiscount) {
        if (appliedDiscount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliedDiscount = appliedDiscount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        if (this.variantId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variantId:");
            if (variantId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, variantId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.appliedDiscount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appliedDiscount:");
            if (appliedDiscount.getValue() != null) {
                appliedDiscount.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
