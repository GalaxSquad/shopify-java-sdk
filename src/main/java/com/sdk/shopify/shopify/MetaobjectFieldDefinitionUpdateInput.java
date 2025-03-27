// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MetaobjectFieldDefinitionUpdateInput implements Serializable {
    private String key;

    private Input<String> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<Boolean> required = Input.undefined();

    private Input<List<MetafieldDefinitionValidationInput>> validations = Input.undefined();

    public MetaobjectFieldDefinitionUpdateInput(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public MetaobjectFieldDefinitionUpdateInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public MetaobjectFieldDefinitionUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public MetaobjectFieldDefinitionUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public MetaobjectFieldDefinitionUpdateInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public MetaobjectFieldDefinitionUpdateInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public Boolean getRequired() {
        return required.getValue();
    }

    public Input<Boolean> getRequiredInput() {
        return required;
    }

    public MetaobjectFieldDefinitionUpdateInput setRequired(Boolean required) {
        this.required = Input.optional(required);
        return this;
    }

    public MetaobjectFieldDefinitionUpdateInput setRequiredInput(Input<Boolean> required) {
        if (required == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.required = required;
        return this;
    }

    public List<MetafieldDefinitionValidationInput> getValidations() {
        return validations.getValue();
    }

    public Input<List<MetafieldDefinitionValidationInput>> getValidationsInput() {
        return validations;
    }

    public MetaobjectFieldDefinitionUpdateInput setValidations(List<MetafieldDefinitionValidationInput> validations) {
        this.validations = Input.optional(validations);
        return this;
    }

    public MetaobjectFieldDefinitionUpdateInput setValidationsInput(Input<List<MetafieldDefinitionValidationInput>> validations) {
        if (validations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.validations = validations;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

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

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.required.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("required:");
            if (required.getValue() != null) {
                _queryBuilder.append(required.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.validations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("validations:");
            if (validations.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldDefinitionValidationInput item1 : validations.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
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
