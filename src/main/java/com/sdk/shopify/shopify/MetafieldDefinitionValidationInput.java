// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetafieldDefinitionValidationInput implements Serializable {
    private String name;

    private String value;

    public MetafieldDefinitionValidationInput(String name, String value) {
        this.name = name;

        this.value = value;
    }

    public String getName() {
        return name;
    }

    public MetafieldDefinitionValidationInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public MetafieldDefinitionValidationInput setValue(String value) {
        this.value = value;
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
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}
