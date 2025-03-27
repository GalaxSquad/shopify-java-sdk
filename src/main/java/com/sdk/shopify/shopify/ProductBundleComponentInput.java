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

import java.io.Serializable;
import java.util.List;

public class ProductBundleComponentInput implements Serializable {
    private ID productId;

    private List<ProductBundleComponentOptionSelectionInput> optionSelections;

    private Input<Integer> quantity = Input.undefined();

    private Input<ProductBundleComponentQuantityOptionInput> quantityOption = Input.undefined();

    public ProductBundleComponentInput(ID productId, List<ProductBundleComponentOptionSelectionInput> optionSelections) {
        this.productId = productId;

        this.optionSelections = optionSelections;
    }

    public ID getProductId() {
        return productId;
    }

    public ProductBundleComponentInput setProductId(ID productId) {
        this.productId = productId;
        return this;
    }

    public List<ProductBundleComponentOptionSelectionInput> getOptionSelections() {
        return optionSelections;
    }

    public ProductBundleComponentInput setOptionSelections(List<ProductBundleComponentOptionSelectionInput> optionSelections) {
        this.optionSelections = optionSelections;
        return this;
    }

    public Integer getQuantity() {
        return quantity.getValue();
    }

    public Input<Integer> getQuantityInput() {
        return quantity;
    }

    public ProductBundleComponentInput setQuantity(Integer quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    public ProductBundleComponentInput setQuantityInput(Input<Integer> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public ProductBundleComponentQuantityOptionInput getQuantityOption() {
        return quantityOption.getValue();
    }

    public Input<ProductBundleComponentQuantityOptionInput> getQuantityOptionInput() {
        return quantityOption;
    }

    public ProductBundleComponentInput setQuantityOption(ProductBundleComponentQuantityOptionInput quantityOption) {
        this.quantityOption = Input.optional(quantityOption);
        return this;
    }

    public ProductBundleComponentInput setQuantityOptionInput(Input<ProductBundleComponentQuantityOptionInput> quantityOption) {
        if (quantityOption == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantityOption = quantityOption;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("optionSelections:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductBundleComponentOptionSelectionInput item1 : optionSelections) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

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

        if (this.quantityOption.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantityOption:");
            if (quantityOption.getValue() != null) {
                quantityOption.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
