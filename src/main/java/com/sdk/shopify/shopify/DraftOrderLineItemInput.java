// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DraftOrderLineItemInput implements Serializable {
    private int quantity;

    private Input<DraftOrderAppliedDiscountInput> appliedDiscount = Input.undefined();

    private Input<List<AttributeInput>> customAttributes = Input.undefined();

    private Input<MoneyInput> originalUnitPriceWithCurrency = Input.undefined();

    private Input<Boolean> requiresShipping = Input.undefined();

    private Input<String> sku = Input.undefined();

    private Input<Boolean> taxable = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<ID> variantId = Input.undefined();

    private Input<WeightInput> weight = Input.undefined();

    private Input<String> uuid = Input.undefined();

    private Input<List<BundlesDraftOrderBundleLineItemComponentInput>> bundleComponents = Input.undefined();

    private Input<Boolean> generatePriceOverride = Input.undefined();

    private Input<MoneyInput> priceOverride = Input.undefined();

    public DraftOrderLineItemInput(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public DraftOrderLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public DraftOrderAppliedDiscountInput getAppliedDiscount() {
        return appliedDiscount.getValue();
    }

    public Input<DraftOrderAppliedDiscountInput> getAppliedDiscountInput() {
        return appliedDiscount;
    }

    public DraftOrderLineItemInput setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
        this.appliedDiscount = Input.optional(appliedDiscount);
        return this;
    }

    public DraftOrderLineItemInput setAppliedDiscountInput(Input<DraftOrderAppliedDiscountInput> appliedDiscount) {
        if (appliedDiscount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliedDiscount = appliedDiscount;
        return this;
    }

    public List<AttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<AttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public DraftOrderLineItemInput setCustomAttributes(List<AttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public DraftOrderLineItemInput setCustomAttributesInput(Input<List<AttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public MoneyInput getOriginalUnitPriceWithCurrency() {
        return originalUnitPriceWithCurrency.getValue();
    }

    public Input<MoneyInput> getOriginalUnitPriceWithCurrencyInput() {
        return originalUnitPriceWithCurrency;
    }

    public DraftOrderLineItemInput setOriginalUnitPriceWithCurrency(MoneyInput originalUnitPriceWithCurrency) {
        this.originalUnitPriceWithCurrency = Input.optional(originalUnitPriceWithCurrency);
        return this;
    }

    public DraftOrderLineItemInput setOriginalUnitPriceWithCurrencyInput(Input<MoneyInput> originalUnitPriceWithCurrency) {
        if (originalUnitPriceWithCurrency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originalUnitPriceWithCurrency = originalUnitPriceWithCurrency;
        return this;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping.getValue();
    }

    public Input<Boolean> getRequiresShippingInput() {
        return requiresShipping;
    }

    public DraftOrderLineItemInput setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = Input.optional(requiresShipping);
        return this;
    }

    public DraftOrderLineItemInput setRequiresShippingInput(Input<Boolean> requiresShipping) {
        if (requiresShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiresShipping = requiresShipping;
        return this;
    }

    public String getSku() {
        return sku.getValue();
    }

    public Input<String> getSkuInput() {
        return sku;
    }

    public DraftOrderLineItemInput setSku(String sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    public DraftOrderLineItemInput setSkuInput(Input<String> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    public Boolean getTaxable() {
        return taxable.getValue();
    }

    public Input<Boolean> getTaxableInput() {
        return taxable;
    }

    public DraftOrderLineItemInput setTaxable(Boolean taxable) {
        this.taxable = Input.optional(taxable);
        return this;
    }

    public DraftOrderLineItemInput setTaxableInput(Input<Boolean> taxable) {
        if (taxable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxable = taxable;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public DraftOrderLineItemInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public DraftOrderLineItemInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public ID getVariantId() {
        return variantId.getValue();
    }

    public Input<ID> getVariantIdInput() {
        return variantId;
    }

    public DraftOrderLineItemInput setVariantId(ID variantId) {
        this.variantId = Input.optional(variantId);
        return this;
    }

    public DraftOrderLineItemInput setVariantIdInput(Input<ID> variantId) {
        if (variantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantId = variantId;
        return this;
    }

    public WeightInput getWeight() {
        return weight.getValue();
    }

    public Input<WeightInput> getWeightInput() {
        return weight;
    }

    public DraftOrderLineItemInput setWeight(WeightInput weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    public DraftOrderLineItemInput setWeightInput(Input<WeightInput> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
        return this;
    }

    public String getUuid() {
        return uuid.getValue();
    }

    public Input<String> getUuidInput() {
        return uuid;
    }

    public DraftOrderLineItemInput setUuid(String uuid) {
        this.uuid = Input.optional(uuid);
        return this;
    }

    public DraftOrderLineItemInput setUuidInput(Input<String> uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uuid = uuid;
        return this;
    }

    public List<BundlesDraftOrderBundleLineItemComponentInput> getBundleComponents() {
        return bundleComponents.getValue();
    }

    public Input<List<BundlesDraftOrderBundleLineItemComponentInput>> getBundleComponentsInput() {
        return bundleComponents;
    }

    public DraftOrderLineItemInput setBundleComponents(List<BundlesDraftOrderBundleLineItemComponentInput> bundleComponents) {
        this.bundleComponents = Input.optional(bundleComponents);
        return this;
    }

    public DraftOrderLineItemInput setBundleComponentsInput(Input<List<BundlesDraftOrderBundleLineItemComponentInput>> bundleComponents) {
        if (bundleComponents == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.bundleComponents = bundleComponents;
        return this;
    }

    public Boolean getGeneratePriceOverride() {
        return generatePriceOverride.getValue();
    }

    public Input<Boolean> getGeneratePriceOverrideInput() {
        return generatePriceOverride;
    }

    public DraftOrderLineItemInput setGeneratePriceOverride(Boolean generatePriceOverride) {
        this.generatePriceOverride = Input.optional(generatePriceOverride);
        return this;
    }

    public DraftOrderLineItemInput setGeneratePriceOverrideInput(Input<Boolean> generatePriceOverride) {
        if (generatePriceOverride == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.generatePriceOverride = generatePriceOverride;
        return this;
    }

    public MoneyInput getPriceOverride() {
        return priceOverride.getValue();
    }

    public Input<MoneyInput> getPriceOverrideInput() {
        return priceOverride;
    }

    public DraftOrderLineItemInput setPriceOverride(MoneyInput priceOverride) {
        this.priceOverride = Input.optional(priceOverride);
        return this;
    }

    public DraftOrderLineItemInput setPriceOverrideInput(Input<MoneyInput> priceOverride) {
        if (priceOverride == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceOverride = priceOverride;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

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

        if (this.originalUnitPriceWithCurrency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("originalUnitPriceWithCurrency:");
            if (originalUnitPriceWithCurrency.getValue() != null) {
                originalUnitPriceWithCurrency.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.requiresShipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("requiresShipping:");
            if (requiresShipping.getValue() != null) {
                _queryBuilder.append(requiresShipping.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sku.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sku:");
            if (sku.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sku.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.taxable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxable:");
            if (taxable.getValue() != null) {
                _queryBuilder.append(taxable.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
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

        if (this.weight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("weight:");
            if (weight.getValue() != null) {
                weight.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uuid.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uuid:");
            if (uuid.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, uuid.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.bundleComponents.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("bundleComponents:");
            if (bundleComponents.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (BundlesDraftOrderBundleLineItemComponentInput item1 : bundleComponents.getValue()) {
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

        if (this.generatePriceOverride.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("generatePriceOverride:");
            if (generatePriceOverride.getValue() != null) {
                _queryBuilder.append(generatePriceOverride.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.priceOverride.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceOverride:");
            if (priceOverride.getValue() != null) {
                priceOverride.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
