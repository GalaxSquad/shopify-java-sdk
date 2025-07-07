// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens while uninstalling an app.
*/
public class AppUninstallAppUninstallErrorQuery extends Query<AppUninstallAppUninstallErrorQuery> {
    AppUninstallAppUninstallErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public AppUninstallAppUninstallErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public AppUninstallAppUninstallErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public AppUninstallAppUninstallErrorQuery message() {
        startField("message");

        return this;
    }
}
