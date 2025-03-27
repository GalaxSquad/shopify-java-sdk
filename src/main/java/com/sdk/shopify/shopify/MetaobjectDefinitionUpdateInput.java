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

public class MetaobjectDefinitionUpdateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<MetaobjectFieldDefinitionOperationInput>> fieldDefinitions = Input.undefined();

    private Input<MetaobjectAccessInput> access = Input.undefined();

    private Input<String> displayNameKey = Input.undefined();

    private Input<Boolean> resetFieldOrder = Input.undefined();

    private Input<MetaobjectCapabilityUpdateInput> capabilities = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public MetaobjectDefinitionUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public MetaobjectDefinitionUpdateInput setNameInput(Input<String> name) {
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

    public MetaobjectDefinitionUpdateInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public MetaobjectDefinitionUpdateInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<MetaobjectFieldDefinitionOperationInput> getFieldDefinitions() {
        return fieldDefinitions.getValue();
    }

    public Input<List<MetaobjectFieldDefinitionOperationInput>> getFieldDefinitionsInput() {
        return fieldDefinitions;
    }

    public MetaobjectDefinitionUpdateInput setFieldDefinitions(List<MetaobjectFieldDefinitionOperationInput> fieldDefinitions) {
        this.fieldDefinitions = Input.optional(fieldDefinitions);
        return this;
    }

    public MetaobjectDefinitionUpdateInput setFieldDefinitionsInput(Input<List<MetaobjectFieldDefinitionOperationInput>> fieldDefinitions) {
        if (fieldDefinitions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    public MetaobjectAccessInput getAccess() {
        return access.getValue();
    }

    public Input<MetaobjectAccessInput> getAccessInput() {
        return access;
    }

    public MetaobjectDefinitionUpdateInput setAccess(MetaobjectAccessInput access) {
        this.access = Input.optional(access);
        return this;
    }

    public MetaobjectDefinitionUpdateInput setAccessInput(Input<MetaobjectAccessInput> access) {
        if (access == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.access = access;
        return this;
    }

    public String getDisplayNameKey() {
        return displayNameKey.getValue();
    }

    public Input<String> getDisplayNameKeyInput() {
        return displayNameKey;
    }

    public MetaobjectDefinitionUpdateInput setDisplayNameKey(String displayNameKey) {
        this.displayNameKey = Input.optional(displayNameKey);
        return this;
    }

    public MetaobjectDefinitionUpdateInput setDisplayNameKeyInput(Input<String> displayNameKey) {
        if (displayNameKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.displayNameKey = displayNameKey;
        return this;
    }

    public Boolean getResetFieldOrder() {
        return resetFieldOrder.getValue();
    }

    public Input<Boolean> getResetFieldOrderInput() {
        return resetFieldOrder;
    }

    public MetaobjectDefinitionUpdateInput setResetFieldOrder(Boolean resetFieldOrder) {
        this.resetFieldOrder = Input.optional(resetFieldOrder);
        return this;
    }

    public MetaobjectDefinitionUpdateInput setResetFieldOrderInput(Input<Boolean> resetFieldOrder) {
        if (resetFieldOrder == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.resetFieldOrder = resetFieldOrder;
        return this;
    }

    public MetaobjectCapabilityUpdateInput getCapabilities() {
        return capabilities.getValue();
    }

    public Input<MetaobjectCapabilityUpdateInput> getCapabilitiesInput() {
        return capabilities;
    }

    public MetaobjectDefinitionUpdateInput setCapabilities(MetaobjectCapabilityUpdateInput capabilities) {
        this.capabilities = Input.optional(capabilities);
        return this;
    }

    public MetaobjectDefinitionUpdateInput setCapabilitiesInput(Input<MetaobjectCapabilityUpdateInput> capabilities) {
        if (capabilities == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.capabilities = capabilities;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.fieldDefinitions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fieldDefinitions:");
            if (fieldDefinitions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetaobjectFieldDefinitionOperationInput item1 : fieldDefinitions.getValue()) {
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

        if (this.access.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("access:");
            if (access.getValue() != null) {
                access.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.displayNameKey.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("displayNameKey:");
            if (displayNameKey.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, displayNameKey.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.resetFieldOrder.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("resetFieldOrder:");
            if (resetFieldOrder.getValue() != null) {
                _queryBuilder.append(resetFieldOrder.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.capabilities.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("capabilities:");
            if (capabilities.getValue() != null) {
                capabilities.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
