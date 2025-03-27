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

/**
* The merchandise thumbnails customizations.
*/
public class CheckoutBrandingMerchandiseThumbnailQuery extends Query<CheckoutBrandingMerchandiseThumbnailQuery> {
    CheckoutBrandingMerchandiseThumbnailQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The settings for the merchandise thumbnail badge.
    */
    public CheckoutBrandingMerchandiseThumbnailQuery badge(CheckoutBrandingMerchandiseThumbnailBadgeQueryDefinition queryDef) {
        startField("badge");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingMerchandiseThumbnailBadgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The border used for merchandise thumbnails.
    */
    public CheckoutBrandingMerchandiseThumbnailQuery border() {
        startField("border");

        return this;
    }

    /**
    * The corner radius used for merchandise thumbnails.
    */
    public CheckoutBrandingMerchandiseThumbnailQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }

    /**
    * The property used to customize how the product image fits within merchandise thumbnails.
    */
    public CheckoutBrandingMerchandiseThumbnailQuery fit() {
        startField("fit");

        return this;
    }
}
