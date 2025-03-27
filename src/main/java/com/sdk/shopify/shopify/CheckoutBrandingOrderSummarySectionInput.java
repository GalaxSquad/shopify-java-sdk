// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;

public class CheckoutBrandingOrderSummarySectionInput implements Serializable {
    private Input<CheckoutBrandingColorSchemeSelection> colorScheme = Input.undefined();

    private Input<CheckoutBrandingBackground> background = Input.undefined();

    private Input<CheckoutBrandingCornerRadius> cornerRadius = Input.undefined();

    private Input<CheckoutBrandingSimpleBorder> border = Input.undefined();

    private Input<CheckoutBrandingBorderStyle> borderStyle = Input.undefined();

    private Input<CheckoutBrandingBorderWidth> borderWidth = Input.undefined();

    private Input<CheckoutBrandingShadow> shadow = Input.undefined();

    private Input<CheckoutBrandingSpacingKeyword> padding = Input.undefined();

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return colorScheme.getValue();
    }

    public Input<CheckoutBrandingColorSchemeSelection> getColorSchemeInput() {
        return colorScheme;
    }

    public CheckoutBrandingOrderSummarySectionInput setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
        this.colorScheme = Input.optional(colorScheme);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setColorSchemeInput(Input<CheckoutBrandingColorSchemeSelection> colorScheme) {
        if (colorScheme == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.colorScheme = colorScheme;
        return this;
    }

    public CheckoutBrandingBackground getBackground() {
        return background.getValue();
    }

    public Input<CheckoutBrandingBackground> getBackgroundInput() {
        return background;
    }

    public CheckoutBrandingOrderSummarySectionInput setBackground(CheckoutBrandingBackground background) {
        this.background = Input.optional(background);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setBackgroundInput(Input<CheckoutBrandingBackground> background) {
        if (background == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.background = background;
        return this;
    }

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return cornerRadius.getValue();
    }

    public Input<CheckoutBrandingCornerRadius> getCornerRadiusInput() {
        return cornerRadius;
    }

    public CheckoutBrandingOrderSummarySectionInput setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
        this.cornerRadius = Input.optional(cornerRadius);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setCornerRadiusInput(Input<CheckoutBrandingCornerRadius> cornerRadius) {
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

    public CheckoutBrandingOrderSummarySectionInput setBorder(CheckoutBrandingSimpleBorder border) {
        this.border = Input.optional(border);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setBorderInput(Input<CheckoutBrandingSimpleBorder> border) {
        if (border == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.border = border;
        return this;
    }

    public CheckoutBrandingBorderStyle getBorderStyle() {
        return borderStyle.getValue();
    }

    public Input<CheckoutBrandingBorderStyle> getBorderStyleInput() {
        return borderStyle;
    }

    public CheckoutBrandingOrderSummarySectionInput setBorderStyle(CheckoutBrandingBorderStyle borderStyle) {
        this.borderStyle = Input.optional(borderStyle);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setBorderStyleInput(Input<CheckoutBrandingBorderStyle> borderStyle) {
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

    public CheckoutBrandingOrderSummarySectionInput setBorderWidth(CheckoutBrandingBorderWidth borderWidth) {
        this.borderWidth = Input.optional(borderWidth);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setBorderWidthInput(Input<CheckoutBrandingBorderWidth> borderWidth) {
        if (borderWidth == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.borderWidth = borderWidth;
        return this;
    }

    public CheckoutBrandingShadow getShadow() {
        return shadow.getValue();
    }

    public Input<CheckoutBrandingShadow> getShadowInput() {
        return shadow;
    }

    public CheckoutBrandingOrderSummarySectionInput setShadow(CheckoutBrandingShadow shadow) {
        this.shadow = Input.optional(shadow);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setShadowInput(Input<CheckoutBrandingShadow> shadow) {
        if (shadow == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shadow = shadow;
        return this;
    }

    public CheckoutBrandingSpacingKeyword getPadding() {
        return padding.getValue();
    }

    public Input<CheckoutBrandingSpacingKeyword> getPaddingInput() {
        return padding;
    }

    public CheckoutBrandingOrderSummarySectionInput setPadding(CheckoutBrandingSpacingKeyword padding) {
        this.padding = Input.optional(padding);
        return this;
    }

    public CheckoutBrandingOrderSummarySectionInput setPaddingInput(Input<CheckoutBrandingSpacingKeyword> padding) {
        if (padding == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.padding = padding;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.colorScheme.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("colorScheme:");
            if (colorScheme.getValue() != null) {
                _queryBuilder.append(colorScheme.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.background.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("background:");
            if (background.getValue() != null) {
                _queryBuilder.append(background.getValue().toString());
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

        if (this.shadow.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shadow:");
            if (shadow.getValue() != null) {
                _queryBuilder.append(shadow.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.padding.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("padding:");
            if (padding.getValue() != null) {
                _queryBuilder.append(padding.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
