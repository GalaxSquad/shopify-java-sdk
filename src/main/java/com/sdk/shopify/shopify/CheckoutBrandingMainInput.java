// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingMainInput implements Serializable {
    private Input<CheckoutBrandingColorSchemeSelection> colorScheme = Input.undefined();

    private Input<CheckoutBrandingImageInput> backgroundImage = Input.undefined();

    private Input<CheckoutBrandingContainerDividerInput> divider = Input.undefined();

    private Input<CheckoutBrandingMainSectionInput> section = Input.undefined();

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return colorScheme.getValue();
    }

    public Input<CheckoutBrandingColorSchemeSelection> getColorSchemeInput() {
        return colorScheme;
    }

    public CheckoutBrandingMainInput setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
        this.colorScheme = Input.optional(colorScheme);
        return this;
    }

    public CheckoutBrandingMainInput setColorSchemeInput(Input<CheckoutBrandingColorSchemeSelection> colorScheme) {
        if (colorScheme == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.colorScheme = colorScheme;
        return this;
    }

    public CheckoutBrandingImageInput getBackgroundImage() {
        return backgroundImage.getValue();
    }

    public Input<CheckoutBrandingImageInput> getBackgroundImageInput() {
        return backgroundImage;
    }

    public CheckoutBrandingMainInput setBackgroundImage(CheckoutBrandingImageInput backgroundImage) {
        this.backgroundImage = Input.optional(backgroundImage);
        return this;
    }

    public CheckoutBrandingMainInput setBackgroundImageInput(Input<CheckoutBrandingImageInput> backgroundImage) {
        if (backgroundImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.backgroundImage = backgroundImage;
        return this;
    }

    public CheckoutBrandingContainerDividerInput getDivider() {
        return divider.getValue();
    }

    public Input<CheckoutBrandingContainerDividerInput> getDividerInput() {
        return divider;
    }

    public CheckoutBrandingMainInput setDivider(CheckoutBrandingContainerDividerInput divider) {
        this.divider = Input.optional(divider);
        return this;
    }

    public CheckoutBrandingMainInput setDividerInput(Input<CheckoutBrandingContainerDividerInput> divider) {
        if (divider == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.divider = divider;
        return this;
    }

    public CheckoutBrandingMainSectionInput getSection() {
        return section.getValue();
    }

    public Input<CheckoutBrandingMainSectionInput> getSectionInput() {
        return section;
    }

    public CheckoutBrandingMainInput setSection(CheckoutBrandingMainSectionInput section) {
        this.section = Input.optional(section);
        return this;
    }

    public CheckoutBrandingMainInput setSectionInput(Input<CheckoutBrandingMainSectionInput> section) {
        if (section == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.section = section;
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

        if (this.backgroundImage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("backgroundImage:");
            if (backgroundImage.getValue() != null) {
                backgroundImage.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.divider.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("divider:");
            if (divider.getValue() != null) {
                divider.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.section.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("section:");
            if (section.getValue() != null) {
                section.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
