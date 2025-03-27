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

public class CheckoutBrandingButtonInput implements Serializable {
    private Input<CheckoutBrandingBackgroundStyle> background = Input.undefined();

    private Input<CheckoutBrandingSimpleBorder> border = Input.undefined();

    private Input<CheckoutBrandingCornerRadius> cornerRadius = Input.undefined();

    private Input<CheckoutBrandingSpacing> blockPadding = Input.undefined();

    private Input<CheckoutBrandingSpacing> inlinePadding = Input.undefined();

    private Input<CheckoutBrandingTypographyStyleInput> typography = Input.undefined();

    public CheckoutBrandingBackgroundStyle getBackground() {
        return background.getValue();
    }

    public Input<CheckoutBrandingBackgroundStyle> getBackgroundInput() {
        return background;
    }

    public CheckoutBrandingButtonInput setBackground(CheckoutBrandingBackgroundStyle background) {
        this.background = Input.optional(background);
        return this;
    }

    public CheckoutBrandingButtonInput setBackgroundInput(Input<CheckoutBrandingBackgroundStyle> background) {
        if (background == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.background = background;
        return this;
    }

    public CheckoutBrandingSimpleBorder getBorder() {
        return border.getValue();
    }

    public Input<CheckoutBrandingSimpleBorder> getBorderInput() {
        return border;
    }

    public CheckoutBrandingButtonInput setBorder(CheckoutBrandingSimpleBorder border) {
        this.border = Input.optional(border);
        return this;
    }

    public CheckoutBrandingButtonInput setBorderInput(Input<CheckoutBrandingSimpleBorder> border) {
        if (border == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.border = border;
        return this;
    }

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return cornerRadius.getValue();
    }

    public Input<CheckoutBrandingCornerRadius> getCornerRadiusInput() {
        return cornerRadius;
    }

    public CheckoutBrandingButtonInput setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
        this.cornerRadius = Input.optional(cornerRadius);
        return this;
    }

    public CheckoutBrandingButtonInput setCornerRadiusInput(Input<CheckoutBrandingCornerRadius> cornerRadius) {
        if (cornerRadius == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cornerRadius = cornerRadius;
        return this;
    }

    public CheckoutBrandingSpacing getBlockPadding() {
        return blockPadding.getValue();
    }

    public Input<CheckoutBrandingSpacing> getBlockPaddingInput() {
        return blockPadding;
    }

    public CheckoutBrandingButtonInput setBlockPadding(CheckoutBrandingSpacing blockPadding) {
        this.blockPadding = Input.optional(blockPadding);
        return this;
    }

    public CheckoutBrandingButtonInput setBlockPaddingInput(Input<CheckoutBrandingSpacing> blockPadding) {
        if (blockPadding == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.blockPadding = blockPadding;
        return this;
    }

    public CheckoutBrandingSpacing getInlinePadding() {
        return inlinePadding.getValue();
    }

    public Input<CheckoutBrandingSpacing> getInlinePaddingInput() {
        return inlinePadding;
    }

    public CheckoutBrandingButtonInput setInlinePadding(CheckoutBrandingSpacing inlinePadding) {
        this.inlinePadding = Input.optional(inlinePadding);
        return this;
    }

    public CheckoutBrandingButtonInput setInlinePaddingInput(Input<CheckoutBrandingSpacing> inlinePadding) {
        if (inlinePadding == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inlinePadding = inlinePadding;
        return this;
    }

    public CheckoutBrandingTypographyStyleInput getTypography() {
        return typography.getValue();
    }

    public Input<CheckoutBrandingTypographyStyleInput> getTypographyInput() {
        return typography;
    }

    public CheckoutBrandingButtonInput setTypography(CheckoutBrandingTypographyStyleInput typography) {
        this.typography = Input.optional(typography);
        return this;
    }

    public CheckoutBrandingButtonInput setTypographyInput(Input<CheckoutBrandingTypographyStyleInput> typography) {
        if (typography == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.typography = typography;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.blockPadding.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("blockPadding:");
            if (blockPadding.getValue() != null) {
                _queryBuilder.append(blockPadding.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.inlinePadding.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("inlinePadding:");
            if (inlinePadding.getValue() != null) {
                _queryBuilder.append(inlinePadding.getValue().toString());
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
