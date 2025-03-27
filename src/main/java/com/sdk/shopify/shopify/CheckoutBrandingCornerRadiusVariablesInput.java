// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingCornerRadiusVariablesInput implements Serializable {
    private Input<Integer> small = Input.undefined();

    private Input<Integer> base = Input.undefined();

    private Input<Integer> large = Input.undefined();

    public Integer getSmall() {
        return small.getValue();
    }

    public Input<Integer> getSmallInput() {
        return small;
    }

    public CheckoutBrandingCornerRadiusVariablesInput setSmall(Integer small) {
        this.small = Input.optional(small);
        return this;
    }

    public CheckoutBrandingCornerRadiusVariablesInput setSmallInput(Input<Integer> small) {
        if (small == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.small = small;
        return this;
    }

    public Integer getBase() {
        return base.getValue();
    }

    public Input<Integer> getBaseInput() {
        return base;
    }

    public CheckoutBrandingCornerRadiusVariablesInput setBase(Integer base) {
        this.base = Input.optional(base);
        return this;
    }

    public CheckoutBrandingCornerRadiusVariablesInput setBaseInput(Input<Integer> base) {
        if (base == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.base = base;
        return this;
    }

    public Integer getLarge() {
        return large.getValue();
    }

    public Input<Integer> getLargeInput() {
        return large;
    }

    public CheckoutBrandingCornerRadiusVariablesInput setLarge(Integer large) {
        this.large = Input.optional(large);
        return this;
    }

    public CheckoutBrandingCornerRadiusVariablesInput setLargeInput(Input<Integer> large) {
        if (large == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.large = large;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.small.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("small:");
            if (small.getValue() != null) {
                _queryBuilder.append(small.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.large.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("large:");
            if (large.getValue() != null) {
                _queryBuilder.append(large.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
