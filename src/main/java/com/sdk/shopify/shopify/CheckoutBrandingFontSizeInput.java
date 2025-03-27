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

public class CheckoutBrandingFontSizeInput implements Serializable {
    private Input<Double> base = Input.undefined();

    private Input<Double> ratio = Input.undefined();

    public Double getBase() {
        return base.getValue();
    }

    public Input<Double> getBaseInput() {
        return base;
    }

    public CheckoutBrandingFontSizeInput setBase(Double base) {
        this.base = Input.optional(base);
        return this;
    }

    public CheckoutBrandingFontSizeInput setBaseInput(Input<Double> base) {
        if (base == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.base = base;
        return this;
    }

    public Double getRatio() {
        return ratio.getValue();
    }

    public Input<Double> getRatioInput() {
        return ratio;
    }

    public CheckoutBrandingFontSizeInput setRatio(Double ratio) {
        this.ratio = Input.optional(ratio);
        return this;
    }

    public CheckoutBrandingFontSizeInput setRatioInput(Input<Double> ratio) {
        if (ratio == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ratio = ratio;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.base.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("base:");
            if (base.getValue() != null) {
                _queryBuilder.append(base.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ratio.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ratio:");
            if (ratio.getValue() != null) {
                _queryBuilder.append(ratio.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
