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

public class CheckoutBrandingImageInput implements Serializable {
    private Input<ID> mediaImageId = Input.undefined();

    public ID getMediaImageId() {
        return mediaImageId.getValue();
    }

    public Input<ID> getMediaImageIdInput() {
        return mediaImageId;
    }

    public CheckoutBrandingImageInput setMediaImageId(ID mediaImageId) {
        this.mediaImageId = Input.optional(mediaImageId);
        return this;
    }

    public CheckoutBrandingImageInput setMediaImageIdInput(Input<ID> mediaImageId) {
        if (mediaImageId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.mediaImageId = mediaImageId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.mediaImageId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("mediaImageId:");
            if (mediaImageId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, mediaImageId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
