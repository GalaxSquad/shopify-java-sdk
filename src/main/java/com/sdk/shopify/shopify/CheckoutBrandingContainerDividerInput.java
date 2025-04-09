// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingContainerDividerInput implements Serializable {
    private Input<CheckoutBrandingBorderStyle> borderStyle = Input.undefined();

    private Input<CheckoutBrandingBorderWidth> borderWidth = Input.undefined();

    private Input<CheckoutBrandingVisibility> visibility = Input.undefined();

    public CheckoutBrandingBorderStyle getBorderStyle() {
        return borderStyle.getValue();
    }

    public Input<CheckoutBrandingBorderStyle> getBorderStyleInput() {
        return borderStyle;
    }

    public CheckoutBrandingContainerDividerInput setBorderStyle(CheckoutBrandingBorderStyle borderStyle) {
        this.borderStyle = Input.optional(borderStyle);
        return this;
    }

    public CheckoutBrandingContainerDividerInput setBorderStyleInput(Input<CheckoutBrandingBorderStyle> borderStyle) {
        if (borderStyle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.borderStyle = borderStyle;
        return this;
    }

    public CheckoutBrandingBorderWidth getBorderWidth() {
        return borderWidth.getValue();
    }

    public Input<CheckoutBrandingBorderWidth> getBorderWidthInput() {
        return borderWidth;
    }

    public CheckoutBrandingContainerDividerInput setBorderWidth(CheckoutBrandingBorderWidth borderWidth) {
        this.borderWidth = Input.optional(borderWidth);
        return this;
    }

    public CheckoutBrandingContainerDividerInput setBorderWidthInput(Input<CheckoutBrandingBorderWidth> borderWidth) {
        if (borderWidth == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.borderWidth = borderWidth;
        return this;
    }

    public CheckoutBrandingVisibility getVisibility() {
        return visibility.getValue();
    }

    public Input<CheckoutBrandingVisibility> getVisibilityInput() {
        return visibility;
    }

    public CheckoutBrandingContainerDividerInput setVisibility(CheckoutBrandingVisibility visibility) {
        this.visibility = Input.optional(visibility);
        return this;
    }

    public CheckoutBrandingContainerDividerInput setVisibilityInput(Input<CheckoutBrandingVisibility> visibility) {
        if (visibility == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.visibility = visibility;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.borderStyle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("borderStyle:");
            if (borderStyle.getValue() != null) {
                _queryBuilder.append(borderStyle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.borderWidth.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("borderWidth:");
            if (borderWidth.getValue() != null) {
                _queryBuilder.append(borderWidth.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.visibility.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("visibility:");
            if (visibility.getValue() != null) {
                _queryBuilder.append(visibility.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
