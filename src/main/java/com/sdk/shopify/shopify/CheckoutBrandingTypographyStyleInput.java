// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingTypographyStyleInput implements Serializable {
    private Input<CheckoutBrandingTypographyFont> font = Input.undefined();

    private Input<CheckoutBrandingTypographySize> size = Input.undefined();

    private Input<CheckoutBrandingTypographyWeight> weight = Input.undefined();

    private Input<CheckoutBrandingTypographyLetterCase> letterCase = Input.undefined();

    private Input<CheckoutBrandingTypographyKerning> kerning = Input.undefined();

    public CheckoutBrandingTypographyFont getFont() {
        return font.getValue();
    }

    public Input<CheckoutBrandingTypographyFont> getFontInput() {
        return font;
    }

    public CheckoutBrandingTypographyStyleInput setFont(CheckoutBrandingTypographyFont font) {
        this.font = Input.optional(font);
        return this;
    }

    public CheckoutBrandingTypographyStyleInput setFontInput(Input<CheckoutBrandingTypographyFont> font) {
        if (font == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.font = font;
        return this;
    }

    public CheckoutBrandingTypographySize getSize() {
        return size.getValue();
    }

    public Input<CheckoutBrandingTypographySize> getSizeInput() {
        return size;
    }

    public CheckoutBrandingTypographyStyleInput setSize(CheckoutBrandingTypographySize size) {
        this.size = Input.optional(size);
        return this;
    }

    public CheckoutBrandingTypographyStyleInput setSizeInput(Input<CheckoutBrandingTypographySize> size) {
        if (size == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.size = size;
        return this;
    }

    public CheckoutBrandingTypographyWeight getWeight() {
        return weight.getValue();
    }

    public Input<CheckoutBrandingTypographyWeight> getWeightInput() {
        return weight;
    }

    public CheckoutBrandingTypographyStyleInput setWeight(CheckoutBrandingTypographyWeight weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    public CheckoutBrandingTypographyStyleInput setWeightInput(Input<CheckoutBrandingTypographyWeight> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
        return this;
    }

    public CheckoutBrandingTypographyLetterCase getLetterCase() {
        return letterCase.getValue();
    }

    public Input<CheckoutBrandingTypographyLetterCase> getLetterCaseInput() {
        return letterCase;
    }

    public CheckoutBrandingTypographyStyleInput setLetterCase(CheckoutBrandingTypographyLetterCase letterCase) {
        this.letterCase = Input.optional(letterCase);
        return this;
    }

    public CheckoutBrandingTypographyStyleInput setLetterCaseInput(Input<CheckoutBrandingTypographyLetterCase> letterCase) {
        if (letterCase == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.letterCase = letterCase;
        return this;
    }

    public CheckoutBrandingTypographyKerning getKerning() {
        return kerning.getValue();
    }

    public Input<CheckoutBrandingTypographyKerning> getKerningInput() {
        return kerning;
    }

    public CheckoutBrandingTypographyStyleInput setKerning(CheckoutBrandingTypographyKerning kerning) {
        this.kerning = Input.optional(kerning);
        return this;
    }

    public CheckoutBrandingTypographyStyleInput setKerningInput(Input<CheckoutBrandingTypographyKerning> kerning) {
        if (kerning == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.kerning = kerning;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.font.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("font:");
            if (font.getValue() != null) {
                _queryBuilder.append(font.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.size.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("size:");
            if (size.getValue() != null) {
                _queryBuilder.append(size.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.weight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("weight:");
            if (weight.getValue() != null) {
                _queryBuilder.append(weight.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.letterCase.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("letterCase:");
            if (letterCase.getValue() != null) {
                _queryBuilder.append(letterCase.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.kerning.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("kerning:");
            if (kerning.getValue() != null) {
                _queryBuilder.append(kerning.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
