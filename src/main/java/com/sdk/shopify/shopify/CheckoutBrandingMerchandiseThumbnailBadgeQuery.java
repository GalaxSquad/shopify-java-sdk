// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The merchandise thumbnail badges customizations.
*/
public class CheckoutBrandingMerchandiseThumbnailBadgeQuery extends Query<CheckoutBrandingMerchandiseThumbnailBadgeQuery> {
    CheckoutBrandingMerchandiseThumbnailBadgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The background used for merchandise thumbnail badges.
    */
    public CheckoutBrandingMerchandiseThumbnailBadgeQuery background() {
        startField("background");

        return this;
    }
}
