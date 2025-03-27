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

public class CollectionPublicationInput implements Serializable {
    private Input<ID> publicationId = Input.undefined();

    public ID getPublicationId() {
        return publicationId.getValue();
    }

    public Input<ID> getPublicationIdInput() {
        return publicationId;
    }

    public CollectionPublicationInput setPublicationId(ID publicationId) {
        this.publicationId = Input.optional(publicationId);
        return this;
    }

    public CollectionPublicationInput setPublicationIdInput(Input<ID> publicationId) {
        if (publicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publicationId = publicationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.publicationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publicationId:");
            if (publicationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, publicationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
