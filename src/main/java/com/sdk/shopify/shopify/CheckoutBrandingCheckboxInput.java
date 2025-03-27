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

public class CheckoutBrandingCheckboxInput implements Serializable {
    private Input<CheckoutBrandingCornerRadius> cornerRadius = Input.undefined();

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return cornerRadius.getValue();
    }

    public Input<CheckoutBrandingCornerRadius> getCornerRadiusInput() {
        return cornerRadius;
    }

    public CheckoutBrandingCheckboxInput setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
        this.cornerRadius = Input.optional(cornerRadius);
        return this;
    }

    public CheckoutBrandingCheckboxInput setCornerRadiusInput(Input<CheckoutBrandingCornerRadius> cornerRadius) {
        if (cornerRadius == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cornerRadius = cornerRadius;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        _queryBuilder.append('}');
    }
}
