// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* User errors for theme file operations.
*/
public class OnlineStoreThemeFilesUserErrorsQuery extends Query<OnlineStoreThemeFilesUserErrorsQuery> {
    OnlineStoreThemeFilesUserErrorsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OnlineStoreThemeFilesUserErrorsQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OnlineStoreThemeFilesUserErrorsQuery field() {
        startField("field");

        return this;
    }

    /**
    * The filename of the theme file.
    */
    public OnlineStoreThemeFilesUserErrorsQuery filename() {
        startField("filename");

        return this;
    }

    /**
    * The error message.
    */
    public OnlineStoreThemeFilesUserErrorsQuery message() {
        startField("message");

        return this;
    }
}
