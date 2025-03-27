// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetafieldInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> namespace = Input.undefined();

    private Input<String> key = Input.undefined();

    private Input<String> value = Input.undefined();

    private Input<String> type = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public MetafieldInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public MetafieldInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getNamespace() {
        return namespace.getValue();
    }

    public Input<String> getNamespaceInput() {
        return namespace;
    }

    public MetafieldInput setNamespace(String namespace) {
        this.namespace = Input.optional(namespace);
        return this;
    }

    public MetafieldInput setNamespaceInput(Input<String> namespace) {
        if (namespace == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespace = namespace;
        return this;
    }

    public String getKey() {
        return key.getValue();
    }

    public Input<String> getKeyInput() {
        return key;
    }

    public MetafieldInput setKey(String key) {
        this.key = Input.optional(key);
        return this;
    }

    public MetafieldInput setKeyInput(Input<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.key = key;
        return this;
    }

    public String getValue() {
        return value.getValue();
    }

    public Input<String> getValueInput() {
        return value;
    }

    public MetafieldInput setValue(String value) {
        this.value = Input.optional(value);
        return this;
    }

    public MetafieldInput setValueInput(Input<String> value) {
        if (value == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.value = value;
        return this;
    }

    public String getType() {
        return type.getValue();
    }

    public Input<String> getTypeInput() {
        return type;
    }

    public MetafieldInput setType(String type) {
        this.type = Input.optional(type);
        return this;
    }

    public MetafieldInput setTypeInput(Input<String> type) {
        if (type == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.type = type;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.key.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("key:");
            if (key.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, key.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.value.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("value:");
            if (value.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, value.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.type.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type:");
            if (type.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, type.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
