// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingExpressCheckoutInput implements Serializable {
    private Input<CheckoutBrandingExpressCheckoutButtonInput> button = Input.undefined();

    public CheckoutBrandingExpressCheckoutButtonInput getButton() {
        return button.getValue();
    }

    public Input<CheckoutBrandingExpressCheckoutButtonInput> getButtonInput() {
        return button;
    }

    public CheckoutBrandingExpressCheckoutInput setButton(CheckoutBrandingExpressCheckoutButtonInput button) {
        this.button = Input.optional(button);
        return this;
    }

    public CheckoutBrandingExpressCheckoutInput setButtonInput(Input<CheckoutBrandingExpressCheckoutButtonInput> button) {
        if (button == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.button = button;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.button.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("button:");
            if (button.getValue() != null) {
                button.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
