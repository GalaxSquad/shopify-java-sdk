// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the Bundles feature configuration for the shop.
*/
public class BundlesFeatureQuery extends Query<BundlesFeatureQuery> {
    BundlesFeatureQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether a shop is configured properly to sell bundles.
    */
    public BundlesFeatureQuery eligibleForBundles() {
        startField("eligibleForBundles");

        return this;
    }

    /**
    * The reason why a shop is not eligible for bundles.
    */
    public BundlesFeatureQuery ineligibilityReason() {
        startField("ineligibilityReason");

        return this;
    }

    /**
    * Whether a shop has any fixed bundle products or has a cartTransform function installed.
    */
    public BundlesFeatureQuery sellsBundles() {
        startField("sellsBundles");

        return this;
    }
}
