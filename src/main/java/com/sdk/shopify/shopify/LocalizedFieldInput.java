// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class LocalizedFieldInput implements Serializable {
    private LocalizedFieldKey key;

    private String value;

    public LocalizedFieldInput(LocalizedFieldKey key, String value) {
        this.key = key;

        this.value = value;
    }

    public LocalizedFieldKey getKey() {
        return key;
    }

    public LocalizedFieldInput setKey(LocalizedFieldKey key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public LocalizedFieldInput setValue(String value) {
        this.value = value;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        _queryBuilder.append(key.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}
