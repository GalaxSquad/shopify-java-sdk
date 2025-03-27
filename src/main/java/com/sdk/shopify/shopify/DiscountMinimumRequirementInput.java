// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class DiscountMinimumRequirementInput implements Serializable {
    private Input<DiscountMinimumQuantityInput> quantity = Input.undefined();

    private Input<DiscountMinimumSubtotalInput> subtotal = Input.undefined();

    public DiscountMinimumQuantityInput getQuantity() {
        return quantity.getValue();
    }

    public Input<DiscountMinimumQuantityInput> getQuantityInput() {
        return quantity;
    }

    public DiscountMinimumRequirementInput setQuantity(DiscountMinimumQuantityInput quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    public DiscountMinimumRequirementInput setQuantityInput(Input<DiscountMinimumQuantityInput> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public DiscountMinimumSubtotalInput getSubtotal() {
        return subtotal.getValue();
    }

    public Input<DiscountMinimumSubtotalInput> getSubtotalInput() {
        return subtotal;
    }

    public DiscountMinimumRequirementInput setSubtotal(DiscountMinimumSubtotalInput subtotal) {
        this.subtotal = Input.optional(subtotal);
        return this;
    }

    public DiscountMinimumRequirementInput setSubtotalInput(Input<DiscountMinimumSubtotalInput> subtotal) {
        if (subtotal == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.subtotal = subtotal;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.quantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantity:");
            if (quantity.getValue() != null) {
                quantity.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.subtotal.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("subtotal:");
            if (subtotal.getValue() != null) {
                subtotal.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
