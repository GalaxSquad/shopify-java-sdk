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

public class MetaobjectCapabilityUpdateInput implements Serializable {
    private Input<MetaobjectCapabilityPublishableInput> publishable = Input.undefined();

    private Input<MetaobjectCapabilityTranslatableInput> translatable = Input.undefined();

    private Input<MetaobjectCapabilityRenderableInput> renderable = Input.undefined();

    private Input<MetaobjectCapabilityOnlineStoreInput> onlineStore = Input.undefined();

    public MetaobjectCapabilityPublishableInput getPublishable() {
        return publishable.getValue();
    }

    public Input<MetaobjectCapabilityPublishableInput> getPublishableInput() {
        return publishable;
    }

    public MetaobjectCapabilityUpdateInput setPublishable(MetaobjectCapabilityPublishableInput publishable) {
        this.publishable = Input.optional(publishable);
        return this;
    }

    public MetaobjectCapabilityUpdateInput setPublishableInput(Input<MetaobjectCapabilityPublishableInput> publishable) {
        if (publishable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publishable = publishable;
        return this;
    }

    public MetaobjectCapabilityTranslatableInput getTranslatable() {
        return translatable.getValue();
    }

    public Input<MetaobjectCapabilityTranslatableInput> getTranslatableInput() {
        return translatable;
    }

    public MetaobjectCapabilityUpdateInput setTranslatable(MetaobjectCapabilityTranslatableInput translatable) {
        this.translatable = Input.optional(translatable);
        return this;
    }

    public MetaobjectCapabilityUpdateInput setTranslatableInput(Input<MetaobjectCapabilityTranslatableInput> translatable) {
        if (translatable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.translatable = translatable;
        return this;
    }

    public MetaobjectCapabilityRenderableInput getRenderable() {
        return renderable.getValue();
    }

    public Input<MetaobjectCapabilityRenderableInput> getRenderableInput() {
        return renderable;
    }

    public MetaobjectCapabilityUpdateInput setRenderable(MetaobjectCapabilityRenderableInput renderable) {
        this.renderable = Input.optional(renderable);
        return this;
    }

    public MetaobjectCapabilityUpdateInput setRenderableInput(Input<MetaobjectCapabilityRenderableInput> renderable) {
        if (renderable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.renderable = renderable;
        return this;
    }

    public MetaobjectCapabilityOnlineStoreInput getOnlineStore() {
        return onlineStore.getValue();
    }

    public Input<MetaobjectCapabilityOnlineStoreInput> getOnlineStoreInput() {
        return onlineStore;
    }

    public MetaobjectCapabilityUpdateInput setOnlineStore(MetaobjectCapabilityOnlineStoreInput onlineStore) {
        this.onlineStore = Input.optional(onlineStore);
        return this;
    }

    public MetaobjectCapabilityUpdateInput setOnlineStoreInput(Input<MetaobjectCapabilityOnlineStoreInput> onlineStore) {
        if (onlineStore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.onlineStore = onlineStore;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.publishable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publishable:");
            if (publishable.getValue() != null) {
                publishable.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.translatable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("translatable:");
            if (translatable.getValue() != null) {
                translatable.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.renderable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("renderable:");
            if (renderable.getValue() != null) {
                renderable.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.onlineStore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("onlineStore:");
            if (onlineStore.getValue() != null) {
                onlineStore.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
