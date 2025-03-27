// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A list of search filters along with their specific options in value and label pair for filtering.
*/
public class SearchFilterOptionsQuery extends Query<SearchFilterOptionsQuery> {
    SearchFilterOptionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A list of options that can be use to filter product availability.
    */
    public SearchFilterOptionsQuery productAvailability(FilterOptionQueryDefinition queryDef) {
        startField("productAvailability");

        _queryBuilder.append('{');
        queryDef.define(new FilterOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
