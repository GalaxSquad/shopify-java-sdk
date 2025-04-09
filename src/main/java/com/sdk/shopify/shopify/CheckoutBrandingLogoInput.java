// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingLogoInput implements Serializable {
    private Input<CheckoutBrandingImageInput> image = Input.undefined();

    private Input<Integer> maxWidth = Input.undefined();

    private Input<CheckoutBrandingVisibility> visibility = Input.undefined();

    public CheckoutBrandingImageInput getImage() {
        return image.getValue();
    }

    public Input<CheckoutBrandingImageInput> getImageInput() {
        return image;
    }

    public CheckoutBrandingLogoInput setImage(CheckoutBrandingImageInput image) {
        this.image = Input.optional(image);
        return this;
    }

    public CheckoutBrandingLogoInput setImageInput(Input<CheckoutBrandingImageInput> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    public Integer getMaxWidth() {
        return maxWidth.getValue();
    }

    public Input<Integer> getMaxWidthInput() {
        return maxWidth;
    }

    public CheckoutBrandingLogoInput setMaxWidth(Integer maxWidth) {
        this.maxWidth = Input.optional(maxWidth);
        return this;
    }

    public CheckoutBrandingLogoInput setMaxWidthInput(Input<Integer> maxWidth) {
        if (maxWidth == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maxWidth = maxWidth;
        return this;
    }

    public CheckoutBrandingVisibility getVisibility() {
        return visibility.getValue();
    }

    public Input<CheckoutBrandingVisibility> getVisibilityInput() {
        return visibility;
    }

    public CheckoutBrandingLogoInput setVisibility(CheckoutBrandingVisibility visibility) {
        this.visibility = Input.optional(visibility);
        return this;
    }

    public CheckoutBrandingLogoInput setVisibilityInput(Input<CheckoutBrandingVisibility> visibility) {
        if (visibility == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.visibility = visibility;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.image.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("image:");
            if (image.getValue() != null) {
                image.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.maxWidth.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("maxWidth:");
            if (maxWidth.getValue() != null) {
                _queryBuilder.append(maxWidth.getValue());
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
