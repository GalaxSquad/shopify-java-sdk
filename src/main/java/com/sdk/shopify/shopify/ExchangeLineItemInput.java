// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ExchangeLineItemInput implements Serializable {
    private int quantity;

    private Input<List<String>> giftCardCodes = Input.undefined();

    private Input<ID> variantId = Input.undefined();

    private Input<ExchangeLineItemAppliedDiscountInput> appliedDiscount = Input.undefined();

    public ExchangeLineItemInput(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public ExchangeLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public List<String> getGiftCardCodes() {
        return giftCardCodes.getValue();
    }

    public Input<List<String>> getGiftCardCodesInput() {
        return giftCardCodes;
    }

    public ExchangeLineItemInput setGiftCardCodes(List<String> giftCardCodes) {
        this.giftCardCodes = Input.optional(giftCardCodes);
        return this;
    }

    public ExchangeLineItemInput setGiftCardCodesInput(Input<List<String>> giftCardCodes) {
        if (giftCardCodes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftCardCodes = giftCardCodes;
        return this;
    }

    public ID getVariantId() {
        return variantId.getValue();
    }

    public Input<ID> getVariantIdInput() {
        return variantId;
    }

    public ExchangeLineItemInput setVariantId(ID variantId) {
        this.variantId = Input.optional(variantId);
        return this;
    }

    public ExchangeLineItemInput setVariantIdInput(Input<ID> variantId) {
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

    public ExchangeLineItemInput setAppliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
        this.appliedDiscount = Input.optional(appliedDiscount);
        return this;
    }

    public ExchangeLineItemInput setAppliedDiscountInput(Input<ExchangeLineItemAppliedDiscountInput> appliedDiscount) {
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

        if (this.giftCardCodes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("giftCardCodes:");
            if (giftCardCodes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : giftCardCodes.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

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
