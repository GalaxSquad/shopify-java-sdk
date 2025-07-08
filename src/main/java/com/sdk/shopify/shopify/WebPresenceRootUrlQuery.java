// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The URL for the homepage of the online store in the context of the web presence and a
* particular locale.
*/
public class WebPresenceRootUrlQuery extends Query<WebPresenceRootUrlQuery> {
    WebPresenceRootUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The locale that the storefront loads in.
    */
    public WebPresenceRootUrlQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * The URL.
    */
    public WebPresenceRootUrlQuery url() {
        startField("url");

        return this;
    }
}
