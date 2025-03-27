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

public class BundlesDraftOrderBundleLineItemComponentInput implements Serializable {
    private int quantity;

    private Input<ID> variantId = Input.undefined();

    private Input<String> uuid = Input.undefined();

    public BundlesDraftOrderBundleLineItemComponentInput(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public BundlesDraftOrderBundleLineItemComponentInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ID getVariantId() {
        return variantId.getValue();
    }

    public Input<ID> getVariantIdInput() {
        return variantId;
    }

    public BundlesDraftOrderBundleLineItemComponentInput setVariantId(ID variantId) {
        this.variantId = Input.optional(variantId);
        return this;
    }

    public BundlesDraftOrderBundleLineItemComponentInput setVariantIdInput(Input<ID> variantId) {
        if (variantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantId = variantId;
        return this;
    }

    public String getUuid() {
        return uuid.getValue();
    }

    public Input<String> getUuidInput() {
        return uuid;
    }

    public BundlesDraftOrderBundleLineItemComponentInput setUuid(String uuid) {
        this.uuid = Input.optional(uuid);
        return this;
    }

    public BundlesDraftOrderBundleLineItemComponentInput setUuidInput(Input<String> uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uuid = uuid;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        if (this.variantId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variantId:");
            if (variantId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, variantId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uuid.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uuid:");
            if (uuid.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, uuid.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
