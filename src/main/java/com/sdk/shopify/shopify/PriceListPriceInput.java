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

public class PriceListPriceInput implements Serializable {
    private ID variantId;

    private MoneyInput price;

    private Input<MoneyInput> compareAtPrice = Input.undefined();

    public PriceListPriceInput(ID variantId, MoneyInput price) {
        this.variantId = variantId;

        this.price = price;
    }

    public ID getVariantId() {
        return variantId;
    }

    public PriceListPriceInput setVariantId(ID variantId) {
        this.variantId = variantId;
        return this;
    }

    public MoneyInput getPrice() {
        return price;
    }

    public PriceListPriceInput setPrice(MoneyInput price) {
        this.price = price;
        return this;
    }

    public MoneyInput getCompareAtPrice() {
        return compareAtPrice.getValue();
    }

    public Input<MoneyInput> getCompareAtPriceInput() {
        return compareAtPrice;
    }

    public PriceListPriceInput setCompareAtPrice(MoneyInput compareAtPrice) {
        this.compareAtPrice = Input.optional(compareAtPrice);
        return this;
    }

    public PriceListPriceInput setCompareAtPriceInput(Input<MoneyInput> compareAtPrice) {
        if (compareAtPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.compareAtPrice = compareAtPrice;
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
        _queryBuilder.append("price:");
        price.appendTo(_queryBuilder);

        if (this.compareAtPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("compareAtPrice:");
            if (compareAtPrice.getValue() != null) {
                compareAtPrice.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
