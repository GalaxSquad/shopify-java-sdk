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

import java.math.BigDecimal;

import java.io.Serializable;

public class SubscriptionContractProductChangeInput implements Serializable {
    private Input<ID> productVariantId = Input.undefined();

    private Input<BigDecimal> currentPrice = Input.undefined();

    public ID getProductVariantId() {
        return productVariantId.getValue();
    }

    public Input<ID> getProductVariantIdInput() {
        return productVariantId;
    }

    public SubscriptionContractProductChangeInput setProductVariantId(ID productVariantId) {
        this.productVariantId = Input.optional(productVariantId);
        return this;
    }

    public SubscriptionContractProductChangeInput setProductVariantIdInput(Input<ID> productVariantId) {
        if (productVariantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productVariantId = productVariantId;
        return this;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice.getValue();
    }

    public Input<BigDecimal> getCurrentPriceInput() {
        return currentPrice;
    }

    public SubscriptionContractProductChangeInput setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = Input.optional(currentPrice);
        return this;
    }

    public SubscriptionContractProductChangeInput setCurrentPriceInput(Input<BigDecimal> currentPrice) {
        if (currentPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currentPrice = currentPrice;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.productVariantId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productVariantId:");
            if (productVariantId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, productVariantId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.currentPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currentPrice:");
            if (currentPrice.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, currentPrice.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
