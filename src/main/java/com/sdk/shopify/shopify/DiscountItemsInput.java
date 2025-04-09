// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class DiscountItemsInput implements Serializable {
    private Input<DiscountProductsInput> products = Input.undefined();

    private Input<DiscountCollectionsInput> collections = Input.undefined();

    private Input<Boolean> all = Input.undefined();

    public DiscountProductsInput getProducts() {
        return products.getValue();
    }

    public Input<DiscountProductsInput> getProductsInput() {
        return products;
    }

    public DiscountItemsInput setProducts(DiscountProductsInput products) {
        this.products = Input.optional(products);
        return this;
    }

    public DiscountItemsInput setProductsInput(Input<DiscountProductsInput> products) {
        if (products == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.products = products;
        return this;
    }

    public DiscountCollectionsInput getCollections() {
        return collections.getValue();
    }

    public Input<DiscountCollectionsInput> getCollectionsInput() {
        return collections;
    }

    public DiscountItemsInput setCollections(DiscountCollectionsInput collections) {
        this.collections = Input.optional(collections);
        return this;
    }

    public DiscountItemsInput setCollectionsInput(Input<DiscountCollectionsInput> collections) {
        if (collections == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.collections = collections;
        return this;
    }

    public Boolean getAll() {
        return all.getValue();
    }

    public Input<Boolean> getAllInput() {
        return all;
    }

    public DiscountItemsInput setAll(Boolean all) {
        this.all = Input.optional(all);
        return this;
    }

    public DiscountItemsInput setAllInput(Input<Boolean> all) {
        if (all == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.all = all;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.products.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("products:");
            if (products.getValue() != null) {
                products.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.collections.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("collections:");
            if (collections.getValue() != null) {
                collections.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.all.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("all:");
            if (all.getValue() != null) {
                _queryBuilder.append(all.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
