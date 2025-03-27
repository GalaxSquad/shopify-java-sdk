// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CheckoutBrandingShopifyFontGroupInput implements Serializable {
    private String name;

    private Input<Integer> baseWeight = Input.undefined();

    private Input<Integer> boldWeight = Input.undefined();

    private Input<CheckoutBrandingFontLoadingStrategy> loadingStrategy = Input.undefined();

    public CheckoutBrandingShopifyFontGroupInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public CheckoutBrandingShopifyFontGroupInput setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBaseWeight() {
        return baseWeight.getValue();
    }

    public Input<Integer> getBaseWeightInput() {
        return baseWeight;
    }

    public CheckoutBrandingShopifyFontGroupInput setBaseWeight(Integer baseWeight) {
        this.baseWeight = Input.optional(baseWeight);
        return this;
    }

    public CheckoutBrandingShopifyFontGroupInput setBaseWeightInput(Input<Integer> baseWeight) {
        if (baseWeight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.baseWeight = baseWeight;
        return this;
    }

    public Integer getBoldWeight() {
        return boldWeight.getValue();
    }

    public Input<Integer> getBoldWeightInput() {
        return boldWeight;
    }

    public CheckoutBrandingShopifyFontGroupInput setBoldWeight(Integer boldWeight) {
        this.boldWeight = Input.optional(boldWeight);
        return this;
    }

    public CheckoutBrandingShopifyFontGroupInput setBoldWeightInput(Input<Integer> boldWeight) {
        if (boldWeight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.boldWeight = boldWeight;
        return this;
    }

    public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
        return loadingStrategy.getValue();
    }

    public Input<CheckoutBrandingFontLoadingStrategy> getLoadingStrategyInput() {
        return loadingStrategy;
    }

    public CheckoutBrandingShopifyFontGroupInput setLoadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
        this.loadingStrategy = Input.optional(loadingStrategy);
        return this;
    }

    public CheckoutBrandingShopifyFontGroupInput setLoadingStrategyInput(Input<CheckoutBrandingFontLoadingStrategy> loadingStrategy) {
        if (loadingStrategy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.loadingStrategy = loadingStrategy;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        if (this.baseWeight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("baseWeight:");
            if (baseWeight.getValue() != null) {
                _queryBuilder.append(baseWeight.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.boldWeight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("boldWeight:");
            if (boldWeight.getValue() != null) {
                _queryBuilder.append(boldWeight.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.loadingStrategy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("loadingStrategy:");
            if (loadingStrategy.getValue() != null) {
                _queryBuilder.append(loadingStrategy.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
