// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingFooterContentInput implements Serializable {
    private Input<CheckoutBrandingVisibility> visibility = Input.undefined();

    public CheckoutBrandingVisibility getVisibility() {
        return visibility.getValue();
    }

    public Input<CheckoutBrandingVisibility> getVisibilityInput() {
        return visibility;
    }

    public CheckoutBrandingFooterContentInput setVisibility(CheckoutBrandingVisibility visibility) {
        this.visibility = Input.optional(visibility);
        return this;
    }

    public CheckoutBrandingFooterContentInput setVisibilityInput(Input<CheckoutBrandingVisibility> visibility) {
        if (visibility == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.visibility = visibility;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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
