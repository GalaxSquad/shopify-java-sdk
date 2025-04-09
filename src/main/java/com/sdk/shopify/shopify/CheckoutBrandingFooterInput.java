// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingFooterInput implements Serializable {
    private Input<CheckoutBrandingFooterPosition> position = Input.undefined();

    private Input<Boolean> divided = Input.undefined();

    private Input<CheckoutBrandingFooterAlignment> alignment = Input.undefined();

    private Input<CheckoutBrandingFooterContentInput> content = Input.undefined();

    private Input<CheckoutBrandingColorSchemeSelection> colorScheme = Input.undefined();

    private Input<CheckoutBrandingSpacingKeyword> padding = Input.undefined();

    public CheckoutBrandingFooterPosition getPosition() {
        return position.getValue();
    }

    public Input<CheckoutBrandingFooterPosition> getPositionInput() {
        return position;
    }

    public CheckoutBrandingFooterInput setPosition(CheckoutBrandingFooterPosition position) {
        this.position = Input.optional(position);
        return this;
    }

    public CheckoutBrandingFooterInput setPositionInput(Input<CheckoutBrandingFooterPosition> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
        return this;
    }

    public Boolean getDivided() {
        return divided.getValue();
    }

    public Input<Boolean> getDividedInput() {
        return divided;
    }

    public CheckoutBrandingFooterInput setDivided(Boolean divided) {
        this.divided = Input.optional(divided);
        return this;
    }

    public CheckoutBrandingFooterInput setDividedInput(Input<Boolean> divided) {
        if (divided == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.divided = divided;
        return this;
    }

    public CheckoutBrandingFooterAlignment getAlignment() {
        return alignment.getValue();
    }

    public Input<CheckoutBrandingFooterAlignment> getAlignmentInput() {
        return alignment;
    }

    public CheckoutBrandingFooterInput setAlignment(CheckoutBrandingFooterAlignment alignment) {
        this.alignment = Input.optional(alignment);
        return this;
    }

    public CheckoutBrandingFooterInput setAlignmentInput(Input<CheckoutBrandingFooterAlignment> alignment) {
        if (alignment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alignment = alignment;
        return this;
    }

    public CheckoutBrandingFooterContentInput getContent() {
        return content.getValue();
    }

    public Input<CheckoutBrandingFooterContentInput> getContentInput() {
        return content;
    }

    public CheckoutBrandingFooterInput setContent(CheckoutBrandingFooterContentInput content) {
        this.content = Input.optional(content);
        return this;
    }

    public CheckoutBrandingFooterInput setContentInput(Input<CheckoutBrandingFooterContentInput> content) {
        if (content == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.content = content;
        return this;
    }

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return colorScheme.getValue();
    }

    public Input<CheckoutBrandingColorSchemeSelection> getColorSchemeInput() {
        return colorScheme;
    }

    public CheckoutBrandingFooterInput setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
        this.colorScheme = Input.optional(colorScheme);
        return this;
    }

    public CheckoutBrandingFooterInput setColorSchemeInput(Input<CheckoutBrandingColorSchemeSelection> colorScheme) {
        if (colorScheme == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.colorScheme = colorScheme;
        return this;
    }

    public CheckoutBrandingSpacingKeyword getPadding() {
        return padding.getValue();
    }

    public Input<CheckoutBrandingSpacingKeyword> getPaddingInput() {
        return padding;
    }

    public CheckoutBrandingFooterInput setPadding(CheckoutBrandingSpacingKeyword padding) {
        this.padding = Input.optional(padding);
        return this;
    }

    public CheckoutBrandingFooterInput setPaddingInput(Input<CheckoutBrandingSpacingKeyword> padding) {
        if (padding == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.padding = padding;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.position.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("position:");
            if (position.getValue() != null) {
                _queryBuilder.append(position.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.divided.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("divided:");
            if (divided.getValue() != null) {
                _queryBuilder.append(divided.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alignment.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alignment:");
            if (alignment.getValue() != null) {
                _queryBuilder.append(alignment.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.content.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("content:");
            if (content.getValue() != null) {
                content.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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
