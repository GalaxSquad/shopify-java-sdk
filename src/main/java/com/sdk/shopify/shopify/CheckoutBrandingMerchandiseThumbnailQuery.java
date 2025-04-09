// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
