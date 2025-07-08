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
    * The md5 digest of the theme file for data integrity.
    */
    public OnlineStoreThemeFileOperationResultQuery checksumMd5() {
        startField("checksumMd5");

        return this;
    }

    /**
    * The date and time when the theme file was created.
    */
    public OnlineStoreThemeFileOperationResultQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Unique identifier of the theme file.
    */
    public OnlineStoreThemeFileOperationResultQuery filename() {
        startField("filename");

        return this;
    }

    /**
    * The size of the theme file in bytes.
    */
    public OnlineStoreThemeFileOperationResultQuery size() {
        startField("size");

        return this;
    }

    /**
    * The date and time when the theme file was last updated.
    */
    public OnlineStoreThemeFileOperationResultQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
