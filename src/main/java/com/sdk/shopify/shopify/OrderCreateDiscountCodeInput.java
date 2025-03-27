// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class OrderCreateDiscountCodeInput implements Serializable {
    private Input<OrderCreatePercentageDiscountCodeAttributesInput> itemPercentageDiscountCode = Input.undefined();

    private Input<OrderCreateFixedDiscountCodeAttributesInput> itemFixedDiscountCode = Input.undefined();

    private Input<OrderCreateFreeShippingDiscountCodeAttributesInput> freeShippingDiscountCode = Input.undefined();

    public OrderCreatePercentageDiscountCodeAttributesInput getItemPercentageDiscountCode() {
        return itemPercentageDiscountCode.getValue();
    }

    public Input<OrderCreatePercentageDiscountCodeAttributesInput> getItemPercentageDiscountCodeInput() {
        return itemPercentageDiscountCode;
    }

    public OrderCreateDiscountCodeInput setItemPercentageDiscountCode(OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode) {
        this.itemPercentageDiscountCode = Input.optional(itemPercentageDiscountCode);
        return this;
    }

    public OrderCreateDiscountCodeInput setItemPercentageDiscountCodeInput(Input<OrderCreatePercentageDiscountCodeAttributesInput> itemPercentageDiscountCode) {
        if (itemPercentageDiscountCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.itemPercentageDiscountCode = itemPercentageDiscountCode;
        return this;
    }

    public OrderCreateFixedDiscountCodeAttributesInput getItemFixedDiscountCode() {
        return itemFixedDiscountCode.getValue();
    }

    public Input<OrderCreateFixedDiscountCodeAttributesInput> getItemFixedDiscountCodeInput() {
        return itemFixedDiscountCode;
    }

    public OrderCreateDiscountCodeInput setItemFixedDiscountCode(OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode) {
        this.itemFixedDiscountCode = Input.optional(itemFixedDiscountCode);
        return this;
    }

    public OrderCreateDiscountCodeInput setItemFixedDiscountCodeInput(Input<OrderCreateFixedDiscountCodeAttributesInput> itemFixedDiscountCode) {
        if (itemFixedDiscountCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.itemFixedDiscountCode = itemFixedDiscountCode;
        return this;
    }

    public OrderCreateFreeShippingDiscountCodeAttributesInput getFreeShippingDiscountCode() {
        return freeShippingDiscountCode.getValue();
    }

    public Input<OrderCreateFreeShippingDiscountCodeAttributesInput> getFreeShippingDiscountCodeInput() {
        return freeShippingDiscountCode;
    }

    public OrderCreateDiscountCodeInput setFreeShippingDiscountCode(OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode) {
        this.freeShippingDiscountCode = Input.optional(freeShippingDiscountCode);
        return this;
    }

    public OrderCreateDiscountCodeInput setFreeShippingDiscountCodeInput(Input<OrderCreateFreeShippingDiscountCodeAttributesInput> freeShippingDiscountCode) {
        if (freeShippingDiscountCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.freeShippingDiscountCode = freeShippingDiscountCode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.itemPercentageDiscountCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("itemPercentageDiscountCode:");
            if (itemPercentageDiscountCode.getValue() != null) {
                itemPercentageDiscountCode.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.itemFixedDiscountCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("itemFixedDiscountCode:");
            if (itemFixedDiscountCode.getValue() != null) {
                itemFixedDiscountCode.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.freeShippingDiscountCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("freeShippingDiscountCode:");
            if (freeShippingDiscountCode.getValue() != null) {
                freeShippingDiscountCode.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
