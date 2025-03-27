// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingContentInput implements Serializable {
    private Input<CheckoutBrandingContainerDividerInput> divider = Input.undefined();

    public CheckoutBrandingContainerDividerInput getDivider() {
        return divider.getValue();
    }

    public Input<CheckoutBrandingContainerDividerInput> getDividerInput() {
        return divider;
    }

    public CheckoutBrandingContentInput setDivider(CheckoutBrandingContainerDividerInput divider) {
        this.divider = Input.optional(divider);
        return this;
    }

    public CheckoutBrandingContentInput setDividerInput(Input<CheckoutBrandingContainerDividerInput> divider) {
        if (divider == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.divider = divider;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.divider.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("divider:");
            if (divider.getValue() != null) {
                divider.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
