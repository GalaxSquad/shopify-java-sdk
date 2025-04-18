// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ProductBundleComponentQuantityOptionValueInput implements Serializable {
    private String name;

    private int quantity;

    public ProductBundleComponentQuantityOptionValueInput(String name, int quantity) {
        this.name = name;

        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public ProductBundleComponentQuantityOptionValueInput setName(String name) {
        this.name = name;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductBundleComponentQuantityOptionValueInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
