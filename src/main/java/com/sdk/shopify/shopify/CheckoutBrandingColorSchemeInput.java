// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingColorSchemeInput implements Serializable {
    private Input<CheckoutBrandingColorRolesInput> base = Input.undefined();

    private Input<CheckoutBrandingControlColorRolesInput> control = Input.undefined();

    private Input<CheckoutBrandingButtonColorRolesInput> primaryButton = Input.undefined();

    private Input<CheckoutBrandingButtonColorRolesInput> secondaryButton = Input.undefined();

    public CheckoutBrandingColorRolesInput getBase() {
        return base.getValue();
    }

    public Input<CheckoutBrandingColorRolesInput> getBaseInput() {
        return base;
    }

    public CheckoutBrandingColorSchemeInput setBase(CheckoutBrandingColorRolesInput base) {
        this.base = Input.optional(base);
        return this;
    }

    public CheckoutBrandingColorSchemeInput setBaseInput(Input<CheckoutBrandingColorRolesInput> base) {
        if (base == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.base = base;
        return this;
    }

    public CheckoutBrandingControlColorRolesInput getControl() {
        return control.getValue();
    }

    public Input<CheckoutBrandingControlColorRolesInput> getControlInput() {
        return control;
    }

    public CheckoutBrandingColorSchemeInput setControl(CheckoutBrandingControlColorRolesInput control) {
        this.control = Input.optional(control);
        return this;
    }

    public CheckoutBrandingColorSchemeInput setControlInput(Input<CheckoutBrandingControlColorRolesInput> control) {
        if (control == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.control = control;
        return this;
    }

    public CheckoutBrandingButtonColorRolesInput getPrimaryButton() {
        return primaryButton.getValue();
    }

    public Input<CheckoutBrandingButtonColorRolesInput> getPrimaryButtonInput() {
        return primaryButton;
    }

    public CheckoutBrandingColorSchemeInput setPrimaryButton(CheckoutBrandingButtonColorRolesInput primaryButton) {
        this.primaryButton = Input.optional(primaryButton);
        return this;
    }

    public CheckoutBrandingColorSchemeInput setPrimaryButtonInput(Input<CheckoutBrandingButtonColorRolesInput> primaryButton) {
        if (primaryButton == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.primaryButton = primaryButton;
        return this;
    }

    public CheckoutBrandingButtonColorRolesInput getSecondaryButton() {
        return secondaryButton.getValue();
    }

    public Input<CheckoutBrandingButtonColorRolesInput> getSecondaryButtonInput() {
        return secondaryButton;
    }

    public CheckoutBrandingColorSchemeInput setSecondaryButton(CheckoutBrandingButtonColorRolesInput secondaryButton) {
        this.secondaryButton = Input.optional(secondaryButton);
        return this;
    }

    public CheckoutBrandingColorSchemeInput setSecondaryButtonInput(Input<CheckoutBrandingButtonColorRolesInput> secondaryButton) {
        if (secondaryButton == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.secondaryButton = secondaryButton;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.base.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("base:");
            if (base.getValue() != null) {
                base.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.control.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("control:");
            if (control.getValue() != null) {
                control.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.primaryButton.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("primaryButton:");
            if (primaryButton.getValue() != null) {
                primaryButton.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.secondaryButton.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("secondaryButton:");
            if (secondaryButton.getValue() != null) {
                secondaryButton.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
