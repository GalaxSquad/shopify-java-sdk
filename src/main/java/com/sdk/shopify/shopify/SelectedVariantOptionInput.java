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

public class SelectedVariantOptionInput implements Serializable {
    private String name;

    private String value;

    private Input<String> linkedMetafieldValue = Input.undefined();

    public SelectedVariantOptionInput(String name, String value) {
        this.name = name;

        this.value = value;
    }

    public String getName() {
        return name;
    }

    public SelectedVariantOptionInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public SelectedVariantOptionInput setValue(String value) {
        this.value = value;
        return this;
    }

    public String getLinkedMetafieldValue() {
        return linkedMetafieldValue.getValue();
    }

    public Input<String> getLinkedMetafieldValueInput() {
        return linkedMetafieldValue;
    }

    public SelectedVariantOptionInput setLinkedMetafieldValue(String linkedMetafieldValue) {
        this.linkedMetafieldValue = Input.optional(linkedMetafieldValue);
        return this;
    }

    public SelectedVariantOptionInput setLinkedMetafieldValueInput(Input<String> linkedMetafieldValue) {
        if (linkedMetafieldValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.linkedMetafieldValue = linkedMetafieldValue;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        Query.appendQuotedString(_queryBuilder, value.toString());

        if (this.linkedMetafieldValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("linkedMetafieldValue:");
            if (linkedMetafieldValue.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, linkedMetafieldValue.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
