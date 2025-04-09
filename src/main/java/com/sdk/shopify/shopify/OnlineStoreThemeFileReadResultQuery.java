// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the result of a read operation performed on a theme asset.
*/
public class OnlineStoreThemeFileReadResultQuery extends Query<OnlineStoreThemeFileReadResultQuery> {
    OnlineStoreThemeFileReadResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Type that indicates the result of the operation.
    */
    public OnlineStoreThemeFileReadResultQuery code() {
        startField("code");

        return this;
    }

    /**
    * Unique identifier associated with the operation and the theme file.
    */
    public OnlineStoreThemeFileReadResultQuery filename() {
        startField("filename");

        return this;
    }
}
