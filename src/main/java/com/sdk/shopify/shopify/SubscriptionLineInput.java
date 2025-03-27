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

public class SubscriptionLineInput implements Serializable {
    private ID productVariantId;

    private int quantity;

    private BigDecimal currentPrice;

    private Input<List<AttributeInput>> customAttributes = Input.undefined();

    private Input<ID> sellingPlanId = Input.undefined();

    private Input<String> sellingPlanName = Input.undefined();

    private Input<SubscriptionPricingPolicyInput> pricingPolicy = Input.undefined();

    public SubscriptionLineInput(ID productVariantId, int quantity, BigDecimal currentPrice) {
        this.productVariantId = productVariantId;

        this.quantity = quantity;

        this.currentPrice = currentPrice;
    }

    public ID getProductVariantId() {
        return productVariantId;
    }

    public SubscriptionLineInput setProductVariantId(ID productVariantId) {
        this.productVariantId = productVariantId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public SubscriptionLineInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public SubscriptionLineInput setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public List<AttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<AttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public SubscriptionLineInput setCustomAttributes(List<AttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public SubscriptionLineInput setCustomAttributesInput(Input<List<AttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public ID getSellingPlanId() {
        return sellingPlanId.getValue();
    }

    public Input<ID> getSellingPlanIdInput() {
        return sellingPlanId;
    }

    public SubscriptionLineInput setSellingPlanId(ID sellingPlanId) {
        this.sellingPlanId = Input.optional(sellingPlanId);
        return this;
    }

    public SubscriptionLineInput setSellingPlanIdInput(Input<ID> sellingPlanId) {
        if (sellingPlanId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlanId = sellingPlanId;
        return this;
    }

    public String getSellingPlanName() {
        return sellingPlanName.getValue();
    }

    public Input<String> getSellingPlanNameInput() {
        return sellingPlanName;
    }

    public SubscriptionLineInput setSellingPlanName(String sellingPlanName) {
        this.sellingPlanName = Input.optional(sellingPlanName);
        return this;
    }

    public SubscriptionLineInput setSellingPlanNameInput(Input<String> sellingPlanName) {
        if (sellingPlanName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlanName = sellingPlanName;
        return this;
    }

    public SubscriptionPricingPolicyInput getPricingPolicy() {
        return pricingPolicy.getValue();
    }

    public Input<SubscriptionPricingPolicyInput> getPricingPolicyInput() {
        return pricingPolicy;
    }

    public SubscriptionLineInput setPricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
        this.pricingPolicy = Input.optional(pricingPolicy);
        return this;
    }

    public SubscriptionLineInput setPricingPolicyInput(Input<SubscriptionPricingPolicyInput> pricingPolicy) {
        if (pricingPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pricingPolicy = pricingPolicy;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("productVariantId:");
        Query.appendQuotedString(_queryBuilder, productVariantId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("currentPrice:");
        Query.appendQuotedString(_queryBuilder, currentPrice.toString());

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

        if (this.sellingPlanId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sellingPlanId:");
            if (sellingPlanId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sellingPlanId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sellingPlanName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sellingPlanName:");
            if (sellingPlanName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sellingPlanName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.pricingPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pricingPolicy:");
            if (pricingPolicy.getValue() != null) {
                pricingPolicy.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
