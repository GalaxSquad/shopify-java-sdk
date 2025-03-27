// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingTypographyInput implements Serializable {
    private Input<CheckoutBrandingFontSizeInput> size = Input.undefined();

    private Input<CheckoutBrandingFontGroupInput> primary = Input.undefined();

    private Input<CheckoutBrandingFontGroupInput> secondary = Input.undefined();

    public CheckoutBrandingFontSizeInput getSize() {
        return size.getValue();
    }

    public Input<CheckoutBrandingFontSizeInput> getSizeInput() {
        return size;
    }

    public CheckoutBrandingTypographyInput setSize(CheckoutBrandingFontSizeInput size) {
        this.size = Input.optional(size);
        return this;
    }

    public CheckoutBrandingTypographyInput setSizeInput(Input<CheckoutBrandingFontSizeInput> size) {
        if (size == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.size = size;
        return this;
    }

    public CheckoutBrandingFontGroupInput getPrimary() {
        return primary.getValue();
    }

    public Input<CheckoutBrandingFontGroupInput> getPrimaryInput() {
        return primary;
    }

    public CheckoutBrandingTypographyInput setPrimary(CheckoutBrandingFontGroupInput primary) {
        this.primary = Input.optional(primary);
        return this;
    }

    public CheckoutBrandingTypographyInput setPrimaryInput(Input<CheckoutBrandingFontGroupInput> primary) {
        if (primary == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.primary = primary;
        return this;
    }

    public CheckoutBrandingFontGroupInput getSecondary() {
        return secondary.getValue();
    }

    public Input<CheckoutBrandingFontGroupInput> getSecondaryInput() {
        return secondary;
    }

    public CheckoutBrandingTypographyInput setSecondary(CheckoutBrandingFontGroupInput secondary) {
        this.secondary = Input.optional(secondary);
        return this;
    }

    public CheckoutBrandingTypographyInput setSecondaryInput(Input<CheckoutBrandingFontGroupInput> secondary) {
        if (secondary == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.secondary = secondary;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.size.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("size:");
            if (size.getValue() != null) {
                size.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.primary.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("primary:");
            if (primary.getValue() != null) {
                primary.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.secondary.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("secondary:");
            if (secondary.getValue() != null) {
                secondary.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
