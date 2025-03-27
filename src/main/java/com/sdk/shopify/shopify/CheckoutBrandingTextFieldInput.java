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

public class CheckoutBrandingTextFieldInput implements Serializable {
    private Input<CheckoutBrandingBorder> border = Input.undefined();

    private Input<CheckoutBrandingTypographyStyleInput> typography = Input.undefined();

    public CheckoutBrandingBorder getBorder() {
        return border.getValue();
    }

    public Input<CheckoutBrandingBorder> getBorderInput() {
        return border;
    }

    public CheckoutBrandingTextFieldInput setBorder(CheckoutBrandingBorder border) {
        this.border = Input.optional(border);
        return this;
    }

    public CheckoutBrandingTextFieldInput setBorderInput(Input<CheckoutBrandingBorder> border) {
        if (border == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.border = border;
        return this;
    }

    public CheckoutBrandingTypographyStyleInput getTypography() {
        return typography.getValue();
    }

    public Input<CheckoutBrandingTypographyStyleInput> getTypographyInput() {
        return typography;
    }

    public CheckoutBrandingTextFieldInput setTypography(CheckoutBrandingTypographyStyleInput typography) {
        this.typography = Input.optional(typography);
        return this;
    }

    public CheckoutBrandingTextFieldInput setTypographyInput(Input<CheckoutBrandingTypographyStyleInput> typography) {
        if (typography == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.typography = typography;
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

        _queryBuilder.append('}');
    }
}
