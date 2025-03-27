// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetaobjectFieldInput implements Serializable {
    private String key;

    private String value;

    public MetaobjectFieldInput(String key, String value) {
        this.key = key;

        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public MetaobjectFieldInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public MetaobjectFieldInput setValue(String value) {
        this.value = value;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}
