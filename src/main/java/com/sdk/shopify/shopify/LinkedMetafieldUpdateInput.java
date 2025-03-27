// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class LinkedMetafieldUpdateInput implements Serializable {
    private String namespace;

    private String key;

    public LinkedMetafieldUpdateInput(String namespace, String key) {
        this.namespace = namespace;

        this.key = key;
    }

    public String getNamespace() {
        return namespace;
    }

    public LinkedMetafieldUpdateInput setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getKey() {
        return key;
    }

    public LinkedMetafieldUpdateInput setKey(String key) {
        this.key = key;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("namespace:");
        Query.appendQuotedString(_queryBuilder, namespace.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append('}');
    }
}
