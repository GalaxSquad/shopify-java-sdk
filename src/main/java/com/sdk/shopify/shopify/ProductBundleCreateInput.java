// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductBundleCreateInput implements Serializable {
    private String title;

    private List<ProductBundleComponentInput> components;

    public ProductBundleCreateInput(String title, List<ProductBundleComponentInput> components) {
        this.title = title;

        this.components = components;
    }

    public String getTitle() {
        return title;
    }

    public ProductBundleCreateInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<ProductBundleComponentInput> getComponents() {
        return components;
    }

    public ProductBundleCreateInput setComponents(List<ProductBundleComponentInput> components) {
        this.components = components;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("components:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductBundleComponentInput item1 : components) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
