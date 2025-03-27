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

public class CheckoutBrandingMerchandiseThumbnailBadgeInput implements Serializable {
    private Input<CheckoutBrandingMerchandiseThumbnailBadgeBackground> background = Input.undefined();

    public CheckoutBrandingMerchandiseThumbnailBadgeBackground getBackground() {
        return background.getValue();
    }

    public Input<CheckoutBrandingMerchandiseThumbnailBadgeBackground> getBackgroundInput() {
        return background;
    }

    public CheckoutBrandingMerchandiseThumbnailBadgeInput setBackground(CheckoutBrandingMerchandiseThumbnailBadgeBackground background) {
        this.background = Input.optional(background);
        return this;
    }

    public CheckoutBrandingMerchandiseThumbnailBadgeInput setBackgroundInput(Input<CheckoutBrandingMerchandiseThumbnailBadgeBackground> background) {
        if (background == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.background = background;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.background.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("background:");
            if (background.getValue() != null) {
                _queryBuilder.append(background.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
