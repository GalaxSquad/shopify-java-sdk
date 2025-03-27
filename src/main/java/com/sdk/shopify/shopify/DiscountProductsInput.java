// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DiscountProductsInput implements Serializable {
    private Input<List<ID>> productsToAdd = Input.undefined();

    private Input<List<ID>> productsToRemove = Input.undefined();

    private Input<List<ID>> productVariantsToAdd = Input.undefined();

    private Input<List<ID>> productVariantsToRemove = Input.undefined();

    public List<ID> getProductsToAdd() {
        return productsToAdd.getValue();
    }

    public Input<List<ID>> getProductsToAddInput() {
        return productsToAdd;
    }

    public DiscountProductsInput setProductsToAdd(List<ID> productsToAdd) {
        this.productsToAdd = Input.optional(productsToAdd);
        return this;
    }

    public DiscountProductsInput setProductsToAddInput(Input<List<ID>> productsToAdd) {
        if (productsToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productsToAdd = productsToAdd;
        return this;
    }

    public List<ID> getProductsToRemove() {
        return productsToRemove.getValue();
    }

    public Input<List<ID>> getProductsToRemoveInput() {
        return productsToRemove;
    }

    public DiscountProductsInput setProductsToRemove(List<ID> productsToRemove) {
        this.productsToRemove = Input.optional(productsToRemove);
        return this;
    }

    public DiscountProductsInput setProductsToRemoveInput(Input<List<ID>> productsToRemove) {
        if (productsToRemove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productsToRemove = productsToRemove;
        return this;
    }

    public List<ID> getProductVariantsToAdd() {
        return productVariantsToAdd.getValue();
    }

    public Input<List<ID>> getProductVariantsToAddInput() {
        return productVariantsToAdd;
    }

    public DiscountProductsInput setProductVariantsToAdd(List<ID> productVariantsToAdd) {
        this.productVariantsToAdd = Input.optional(productVariantsToAdd);
        return this;
    }

    public DiscountProductsInput setProductVariantsToAddInput(Input<List<ID>> productVariantsToAdd) {
        if (productVariantsToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantsToAdd = productVariantsToAdd;
        return this;
    }

    public List<ID> getProductVariantsToRemove() {
        return productVariantsToRemove.getValue();
    }

    public Input<List<ID>> getProductVariantsToRemoveInput() {
        return productVariantsToRemove;
    }

    public DiscountProductsInput setProductVariantsToRemove(List<ID> productVariantsToRemove) {
        this.productVariantsToRemove = Input.optional(productVariantsToRemove);
        return this;
    }

    public DiscountProductsInput setProductVariantsToRemoveInput(Input<List<ID>> productVariantsToRemove) {
        if (productVariantsToRemove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantsToRemove = productVariantsToRemove;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.productsToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productsToAdd:");
            if (productsToAdd.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productsToAdd.getValue()) {
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

        if (this.productsToRemove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productsToRemove:");
            if (productsToRemove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productsToRemove.getValue()) {
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

        if (this.productVariantsToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantsToAdd:");
            if (productVariantsToAdd.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productVariantsToAdd.getValue()) {
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

        if (this.productVariantsToRemove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantsToRemove:");
            if (productVariantsToRemove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : productVariantsToRemove.getValue()) {
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

        _queryBuilder.append('}');
    }
}
