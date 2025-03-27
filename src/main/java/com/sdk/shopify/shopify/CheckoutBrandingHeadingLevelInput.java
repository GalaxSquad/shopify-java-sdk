// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingHeadingLevelInput implements Serializable {
    private Input<CheckoutBrandingTypographyStyleInput> typography = Input.undefined();

    public CheckoutBrandingTypographyStyleInput getTypography() {
        return typography.getValue();
    }

    public Input<CheckoutBrandingTypographyStyleInput> getTypographyInput() {
        return typography;
    }

    public CheckoutBrandingHeadingLevelInput setTypography(CheckoutBrandingTypographyStyleInput typography) {
        this.typography = Input.optional(typography);
        return this;
    }

    public CheckoutBrandingHeadingLevelInput setTypographyInput(Input<CheckoutBrandingTypographyStyleInput> typography) {
        if (typography == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.typography = typography;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.typography.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("typography:");
            if (typography.getValue() != null) {
                typography.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
