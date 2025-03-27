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

public class MetafieldDefinitionUpdateInput implements Serializable {
    private String key;

    private MetafieldOwnerType ownerType;

    private Input<String> namespace = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<MetafieldDefinitionValidationInput>> validations = Input.undefined();

    private Input<Boolean> pin = Input.undefined();

    private Input<MetafieldAccessUpdateInput> access = Input.undefined();

    private Input<MetafieldDefinitionConstraintsUpdatesInput> constraintsUpdates = Input.undefined();

    private Input<MetafieldCapabilityUpdateInput> capabilities = Input.undefined();

    public MetafieldDefinitionUpdateInput(String key, MetafieldOwnerType ownerType) {
        this.key = key;

        this.ownerType = ownerType;
    }

    public String getKey() {
        return key;
    }

    public MetafieldDefinitionUpdateInput setKey(String key) {
        this.key = key;
        return this;
    }

    public MetafieldOwnerType getOwnerType() {
        return ownerType;
    }

    public MetafieldDefinitionUpdateInput setOwnerType(MetafieldOwnerType ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    public String getNamespace() {
        return namespace.getValue();
    }

    public Input<String> getNamespaceInput() {
        return namespace;
    }

    public MetafieldDefinitionUpdateInput setNamespace(String namespace) {
        this.namespace = Input.optional(namespace);
        return this;
    }

    public MetafieldDefinitionUpdateInput setNamespaceInput(Input<String> namespace) {
        if (namespace == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespace = namespace;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public MetafieldDefinitionUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public MetafieldDefinitionUpdateInput setNameInput(Input<String> name) {
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

    public MetafieldDefinitionUpdateInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public MetafieldDefinitionUpdateInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<MetafieldDefinitionValidationInput> getValidations() {
        return validations.getValue();
    }

    public Input<List<MetafieldDefinitionValidationInput>> getValidationsInput() {
        return validations;
    }

    public MetafieldDefinitionUpdateInput setValidations(List<MetafieldDefinitionValidationInput> validations) {
        this.validations = Input.optional(validations);
        return this;
    }

    public MetafieldDefinitionUpdateInput setValidationsInput(Input<List<MetafieldDefinitionValidationInput>> validations) {
        if (validations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.validations = validations;
        return this;
    }

    public Boolean getPin() {
        return pin.getValue();
    }

    public Input<Boolean> getPinInput() {
        return pin;
    }

    public MetafieldDefinitionUpdateInput setPin(Boolean pin) {
        this.pin = Input.optional(pin);
        return this;
    }

    public MetafieldDefinitionUpdateInput setPinInput(Input<Boolean> pin) {
        if (pin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pin = pin;
        return this;
    }

    public MetafieldAccessUpdateInput getAccess() {
        return access.getValue();
    }

    public Input<MetafieldAccessUpdateInput> getAccessInput() {
        return access;
    }

    public MetafieldDefinitionUpdateInput setAccess(MetafieldAccessUpdateInput access) {
        this.access = Input.optional(access);
        return this;
    }

    public MetafieldDefinitionUpdateInput setAccessInput(Input<MetafieldAccessUpdateInput> access) {
        if (access == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.access = access;
        return this;
    }

    public MetafieldDefinitionConstraintsUpdatesInput getConstraintsUpdates() {
        return constraintsUpdates.getValue();
    }

    public Input<MetafieldDefinitionConstraintsUpdatesInput> getConstraintsUpdatesInput() {
        return constraintsUpdates;
    }

    public MetafieldDefinitionUpdateInput setConstraintsUpdates(MetafieldDefinitionConstraintsUpdatesInput constraintsUpdates) {
        this.constraintsUpdates = Input.optional(constraintsUpdates);
        return this;
    }

    public MetafieldDefinitionUpdateInput setConstraintsUpdatesInput(Input<MetafieldDefinitionConstraintsUpdatesInput> constraintsUpdates) {
        if (constraintsUpdates == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.constraintsUpdates = constraintsUpdates;
        return this;
    }

    public MetafieldCapabilityUpdateInput getCapabilities() {
        return capabilities.getValue();
    }

    public Input<MetafieldCapabilityUpdateInput> getCapabilitiesInput() {
        return capabilities;
    }

    public MetafieldDefinitionUpdateInput setCapabilities(MetafieldCapabilityUpdateInput capabilities) {
        this.capabilities = Input.optional(capabilities);
        return this;
    }

    public MetafieldDefinitionUpdateInput setCapabilitiesInput(Input<MetafieldCapabilityUpdateInput> capabilities) {
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
        _queryBuilder.append("key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("ownerType:");
        _queryBuilder.append(ownerType.toString());

        if (this.namespace.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespace:");
            if (namespace.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, namespace.getValue().toString());
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

        if (this.pin.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pin:");
            if (pin.getValue() != null) {
                _queryBuilder.append(pin.getValue());
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

        if (this.constraintsUpdates.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("constraintsUpdates:");
            if (constraintsUpdates.getValue() != null) {
                constraintsUpdates.getValue().appendTo(_queryBuilder);
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
