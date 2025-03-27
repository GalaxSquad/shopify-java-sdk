// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MetafieldDefinitionInput implements Serializable {
    private String key;

    private String name;

    private MetafieldOwnerType ownerType;

    private String type;

    private Input<String> namespace = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<MetafieldDefinitionValidationInput>> validations = Input.undefined();

    private Input<Boolean> pin = Input.undefined();

    private Input<MetafieldAccessInput> access = Input.undefined();

    private Input<MetafieldDefinitionConstraintsInput> constraints = Input.undefined();

    private Input<MetafieldCapabilityCreateInput> capabilities = Input.undefined();

    public MetafieldDefinitionInput(String key, String name, MetafieldOwnerType ownerType, String type) {
        this.key = key;

        this.name = name;

        this.ownerType = ownerType;

        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public MetafieldDefinitionInput setKey(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name;
    }

    public MetafieldDefinitionInput setName(String name) {
        this.name = name;
        return this;
    }

    public MetafieldOwnerType getOwnerType() {
        return ownerType;
    }

    public MetafieldDefinitionInput setOwnerType(MetafieldOwnerType ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    public String getType() {
        return type;
    }

    public MetafieldDefinitionInput setType(String type) {
        this.type = type;
        return this;
    }

    public String getNamespace() {
        return namespace.getValue();
    }

    public Input<String> getNamespaceInput() {
        return namespace;
    }

    public MetafieldDefinitionInput setNamespace(String namespace) {
        this.namespace = Input.optional(namespace);
        return this;
    }

    public MetafieldDefinitionInput setNamespaceInput(Input<String> namespace) {
        if (namespace == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespace = namespace;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public MetafieldDefinitionInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public MetafieldDefinitionInput setDescriptionInput(Input<String> description) {
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

    public MetafieldDefinitionInput setValidations(List<MetafieldDefinitionValidationInput> validations) {
        this.validations = Input.optional(validations);
        return this;
    }

    public MetafieldDefinitionInput setValidationsInput(Input<List<MetafieldDefinitionValidationInput>> validations) {
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

    public MetafieldDefinitionInput setPin(Boolean pin) {
        this.pin = Input.optional(pin);
        return this;
    }

    public MetafieldDefinitionInput setPinInput(Input<Boolean> pin) {
        if (pin == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pin = pin;
        return this;
    }

    public MetafieldAccessInput getAccess() {
        return access.getValue();
    }

    public Input<MetafieldAccessInput> getAccessInput() {
        return access;
    }

    public MetafieldDefinitionInput setAccess(MetafieldAccessInput access) {
        this.access = Input.optional(access);
        return this;
    }

    public MetafieldDefinitionInput setAccessInput(Input<MetafieldAccessInput> access) {
        if (access == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.access = access;
        return this;
    }

    public MetafieldDefinitionConstraintsInput getConstraints() {
        return constraints.getValue();
    }

    public Input<MetafieldDefinitionConstraintsInput> getConstraintsInput() {
        return constraints;
    }

    public MetafieldDefinitionInput setConstraints(MetafieldDefinitionConstraintsInput constraints) {
        this.constraints = Input.optional(constraints);
        return this;
    }

    public MetafieldDefinitionInput setConstraintsInput(Input<MetafieldDefinitionConstraintsInput> constraints) {
        if (constraints == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.constraints = constraints;
        return this;
    }

    public MetafieldCapabilityCreateInput getCapabilities() {
        return capabilities.getValue();
    }

    public Input<MetafieldCapabilityCreateInput> getCapabilitiesInput() {
        return capabilities;
    }

    public MetafieldDefinitionInput setCapabilities(MetafieldCapabilityCreateInput capabilities) {
        this.capabilities = Input.optional(capabilities);
        return this;
    }

    public MetafieldDefinitionInput setCapabilitiesInput(Input<MetafieldCapabilityCreateInput> capabilities) {
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
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("ownerType:");
        _queryBuilder.append(ownerType.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

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

        if (this.constraints.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("constraints:");
            if (constraints.getValue() != null) {
                constraints.getValue().appendTo(_queryBuilder);
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
