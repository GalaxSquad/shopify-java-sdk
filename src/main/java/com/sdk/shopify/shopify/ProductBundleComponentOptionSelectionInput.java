// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductBundleComponentOptionSelectionInput implements Serializable {
    private ID componentOptionId;

    private String name;

    private List<String> values;

    public ProductBundleComponentOptionSelectionInput(ID componentOptionId, String name, List<String> values) {
        this.componentOptionId = componentOptionId;

        this.name = name;

        this.values = values;
    }

    public ID getComponentOptionId() {
        return componentOptionId;
    }

    public ProductBundleComponentOptionSelectionInput setComponentOptionId(ID componentOptionId) {
        this.componentOptionId = componentOptionId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductBundleComponentOptionSelectionInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public ProductBundleComponentOptionSelectionInput setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("componentOptionId:");
        Query.appendQuotedString(_queryBuilder, componentOptionId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("values:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : values) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
