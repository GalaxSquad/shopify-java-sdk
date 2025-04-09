// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the result of a copy, delete, or write operation performed on a theme file.
*/
public class OnlineStoreThemeFileOperationResultQuery extends Query<OnlineStoreThemeFileOperationResultQuery> {
    OnlineStoreThemeFileOperationResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Unique identifier of the theme file.
    */
    public OnlineStoreThemeFileOperationResultQuery filename() {
        startField("filename");

        return this;
    }
}
