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

public class MetaobjectDefinitionCreateInput implements Serializable {
    private String type;

    private List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions;

    private Input<String> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<MetaobjectAccessInput> access = Input.undefined();

    private Input<String> displayNameKey = Input.undefined();

    private Input<MetaobjectCapabilityCreateInput> capabilities = Input.undefined();

    public MetaobjectDefinitionCreateInput(String type, List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions) {
        this.type = type;

        this.fieldDefinitions = fieldDefinitions;
    }

    public String getType() {
        return type;
    }

    public MetaobjectDefinitionCreateInput setType(String type) {
        this.type = type;
        return this;
    }

    public List<MetaobjectFieldDefinitionCreateInput> getFieldDefinitions() {
        return fieldDefinitions;
    }

    public MetaobjectDefinitionCreateInput setFieldDefinitions(List<MetaobjectFieldDefinitionCreateInput> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public MetaobjectDefinitionCreateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public MetaobjectDefinitionCreateInput setNameInput(Input<String> name) {
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

    public MetaobjectDefinitionCreateInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public MetaobjectDefinitionCreateInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public MetaobjectAccessInput getAccess() {
        return access.getValue();
    }

    public Input<MetaobjectAccessInput> getAccessInput() {
        return access;
    }

    public MetaobjectDefinitionCreateInput setAccess(MetaobjectAccessInput access) {
        this.access = Input.optional(access);
        return this;
    }

    public MetaobjectDefinitionCreateInput setAccessInput(Input<MetaobjectAccessInput> access) {
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

    public MetaobjectDefinitionCreateInput setDisplayNameKey(String displayNameKey) {
        this.displayNameKey = Input.optional(displayNameKey);
        return this;
    }

    public MetaobjectDefinitionCreateInput setDisplayNameKeyInput(Input<String> displayNameKey) {
        if (displayNameKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.displayNameKey = displayNameKey;
        return this;
    }

    public MetaobjectCapabilityCreateInput getCapabilities() {
        return capabilities.getValue();
    }

    public Input<MetaobjectCapabilityCreateInput> getCapabilitiesInput() {
        return capabilities;
    }

    public MetaobjectDefinitionCreateInput setCapabilities(MetaobjectCapabilityCreateInput capabilities) {
        this.capabilities = Input.optional(capabilities);
        return this;
    }

    public MetaobjectDefinitionCreateInput setCapabilitiesInput(Input<MetaobjectCapabilityCreateInput> capabilities) {
        if (capabilities == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.capabilities = capabilities;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fieldDefinitions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MetaobjectFieldDefinitionCreateInput item1 : fieldDefinitions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

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
