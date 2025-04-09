// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingInput implements Serializable {
    private Input<CheckoutBrandingDesignSystemInput> designSystem = Input.undefined();

    private Input<CheckoutBrandingCustomizationsInput> customizations = Input.undefined();

    public CheckoutBrandingDesignSystemInput getDesignSystem() {
        return designSystem.getValue();
    }

    public Input<CheckoutBrandingDesignSystemInput> getDesignSystemInput() {
        return designSystem;
    }

    public CheckoutBrandingInput setDesignSystem(CheckoutBrandingDesignSystemInput designSystem) {
        this.designSystem = Input.optional(designSystem);
        return this;
    }

    public CheckoutBrandingInput setDesignSystemInput(Input<CheckoutBrandingDesignSystemInput> designSystem) {
        if (designSystem == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.designSystem = designSystem;
        return this;
    }

    public CheckoutBrandingCustomizationsInput getCustomizations() {
        return customizations.getValue();
    }

    public Input<CheckoutBrandingCustomizationsInput> getCustomizationsInput() {
        return customizations;
    }

    public CheckoutBrandingInput setCustomizations(CheckoutBrandingCustomizationsInput customizations) {
        this.customizations = Input.optional(customizations);
        return this;
    }

    public CheckoutBrandingInput setCustomizationsInput(Input<CheckoutBrandingCustomizationsInput> customizations) {
        if (customizations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customizations = customizations;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.designSystem.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("designSystem:");
            if (designSystem.getValue() != null) {
                designSystem.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customizations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customizations:");
            if (customizations.getValue() != null) {
                customizations.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
