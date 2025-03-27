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

public class MetaobjectCapabilityDefinitionDataRenderableInput implements Serializable {
    private Input<String> metaTitleKey = Input.undefined();

    private Input<String> metaDescriptionKey = Input.undefined();

    public String getMetaTitleKey() {
        return metaTitleKey.getValue();
    }

    public Input<String> getMetaTitleKeyInput() {
        return metaTitleKey;
    }

    public MetaobjectCapabilityDefinitionDataRenderableInput setMetaTitleKey(String metaTitleKey) {
        this.metaTitleKey = Input.optional(metaTitleKey);
        return this;
    }

    public MetaobjectCapabilityDefinitionDataRenderableInput setMetaTitleKeyInput(Input<String> metaTitleKey) {
        if (metaTitleKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaTitleKey = metaTitleKey;
        return this;
    }

    public String getMetaDescriptionKey() {
        return metaDescriptionKey.getValue();
    }

    public Input<String> getMetaDescriptionKeyInput() {
        return metaDescriptionKey;
    }

    public MetaobjectCapabilityDefinitionDataRenderableInput setMetaDescriptionKey(String metaDescriptionKey) {
        this.metaDescriptionKey = Input.optional(metaDescriptionKey);
        return this;
    }

    public MetaobjectCapabilityDefinitionDataRenderableInput setMetaDescriptionKeyInput(Input<String> metaDescriptionKey) {
        if (metaDescriptionKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaDescriptionKey = metaDescriptionKey;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.metaTitleKey.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metaTitleKey:");
            if (metaTitleKey.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, metaTitleKey.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metaDescriptionKey.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metaDescriptionKey:");
            if (metaDescriptionKey.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, metaDescriptionKey.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
