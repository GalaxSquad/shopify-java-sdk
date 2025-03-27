// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingHeaderCartLinkInput implements Serializable {
    private Input<CheckoutBrandingCartLinkContentType> contentType = Input.undefined();

    private Input<CheckoutBrandingImageInput> image = Input.undefined();

    public CheckoutBrandingCartLinkContentType getContentType() {
        return contentType.getValue();
    }

    public Input<CheckoutBrandingCartLinkContentType> getContentTypeInput() {
        return contentType;
    }

    public CheckoutBrandingHeaderCartLinkInput setContentType(CheckoutBrandingCartLinkContentType contentType) {
        this.contentType = Input.optional(contentType);
        return this;
    }

    public CheckoutBrandingHeaderCartLinkInput setContentTypeInput(Input<CheckoutBrandingCartLinkContentType> contentType) {
        if (contentType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.contentType = contentType;
        return this;
    }

    public CheckoutBrandingImageInput getImage() {
        return image.getValue();
    }

    public Input<CheckoutBrandingImageInput> getImageInput() {
        return image;
    }

    public CheckoutBrandingHeaderCartLinkInput setImage(CheckoutBrandingImageInput image) {
        this.image = Input.optional(image);
        return this;
    }

    public CheckoutBrandingHeaderCartLinkInput setImageInput(Input<CheckoutBrandingImageInput> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.contentType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("contentType:");
            if (contentType.getValue() != null) {
                _queryBuilder.append(contentType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        _queryBuilder.append('}');
    }
}
