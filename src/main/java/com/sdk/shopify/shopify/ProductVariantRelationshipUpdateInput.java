// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductVariantRelationshipUpdateInput implements Serializable {
    private Input<ID> parentProductVariantId = Input.undefined();

    private Input<ID> parentProductId = Input.undefined();

    private Input<List<ProductVariantGroupRelationshipInput>> productVariantRelationshipsToCreate = Input.undefined();

    private Input<List<ProductVariantGroupRelationshipInput>> productVariantRelationshipsToUpdate = Input.undefined();

    private Input<List<ID>> productVariantRelationshipsToRemove = Input.undefined();

    private Input<Boolean> removeAllProductVariantRelationships = Input.undefined();

    private Input<PriceInput> priceInput = Input.undefined();

    public ID getParentProductVariantId() {
        return parentProductVariantId.getValue();
    }

    public Input<ID> getParentProductVariantIdInput() {
        return parentProductVariantId;
    }

    public ProductVariantRelationshipUpdateInput setParentProductVariantId(ID parentProductVariantId) {
        this.parentProductVariantId = Input.optional(parentProductVariantId);
        return this;
    }

    public ProductVariantRelationshipUpdateInput setParentProductVariantIdInput(Input<ID> parentProductVariantId) {
        if (parentProductVariantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentProductVariantId = parentProductVariantId;
        return this;
    }

    public ID getParentProductId() {
        return parentProductId.getValue();
    }

    public Input<ID> getParentProductIdInput() {
        return parentProductId;
    }

    public ProductVariantRelationshipUpdateInput setParentProductId(ID parentProductId) {
        this.parentProductId = Input.optional(parentProductId);
        return this;
    }

    public ProductVariantRelationshipUpdateInput setParentProductIdInput(Input<ID> parentProductId) {
        if (parentProductId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentProductId = parentProductId;
        return this;
    }

    public List<ProductVariantGroupRelationshipInput> getProductVariantRelationshipsToCreate() {
        return productVariantRelationshipsToCreate.getValue();
    }

    public Input<List<ProductVariantGroupRelationshipInput>> getProductVariantRelationshipsToCreateInput() {
        return productVariantRelationshipsToCreate;
    }

    public ProductVariantRelationshipUpdateInput setProductVariantRelationshipsToCreate(List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToCreate) {
        this.productVariantRelationshipsToCreate = Input.optional(productVariantRelationshipsToCreate);
        return this;
    }

    public ProductVariantRelationshipUpdateInput setProductVariantRelationshipsToCreateInput(Input<List<ProductVariantGroupRelationshipInput>> productVariantRelationshipsToCreate) {
        if (productVariantRelationshipsToCreate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantRelationshipsToCreate = productVariantRelationshipsToCreate;
        return this;
    }

    public List<ProductVariantGroupRelationshipInput> getProductVariantRelationshipsToUpdate() {
        return productVariantRelationshipsToUpdate.getValue();
    }

    public Input<List<ProductVariantGroupRelationshipInput>> getProductVariantRelationshipsToUpdateInput() {
        return productVariantRelationshipsToUpdate;
    }

    public ProductVariantRelationshipUpdateInput setProductVariantRelationshipsToUpdate(List<ProductVariantGroupRelationshipInput> productVariantRelationshipsToUpdate) {
        this.productVariantRelationshipsToUpdate = Input.optional(productVariantRelationshipsToUpdate);
        return this;
    }

    public ProductVariantRelationshipUpdateInput setProductVariantRelationshipsToUpdateInput(Input<List<ProductVariantGroupRelationshipInput>> productVariantRelationshipsToUpdate) {
        if (productVariantRelationshipsToUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantRelationshipsToUpdate = productVariantRelationshipsToUpdate;
        return this;
    }

    public List<ID> getProductVariantRelationshipsToRemove() {
        return productVariantRelationshipsToRemove.getValue();
    }

    public Input<List<ID>> getProductVariantRelationshipsToRemoveInput() {
        return productVariantRelationshipsToRemove;
    }

    public ProductVariantRelationshipUpdateInput setProductVariantRelationshipsToRemove(List<ID> productVariantRelationshipsToRemove) {
        this.productVariantRelationshipsToRemove = Input.optional(productVariantRelationshipsToRemove);
        return this;
    }

    public ProductVariantRelationshipUpdateInput setProductVariantRelationshipsToRemoveInput(Input<List<ID>> productVariantRelationshipsToRemove) {
        if (productVariantRelationshipsToRemove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantRelationshipsToRemove = productVariantRelationshipsToRemove;
        return this;
    }

    public Boolean getRemoveAllProductVariantRelationships() {
        return removeAllProductVariantRelationships.getValue();
    }

    public Input<Boolean> getRemoveAllProductVariantRelationshipsInput() {
        return removeAllProductVariantRelationships;
    }

    public ProductVariantRelationshipUpdateInput setRemoveAllProductVariantRelationships(Boolean removeAllProductVariantRelationships) {
        this.removeAllProductVariantRelationships = Input.optional(removeAllProductVariantRelationships);
        return this;
    }

    public ProductVariantRelationshipUpdateInput setRemoveAllProductVariantRelationshipsInput(Input<Boolean> removeAllProductVariantRelationships) {
        if (removeAllProductVariantRelationships == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.removeAllProductVariantRelationships = removeAllProductVariantRelationships;
        return this;
    }

    public PriceInput getPriceInput() {
        return priceInput.getValue();
    }

    public Input<PriceInput> getPriceInputInput() {
        return priceInput;
    }

    public ProductVariantRelationshipUpdateInput setPriceInput(PriceInput priceInput) {
        this.priceInput = Input.optional(priceInput);
        return this;
    }

    public ProductVariantRelationshipUpdateInput setPriceInputInput(Input<PriceInput> priceInput) {
        if (priceInput == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceInput = priceInput;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.parentProductVariantId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parentProductVariantId:");
            if (parentProductVariantId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, parentProductVariantId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.parentProductId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parentProductId:");
            if (parentProductId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, parentProductId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.productVariantRelationshipsToCreate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantRelationshipsToCreate:");
            if (productVariantRelationshipsToCreate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductVariantGroupRelationshipInput item1 : productVariantRelationshipsToCreate.getValue()) {
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

        if (this.productVariantRelationshipsToUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantRelationshipsToUpdate:");
            if (productVariantRelationshipsToUpdate.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductVariantGroupRelationshipInput item1 : productVariantRelationshipsToUpdate.getValue()) {
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

        if (this.productVariantRelationshipsToRemove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantRelationshipsToRemove:");
            if (productVariantRelationshipsToRemove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productVariantRelationshipsToRemove.getValue()) {
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

        if (this.removeAllProductVariantRelationships.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("removeAllProductVariantRelationships:");
            if (removeAllProductVariantRelationships.getValue() != null) {
                _queryBuilder.append(removeAllProductVariantRelationships.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.priceInput.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceInput:");
            if (priceInput.getValue() != null) {
                priceInput.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
