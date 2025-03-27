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

public class OptionAndValueInput implements Serializable {
    private String name;

    private List<String> values;

    private Input<ID> optionId = Input.undefined();

    private Input<LinkedMetafieldInput> linkedMetafield = Input.undefined();

    public OptionAndValueInput(String name, List<String> values) {
        this.name = name;

        this.values = values;
    }

    public String getName() {
        return name;
    }

    public OptionAndValueInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public OptionAndValueInput setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public ID getOptionId() {
        return optionId.getValue();
    }

    public Input<ID> getOptionIdInput() {
        return optionId;
    }

    public OptionAndValueInput setOptionId(ID optionId) {
        this.optionId = Input.optional(optionId);
        return this;
    }

    public OptionAndValueInput setOptionIdInput(Input<ID> optionId) {
        if (optionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionId = optionId;
        return this;
    }

    public LinkedMetafieldInput getLinkedMetafield() {
        return linkedMetafield.getValue();
    }

    public Input<LinkedMetafieldInput> getLinkedMetafieldInput() {
        return linkedMetafield;
    }

    public OptionAndValueInput setLinkedMetafield(LinkedMetafieldInput linkedMetafield) {
        this.linkedMetafield = Input.optional(linkedMetafield);
        return this;
    }

    public OptionAndValueInput setLinkedMetafieldInput(Input<LinkedMetafieldInput> linkedMetafield) {
        if (linkedMetafield == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.linkedMetafield = linkedMetafield;
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

        if (this.optionId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("optionId:");
            if (optionId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, optionId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.linkedMetafield.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("linkedMetafield:");
            if (linkedMetafield.getValue() != null) {
                linkedMetafield.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
