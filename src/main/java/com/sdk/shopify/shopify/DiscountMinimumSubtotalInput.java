// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class DiscountMinimumSubtotalInput implements Serializable {
    private Input<BigDecimal> greaterThanOrEqualToSubtotal = Input.undefined();

    public BigDecimal getGreaterThanOrEqualToSubtotal() {
        return greaterThanOrEqualToSubtotal.getValue();
    }

    public Input<BigDecimal> getGreaterThanOrEqualToSubtotalInput() {
        return greaterThanOrEqualToSubtotal;
    }

    public DiscountMinimumSubtotalInput setGreaterThanOrEqualToSubtotal(BigDecimal greaterThanOrEqualToSubtotal) {
        this.greaterThanOrEqualToSubtotal = Input.optional(greaterThanOrEqualToSubtotal);
        return this;
    }

    public DiscountMinimumSubtotalInput setGreaterThanOrEqualToSubtotalInput(Input<BigDecimal> greaterThanOrEqualToSubtotal) {
        if (greaterThanOrEqualToSubtotal == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.greaterThanOrEqualToSubtotal = greaterThanOrEqualToSubtotal;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.greaterThanOrEqualToSubtotal.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("greaterThanOrEqualToSubtotal:");
            if (greaterThanOrEqualToSubtotal.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, greaterThanOrEqualToSubtotal.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
