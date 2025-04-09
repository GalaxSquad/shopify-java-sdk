// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MetafieldsSetInput implements Serializable {
    private ID ownerId;

    private String key;

    private String value;

    private Input<String> namespace = Input.undefined();

    private Input<String> compareDigest = Input.undefined();

    private Input<String> type = Input.undefined();

    public MetafieldsSetInput(ID ownerId, String key, String value) {
        this.ownerId = ownerId;

        this.key = key;

        this.value = value;
    }

    public ID getOwnerId() {
        return ownerId;
    }

    public MetafieldsSetInput setOwnerId(ID ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getKey() {
        return key;
    }

    public MetafieldsSetInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public MetafieldsSetInput setValue(String value) {
        this.value = value;
        return this;
    }

    public String getNamespace() {
        return namespace.getValue();
    }

    public Input<String> getNamespaceInput() {
        return namespace;
    }

    public MetafieldsSetInput setNamespace(String namespace) {
        this.namespace = Input.optional(namespace);
        return this;
    }

    public MetafieldsSetInput setNamespaceInput(Input<String> namespace) {
        if (namespace == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespace = namespace;
        return this;
    }

    public String getCompareDigest() {
        return compareDigest.getValue();
    }

    public Input<String> getCompareDigestInput() {
        return compareDigest;
    }

    public MetafieldsSetInput setCompareDigest(String compareDigest) {
        this.compareDigest = Input.optional(compareDigest);
        return this;
    }

    public MetafieldsSetInput setCompareDigestInput(Input<String> compareDigest) {
        if (compareDigest == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.compareDigest = compareDigest;
        return this;
    }

    public String getType() {
        return type.getValue();
    }

    public Input<String> getTypeInput() {
        return type;
    }

    public MetafieldsSetInput setType(String type) {
        this.type = Input.optional(type);
        return this;
    }

    public MetafieldsSetInput setTypeInput(Input<String> type) {
        if (type == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.type = type;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("ownerId:");
        Query.appendQuotedString(_queryBuilder, ownerId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

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

        if (this.compareDigest.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("compareDigest:");
            if (compareDigest.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, compareDigest.getValue().toString());
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
