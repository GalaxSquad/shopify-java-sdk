// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductVariantSetInput implements Serializable {
    private List<VariantOptionValueInput> optionValues;

    private Input<Boolean> requiresComponents = Input.undefined();

    private Input<String> barcode = Input.undefined();

    private Input<String> compareAtPrice = Input.undefined();

    private Input<ID> id = Input.undefined();

    private Input<FileSetInput> file = Input.undefined();

    private Input<ProductVariantInventoryPolicy> inventoryPolicy = Input.undefined();

    private Input<List<ProductSetInventoryInput>> inventoryQuantities = Input.undefined();

    private Input<InventoryItemInput> inventoryItem = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<Integer> position = Input.undefined();

    private Input<String> price = Input.undefined();

    private Input<String> sku = Input.undefined();

    private Input<Boolean> taxable = Input.undefined();

    private Input<String> taxCode = Input.undefined();

    public ProductVariantSetInput(List<VariantOptionValueInput> optionValues) {
        this.optionValues = optionValues;
    }

    public List<VariantOptionValueInput> getOptionValues() {
        return optionValues;
    }

    public ProductVariantSetInput setOptionValues(List<VariantOptionValueInput> optionValues) {
        this.optionValues = optionValues;
        return this;
    }

    public Boolean getRequiresComponents() {
        return requiresComponents.getValue();
    }

    public Input<Boolean> getRequiresComponentsInput() {
        return requiresComponents;
    }

    public ProductVariantSetInput setRequiresComponents(Boolean requiresComponents) {
        this.requiresComponents = Input.optional(requiresComponents);
        return this;
    }

    public ProductVariantSetInput setRequiresComponentsInput(Input<Boolean> requiresComponents) {
        if (requiresComponents == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiresComponents = requiresComponents;
        return this;
    }

    public String getBarcode() {
        return barcode.getValue();
    }

    public Input<String> getBarcodeInput() {
        return barcode;
    }

    public ProductVariantSetInput setBarcode(String barcode) {
        this.barcode = Input.optional(barcode);
        return this;
    }

    public ProductVariantSetInput setBarcodeInput(Input<String> barcode) {
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

    public ProductVariantSetInput setCompareAtPrice(String compareAtPrice) {
        this.compareAtPrice = Input.optional(compareAtPrice);
        return this;
    }

    public ProductVariantSetInput setCompareAtPriceInput(Input<String> compareAtPrice) {
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

    public ProductVariantSetInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ProductVariantSetInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public FileSetInput getFile() {
        return file.getValue();
    }

    public Input<FileSetInput> getFileInput() {
        return file;
    }

    public ProductVariantSetInput setFile(FileSetInput file) {
        this.file = Input.optional(file);
        return this;
    }

    public ProductVariantSetInput setFileInput(Input<FileSetInput> file) {
        if (file == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.file = file;
        return this;
    }

    public ProductVariantInventoryPolicy getInventoryPolicy() {
        return inventoryPolicy.getValue();
    }

    public Input<ProductVariantInventoryPolicy> getInventoryPolicyInput() {
        return inventoryPolicy;
    }

    public ProductVariantSetInput setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
        this.inventoryPolicy = Input.optional(inventoryPolicy);
        return this;
    }

    public ProductVariantSetInput setInventoryPolicyInput(Input<ProductVariantInventoryPolicy> inventoryPolicy) {
        if (inventoryPolicy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryPolicy = inventoryPolicy;
        return this;
    }

    public List<ProductSetInventoryInput> getInventoryQuantities() {
        return inventoryQuantities.getValue();
    }

    public Input<List<ProductSetInventoryInput>> getInventoryQuantitiesInput() {
        return inventoryQuantities;
    }

    public ProductVariantSetInput setInventoryQuantities(List<ProductSetInventoryInput> inventoryQuantities) {
        this.inventoryQuantities = Input.optional(inventoryQuantities);
        return this;
    }

    public ProductVariantSetInput setInventoryQuantitiesInput(Input<List<ProductSetInventoryInput>> inventoryQuantities) {
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

    public ProductVariantSetInput setInventoryItem(InventoryItemInput inventoryItem) {
        this.inventoryItem = Input.optional(inventoryItem);
        return this;
    }

    public ProductVariantSetInput setInventoryItemInput(Input<InventoryItemInput> inventoryItem) {
        if (inventoryItem == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryItem = inventoryItem;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public ProductVariantSetInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public ProductVariantSetInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public Integer getPosition() {
        return position.getValue();
    }

    public Input<Integer> getPositionInput() {
        return position;
    }

    public ProductVariantSetInput setPosition(Integer position) {
        this.position = Input.optional(position);
        return this;
    }

    public ProductVariantSetInput setPositionInput(Input<Integer> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
        return this;
    }

    public String getPrice() {
        return price.getValue();
    }

    public Input<String> getPriceInput() {
        return price;
    }

    public ProductVariantSetInput setPrice(String price) {
        this.price = Input.optional(price);
        return this;
    }

    public ProductVariantSetInput setPriceInput(Input<String> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    public String getSku() {
        return sku.getValue();
    }

    public Input<String> getSkuInput() {
        return sku;
    }

    public ProductVariantSetInput setSku(String sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    public ProductVariantSetInput setSkuInput(Input<String> sku) {
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

    public ProductVariantSetInput setTaxable(Boolean taxable) {
        this.taxable = Input.optional(taxable);
        return this;
    }

    public ProductVariantSetInput setTaxableInput(Input<Boolean> taxable) {
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

    public ProductVariantSetInput setTaxCode(String taxCode) {
        this.taxCode = Input.optional(taxCode);
        return this;
    }

    public ProductVariantSetInput setTaxCodeInput(Input<String> taxCode) {
        if (taxCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxCode = taxCode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("optionValues:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (VariantOptionValueInput item1 : optionValues) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

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

        if (this.file.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("file:");
            if (file.getValue() != null) {
                file.getValue().appendTo(_queryBuilder);
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
                    for (ProductSetInventoryInput item1 : inventoryQuantities.getValue()) {
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

        if (this.position.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("position:");
            if (position.getValue() != null) {
                _queryBuilder.append(position.getValue());
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

        _queryBuilder.append('}');
    }
}
