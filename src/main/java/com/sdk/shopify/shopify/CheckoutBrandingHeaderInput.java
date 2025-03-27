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

public class CheckoutBrandingHeaderInput implements Serializable {
    private Input<CheckoutBrandingHeaderAlignment> alignment = Input.undefined();

    private Input<CheckoutBrandingHeaderPosition> position = Input.undefined();

    private Input<CheckoutBrandingLogoInput> logo = Input.undefined();

    private Input<CheckoutBrandingImageInput> banner = Input.undefined();

    private Input<Boolean> divided = Input.undefined();

    private Input<CheckoutBrandingHeaderCartLinkInput> cartLink = Input.undefined();

    private Input<CheckoutBrandingColorSchemeSelection> colorScheme = Input.undefined();

    private Input<CheckoutBrandingSpacingKeyword> padding = Input.undefined();

    public CheckoutBrandingHeaderAlignment getAlignment() {
        return alignment.getValue();
    }

    public Input<CheckoutBrandingHeaderAlignment> getAlignmentInput() {
        return alignment;
    }

    public CheckoutBrandingHeaderInput setAlignment(CheckoutBrandingHeaderAlignment alignment) {
        this.alignment = Input.optional(alignment);
        return this;
    }

    public CheckoutBrandingHeaderInput setAlignmentInput(Input<CheckoutBrandingHeaderAlignment> alignment) {
        if (alignment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alignment = alignment;
        return this;
    }

    public CheckoutBrandingHeaderPosition getPosition() {
        return position.getValue();
    }

    public Input<CheckoutBrandingHeaderPosition> getPositionInput() {
        return position;
    }

    public CheckoutBrandingHeaderInput setPosition(CheckoutBrandingHeaderPosition position) {
        this.position = Input.optional(position);
        return this;
    }

    public CheckoutBrandingHeaderInput setPositionInput(Input<CheckoutBrandingHeaderPosition> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
        return this;
    }

    public CheckoutBrandingLogoInput getLogo() {
        return logo.getValue();
    }

    public Input<CheckoutBrandingLogoInput> getLogoInput() {
        return logo;
    }

    public CheckoutBrandingHeaderInput setLogo(CheckoutBrandingLogoInput logo) {
        this.logo = Input.optional(logo);
        return this;
    }

    public CheckoutBrandingHeaderInput setLogoInput(Input<CheckoutBrandingLogoInput> logo) {
        if (logo == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.logo = logo;
        return this;
    }

    public CheckoutBrandingImageInput getBanner() {
        return banner.getValue();
    }

    public Input<CheckoutBrandingImageInput> getBannerInput() {
        return banner;
    }

    public CheckoutBrandingHeaderInput setBanner(CheckoutBrandingImageInput banner) {
        this.banner = Input.optional(banner);
        return this;
    }

    public CheckoutBrandingHeaderInput setBannerInput(Input<CheckoutBrandingImageInput> banner) {
        if (banner == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.banner = banner;
        return this;
    }

    public Boolean getDivided() {
        return divided.getValue();
    }

    public Input<Boolean> getDividedInput() {
        return divided;
    }

    public CheckoutBrandingHeaderInput setDivided(Boolean divided) {
        this.divided = Input.optional(divided);
        return this;
    }

    public CheckoutBrandingHeaderInput setDividedInput(Input<Boolean> divided) {
        if (divided == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.divided = divided;
        return this;
    }

    public CheckoutBrandingHeaderCartLinkInput getCartLink() {
        return cartLink.getValue();
    }

    public Input<CheckoutBrandingHeaderCartLinkInput> getCartLinkInput() {
        return cartLink;
    }

    public CheckoutBrandingHeaderInput setCartLink(CheckoutBrandingHeaderCartLinkInput cartLink) {
        this.cartLink = Input.optional(cartLink);
        return this;
    }

    public CheckoutBrandingHeaderInput setCartLinkInput(Input<CheckoutBrandingHeaderCartLinkInput> cartLink) {
        if (cartLink == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cartLink = cartLink;
        return this;
    }

    public CheckoutBrandingColorSchemeSelection getColorScheme() {
        return colorScheme.getValue();
    }

    public Input<CheckoutBrandingColorSchemeSelection> getColorSchemeInput() {
        return colorScheme;
    }

    public CheckoutBrandingHeaderInput setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
        this.colorScheme = Input.optional(colorScheme);
        return this;
    }

    public CheckoutBrandingHeaderInput setColorSchemeInput(Input<CheckoutBrandingColorSchemeSelection> colorScheme) {
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

    public CheckoutBrandingHeaderInput setPadding(CheckoutBrandingSpacingKeyword padding) {
        this.padding = Input.optional(padding);
        return this;
    }

    public CheckoutBrandingHeaderInput setPaddingInput(Input<CheckoutBrandingSpacingKeyword> padding) {
        if (padding == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.padding = padding;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.logo.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("logo:");
            if (logo.getValue() != null) {
                logo.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.banner.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("banner:");
            if (banner.getValue() != null) {
                banner.getValue().appendTo(_queryBuilder);
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

        if (this.cartLink.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cartLink:");
            if (cartLink.getValue() != null) {
                cartLink.getValue().appendTo(_queryBuilder);
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
