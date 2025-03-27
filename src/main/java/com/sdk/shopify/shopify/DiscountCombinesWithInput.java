// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class DiscountCombinesWithInput implements Serializable {
    private Input<Boolean> productDiscounts = Input.undefined();

    private Input<Boolean> orderDiscounts = Input.undefined();

    private Input<Boolean> shippingDiscounts = Input.undefined();

    public Boolean getProductDiscounts() {
        return productDiscounts.getValue();
    }

    public Input<Boolean> getProductDiscountsInput() {
        return productDiscounts;
    }

    public DiscountCombinesWithInput setProductDiscounts(Boolean productDiscounts) {
        this.productDiscounts = Input.optional(productDiscounts);
        return this;
    }

    public DiscountCombinesWithInput setProductDiscountsInput(Input<Boolean> productDiscounts) {
        if (productDiscounts == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productDiscounts = productDiscounts;
        return this;
    }

    public Boolean getOrderDiscounts() {
        return orderDiscounts.getValue();
    }

    public Input<Boolean> getOrderDiscountsInput() {
        return orderDiscounts;
    }

    public DiscountCombinesWithInput setOrderDiscounts(Boolean orderDiscounts) {
        this.orderDiscounts = Input.optional(orderDiscounts);
        return this;
    }

    public DiscountCombinesWithInput setOrderDiscountsInput(Input<Boolean> orderDiscounts) {
        if (orderDiscounts == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.orderDiscounts = orderDiscounts;
        return this;
    }

    public Boolean getShippingDiscounts() {
        return shippingDiscounts.getValue();
    }

    public Input<Boolean> getShippingDiscountsInput() {
        return shippingDiscounts;
    }

    public DiscountCombinesWithInput setShippingDiscounts(Boolean shippingDiscounts) {
        this.shippingDiscounts = Input.optional(shippingDiscounts);
        return this;
    }

    public DiscountCombinesWithInput setShippingDiscountsInput(Input<Boolean> shippingDiscounts) {
        if (shippingDiscounts == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingDiscounts = shippingDiscounts;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.productDiscounts.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productDiscounts:");
            if (productDiscounts.getValue() != null) {
                _queryBuilder.append(productDiscounts.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.orderDiscounts.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("orderDiscounts:");
            if (orderDiscounts.getValue() != null) {
                _queryBuilder.append(orderDiscounts.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingDiscounts.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingDiscounts:");
            if (shippingDiscounts.getValue() != null) {
                _queryBuilder.append(shippingDiscounts.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
