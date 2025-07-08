// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class HasMetafieldsMetafieldIdentifierInput implements Serializable {
    private String key;

    private Input<String> namespace = Input.undefined();

    public HasMetafieldsMetafieldIdentifierInput(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public HasMetafieldsMetafieldIdentifierInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getNamespace() {
        return namespace.getValue();
    }

    public Input<String> getNamespaceInput() {
        return namespace;
    }

    public HasMetafieldsMetafieldIdentifierInput setNamespace(String namespace) {
        this.namespace = Input.optional(namespace);
        return this;
    }

    public HasMetafieldsMetafieldIdentifierInput setNamespaceInput(Input<String> namespace) {
        if (namespace == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespace = namespace;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        if (this.namespace.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespace:");
            if (namespace.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, namespace.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
