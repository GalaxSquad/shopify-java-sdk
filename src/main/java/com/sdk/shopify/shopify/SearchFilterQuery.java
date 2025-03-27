// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A filter in a search query represented by a key value pair.
*/
public class SearchFilterQuery extends Query<SearchFilterQuery> {
    SearchFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The key of the search filter.
    */
    public SearchFilterQuery key() {
        startField("key");

        return this;
    }

    /**
    * The value of the search filter.
    */
    public SearchFilterQuery value() {
        startField("value");

        return this;
    }
}
