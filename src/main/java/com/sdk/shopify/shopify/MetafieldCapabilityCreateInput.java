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

public class MetafieldCapabilityCreateInput implements Serializable {
    private Input<MetafieldCapabilitySmartCollectionConditionInput> smartCollectionCondition = Input.undefined();

    private Input<MetafieldCapabilityAdminFilterableInput> adminFilterable = Input.undefined();

    private Input<MetafieldCapabilityUniqueValuesInput> uniqueValues = Input.undefined();

    public MetafieldCapabilitySmartCollectionConditionInput getSmartCollectionCondition() {
        return smartCollectionCondition.getValue();
    }

    public Input<MetafieldCapabilitySmartCollectionConditionInput> getSmartCollectionConditionInput() {
        return smartCollectionCondition;
    }

    public MetafieldCapabilityCreateInput setSmartCollectionCondition(MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition) {
        this.smartCollectionCondition = Input.optional(smartCollectionCondition);
        return this;
    }

    public MetafieldCapabilityCreateInput setSmartCollectionConditionInput(Input<MetafieldCapabilitySmartCollectionConditionInput> smartCollectionCondition) {
        if (smartCollectionCondition == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smartCollectionCondition = smartCollectionCondition;
        return this;
    }

    public MetafieldCapabilityAdminFilterableInput getAdminFilterable() {
        return adminFilterable.getValue();
    }

    public Input<MetafieldCapabilityAdminFilterableInput> getAdminFilterableInput() {
        return adminFilterable;
    }

    public MetafieldCapabilityCreateInput setAdminFilterable(MetafieldCapabilityAdminFilterableInput adminFilterable) {
        this.adminFilterable = Input.optional(adminFilterable);
        return this;
    }

    public MetafieldCapabilityCreateInput setAdminFilterableInput(Input<MetafieldCapabilityAdminFilterableInput> adminFilterable) {
        if (adminFilterable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.adminFilterable = adminFilterable;
        return this;
    }

    public MetafieldCapabilityUniqueValuesInput getUniqueValues() {
        return uniqueValues.getValue();
    }

    public Input<MetafieldCapabilityUniqueValuesInput> getUniqueValuesInput() {
        return uniqueValues;
    }

    public MetafieldCapabilityCreateInput setUniqueValues(MetafieldCapabilityUniqueValuesInput uniqueValues) {
        this.uniqueValues = Input.optional(uniqueValues);
        return this;
    }

    public MetafieldCapabilityCreateInput setUniqueValuesInput(Input<MetafieldCapabilityUniqueValuesInput> uniqueValues) {
        if (uniqueValues == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uniqueValues = uniqueValues;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.smartCollectionCondition.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("smartCollectionCondition:");
            if (smartCollectionCondition.getValue() != null) {
                smartCollectionCondition.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.adminFilterable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("adminFilterable:");
            if (adminFilterable.getValue() != null) {
                adminFilterable.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uniqueValues.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uniqueValues:");
            if (uniqueValues.getValue() != null) {
                uniqueValues.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
