// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingCustomFontGroupInput implements Serializable {
    private CheckoutBrandingCustomFontInput base;

    private CheckoutBrandingCustomFontInput bold;

    private Input<CheckoutBrandingFontLoadingStrategy> loadingStrategy = Input.undefined();

    public CheckoutBrandingCustomFontGroupInput(CheckoutBrandingCustomFontInput base, CheckoutBrandingCustomFontInput bold) {
        this.base = base;

        this.bold = bold;
    }

    public CheckoutBrandingCustomFontInput getBase() {
        return base;
    }

    public CheckoutBrandingCustomFontGroupInput setBase(CheckoutBrandingCustomFontInput base) {
        this.base = base;
        return this;
    }

    public CheckoutBrandingCustomFontInput getBold() {
        return bold;
    }

    public CheckoutBrandingCustomFontGroupInput setBold(CheckoutBrandingCustomFontInput bold) {
        this.bold = bold;
        return this;
    }

    public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
        return loadingStrategy.getValue();
    }

    public Input<CheckoutBrandingFontLoadingStrategy> getLoadingStrategyInput() {
        return loadingStrategy;
    }

    public CheckoutBrandingCustomFontGroupInput setLoadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
        this.loadingStrategy = Input.optional(loadingStrategy);
        return this;
    }

    public CheckoutBrandingCustomFontGroupInput setLoadingStrategyInput(Input<CheckoutBrandingFontLoadingStrategy> loadingStrategy) {
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
        _queryBuilder.append("base:");
        base.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("bold:");
        bold.appendTo(_queryBuilder);

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
