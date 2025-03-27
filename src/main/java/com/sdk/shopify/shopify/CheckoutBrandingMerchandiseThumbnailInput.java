// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingMerchandiseThumbnailInput implements Serializable {
    private Input<CheckoutBrandingSimpleBorder> border = Input.undefined();

    private Input<CheckoutBrandingCornerRadius> cornerRadius = Input.undefined();

    private Input<CheckoutBrandingObjectFit> fit = Input.undefined();

    private Input<CheckoutBrandingMerchandiseThumbnailBadgeInput> badge = Input.undefined();

    public CheckoutBrandingSimpleBorder getBorder() {
        return border.getValue();
    }

    public Input<CheckoutBrandingSimpleBorder> getBorderInput() {
        return border;
    }

    public CheckoutBrandingMerchandiseThumbnailInput setBorder(CheckoutBrandingSimpleBorder border) {
        this.border = Input.optional(border);
        return this;
    }

    public CheckoutBrandingMerchandiseThumbnailInput setBorderInput(Input<CheckoutBrandingSimpleBorder> border) {
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

    public CheckoutBrandingMerchandiseThumbnailInput setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
        this.cornerRadius = Input.optional(cornerRadius);
        return this;
    }

    public CheckoutBrandingMerchandiseThumbnailInput setCornerRadiusInput(Input<CheckoutBrandingCornerRadius> cornerRadius) {
        if (cornerRadius == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cornerRadius = cornerRadius;
        return this;
    }

    public CheckoutBrandingObjectFit getFit() {
        return fit.getValue();
    }

    public Input<CheckoutBrandingObjectFit> getFitInput() {
        return fit;
    }

    public CheckoutBrandingMerchandiseThumbnailInput setFit(CheckoutBrandingObjectFit fit) {
        this.fit = Input.optional(fit);
        return this;
    }

    public CheckoutBrandingMerchandiseThumbnailInput setFitInput(Input<CheckoutBrandingObjectFit> fit) {
        if (fit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fit = fit;
        return this;
    }

    public CheckoutBrandingMerchandiseThumbnailBadgeInput getBadge() {
        return badge.getValue();
    }

    public Input<CheckoutBrandingMerchandiseThumbnailBadgeInput> getBadgeInput() {
        return badge;
    }

    public CheckoutBrandingMerchandiseThumbnailInput setBadge(CheckoutBrandingMerchandiseThumbnailBadgeInput badge) {
        this.badge = Input.optional(badge);
        return this;
    }

    public CheckoutBrandingMerchandiseThumbnailInput setBadgeInput(Input<CheckoutBrandingMerchandiseThumbnailBadgeInput> badge) {
        if (badge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.badge = badge;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.fit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fit:");
            if (fit.getValue() != null) {
                _queryBuilder.append(fit.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.badge.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("badge:");
            if (badge.getValue() != null) {
                badge.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
