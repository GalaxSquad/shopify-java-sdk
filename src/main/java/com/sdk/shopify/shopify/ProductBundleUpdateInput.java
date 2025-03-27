// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductBundleUpdateInput implements Serializable {
    private ID productId;

    private Input<String> title = Input.undefined();

    private Input<List<ProductBundleComponentInput>> components = Input.undefined();

    public ProductBundleUpdateInput(ID productId) {
        this.productId = productId;
    }

    public ID getProductId() {
        return productId;
    }

    public ProductBundleUpdateInput setProductId(ID productId) {
        this.productId = productId;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public ProductBundleUpdateInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public ProductBundleUpdateInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public List<ProductBundleComponentInput> getComponents() {
        return components.getValue();
    }

    public Input<List<ProductBundleComponentInput>> getComponentsInput() {
        return components;
    }

    public ProductBundleUpdateInput setComponents(List<ProductBundleComponentInput> components) {
        this.components = Input.optional(components);
        return this;
    }

    public ProductBundleUpdateInput setComponentsInput(Input<List<ProductBundleComponentInput>> components) {
        if (components == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.components = components;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

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

        if (this.components.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("components:");
            if (components.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductBundleComponentInput item1 : components.getValue()) {
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

        _queryBuilder.append('}');
    }
}
