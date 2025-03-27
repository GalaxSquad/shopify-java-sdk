// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingGlobalInput implements Serializable {
    private Input<CheckoutBrandingGlobalCornerRadius> cornerRadius = Input.undefined();

    private Input<CheckoutBrandingTypographyStyleGlobalInput> typography = Input.undefined();

    public CheckoutBrandingGlobalCornerRadius getCornerRadius() {
        return cornerRadius.getValue();
    }

    public Input<CheckoutBrandingGlobalCornerRadius> getCornerRadiusInput() {
        return cornerRadius;
    }

    public CheckoutBrandingGlobalInput setCornerRadius(CheckoutBrandingGlobalCornerRadius cornerRadius) {
        this.cornerRadius = Input.optional(cornerRadius);
        return this;
    }

    public CheckoutBrandingGlobalInput setCornerRadiusInput(Input<CheckoutBrandingGlobalCornerRadius> cornerRadius) {
        if (cornerRadius == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cornerRadius = cornerRadius;
        return this;
    }

    public CheckoutBrandingTypographyStyleGlobalInput getTypography() {
        return typography.getValue();
    }

    public Input<CheckoutBrandingTypographyStyleGlobalInput> getTypographyInput() {
        return typography;
    }

    public CheckoutBrandingGlobalInput setTypography(CheckoutBrandingTypographyStyleGlobalInput typography) {
        this.typography = Input.optional(typography);
        return this;
    }

    public CheckoutBrandingGlobalInput setTypographyInput(Input<CheckoutBrandingTypographyStyleGlobalInput> typography) {
        if (typography == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.typography = typography;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.cornerRadius.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cornerRadius:");
            if (cornerRadius.getValue() != null) {
                _queryBuilder.append(cornerRadius.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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
