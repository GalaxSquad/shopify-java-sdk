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

public class PublicationCreateInput implements Serializable {
    private Input<ID> catalogId = Input.undefined();

    private Input<PublicationCreateInputPublicationDefaultState> defaultState = Input.undefined();

    private Input<Boolean> autoPublish = Input.undefined();

    public ID getCatalogId() {
        return catalogId.getValue();
    }

    public Input<ID> getCatalogIdInput() {
        return catalogId;
    }

    public PublicationCreateInput setCatalogId(ID catalogId) {
        this.catalogId = Input.optional(catalogId);
        return this;
    }

    public PublicationCreateInput setCatalogIdInput(Input<ID> catalogId) {
        if (catalogId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.catalogId = catalogId;
        return this;
    }

    public PublicationCreateInputPublicationDefaultState getDefaultState() {
        return defaultState.getValue();
    }

    public Input<PublicationCreateInputPublicationDefaultState> getDefaultStateInput() {
        return defaultState;
    }

    public PublicationCreateInput setDefaultState(PublicationCreateInputPublicationDefaultState defaultState) {
        this.defaultState = Input.optional(defaultState);
        return this;
    }

    public PublicationCreateInput setDefaultStateInput(Input<PublicationCreateInputPublicationDefaultState> defaultState) {
        if (defaultState == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultState = defaultState;
        return this;
    }

    public Boolean getAutoPublish() {
        return autoPublish.getValue();
    }

    public Input<Boolean> getAutoPublishInput() {
        return autoPublish;
    }

    public PublicationCreateInput setAutoPublish(Boolean autoPublish) {
        this.autoPublish = Input.optional(autoPublish);
        return this;
    }

    public PublicationCreateInput setAutoPublishInput(Input<Boolean> autoPublish) {
        if (autoPublish == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.autoPublish = autoPublish;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.catalogId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("catalogId:");
            if (catalogId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, catalogId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.defaultState.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("defaultState:");
            if (defaultState.getValue() != null) {
                _queryBuilder.append(defaultState.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.autoPublish.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("autoPublish:");
            if (autoPublish.getValue() != null) {
                _queryBuilder.append(autoPublish.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
