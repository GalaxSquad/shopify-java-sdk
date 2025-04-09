// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DiscountMinimumQuantityInput implements Serializable {
    private Input<String> greaterThanOrEqualToQuantity = Input.undefined();

    public String getGreaterThanOrEqualToQuantity() {
        return greaterThanOrEqualToQuantity.getValue();
    }

    public Input<String> getGreaterThanOrEqualToQuantityInput() {
        return greaterThanOrEqualToQuantity;
    }

    public DiscountMinimumQuantityInput setGreaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
        this.greaterThanOrEqualToQuantity = Input.optional(greaterThanOrEqualToQuantity);
        return this;
    }

    public DiscountMinimumQuantityInput setGreaterThanOrEqualToQuantityInput(Input<String> greaterThanOrEqualToQuantity) {
        if (greaterThanOrEqualToQuantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.greaterThanOrEqualToQuantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("greaterThanOrEqualToQuantity:");
            if (greaterThanOrEqualToQuantity.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, greaterThanOrEqualToQuantity.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
