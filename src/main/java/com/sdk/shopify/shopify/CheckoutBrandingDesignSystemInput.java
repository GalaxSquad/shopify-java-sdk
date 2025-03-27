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

public class CheckoutBrandingDesignSystemInput implements Serializable {
    private Input<CheckoutBrandingColorsInput> colors = Input.undefined();

    private Input<CheckoutBrandingTypographyInput> typography = Input.undefined();

    private Input<CheckoutBrandingCornerRadiusVariablesInput> cornerRadius = Input.undefined();

    public CheckoutBrandingColorsInput getColors() {
        return colors.getValue();
    }

    public Input<CheckoutBrandingColorsInput> getColorsInput() {
        return colors;
    }

    public CheckoutBrandingDesignSystemInput setColors(CheckoutBrandingColorsInput colors) {
        this.colors = Input.optional(colors);
        return this;
    }

    public CheckoutBrandingDesignSystemInput setColorsInput(Input<CheckoutBrandingColorsInput> colors) {
        if (colors == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.colors = colors;
        return this;
    }

    public CheckoutBrandingTypographyInput getTypography() {
        return typography.getValue();
    }

    public Input<CheckoutBrandingTypographyInput> getTypographyInput() {
        return typography;
    }

    public CheckoutBrandingDesignSystemInput setTypography(CheckoutBrandingTypographyInput typography) {
        this.typography = Input.optional(typography);
        return this;
    }

    public CheckoutBrandingDesignSystemInput setTypographyInput(Input<CheckoutBrandingTypographyInput> typography) {
        if (typography == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.typography = typography;
        return this;
    }

    public CheckoutBrandingCornerRadiusVariablesInput getCornerRadius() {
        return cornerRadius.getValue();
    }

    public Input<CheckoutBrandingCornerRadiusVariablesInput> getCornerRadiusInput() {
        return cornerRadius;
    }

    public CheckoutBrandingDesignSystemInput setCornerRadius(CheckoutBrandingCornerRadiusVariablesInput cornerRadius) {
        this.cornerRadius = Input.optional(cornerRadius);
        return this;
    }

    public CheckoutBrandingDesignSystemInput setCornerRadiusInput(Input<CheckoutBrandingCornerRadiusVariablesInput> cornerRadius) {
        if (cornerRadius == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cornerRadius = cornerRadius;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.colors.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("colors:");
            if (colors.getValue() != null) {
                colors.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.typography.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("typography:");
            if (typography.getValue() != null) {
                typography.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cornerRadius.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cornerRadius:");
            if (cornerRadius.getValue() != null) {
                cornerRadius.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
