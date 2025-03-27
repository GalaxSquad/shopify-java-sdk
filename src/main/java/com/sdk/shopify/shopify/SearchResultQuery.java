// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an individual result returned from a search.
*/
public class SearchResultQuery extends Query<SearchResultQuery> {
    SearchResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the search result description text.
    */
    public SearchResultQuery description() {
        startField("description");

        return this;
    }

    /**
    * Returns the Image resource presented to accompany a search result.
    */
    public SearchResultQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the ID of the resource returned in the search result.
    */
    public SearchResultQuery reference(NodeQueryDefinition queryDef) {
        startField("reference");

        _queryBuilder.append('{');
        queryDef.define(new NodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the resource title.
    */
    public SearchResultQuery title() {
        startField("title");

        return this;
    }

    /**
    * Returns the absolute URL to the resource in the search result.
    */
    public SearchResultQuery url() {
        startField("url");

        return this;
    }
}
