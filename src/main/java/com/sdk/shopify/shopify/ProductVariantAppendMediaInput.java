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

public class ProductVariantAppendMediaInput implements Serializable {
    private ID variantId;

    private List<ID> mediaIds;

    public ProductVariantAppendMediaInput(ID variantId, List<ID> mediaIds) {
        this.variantId = variantId;

        this.mediaIds = mediaIds;
    }

    public ID getVariantId() {
        return variantId;
    }

    public ProductVariantAppendMediaInput setVariantId(ID variantId) {
        this.variantId = variantId;
        return this;
    }

    public List<ID> getMediaIds() {
        return mediaIds;
    }

    public ProductVariantAppendMediaInput setMediaIds(List<ID> mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("variantId:");
        Query.appendQuotedString(_queryBuilder, variantId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("mediaIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : mediaIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
