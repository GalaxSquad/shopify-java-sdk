// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the base64 encoded body of a theme file.
*/
public class OnlineStoreThemeFileBodyBase64Query extends Query<OnlineStoreThemeFileBodyBase64Query> {
    OnlineStoreThemeFileBodyBase64Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The body of the theme file, base64 encoded.
    */
    public OnlineStoreThemeFileBodyBase64Query contentBase64() {
        startField("contentBase64");

        return this;
    }
}
