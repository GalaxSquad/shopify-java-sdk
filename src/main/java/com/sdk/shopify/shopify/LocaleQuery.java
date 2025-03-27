// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A locale.
*/
public class LocaleQuery extends Query<LocaleQuery> {
    LocaleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Locale ISO code.
    */
    public LocaleQuery isoCode() {
        startField("isoCode");

        return this;
    }

    /**
    * Human-readable locale name.
    */
    public LocaleQuery name() {
        startField("name");

        return this;
    }
}
