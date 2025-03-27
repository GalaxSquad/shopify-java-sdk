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

public class ProductClaimOwnershipInput implements Serializable {
    private Input<Boolean> bundles = Input.undefined();

    public Boolean getBundles() {
        return bundles.getValue();
    }

    public Input<Boolean> getBundlesInput() {
        return bundles;
    }

    public ProductClaimOwnershipInput setBundles(Boolean bundles) {
        this.bundles = Input.optional(bundles);
        return this;
    }

    public ProductClaimOwnershipInput setBundlesInput(Input<Boolean> bundles) {
        if (bundles == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.bundles = bundles;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.bundles.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("bundles:");
            if (bundles.getValue() != null) {
                _queryBuilder.append(bundles.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
