// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class OrderCreateLineItemInput implements Serializable {
    private int quantity;

    private Input<String> fulfillmentService = Input.undefined();

    private Input<Boolean> giftCard = Input.undefined();

    private Input<MoneyBagInput> priceSet = Input.undefined();

    private Input<ID> productId = Input.undefined();

    private Input<List<OrderCreateLineItemPropertyInput>> properties = Input.undefined();

    private Input<Boolean> requiresShipping = Input.undefined();

    private Input<String> sku = Input.undefined();

    private Input<List<OrderCreateTaxLineInput>> taxLines = Input.undefined();

    private Input<Boolean> taxable = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<ID> variantId = Input.undefined();

    private Input<String> variantTitle = Input.undefined();

    private Input<String> vendor = Input.undefined();

    private Input<WeightInput> weight = Input.undefined();

    public OrderCreateLineItemInput(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderCreateLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getFulfillmentService() {
        return fulfillmentService.getValue();
    }

    public Input<String> getFulfillmentServiceInput() {
        return fulfillmentService;
    }

    public OrderCreateLineItemInput setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = Input.optional(fulfillmentService);
        return this;
    }

    public OrderCreateLineItemInput setFulfillmentServiceInput(Input<String> fulfillmentService) {
        if (fulfillmentService == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillmentService = fulfillmentService;
        return this;
    }

    public Boolean getGiftCard() {
        return giftCard.getValue();
    }

    public Input<Boolean> getGiftCardInput() {
        return giftCard;
    }

    public OrderCreateLineItemInput setGiftCard(Boolean giftCard) {
        this.giftCard = Input.optional(giftCard);
        return this;
    }

    public OrderCreateLineItemInput setGiftCardInput(Input<Boolean> giftCard) {
        if (giftCard == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftCard = giftCard;
        return this;
    }

    public MoneyBagInput getPriceSet() {
        return priceSet.getValue();
    }

    public Input<MoneyBagInput> getPriceSetInput() {
        return priceSet;
    }

    public OrderCreateLineItemInput setPriceSet(MoneyBagInput priceSet) {
        this.priceSet = Input.optional(priceSet);
        return this;
    }

    public OrderCreateLineItemInput setPriceSetInput(Input<MoneyBagInput> priceSet) {
        if (priceSet == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceSet = priceSet;
        return this;
    }

    public ID getProductId() {
        return productId.getValue();
    }

    public Input<ID> getProductIdInput() {
        return productId;
    }

    public OrderCreateLineItemInput setProductId(ID productId) {
        this.productId = Input.optional(productId);
        return this;
    }

    public OrderCreateLineItemInput setProductIdInput(Input<ID> productId) {
        if (productId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productId = productId;
        return this;
    }

    public List<OrderCreateLineItemPropertyInput> getProperties() {
        return properties.getValue();
    }

    public Input<List<OrderCreateLineItemPropertyInput>> getPropertiesInput() {
        return properties;
    }

    public OrderCreateLineItemInput setProperties(List<OrderCreateLineItemPropertyInput> properties) {
        this.properties = Input.optional(properties);
        return this;
    }

    public OrderCreateLineItemInput setPropertiesInput(Input<List<OrderCreateLineItemPropertyInput>> properties) {
        if (properties == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.properties = properties;
        return this;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping.getValue();
    }

    public Input<Boolean> getRequiresShippingInput() {
        return requiresShipping;
    }

    public OrderCreateLineItemInput setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = Input.optional(requiresShipping);
        return this;
    }

    public OrderCreateLineItemInput setRequiresShippingInput(Input<Boolean> requiresShipping) {
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

    public OrderCreateLineItemInput setSku(String sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    public OrderCreateLineItemInput setSkuInput(Input<String> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    public List<OrderCreateTaxLineInput> getTaxLines() {
        return taxLines.getValue();
    }

    public Input<List<OrderCreateTaxLineInput>> getTaxLinesInput() {
        return taxLines;
    }

    public OrderCreateLineItemInput setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
        this.taxLines = Input.optional(taxLines);
        return this;
    }

    public OrderCreateLineItemInput setTaxLinesInput(Input<List<OrderCreateTaxLineInput>> taxLines) {
        if (taxLines == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxLines = taxLines;
        return this;
    }

    public Boolean getTaxable() {
        return taxable.getValue();
    }

    public Input<Boolean> getTaxableInput() {
        return taxable;
    }

    public OrderCreateLineItemInput setTaxable(Boolean taxable) {
        this.taxable = Input.optional(taxable);
        return this;
    }

    public OrderCreateLineItemInput setTaxableInput(Input<Boolean> taxable) {
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

    public OrderCreateLineItemInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public OrderCreateLineItemInput setTitleInput(Input<String> title) {
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

    public OrderCreateLineItemInput setVariantId(ID variantId) {
        this.variantId = Input.optional(variantId);
        return this;
    }

    public OrderCreateLineItemInput setVariantIdInput(Input<ID> variantId) {
        if (variantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantId = variantId;
        return this;
    }

    public String getVariantTitle() {
        return variantTitle.getValue();
    }

    public Input<String> getVariantTitleInput() {
        return variantTitle;
    }

    public OrderCreateLineItemInput setVariantTitle(String variantTitle) {
        this.variantTitle = Input.optional(variantTitle);
        return this;
    }

    public OrderCreateLineItemInput setVariantTitleInput(Input<String> variantTitle) {
        if (variantTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantTitle = variantTitle;
        return this;
    }

    public String getVendor() {
        return vendor.getValue();
    }

    public Input<String> getVendorInput() {
        return vendor;
    }

    public OrderCreateLineItemInput setVendor(String vendor) {
        this.vendor = Input.optional(vendor);
        return this;
    }

    public OrderCreateLineItemInput setVendorInput(Input<String> vendor) {
        if (vendor == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.vendor = vendor;
        return this;
    }

    public WeightInput getWeight() {
        return weight.getValue();
    }

    public Input<WeightInput> getWeightInput() {
        return weight;
    }

    public OrderCreateLineItemInput setWeight(WeightInput weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    public OrderCreateLineItemInput setWeightInput(Input<WeightInput> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        if (this.fulfillmentService.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillmentService:");
            if (fulfillmentService.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, fulfillmentService.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftCard.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("giftCard:");
            if (giftCard.getValue() != null) {
                _queryBuilder.append(giftCard.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.priceSet.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceSet:");
            if (priceSet.getValue() != null) {
                priceSet.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.productId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productId:");
            if (productId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, productId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.properties.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("properties:");
            if (properties.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateLineItemPropertyInput item1 : properties.getValue()) {
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

        if (this.taxLines.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxLines:");
            if (taxLines.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateTaxLineInput item1 : taxLines.getValue()) {
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

        if (this.variantTitle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variantTitle:");
            if (variantTitle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, variantTitle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.vendor.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("vendor:");
            if (vendor.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, vendor.getValue().toString());
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

        _queryBuilder.append('}');
    }
}
