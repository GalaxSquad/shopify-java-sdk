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

public class MetaobjectCapabilityDefinitionDataOnlineStoreInput implements Serializable {
    private String urlHandle;

    private Input<Boolean> createRedirects = Input.undefined();

    public MetaobjectCapabilityDefinitionDataOnlineStoreInput(String urlHandle) {
        this.urlHandle = urlHandle;
    }

    public String getUrlHandle() {
        return urlHandle;
    }

    public MetaobjectCapabilityDefinitionDataOnlineStoreInput setUrlHandle(String urlHandle) {
        this.urlHandle = urlHandle;
        return this;
    }

    public Boolean getCreateRedirects() {
        return createRedirects.getValue();
    }

    public Input<Boolean> getCreateRedirectsInput() {
        return createRedirects;
    }

    public MetaobjectCapabilityDefinitionDataOnlineStoreInput setCreateRedirects(Boolean createRedirects) {
        this.createRedirects = Input.optional(createRedirects);
        return this;
    }

    public MetaobjectCapabilityDefinitionDataOnlineStoreInput setCreateRedirectsInput(Input<Boolean> createRedirects) {
        if (createRedirects == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createRedirects = createRedirects;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("urlHandle:");
        Query.appendQuotedString(_queryBuilder, urlHandle.toString());

        if (this.createRedirects.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createRedirects:");
            if (createRedirects.getValue() != null) {
                _queryBuilder.append(createRedirects.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
