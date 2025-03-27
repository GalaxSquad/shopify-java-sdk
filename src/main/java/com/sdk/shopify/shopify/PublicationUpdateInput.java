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

public class PublicationUpdateInput implements Serializable {
    private Input<List<ID>> publishablesToAdd = Input.undefined();

    private Input<List<ID>> publishablesToRemove = Input.undefined();

    private Input<Boolean> autoPublish = Input.undefined();

    public List<ID> getPublishablesToAdd() {
        return publishablesToAdd.getValue();
    }

    public Input<List<ID>> getPublishablesToAddInput() {
        return publishablesToAdd;
    }

    public PublicationUpdateInput setPublishablesToAdd(List<ID> publishablesToAdd) {
        this.publishablesToAdd = Input.optional(publishablesToAdd);
        return this;
    }

    public PublicationUpdateInput setPublishablesToAddInput(Input<List<ID>> publishablesToAdd) {
        if (publishablesToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publishablesToAdd = publishablesToAdd;
        return this;
    }

    public List<ID> getPublishablesToRemove() {
        return publishablesToRemove.getValue();
    }

    public Input<List<ID>> getPublishablesToRemoveInput() {
        return publishablesToRemove;
    }

    public PublicationUpdateInput setPublishablesToRemove(List<ID> publishablesToRemove) {
        this.publishablesToRemove = Input.optional(publishablesToRemove);
        return this;
    }

    public PublicationUpdateInput setPublishablesToRemoveInput(Input<List<ID>> publishablesToRemove) {
        if (publishablesToRemove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publishablesToRemove = publishablesToRemove;
        return this;
    }

    public Boolean getAutoPublish() {
        return autoPublish.getValue();
    }

    public Input<Boolean> getAutoPublishInput() {
        return autoPublish;
    }

    public PublicationUpdateInput setAutoPublish(Boolean autoPublish) {
        this.autoPublish = Input.optional(autoPublish);
        return this;
    }

    public PublicationUpdateInput setAutoPublishInput(Input<Boolean> autoPublish) {
        if (autoPublish == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.autoPublish = autoPublish;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.publishablesToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publishablesToAdd:");
            if (publishablesToAdd.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : publishablesToAdd.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.publishablesToRemove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publishablesToRemove:");
            if (publishablesToRemove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : publishablesToRemove.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
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
