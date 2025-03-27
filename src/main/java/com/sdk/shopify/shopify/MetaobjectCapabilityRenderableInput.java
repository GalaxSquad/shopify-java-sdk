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

public class MetaobjectCapabilityRenderableInput implements Serializable {
    private boolean enabled;

    private Input<MetaobjectCapabilityDefinitionDataRenderableInput> data = Input.undefined();

    public MetaobjectCapabilityRenderableInput(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public MetaobjectCapabilityRenderableInput setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public MetaobjectCapabilityDefinitionDataRenderableInput getData() {
        return data.getValue();
    }

    public Input<MetaobjectCapabilityDefinitionDataRenderableInput> getDataInput() {
        return data;
    }

    public MetaobjectCapabilityRenderableInput setData(MetaobjectCapabilityDefinitionDataRenderableInput data) {
        this.data = Input.optional(data);
        return this;
    }

    public MetaobjectCapabilityRenderableInput setDataInput(Input<MetaobjectCapabilityDefinitionDataRenderableInput> data) {
        if (data == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.data = data;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("enabled:");
        _queryBuilder.append(enabled);

        if (this.data.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("data:");
            if (data.getValue() != null) {
                data.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
