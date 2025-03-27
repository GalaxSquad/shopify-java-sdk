// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class VariantOptionValueInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> linkedMetafieldValue = Input.undefined();

    private Input<ID> optionId = Input.undefined();

    private Input<String> optionName = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public VariantOptionValueInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public VariantOptionValueInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public VariantOptionValueInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public VariantOptionValueInput setNameInput(Input<String> name) {
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

    public VariantOptionValueInput setLinkedMetafieldValue(String linkedMetafieldValue) {
        this.linkedMetafieldValue = Input.optional(linkedMetafieldValue);
        return this;
    }

    public VariantOptionValueInput setLinkedMetafieldValueInput(Input<String> linkedMetafieldValue) {
        if (linkedMetafieldValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.linkedMetafieldValue = linkedMetafieldValue;
        return this;
    }

    public ID getOptionId() {
        return optionId.getValue();
    }

    public Input<ID> getOptionIdInput() {
        return optionId;
    }

    public VariantOptionValueInput setOptionId(ID optionId) {
        this.optionId = Input.optional(optionId);
        return this;
    }

    public VariantOptionValueInput setOptionIdInput(Input<ID> optionId) {
        if (optionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionId = optionId;
        return this;
    }

    public String getOptionName() {
        return optionName.getValue();
    }

    public Input<String> getOptionNameInput() {
        return optionName;
    }

    public VariantOptionValueInput setOptionName(String optionName) {
        this.optionName = Input.optional(optionName);
        return this;
    }

    public VariantOptionValueInput setOptionNameInput(Input<String> optionName) {
        if (optionName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionName = optionName;
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

        if (this.optionName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("optionName:");
            if (optionName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, optionName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
