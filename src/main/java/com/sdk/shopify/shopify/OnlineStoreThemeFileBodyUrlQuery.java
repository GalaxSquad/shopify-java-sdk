// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the url of the body of a theme file.
*/
public class OnlineStoreThemeFileBodyUrlQuery extends Query<OnlineStoreThemeFileBodyUrlQuery> {
    OnlineStoreThemeFileBodyUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The short lived url for the body of the theme file.
    */
    public OnlineStoreThemeFileBodyUrlQuery url() {
        startField("url");

        return this;
    }
}
