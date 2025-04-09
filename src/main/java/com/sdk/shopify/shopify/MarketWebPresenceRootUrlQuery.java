// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The URL for the homepage of the online store in the context of a particular market and a
* particular locale.
*/
public class MarketWebPresenceRootUrlQuery extends Query<MarketWebPresenceRootUrlQuery> {
    MarketWebPresenceRootUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The locale that the storefront loads in.
    */
    public MarketWebPresenceRootUrlQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * The URL.
    */
    public MarketWebPresenceRootUrlQuery url() {
        startField("url");

        return this;
    }
}
