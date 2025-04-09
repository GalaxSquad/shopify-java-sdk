// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CustomShippingPackageInput implements Serializable {
    private Input<WeightInput> weight = Input.undefined();

    private Input<ObjectDimensionsInput> dimensions = Input.undefined();

    private Input<Boolean> defaultValue = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<ShippingPackageType> type = Input.undefined();

    public WeightInput getWeight() {
        return weight.getValue();
    }

    public Input<WeightInput> getWeightInput() {
        return weight;
    }

    public CustomShippingPackageInput setWeight(WeightInput weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    public CustomShippingPackageInput setWeightInput(Input<WeightInput> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
        return this;
    }

    public ObjectDimensionsInput getDimensions() {
        return dimensions.getValue();
    }

    public Input<ObjectDimensionsInput> getDimensionsInput() {
        return dimensions;
    }

    public CustomShippingPackageInput setDimensions(ObjectDimensionsInput dimensions) {
        this.dimensions = Input.optional(dimensions);
        return this;
    }

    public CustomShippingPackageInput setDimensionsInput(Input<ObjectDimensionsInput> dimensions) {
        if (dimensions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dimensions = dimensions;
        return this;
    }

    public Boolean getDefault() {
        return defaultValue.getValue();
    }

    public Input<Boolean> getDefaultInput() {
        return defaultValue;
    }

    public CustomShippingPackageInput setDefault(Boolean defaultValue) {
        this.defaultValue = Input.optional(defaultValue);
        return this;
    }

    public CustomShippingPackageInput setDefaultInput(Input<Boolean> defaultValue) {
        if (defaultValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultValue = defaultValue;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public CustomShippingPackageInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CustomShippingPackageInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public ShippingPackageType getType() {
        return type.getValue();
    }

    public Input<ShippingPackageType> getTypeInput() {
        return type;
    }

    public CustomShippingPackageInput setType(ShippingPackageType type) {
        this.type = Input.optional(type);
        return this;
    }

    public CustomShippingPackageInput setTypeInput(Input<ShippingPackageType> type) {
        if (type == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.type = type;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.weight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("weight:");
            if (weight.getValue() != null) {
                weight.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dimensions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dimensions:");
            if (dimensions.getValue() != null) {
                dimensions.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.defaultValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("default:");
            if (defaultValue.getValue() != null) {
                _queryBuilder.append(defaultValue.getValue());
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

        if (this.type.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type:");
            if (type.getValue() != null) {
                _queryBuilder.append(type.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
