// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SubscriptionLineUpdateInput implements Serializable {
    private Input<ID> productVariantId = Input.undefined();

    private Input<Integer> quantity = Input.undefined();

    private Input<ID> sellingPlanId = Input.undefined();

    private Input<String> sellingPlanName = Input.undefined();

    private Input<BigDecimal> currentPrice = Input.undefined();

    private Input<List<AttributeInput>> customAttributes = Input.undefined();

    private Input<SubscriptionPricingPolicyInput> pricingPolicy = Input.undefined();

    public ID getProductVariantId() {
        return productVariantId.getValue();
    }

    public Input<ID> getProductVariantIdInput() {
        return productVariantId;
    }

    public SubscriptionLineUpdateInput setProductVariantId(ID productVariantId) {
        this.productVariantId = Input.optional(productVariantId);
        return this;
    }

    public SubscriptionLineUpdateInput setProductVariantIdInput(Input<ID> productVariantId) {
        if (productVariantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantId = productVariantId;
        return this;
    }

    public Integer getQuantity() {
        return quantity.getValue();
    }

    public Input<Integer> getQuantityInput() {
        return quantity;
    }

    public SubscriptionLineUpdateInput setQuantity(Integer quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    public SubscriptionLineUpdateInput setQuantityInput(Input<Integer> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public ID getSellingPlanId() {
        return sellingPlanId.getValue();
    }

    public Input<ID> getSellingPlanIdInput() {
        return sellingPlanId;
    }

    public SubscriptionLineUpdateInput setSellingPlanId(ID sellingPlanId) {
        this.sellingPlanId = Input.optional(sellingPlanId);
        return this;
    }

    public SubscriptionLineUpdateInput setSellingPlanIdInput(Input<ID> sellingPlanId) {
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

    public SubscriptionLineUpdateInput setSellingPlanName(String sellingPlanName) {
        this.sellingPlanName = Input.optional(sellingPlanName);
        return this;
    }

    public SubscriptionLineUpdateInput setSellingPlanNameInput(Input<String> sellingPlanName) {
        if (sellingPlanName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sellingPlanName = sellingPlanName;
        return this;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice.getValue();
    }

    public Input<BigDecimal> getCurrentPriceInput() {
        return currentPrice;
    }

    public SubscriptionLineUpdateInput setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = Input.optional(currentPrice);
        return this;
    }

    public SubscriptionLineUpdateInput setCurrentPriceInput(Input<BigDecimal> currentPrice) {
        if (currentPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currentPrice = currentPrice;
        return this;
    }

    public List<AttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<AttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public SubscriptionLineUpdateInput setCustomAttributes(List<AttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public SubscriptionLineUpdateInput setCustomAttributesInput(Input<List<AttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public SubscriptionPricingPolicyInput getPricingPolicy() {
        return pricingPolicy.getValue();
    }

    public Input<SubscriptionPricingPolicyInput> getPricingPolicyInput() {
        return pricingPolicy;
    }

    public SubscriptionLineUpdateInput setPricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
        this.pricingPolicy = Input.optional(pricingPolicy);
        return this;
    }

    public SubscriptionLineUpdateInput setPricingPolicyInput(Input<SubscriptionPricingPolicyInput> pricingPolicy) {
        if (pricingPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pricingPolicy = pricingPolicy;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.productVariantId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantId:");
            if (productVariantId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, productVariantId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.quantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantity:");
            if (quantity.getValue() != null) {
                _queryBuilder.append(quantity.getValue());
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

        if (this.currentPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currentPrice:");
            if (currentPrice.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, currentPrice.getValue().toString());
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
