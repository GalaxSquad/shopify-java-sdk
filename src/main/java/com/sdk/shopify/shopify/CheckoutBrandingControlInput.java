// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingControlInput implements Serializable {
    private Input<CheckoutBrandingColorSelection> color = Input.undefined();

    private Input<CheckoutBrandingCornerRadius> cornerRadius = Input.undefined();

    private Input<CheckoutBrandingSimpleBorder> border = Input.undefined();

    private Input<CheckoutBrandingLabelPosition> labelPosition = Input.undefined();

    public CheckoutBrandingColorSelection getColor() {
        return color.getValue();
    }

    public Input<CheckoutBrandingColorSelection> getColorInput() {
        return color;
    }

    public CheckoutBrandingControlInput setColor(CheckoutBrandingColorSelection color) {
        this.color = Input.optional(color);
        return this;
    }

    public CheckoutBrandingControlInput setColorInput(Input<CheckoutBrandingColorSelection> color) {
        if (color == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.color = color;
        return this;
    }

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return cornerRadius.getValue();
    }

    public Input<CheckoutBrandingCornerRadius> getCornerRadiusInput() {
        return cornerRadius;
    }

    public CheckoutBrandingControlInput setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
        this.cornerRadius = Input.optional(cornerRadius);
        return this;
    }

    public CheckoutBrandingControlInput setCornerRadiusInput(Input<CheckoutBrandingCornerRadius> cornerRadius) {
        if (cornerRadius == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cornerRadius = cornerRadius;
        return this;
    }

    public CheckoutBrandingSimpleBorder getBorder() {
        return border.getValue();
    }

    public Input<CheckoutBrandingSimpleBorder> getBorderInput() {
        return border;
    }

    public CheckoutBrandingControlInput setBorder(CheckoutBrandingSimpleBorder border) {
        this.border = Input.optional(border);
        return this;
    }

    public CheckoutBrandingControlInput setBorderInput(Input<CheckoutBrandingSimpleBorder> border) {
        if (border == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.border = border;
        return this;
    }

    public CheckoutBrandingLabelPosition getLabelPosition() {
        return labelPosition.getValue();
    }

    public Input<CheckoutBrandingLabelPosition> getLabelPositionInput() {
        return labelPosition;
    }

    public CheckoutBrandingControlInput setLabelPosition(CheckoutBrandingLabelPosition labelPosition) {
        this.labelPosition = Input.optional(labelPosition);
        return this;
    }

    public CheckoutBrandingControlInput setLabelPositionInput(Input<CheckoutBrandingLabelPosition> labelPosition) {
        if (labelPosition == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.labelPosition = labelPosition;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.color.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("color:");
            if (color.getValue() != null) {
                _queryBuilder.append(color.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.border.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("border:");
            if (border.getValue() != null) {
                _queryBuilder.append(border.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.labelPosition.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("labelPosition:");
            if (labelPosition.getValue() != null) {
                _queryBuilder.append(labelPosition.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
