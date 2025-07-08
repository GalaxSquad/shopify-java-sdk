// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetafieldDefinitionIdentifierInput implements Serializable {
    private MetafieldOwnerType ownerType;

    private String key;

    private Input<String> namespace = Input.undefined();

    public MetafieldDefinitionIdentifierInput(MetafieldOwnerType ownerType, String key) {
        this.ownerType = ownerType;

        this.key = key;
    }

    public MetafieldOwnerType getOwnerType() {
        return ownerType;
    }

    public MetafieldDefinitionIdentifierInput setOwnerType(MetafieldOwnerType ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    public String getKey() {
        return key;
    }

    public MetafieldDefinitionIdentifierInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getNamespace() {
        return namespace.getValue();
    }

    public Input<String> getNamespaceInput() {
        return namespace;
    }

    public MetafieldDefinitionIdentifierInput setNamespace(String namespace) {
        this.namespace = Input.optional(namespace);
        return this;
    }

    public MetafieldDefinitionIdentifierInput setNamespaceInput(Input<String> namespace) {
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
        _queryBuilder.append("ownerType:");
        _queryBuilder.append(ownerType.toString());

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
