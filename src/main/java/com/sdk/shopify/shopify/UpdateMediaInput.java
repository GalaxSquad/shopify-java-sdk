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

public class UpdateMediaInput implements Serializable {
    private ID id;

    private Input<String> previewImageSource = Input.undefined();

    private Input<String> alt = Input.undefined();

    public UpdateMediaInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public UpdateMediaInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getPreviewImageSource() {
        return previewImageSource.getValue();
    }

    public Input<String> getPreviewImageSourceInput() {
        return previewImageSource;
    }

    public UpdateMediaInput setPreviewImageSource(String previewImageSource) {
        this.previewImageSource = Input.optional(previewImageSource);
        return this;
    }

    public UpdateMediaInput setPreviewImageSourceInput(Input<String> previewImageSource) {
        if (previewImageSource == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.previewImageSource = previewImageSource;
        return this;
    }

    public String getAlt() {
        return alt.getValue();
    }

    public Input<String> getAltInput() {
        return alt;
    }

    public UpdateMediaInput setAlt(String alt) {
        this.alt = Input.optional(alt);
        return this;
    }

    public UpdateMediaInput setAltInput(Input<String> alt) {
        if (alt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alt = alt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.previewImageSource.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("previewImageSource:");
            if (previewImageSource.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, previewImageSource.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alt:");
            if (alt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
