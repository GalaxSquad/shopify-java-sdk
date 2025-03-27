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

public class OptionValueUpdateInput implements Serializable {
    private ID id;

    private Input<String> name = Input.undefined();

    private Input<String> linkedMetafieldValue = Input.undefined();

    public OptionValueUpdateInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public OptionValueUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public OptionValueUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public OptionValueUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getLinkedMetafieldValue() {
        return linkedMetafieldValue.getValue();
    }

    public Input<String> getLinkedMetafieldValueInput() {
        return linkedMetafieldValue;
    }

    public OptionValueUpdateInput setLinkedMetafieldValue(String linkedMetafieldValue) {
        this.linkedMetafieldValue = Input.optional(linkedMetafieldValue);
        return this;
    }

    public OptionValueUpdateInput setLinkedMetafieldValueInput(Input<String> linkedMetafieldValue) {
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
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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
