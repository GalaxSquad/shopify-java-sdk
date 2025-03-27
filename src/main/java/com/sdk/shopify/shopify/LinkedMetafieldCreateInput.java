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
import java.util.List;

public class LinkedMetafieldCreateInput implements Serializable {
    private String namespace;

    private String key;

    private Input<List<String>> values = Input.undefined();

    public LinkedMetafieldCreateInput(String namespace, String key) {
        this.namespace = namespace;

        this.key = key;
    }

    public String getNamespace() {
        return namespace;
    }

    public LinkedMetafieldCreateInput setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getKey() {
        return key;
    }

    public LinkedMetafieldCreateInput setKey(String key) {
        this.key = key;
        return this;
    }

    public List<String> getValues() {
        return values.getValue();
    }

    public Input<List<String>> getValuesInput() {
        return values;
    }

    public LinkedMetafieldCreateInput setValues(List<String> values) {
        this.values = Input.optional(values);
        return this;
    }

    public LinkedMetafieldCreateInput setValuesInput(Input<List<String>> values) {
        if (values == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.values = values;
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

        if (this.values.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("values:");
            if (values.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : values.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
