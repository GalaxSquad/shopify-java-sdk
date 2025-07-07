// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductVariantsBulkInput implements Serializable {
    private Input<String> barcode = Input.undefined();

    private Input<String> compareAtPrice = Input.undefined();

    private Input<ID> id = Input.undefined();

    private Input<List<String>> mediaSrc = Input.undefined();

    private Input<ProductVariantInventoryPolicy> inventoryPolicy = Input.undefined();

    private Input<List<InventoryLevelInput>> inventoryQuantities = Input.undefined();

    private Input<InventoryItemInput> inventoryItem = Input.undefined();

    private Input<ID> mediaId = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<List<VariantOptionValueInput>> optionValues = Input.undefined();

    private Input<String> price = Input.undefined();

    private Input<Boolean> taxable = Input.undefined();

    private Input<String> taxCode = Input.undefined();

    private Input<UnitPriceMeasurementInput> unitPriceMeasurement = Input.undefined();

    private Input<Boolean> showUnitPrice = Input.undefined();

    private Input<Boolean> requiresComponents = Input.undefined();

    public String getBarcode() {
        return barcode.getValue();
    }

    public Input<String> getBarcodeInput() {
        return barcode;
    }

    public ProductVariantsBulkInput setBarcode(String barcode) {
        this.barcode = Input.optional(barcode);
        return this;
    }

    public ProductVariantsBulkInput setBarcodeInput(Input<String> barcode) {
        if (barcode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.barcode = barcode;
        return this;
    }

    public String getCompareAtPrice() {
        return compareAtPrice.getValue();
    }

    public Input<String> getCompareAtPriceInput() {
        return compareAtPrice;
    }

    public ProductVariantsBulkInput setCompareAtPrice(String compareAtPrice) {
        this.compareAtPrice = Input.optional(compareAtPrice);
        return this;
    }

    public ProductVariantsBulkInput setCompareAtPriceInput(Input<String> compareAtPrice) {
        if (compareAtPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.compareAtPrice = compareAtPrice;
        return this;
    }

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ProductVariantsBulkInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ProductVariantsBulkInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public List<String> getMediaSrc() {
        return mediaSrc.getValue();
    }

    public Input<List<String>> getMediaSrcInput() {
        return mediaSrc;
    }

    public ProductVariantsBulkInput setMediaSrc(List<String> mediaSrc) {
        this.mediaSrc = Input.optional(mediaSrc);
        return this;
    }

    public ProductVariantsBulkInput setMediaSrcInput(Input<List<String>> mediaSrc) {
        if (mediaSrc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.mediaSrc = mediaSrc;
        return this;
    }

    public ProductVariantInventoryPolicy getInventoryPolicy() {
        return inventoryPolicy.getValue();
    }

    public Input<ProductVariantInventoryPolicy> getInventoryPolicyInput() {
        return inventoryPolicy;
    }

    public ProductVariantsBulkInput setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
        this.inventoryPolicy = Input.optional(inventoryPolicy);
        return this;
    }

    public ProductVariantsBulkInput setInventoryPolicyInput(Input<ProductVariantInventoryPolicy> inventoryPolicy) {
        if (inventoryPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryPolicy = inventoryPolicy;
        return this;
    }

    public List<InventoryLevelInput> getInventoryQuantities() {
        return inventoryQuantities.getValue();
    }

    public Input<List<InventoryLevelInput>> getInventoryQuantitiesInput() {
        return inventoryQuantities;
    }

    public ProductVariantsBulkInput setInventoryQuantities(List<InventoryLevelInput> inventoryQuantities) {
        this.inventoryQuantities = Input.optional(inventoryQuantities);
        return this;
    }

    public ProductVariantsBulkInput setInventoryQuantitiesInput(Input<List<InventoryLevelInput>> inventoryQuantities) {
        if (inventoryQuantities == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryQuantities = inventoryQuantities;
        return this;
    }

    public InventoryItemInput getInventoryItem() {
        return inventoryItem.getValue();
    }

    public Input<InventoryItemInput> getInventoryItemInput() {
        return inventoryItem;
    }

    public ProductVariantsBulkInput setInventoryItem(InventoryItemInput inventoryItem) {
        this.inventoryItem = Input.optional(inventoryItem);
        return this;
    }

    public ProductVariantsBulkInput setInventoryItemInput(Input<InventoryItemInput> inventoryItem) {
        if (inventoryItem == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryItem = inventoryItem;
        return this;
    }

    public ID getMediaId() {
        return mediaId.getValue();
    }

    public Input<ID> getMediaIdInput() {
        return mediaId;
    }

    public ProductVariantsBulkInput setMediaId(ID mediaId) {
        this.mediaId = Input.optional(mediaId);
        return this;
    }

    public ProductVariantsBulkInput setMediaIdInput(Input<ID> mediaId) {
        if (mediaId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.mediaId = mediaId;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public ProductVariantsBulkInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public ProductVariantsBulkInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public List<VariantOptionValueInput> getOptionValues() {
        return optionValues.getValue();
    }

    public Input<List<VariantOptionValueInput>> getOptionValuesInput() {
        return optionValues;
    }

    public ProductVariantsBulkInput setOptionValues(List<VariantOptionValueInput> optionValues) {
        this.optionValues = Input.optional(optionValues);
        return this;
    }

    public ProductVariantsBulkInput setOptionValuesInput(Input<List<VariantOptionValueInput>> optionValues) {
        if (optionValues == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionValues = optionValues;
        return this;
    }

    public String getPrice() {
        return price.getValue();
    }

    public Input<String> getPriceInput() {
        return price;
    }

    public ProductVariantsBulkInput setPrice(String price) {
        this.price = Input.optional(price);
        return this;
    }

    public ProductVariantsBulkInput setPriceInput(Input<String> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    public Boolean getTaxable() {
        return taxable.getValue();
    }

    public Input<Boolean> getTaxableInput() {
        return taxable;
    }

    public ProductVariantsBulkInput setTaxable(Boolean taxable) {
        this.taxable = Input.optional(taxable);
        return this;
    }

    public ProductVariantsBulkInput setTaxableInput(Input<Boolean> taxable) {
        if (taxable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxable = taxable;
        return this;
    }

    public String getTaxCode() {
        return taxCode.getValue();
    }

    public Input<String> getTaxCodeInput() {
        return taxCode;
    }

    public ProductVariantsBulkInput setTaxCode(String taxCode) {
        this.taxCode = Input.optional(taxCode);
        return this;
    }

    public ProductVariantsBulkInput setTaxCodeInput(Input<String> taxCode) {
        if (taxCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxCode = taxCode;
        return this;
    }

    public UnitPriceMeasurementInput getUnitPriceMeasurement() {
        return unitPriceMeasurement.getValue();
    }

    public Input<UnitPriceMeasurementInput> getUnitPriceMeasurementInput() {
        return unitPriceMeasurement;
    }

    public ProductVariantsBulkInput setUnitPriceMeasurement(UnitPriceMeasurementInput unitPriceMeasurement) {
        this.unitPriceMeasurement = Input.optional(unitPriceMeasurement);
        return this;
    }

    public ProductVariantsBulkInput setUnitPriceMeasurementInput(Input<UnitPriceMeasurementInput> unitPriceMeasurement) {
        if (unitPriceMeasurement == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.unitPriceMeasurement = unitPriceMeasurement;
        return this;
    }

    public Boolean getShowUnitPrice() {
        return showUnitPrice.getValue();
    }

    public Input<Boolean> getShowUnitPriceInput() {
        return showUnitPrice;
    }

    public ProductVariantsBulkInput setShowUnitPrice(Boolean showUnitPrice) {
        this.showUnitPrice = Input.optional(showUnitPrice);
        return this;
    }

    public ProductVariantsBulkInput setShowUnitPriceInput(Input<Boolean> showUnitPrice) {
        if (showUnitPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.showUnitPrice = showUnitPrice;
        return this;
    }

    public Boolean getRequiresComponents() {
        return requiresComponents.getValue();
    }

    public Input<Boolean> getRequiresComponentsInput() {
        return requiresComponents;
    }

    public ProductVariantsBulkInput setRequiresComponents(Boolean requiresComponents) {
        this.requiresComponents = Input.optional(requiresComponents);
        return this;
    }

    public ProductVariantsBulkInput setRequiresComponentsInput(Input<Boolean> requiresComponents) {
        if (requiresComponents == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiresComponents = requiresComponents;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.barcode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("barcode:");
            if (barcode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, barcode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.compareAtPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("compareAtPrice:");
            if (compareAtPrice.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, compareAtPrice.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.mediaSrc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("mediaSrc:");
            if (mediaSrc.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : mediaSrc.getValue()) {
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

        if (this.inventoryPolicy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("inventoryPolicy:");
            if (inventoryPolicy.getValue() != null) {
                _queryBuilder.append(inventoryPolicy.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.inventoryQuantities.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("inventoryQuantities:");
            if (inventoryQuantities.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (InventoryLevelInput item1 : inventoryQuantities.getValue()) {
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

        if (this.inventoryItem.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("inventoryItem:");
            if (inventoryItem.getValue() != null) {
                inventoryItem.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.mediaId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("mediaId:");
            if (mediaId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, mediaId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
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

        if (this.optionValues.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("optionValues:");
            if (optionValues.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (VariantOptionValueInput item1 : optionValues.getValue()) {
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

        if (this.price.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("price:");
            if (price.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, price.getValue().toString());
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

        if (this.taxCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxCode:");
            if (taxCode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, taxCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.unitPriceMeasurement.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("unitPriceMeasurement:");
            if (unitPriceMeasurement.getValue() != null) {
                unitPriceMeasurement.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.showUnitPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("showUnitPrice:");
            if (showUnitPrice.getValue() != null) {
                _queryBuilder.append(showUnitPrice.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.requiresComponents.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("requiresComponents:");
            if (requiresComponents.getValue() != null) {
                _queryBuilder.append(requiresComponents.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
