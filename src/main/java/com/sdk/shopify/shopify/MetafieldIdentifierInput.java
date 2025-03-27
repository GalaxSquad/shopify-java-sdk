// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;

public class MetafieldIdentifierInput implements Serializable {
    private ID ownerId;

    private String namespace;

    private String key;

    public MetafieldIdentifierInput(ID ownerId, String namespace, String key) {
        this.ownerId = ownerId;

        this.namespace = namespace;

        this.key = key;
    }

    public ID getOwnerId() {
        return ownerId;
    }

    public MetafieldIdentifierInput setOwnerId(ID ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public MetafieldIdentifierInput setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getKey() {
        return key;
    }

    public MetafieldIdentifierInput setKey(String key) {
        this.key = key;
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
        _queryBuilder.append("namespace:");
        Query.appendQuotedString(_queryBuilder, namespace.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append('}');
    }
}
