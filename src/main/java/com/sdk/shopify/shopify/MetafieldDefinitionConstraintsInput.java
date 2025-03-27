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

public class MetafieldDefinitionConstraintsInput implements Serializable {
    private String key;

    private List<String> values;

    public MetafieldDefinitionConstraintsInput(String key, List<String> values) {
        this.key = key;

        this.values = values;
    }

    public String getKey() {
        return key;
    }

    public MetafieldDefinitionConstraintsInput setKey(String key) {
        this.key = key;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public MetafieldDefinitionConstraintsInput setValues(List<String> values) {
        this.values = values;
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
        _queryBuilder.append("values:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : values) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
