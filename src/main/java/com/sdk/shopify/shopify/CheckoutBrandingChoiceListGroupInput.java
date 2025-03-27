// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingChoiceListGroupInput implements Serializable {
    private Input<CheckoutBrandingSpacingKeyword> spacing = Input.undefined();

    public CheckoutBrandingSpacingKeyword getSpacing() {
        return spacing.getValue();
    }

    public Input<CheckoutBrandingSpacingKeyword> getSpacingInput() {
        return spacing;
    }

    public CheckoutBrandingChoiceListGroupInput setSpacing(CheckoutBrandingSpacingKeyword spacing) {
        this.spacing = Input.optional(spacing);
        return this;
    }

    public CheckoutBrandingChoiceListGroupInput setSpacingInput(Input<CheckoutBrandingSpacingKeyword> spacing) {
        if (spacing == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.spacing = spacing;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.spacing.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("spacing:");
            if (spacing.getValue() != null) {
                _queryBuilder.append(spacing.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
