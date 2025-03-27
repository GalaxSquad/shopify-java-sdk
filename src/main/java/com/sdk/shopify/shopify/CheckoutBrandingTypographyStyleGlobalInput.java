// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingTypographyStyleGlobalInput implements Serializable {
    private Input<CheckoutBrandingTypographyLetterCase> letterCase = Input.undefined();

    private Input<CheckoutBrandingTypographyKerning> kerning = Input.undefined();

    public CheckoutBrandingTypographyLetterCase getLetterCase() {
        return letterCase.getValue();
    }

    public Input<CheckoutBrandingTypographyLetterCase> getLetterCaseInput() {
        return letterCase;
    }

    public CheckoutBrandingTypographyStyleGlobalInput setLetterCase(CheckoutBrandingTypographyLetterCase letterCase) {
        this.letterCase = Input.optional(letterCase);
        return this;
    }

    public CheckoutBrandingTypographyStyleGlobalInput setLetterCaseInput(Input<CheckoutBrandingTypographyLetterCase> letterCase) {
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

    public CheckoutBrandingTypographyStyleGlobalInput setKerning(CheckoutBrandingTypographyKerning kerning) {
        this.kerning = Input.optional(kerning);
        return this;
    }

    public CheckoutBrandingTypographyStyleGlobalInput setKerningInput(Input<CheckoutBrandingTypographyKerning> kerning) {
        if (kerning == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.kerning = kerning;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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
