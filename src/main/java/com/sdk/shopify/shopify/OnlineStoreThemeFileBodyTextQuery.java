// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the body of a theme file.
*/
public class OnlineStoreThemeFileBodyTextQuery extends Query<OnlineStoreThemeFileBodyTextQuery> {
    OnlineStoreThemeFileBodyTextQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The body of the theme file.
    */
    public OnlineStoreThemeFileBodyTextQuery content() {
        startField("content");

        return this;
    }
}
